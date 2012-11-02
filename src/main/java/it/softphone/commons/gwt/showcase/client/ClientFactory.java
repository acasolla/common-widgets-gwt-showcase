package it.softphone.commons.gwt.showcase.client;

import it.softphone.commons.gwt.showcase.client.activities.MainView;
import it.softphone.commons.gwt.showcase.client.activities.about.AboutView;
import it.softphone.commons.gwt.showcase.client.activities.base.HintTextBoxView;
import it.softphone.commons.gwt.showcase.client.activities.base.HtmlLinkView;
import it.softphone.commons.gwt.showcase.client.activities.base.MaskView;
import it.softphone.commons.gwt.showcase.client.activities.base.PortraitView;
import it.softphone.commons.gwt.showcase.client.activities.base.RichTextAreaView;
import it.softphone.commons.gwt.showcase.client.activities.base.SearchBoxView;
import it.softphone.commons.gwt.showcase.client.activities.list.SimpleFormDetailDataGridView;
import it.softphone.commons.gwt.showcase.client.activities.list.AdvancedFormDetailDataGridView;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxListView;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxView;
import it.softphone.commons.gwt.showcase.client.activities.social.FeedBoxView;
import it.softphone.commons.gwt.showcase.client.activities.social.ReplyBoxView;
import it.softphone.commons.gwt.showcase.client.activities.tag.TagBoxView;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory
{
	EventBus getEventBus();
	PlaceController getPlaceController();
	
	MainView getMainView();
	AboutView getAboutView();
	
	HintTextBoxView getHintTextBoxView();
	MaskView getMaskView();
	HtmlLinkView getHtmlLinkView();
	PortraitView getPortraitView();
	RichTextAreaView getRichTextAreaView();
	SearchBoxView getSearchBoxView();
	
	CommentBoxView getCommentBoxView();
	CommentBoxListView getCommentBoxListView();
	FeedBoxView getFeedBoxView();
	ReplyBoxView getReplyBoxView();

	TagBoxView getTagBoxView();
	
	SimpleFormDetailDataGridView getSimpleFormDetailDataGridView();
	AdvancedFormDetailDataGridView getAdvancedFormDetailDataGridView();
}
