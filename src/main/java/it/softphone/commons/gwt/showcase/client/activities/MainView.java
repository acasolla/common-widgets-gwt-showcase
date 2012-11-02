package it.softphone.commons.gwt.showcase.client.activities;

import it.softphone.commons.gwt.showcase.client.HasLogger;
import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.web.bindery.event.shared.EventBus;

public interface MainView extends AcceptsOneWidget,IsWidget,ResourceAware,HasLogger{
	void setContentWidget( IsWidget w );
	void setEventBus( EventBus bus );
}