package it.softphone.commons.gwt.showcase.client.activities.base;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class MaskPlace extends Place
{
	private final static String name = "Mask";
	//private Question
	
	public MaskPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<MaskPlace>
	{

		@Override
		public String getToken(MaskPlace place)
		{
			return place.getName();
		}

		@Override
		public MaskPlace getPlace(String token)
		{
			return new MaskPlace();
		}


	}
}
