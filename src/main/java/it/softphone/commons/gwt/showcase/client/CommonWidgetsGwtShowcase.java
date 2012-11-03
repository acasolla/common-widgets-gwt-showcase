package it.softphone.commons.gwt.showcase.client;

import it.softphone.commons.gwt.showcase.client.activities.HomePlace;
import it.softphone.commons.gwt.showcase.client.mvp.AppActivityMapper;
import it.softphone.commons.gwt.showcase.client.mvp.AppHistoryObserver;
import it.softphone.commons.gwt.showcase.client.mvp.AppPlaceHistoryMapper;
import it.softphone.commons.gwt.showcase.client.resources.CssResource;
import it.softphone.rd.gwt.client.history.CommonPlaceHistoryHandler;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CommonWidgetsGwtShowcase implements EntryPoint{
	
	private final ClientFactory clientFactory = GWT.create(ClientFactory.class);
	private final CssResource css = GWT.create(CssResource.class);
	
	public void onModuleLoad() {

		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			@Override
			public void onUncaughtException(Throwable e) {
				Window.alert("uncaught: " + e.getMessage());
				e.printStackTrace();

			}
		});
		css.getMainCss().ensureInjected();
	
		SimplePanel appWidget = new SimplePanel();
		
		EventBus eventBus = clientFactory.getEventBus();
		
		ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(appWidget);
		AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
		AppHistoryObserver historyObserver = new AppHistoryObserver();

		CommonPlaceHistoryHandler historyHandler = new CommonPlaceHistoryHandler(historyMapper, historyObserver);

		historyHandler.register(clientFactory.getPlaceController(), clientFactory.getEventBus(), new HomePlace());
		historyHandler.handleCurrentHistory();
		
		RootPanel.get("loading").setVisible(false);
		RootLayoutPanel rp = RootLayoutPanel.get();
		rp.add(appWidget);
		historyHandler.handleCurrentHistory();
        
		
  }


}
