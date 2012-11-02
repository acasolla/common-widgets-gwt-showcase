package it.softphone.commons.gwt.showcase.client.mvp;

import it.softphone.commons.gwt.showcase.client.ClientFactory;
import it.softphone.commons.gwt.showcase.client.activities.MainActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;
	private MainActivity main;

	/**
	 * AppActivityMapper associates each Place with its corresponding
	 * {@link Activity}
	 * 
	 * @param clientFactory
	 *            Factory to be passed to activities
	 */
	public AppActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}


	@Override
	public Activity getActivity(Place place) {
		
		if (main == null)
			main = new MainActivity(place, clientFactory);
		main.setCenterView(place);
		return main;
	}

}
