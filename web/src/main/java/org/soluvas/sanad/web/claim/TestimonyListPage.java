package org.soluvas.sanad.web.claim;

import java.util.Iterator;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.wicket.AttributeModifier;
import org.apache.wicket.datetime.StyleDateConverter;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.data.domain.PageOffsetRequest;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.sanad.core.ClaimManager;
import org.soluvas.sanad.core.ClaimManager.TestimonySummary;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.soluvas.web.site.widget.DateTimeLabel;
import org.wicketstuff.annotation.mount.MountPath;

import de.agilecoders.wicket.core.markup.html.bootstrap.navigation.ajax.BootstrapAjaxPagingNavigator;

@SuppressWarnings("serial")
@MountPath("testimony")
public class TestimonyListPage extends GuestLayoutPage {

	@Inject
	ClaimManager claimMgr;
	
	public TestimonyListPage(PageParameters parameters) {
		super(parameters);
		
		IDataProvider<TestimonySummary> testimonyDp = new IDataProvider<TestimonySummary>() {
			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends TestimonySummary> iterator(long first, long count) {
				return claimMgr.findAllTestimonySummaries(new PageOffsetRequest(first, count, Direction.DESC, "creationTime")).iterator();
			}

			@Override
			public long size() {
				return claimMgr.getTestimonyCount();
			}

			@Override
			public IModel<TestimonySummary> model(TestimonySummary object) {
				return new Model<>(object);
			}
		};
		
		final DataView<TestimonySummary> testimonyDv = new DataView<TestimonySummary>("testimonies", testimonyDp, 20) {
			@Override
			protected void populateItem(Item<TestimonySummary> item) {
				TestimonySummary testimony = item.getModelObject();
				String testimonyUrl = urlFor(TestimonyPage.class, TestimonyPage.byId(testimony.getId())).toString();
				item.add(new AttributeModifier("href", testimonyUrl));
				String descriptionAbbr = StringUtils.abbreviate(testimony.getDescription(), 160);
				item.add(new Label("descriptionAbbr", descriptionAbbr));
				item.add(new Label("personId", testimony.getPersonId()));
				item.add(new DateTimeLabel("creationTime", testimony.getCreationTime(), new StyleDateConverter("MS", false)));
			}
		};
		add(testimonyDv);
		add(new BootstrapAjaxPagingNavigator("pagingNavigator", testimonyDv));
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new Model<>("Testimonies - Sanad");
	}

}
