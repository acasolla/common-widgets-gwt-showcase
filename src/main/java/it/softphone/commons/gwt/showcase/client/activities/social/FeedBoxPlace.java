package it.softphone.commons.gwt.showcase.client.activities.social;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class FeedBoxPlace extends Place
{
	private final static String name = "FeedBox";
	//private Question
	
	public FeedBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<FeedBoxPlace>
	{

		@Override
		public String getToken(FeedBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public FeedBoxPlace getPlace(String token)
		{
			return new FeedBoxPlace();
		}


	}
}
