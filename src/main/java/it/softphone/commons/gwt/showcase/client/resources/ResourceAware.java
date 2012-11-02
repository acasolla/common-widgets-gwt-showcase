package it.softphone.commons.gwt.showcase.client.resources;

import com.google.gwt.core.client.GWT;

public interface ResourceAware {

	Resources resources = GWT.create(Resources.class);
	CssResource css = GWT.create(CssResource.class);
}
