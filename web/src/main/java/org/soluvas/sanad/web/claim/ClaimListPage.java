package org.soluvas.sanad.web.claim;

import java.util.Iterator;

import javax.inject.Inject;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.data.domain.PageOffsetRequest;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.sanad.core.ClaimManager;
import org.soluvas.sanad.core.jpa.AuthenticityClaim;
import org.soluvas.sanad.core.jpa.Claim;
import org.soluvas.sanad.core.jpa.LiteralClaim;
import org.soluvas.sanad.core.jpa.NarratorClaim;
import org.soluvas.sanad.core.jpa.SuccessionClaim;
import org.soluvas.sanad.core.jpa.ThingClaim;
import org.soluvas.sanad.core.jpa.TransliterationClaim;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.soluvas.web.site.JpaModel;
import org.wicketstuff.annotation.mount.MountPath;

import de.agilecoders.wicket.core.markup.html.bootstrap.navigation.ajax.BootstrapAjaxPagingNavigator;

@SuppressWarnings("serial")
@MountPath("claim")
public class ClaimListPage extends GuestLayoutPage {

	@Inject
	ClaimManager claimMgr;
	
	public ClaimListPage(PageParameters parameters) {
		super(parameters);
		
		IDataProvider<Claim> claimsDp = new IDataProvider<Claim>() {
			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends Claim> iterator(long first, long count) {
				return claimMgr.findAllClaims(new PageOffsetRequest(first, count, Direction.DESC, "creationTime")).iterator();
			}

			@Override
			public long size() {
				return claimMgr.getClaimCount();
			}

			@Override
			public IModel<Claim> model(Claim object) {
				return new JpaModel<>(Claim.class, object.getId(), object);
			}
		};
		
		final DataView<Claim> claimDv = new DataView<Claim>("claims", claimsDp, 20) {
			@Override
			protected void populateItem(Item<Claim> item) {
				Claim claim = item.getModelObject();
				String claimUrl = urlFor(ClaimPage.class, ClaimPage.byId(claim.getId())).toString();
				item.add(new AttributeModifier("href", claimUrl));
				if (claim instanceof LiteralClaim) {
					final Fragment fragment = new Fragment("fragment", "literal", this);
					final LiteralClaim literalClaim = (LiteralClaim) claim;
					fragment.add(new Label("spelling", literalClaim.getSpelling()));
					fragment.add(new Label("literal", literalClaim.getHtml()).setEscapeModelStrings(false));
					item.add(fragment);
				} else if (claim instanceof TransliterationClaim) {
					final Fragment fragment = new Fragment("fragment", "transliteration", this);
					item.add(fragment);
				} else if (claim instanceof AuthenticityClaim) {
					final Fragment fragment = new Fragment("fragment", "authenticity", this);
					item.add(fragment);
				} else if (claim instanceof SuccessionClaim) {
					final Fragment fragment = new Fragment("fragment", "succession", this);
					item.add(fragment);
				} else if (claim instanceof ThingClaim) {
					final Fragment fragment = new Fragment("fragment", "thing", this);
					item.add(fragment);
				} else if (claim instanceof NarratorClaim) {
					final Fragment fragment = new Fragment("fragment", "narrator", this);
					item.add(fragment);
				} else {
					throw new IllegalArgumentException("Unrecognized claim: " + claim.getClass().getName());
				}
			}
		};
		add(claimDv);
		add(new BootstrapAjaxPagingNavigator("pagingNavigator", claimDv));
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new Model<>("Claims - Sanad");
	}

}
