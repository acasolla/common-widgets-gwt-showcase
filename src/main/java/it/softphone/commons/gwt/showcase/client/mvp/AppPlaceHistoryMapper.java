package it.softphone.commons.gwt.showcase.client.mvp;

import it.softphone.commons.gwt.showcase.client.activities.HomePlace;
import it.softphone.commons.gwt.showcase.client.activities.MainPlace;
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

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */
@WithTokenizers( {MainPlace.Tokenizer.class,
				  HintTextBoxPlace.Tokenizer.class,
				  HomePlace.Tokenizer.class,
				  MaskPlace.Tokenizer.class,
				  PortraitPlace.Tokenizer.class,
				  RichTextAreaPlace.Tokenizer.class,
				  SearchBoxPlace.Tokenizer.class,
				  HtmlLinkPlace.Tokenizer.class,
				  CommentBoxPlace.Tokenizer.class,
				  CommentBoxListPlace.Tokenizer.class,
				  FeedBoxPlace.Tokenizer.class,
				  ReplyBoxPlace.Tokenizer.class,
				  TagBoxPlace.Tokenizer.class,
				  SimpleFormDetailDataGridPlace.Tokenizer.class,
				  AdvancedFormDetailDataGridPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
