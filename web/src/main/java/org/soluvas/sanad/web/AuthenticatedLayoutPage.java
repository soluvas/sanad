package org.soluvas.sanad.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.wicket.RestartResponseAtInterceptPageException;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.web.login.DedicatedLoginPage;

@SuppressWarnings("serial")
public abstract class AuthenticatedLayoutPage extends GuestLayoutPage {

	public AuthenticatedLayoutPage(PageParameters parameters) {
		super(parameters);
	}

	@Override
	protected void onConfigure() {
		super.onConfigure();
		
		final Subject subject = SecurityUtils.getSubject();
		if (!subject.isAuthenticated()) {
			getSession().info("Please login");
			throw new RestartResponseAtInterceptPageException(DedicatedLoginPage.class);
		}
	}
	
}
