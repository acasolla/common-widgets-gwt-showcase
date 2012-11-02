package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class PortraitPlace extends Place
{
	private final static String name = "Portrait";
	//private Question
	
	public PortraitPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<PortraitPlace>
	{

		@Override
		public String getToken(PortraitPlace place)
		{
			return place.getName();
		}

		@Override
		public PortraitPlace getPlace(String token)
		{
			return new PortraitPlace();
		}


	}
}
