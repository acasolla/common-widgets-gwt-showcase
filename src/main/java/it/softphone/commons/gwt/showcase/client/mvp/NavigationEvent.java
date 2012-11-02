package it.softphone.commons.gwt.showcase.client.mvp;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class NavigationEvent extends Event<NavigationEvent.Handler> {

	public enum UIEntry {
		HINT_TEXT_BOX, 
		MASK,
		PORTRAIT,
		RICH_TEXT_AREA,
		SEARCH_BOX,
		HTML_LINK,
		ABOUT,
		COMMENT_BOX,
		COMMENT_BOX_LIST,
		FEED_BOX,
		REPLY_BOX,
		TAG_BOX,
		SIMPLE_FORM_DETAIL_DATA_GRID,
		ADVANCED_FORM_DETAIL_DATA_GRID;
	}

	public interface Handler {
		void onViewSelected(NavigationEvent event);
	}

	private static final Type<NavigationEvent.Handler> TYPE = new Type<NavigationEvent.Handler>();
	private final UIEntry entry;

	public static void fire(EventBus eventBus, UIEntry entry) {
		eventBus.fireEvent(new NavigationEvent(entry));
	}

	public static HandlerRegistration register(EventBus eventBus, Handler handler) {
		return eventBus.addHandler(TYPE, handler);
	}

	@Override
	public com.google.web.bindery.event.shared.Event.Type<Handler> getAssociatedType() {
		return TYPE;
	}

	protected NavigationEvent(UIEntry entry) {
		this.entry = entry;

	}

	@Override
	protected void dispatch(Handler handler) {
		handler.onViewSelected(this);

	}

	public static Type<NavigationEvent.Handler> getType() {
		return TYPE;
	}

	public UIEntry getEntry() {
		return entry;
	}
}
