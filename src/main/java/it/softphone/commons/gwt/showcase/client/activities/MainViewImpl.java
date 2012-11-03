package it.softphone.commons.gwt.showcase.client.activities;

import it.softphone.commons.gwt.showcase.client.mvp.NavigationEvent;
import it.softphone.commons.gwt.showcase.client.mvp.NavigationEvent.UIEntry;
import it.softphone.rd.gwt.client.widget.base.HTMLLink;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;

public class MainViewImpl extends Composite implements MainView{
	interface MainPanelImplUiBinder extends UiBinder<Widget, MainViewImpl> {}

	private static MainPanelImplUiBinder uiBinder = GWT
			.create(MainPanelImplUiBinder.class);
	
	private EventBus bus;
	 @UiField SimplePanel centerPanel;
	@UiField Tree tree;
	@UiField HTMLLink home;
	
	public MainViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		addHandlers();
		
	}
	
		
	public void addHandlers(){
		
	}
	
	
	@Override
	public void setWidget(IsWidget w) {
		centerPanel.setWidget(w);
		
	}


	@Override
	public void setContentWidget( IsWidget w) {

		centerPanel.setWidget(w);
	}

	@UiHandler("home")
	void onHomeClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.HOME);
	}

	
	@UiHandler("hint")
	void onHintClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.HINT_TEXT_BOX);
	}

	@UiHandler("mask")
	void onMaskClick(ClickEvent event) {
			NavigationEvent.fire(bus, UIEntry.MASK);
	}

	@UiHandler("link")
	void onLinkClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.HTML_LINK);
	}

	@UiHandler("portrait")
	void onPortraitClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.PORTRAIT);
	}

	@UiHandler("richTextArea")
	void onRichTextAreaClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.RICH_TEXT_AREA);
	}

	@UiHandler("searchBox")
	void onSearchBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.SEARCH_BOX);
	}

	@UiHandler("comment")
	void onCommentBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.COMMENT_BOX);
	}

	@UiHandler("commentList")
	void onCommentListBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.COMMENT_BOX_LIST);
	}

	@UiHandler("feed")
	void onFeedBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.FEED_BOX);
	}

	@UiHandler("reply")
	void onReplyBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.REPLY_BOX);
	}


	@UiHandler("tag")
	void onTagBoxClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.TAG_BOX);
	}

	@UiHandler("simpleFormDetail")
	void onSimpleFormDetailClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.SIMPLE_FORM_DETAIL_DATA_GRID);
	}

	@UiHandler("advancedFormDetail")
	void onAdvancedFormDetailClick(ClickEvent event) {
		NavigationEvent.fire(bus, UIEntry.ADVANCED_FORM_DETAIL_DATA_GRID);
	}

	@Override
	public void setEventBus(EventBus bus) {
		this.bus = bus;
		
	}



}
