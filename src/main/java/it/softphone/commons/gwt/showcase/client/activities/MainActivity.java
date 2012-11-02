package it.softphone.commons.gwt.showcase.client.activities;

import it.softphone.commons.gwt.showcase.client.ClientFactory;
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

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public class MainActivity extends AbstractActivity {
	// Used to obtain views, eventBus, placeController
	// Alternatively, could be injected via GIN
	private ClientFactory clientFactory;
	
	public MainActivity(Place place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	/**
	 * Invoked by the ActivityManager to start a new Activity
	 */
	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		MainView mainPanel = clientFactory.getMainView();
		mainPanel.setEventBus(clientFactory.getEventBus());
		containerWidget.setWidget(mainPanel.asWidget());
		
	}

	public void setCenterView( Place place ){
		final MainView mainPanel = clientFactory.getMainView();
		if ( place == null ) return;
	
		IsWidget page = clientFactory.getAboutView();
	
		if ( place instanceof MaskPlace ){
			page = clientFactory.getMaskView();
		}
		if ( place instanceof HintTextBoxPlace ){
			page = clientFactory.getHintTextBoxView();
		}
		if ( place instanceof PortraitPlace ){
			page = clientFactory.getPortraitView();
		}
		if ( place instanceof RichTextAreaPlace ){
			page = clientFactory.getRichTextAreaView();
		}
		if ( place instanceof SearchBoxPlace ){
			page = clientFactory.getSearchBoxView();
		}
		if ( place instanceof HtmlLinkPlace ){
			page = clientFactory.getHtmlLinkView();
		}
		if ( place instanceof CommentBoxPlace ){
			page = clientFactory.getCommentBoxView();
		}
		if ( place instanceof CommentBoxListPlace ){
			page = clientFactory.getCommentBoxListView();
		}
		if ( place instanceof FeedBoxPlace ){
			page = clientFactory.getFeedBoxView();
		}
		if ( place instanceof ReplyBoxPlace ){
			page = clientFactory.getReplyBoxView();
		}
		if ( place instanceof TagBoxPlace ){
			page = clientFactory.getTagBoxView();
		}
		if ( place instanceof SimpleFormDetailDataGridPlace ){
			page = clientFactory.getSimpleFormDetailDataGridView();
		}
		if ( place instanceof AdvancedFormDetailDataGridPlace ){
			page = clientFactory.getAdvancedFormDetailDataGridView();
		}

		mainPanel.setContentWidget(page);
		
		
	}


	


}
