package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class RichTextAreaPlace extends Place
{
	private final static String name = "RichTextArea";
	//private Question
	
	public RichTextAreaPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<RichTextAreaPlace>
	{

		@Override
		public String getToken(RichTextAreaPlace place)
		{
			return place.getName();
		}

		@Override
		public RichTextAreaPlace getPlace(String token)
		{
			return new RichTextAreaPlace();
		}


	}
}
