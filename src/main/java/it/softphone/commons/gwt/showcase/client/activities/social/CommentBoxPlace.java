package it.softphone.commons.gwt.showcase.client.activities.social;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class CommentBoxPlace extends Place
{
	private final static String name = "CommentBox";
	//private Question
	
	public CommentBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<CommentBoxPlace>
	{

		@Override
		public String getToken(CommentBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public CommentBoxPlace getPlace(String token)
		{
			return new CommentBoxPlace();
		}


	}
}
