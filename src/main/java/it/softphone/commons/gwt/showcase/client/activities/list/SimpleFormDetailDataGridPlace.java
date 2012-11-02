package it.softphone.commons.gwt.showcase.client.activities.list;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class SimpleFormDetailDataGridPlace extends Place
{
	private final static String name = "FormDetail";
	//private Question
	
	public SimpleFormDetailDataGridPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<SimpleFormDetailDataGridPlace>
	{

		@Override
		public String getToken(SimpleFormDetailDataGridPlace place)
		{
			return place.getName();
		}

		@Override
		public SimpleFormDetailDataGridPlace getPlace(String token)
		{
			return new SimpleFormDetailDataGridPlace();
		}


	}
}
