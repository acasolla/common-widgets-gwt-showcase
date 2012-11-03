package it.softphone.commons.gwt.showcase.client;



import it.softphone.commons.gwt.showcase.client.activities.HomeView;
import it.softphone.commons.gwt.showcase.client.activities.HomeViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.MainView;
import it.softphone.commons.gwt.showcase.client.activities.MainViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.HintTextBoxView;
import it.softphone.commons.gwt.showcase.client.activities.base.HintTextBoxViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.HtmlLinkView;
import it.softphone.commons.gwt.showcase.client.activities.base.HtmlLinkViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.MaskView;
import it.softphone.commons.gwt.showcase.client.activities.base.MaskViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.PortraitView;
import it.softphone.commons.gwt.showcase.client.activities.base.PortraitViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.RichTextAreaView;
import it.softphone.commons.gwt.showcase.client.activities.base.RichTextAreaViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.base.SearchBoxView;
import it.softphone.commons.gwt.showcase.client.activities.base.SearchBoxViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.list.SimpleFormDetailDataGridView;
import it.softphone.commons.gwt.showcase.client.activities.list.SimpleFormDetailDataGridViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.list.AdvancedFormDetailDataGridView;
import it.softphone.commons.gwt.showcase.client.activities.list.AdvancedFormDetailDataGridViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxListView;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxListViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxView;
import it.softphone.commons.gwt.showcase.client.activities.social.CommentBoxViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.social.FeedBoxView;
import it.softphone.commons.gwt.showcase.client.activities.social.FeedBoxViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.social.ReplyBoxView;
import it.softphone.commons.gwt.showcase.client.activities.social.ReplyBoxViewImpl;
import it.softphone.commons.gwt.showcase.client.activities.tag.TagBoxView;
import it.softphone.commons.gwt.showcase.client.activities.tag.TagBoxViewImpl;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class ClientFactoryImpl implements ClientFactory
{
	private static final EventBus eventBus = new SimpleEventBus();
	private static final PlaceController placeController = new PlaceController(eventBus);
	private static final MainViewImpl main = new MainViewImpl();
	private static final HomeViewImpl home = new HomeViewImpl();

	private static final HintTextBoxViewImpl hintTextBox = new HintTextBoxViewImpl();
	private static final MaskViewImpl mask = new MaskViewImpl();
	private static final HtmlLinkViewImpl htmlLink = new HtmlLinkViewImpl();
	private static final PortraitViewImpl portrait = new PortraitViewImpl();
	private static final RichTextAreaViewImpl richTextArea = new RichTextAreaViewImpl();
	private static final SearchBoxViewImpl searchBox = new SearchBoxViewImpl();
	
	private static final CommentBoxViewImpl commentBox = new CommentBoxViewImpl();
	private static final CommentBoxListViewImpl commentBoxList = new CommentBoxListViewImpl();
	private static final FeedBoxViewImpl feedBox = new FeedBoxViewImpl();
	private static final ReplyBoxViewImpl replyBox = new ReplyBoxViewImpl();
	
	private static final TagBoxViewImpl tagBox = new TagBoxViewImpl();
	
	private static final SimpleFormDetailDataGridViewImpl simpleFormDetailDataGrid = new SimpleFormDetailDataGridViewImpl();
	private static final AdvancedFormDetailDataGridViewImpl advancedFormDetailDataGrid = new AdvancedFormDetailDataGridViewImpl();
	
	@Override
	public EventBus getEventBus()
	{
		return eventBus;
	}

	
	@Override
	public PlaceController getPlaceController()
	{
		return placeController;
	}



	@Override
	public HomeView getHomeView() {
		return home;
	}


	@Override
	public MainView getMainView() {
		return main;
	}


	@Override
	public HintTextBoxView getHintTextBoxView() {
		return hintTextBox;
	}


	@Override
	public MaskView getMaskView() {
		return mask;
	}


	@Override
	public HtmlLinkView getHtmlLinkView() {
		return htmlLink;
	}


	@Override
	public PortraitView getPortraitView() {
		return portrait;
	}


	@Override
	public RichTextAreaView getRichTextAreaView() {
		return richTextArea;
	}


	@Override
	public SearchBoxView getSearchBoxView() {
		return searchBox;
	}


	@Override
	public CommentBoxView getCommentBoxView() {
		return commentBox;
	}


	@Override
	public CommentBoxListView getCommentBoxListView() {
		return commentBoxList;
	}


	@Override
	public FeedBoxView getFeedBoxView() {
		return feedBox;
	}


	@Override
	public ReplyBoxView getReplyBoxView() {
		return replyBox;
	}


	@Override
	public TagBoxView getTagBoxView() {
		return tagBox;
	}


	@Override
	public SimpleFormDetailDataGridView getSimpleFormDetailDataGridView() {
		return simpleFormDetailDataGrid;
	}


	@Override
	public AdvancedFormDetailDataGridView getAdvancedFormDetailDataGridView() {
		return advancedFormDetailDataGrid;
	}




	
}
