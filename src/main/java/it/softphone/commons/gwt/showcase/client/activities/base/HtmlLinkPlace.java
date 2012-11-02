package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class HtmlLinkPlace extends Place
{
	private final static String name = "HtmlLink";
	//private Question
	
	public HtmlLinkPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<HtmlLinkPlace>
	{

		@Override
		public String getToken(HtmlLinkPlace place)
		{
			return place.getName();
		}

		@Override
		public HtmlLinkPlace getPlace(String token)
		{
			return new HtmlLinkPlace();
		}


	}
}
