package it.softphone.commons.gwt.showcase.client.activities.social;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class ReplyBoxPlace extends Place
{
	private final static String name = "ReplyBox";
	//private Question
	
	public ReplyBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<ReplyBoxPlace>
	{

		@Override
		public String getToken(ReplyBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public ReplyBoxPlace getPlace(String token)
		{
			return new ReplyBoxPlace();
		}


	}
}
