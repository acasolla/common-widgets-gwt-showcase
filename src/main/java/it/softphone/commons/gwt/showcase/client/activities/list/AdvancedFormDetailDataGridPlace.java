package it.softphone.commons.gwt.showcase.client.activities.list;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

//public class HelloPlace extends ActivityPlace<HelloActivity>
public class AdvancedFormDetailDataGridPlace extends Place
{
	private final static String name = "NamedTooltipColumn";
	//private Question
	
	public AdvancedFormDetailDataGridPlace()
	{
		super();
	}

	public String getName()
	{
		return name;
	}

	public static class Tokenizer implements PlaceTokenizer<AdvancedFormDetailDataGridPlace>
	{

		@Override
		public String getToken(AdvancedFormDetailDataGridPlace place)
		{
			return place.getName();
		}

		@Override
		public AdvancedFormDetailDataGridPlace getPlace(String token)
		{
			return new AdvancedFormDetailDataGridPlace();
		}


	}
}
