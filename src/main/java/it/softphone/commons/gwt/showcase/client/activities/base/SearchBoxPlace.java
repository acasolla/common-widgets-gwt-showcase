package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class SearchBoxPlace extends Place
{
	private final static String name = "SearchBox";
	//private Question
	
	public SearchBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<SearchBoxPlace>
	{

		@Override
		public String getToken(SearchBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public SearchBoxPlace getPlace(String token)
		{
			return new SearchBoxPlace();
		}


	}
}
