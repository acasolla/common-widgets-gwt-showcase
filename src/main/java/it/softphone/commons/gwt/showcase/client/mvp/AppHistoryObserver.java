package it.softphone.commons.gwt.showcase.client.mvp;

import it.softphone.commons.gwt.showcase.client.activities.about.AboutPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.HintTextBoxPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.HtmlLinkPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.MaskPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.PortraitPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.RichTextAreaPlace;
import it.softphone.commons.gwt.showcase.client.activities.base.SearchBoxPlace;
import it.softphone.commons.gwt.showcase.client.activities.list.SimpleFormDetailDataGridPlace;
import it.softphone.commons.gwt.showcase.client.activities.list.AdvancedFormDetailDataGridPlace;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxListPlace;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxPlace;
import it.softphone.commons.gwt.showcase.client.activities.social.FeedBoxPlace;
import it.softphone.commons.gwt.showcase.client.activities.social.ReplyBoxPlace;
import it.softphone.commons.gwt.showcase.client.activities.tag.TagBoxPlace;
import it.softphone.commons.gwt.showcase.client.mvp.NavigationEvent.UIEntry;
import it.softphone.rd.gwt.client.history.HistoryHandler;
import it.softphone.rd.gwt.client.history.HistoryObserver;

import com.google.gwt.place.shared.Place;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class AppHistoryObserver implements HistoryObserver {

	@Override
	public void onPlaceChange(Place place, HistoryHandler handler) {
		

	}

	@Override
	public void onHistoryChanged(Place place, HistoryHandler handler) {

	}

	@Override
	public void onAppStarted(Place place, HistoryHandler historyHandler) {
		
	}

	@Override
	public HandlerRegistration bind(EventBus eventBus, final HistoryHandler historyHandler) {

		HandlerRegistration addHandler = eventBus.addHandler(NavigationEvent.getType(), new NavigationEvent.Handler() {

			@Override
			public void onViewSelected(NavigationEvent event) {
				
				Place place = null;
				UIEntry entry = event.getEntry();
				
				switch(entry){
				case ABOUT:
					place = new AboutPlace();
					break;
				case HINT_TEXT_BOX:
					place = new HintTextBoxPlace();
					break;
				case MASK:
					place = new MaskPlace();
					break;
				case SEARCH_BOX:
					place = new SearchBoxPlace();
					break;
				case RICH_TEXT_AREA:
					place = new RichTextAreaPlace();
					break;
				case PORTRAIT:
					place = new PortraitPlace();
					break;
				case HTML_LINK:
					place = new HtmlLinkPlace();
					break;
				case COMMENT_BOX:
					place = new CommentBoxPlace();
					break;
				case COMMENT_BOX_LIST:
					place = new CommentBoxListPlace();
					break;
				case FEED_BOX:
					place = new FeedBoxPlace();
					break;
				case REPLY_BOX:
					place = new ReplyBoxPlace();
					break;
				case SIMPLE_FORM_DETAIL_DATA_GRID:
					place = new SimpleFormDetailDataGridPlace();
					break;
				case TAG_BOX:
					place = new TagBoxPlace();
					break;
				case ADVANCED_FORM_DETAIL_DATA_GRID:
					place = new AdvancedFormDetailDataGridPlace();
					break;
		
					
				default:
					place = new AboutPlace();
				
				}
				historyHandler.replaceCurrentPlace(place);
				historyHandler.goTo(place, true);
	
			
			}


		
		});
		
		return addHandler;
		
	}




}
