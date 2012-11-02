package it.softphone.commons.gwt.showcase.client.activities.social;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class CommentBoxListPlace extends Place
{
	private final static String name = "CommentBoxList";
	//private Question
	
	public CommentBoxListPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<CommentBoxListPlace>
	{

		@Override
		public String getToken(CommentBoxListPlace place)
		{
			return place.getName();
		}

		@Override
		public CommentBoxListPlace getPlace(String token)
		{
			return new CommentBoxListPlace();
		}


	}
}
