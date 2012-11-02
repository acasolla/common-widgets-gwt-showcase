package it.softphone.commons.gwt.showcase.client.activities.tag;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class TagBoxPlace extends Place
{
	private final static String name = "TagBox";
	//private Question
	
	public TagBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<TagBoxPlace>
	{

		@Override
		public String getToken(TagBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public TagBoxPlace getPlace(String token)
		{
			return new TagBoxPlace();
		}


	}
}
