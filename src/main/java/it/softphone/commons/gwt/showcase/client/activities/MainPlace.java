package it.softphone.commons.gwt.showcase.client.activities;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class MainPlace extends Place
{
	private final static String name = "MainPanel";
	//private Question
	
	public MainPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<MainPlace>
	{

		@Override
		public String getToken(MainPlace place)
		{
			return place.getName();
		}

		@Override
		public MainPlace getPlace(String token)
		{
			return new MainPlace();
		}


	}
	
//	@Override
//	protected Place getPlace(String token)
//	{
//		return new HelloPlace(token);
//	}
//
//	@Override
//	protected Activity getActivity()
//	{
//		return new HelloActivity("David");
//	}
}
