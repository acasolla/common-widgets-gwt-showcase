package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class HintTextBoxPlace extends Place
{
	private final static String name = "HintTextBox";
	//private Question
	
	public HintTextBoxPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<HintTextBoxPlace>
	{

		@Override
		public String getToken(HintTextBoxPlace place)
		{
			return place.getName();
		}

		@Override
		public HintTextBoxPlace getPlace(String token)
		{
			return new HintTextBoxPlace();
		}


	}
}
