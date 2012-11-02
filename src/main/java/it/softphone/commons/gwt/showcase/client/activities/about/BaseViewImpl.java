/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.softphone.commons.gwt.showcase.client.activities.about;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link AboutView}.
 */
public abstract class BaseViewImpl extends Composite implements BaseView {

	interface BaseViewImplUiBinder extends UiBinder<Widget, BaseViewImpl> {}

	private static BaseViewImplUiBinder uiBinder = GWT
			.create(BaseViewImplUiBinder.class);
	
	@UiField FlowPanel container;
	
	protected FlowPanel exampleContainer = new FlowPanel();
	protected FlowPanel sourceContainer = new FlowPanel();
	protected FlowPanel styleContainer = new FlowPanel();


	public BaseViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		container.addStyleName(css.getMainCss().exampleContainer());
		container.add(getExample());
	}

	
	protected FlowPanel getContainer(){
		return container;
	}
	protected abstract Widget getExample();
	protected abstract Widget getStyle();
	protected abstract Widget getSource();
	
	protected final FlowPanel getExampleContainer() {
		return exampleContainer;
	}

	protected final FlowPanel getSourceContainer() {
		return sourceContainer;
	}

	protected final FlowPanel getStyleContainer() {
		return styleContainer;
	}

	

	@UiHandler("style")
	void onStyleClick(ClickEvent event) {
		container.clear();
		container.add(getStyle());
		container.removeStyleName(css.getMainCss().exampleContainer());
		container.addStyleName(css.getMainCss().codeContainer());
		
	}

	@UiHandler("source")
	void onSourceClick(ClickEvent event) {
		container.clear();
		container.add(getSource());
		container.removeStyleName(css.getMainCss().exampleContainer());
		container.addStyleName(css.getMainCss().codeContainer());
		
	}
	
	@UiHandler("example")
	void onExampleClick(ClickEvent event) {
		container.clear();
		container.add(getExample());
		container.addStyleName(css.getMainCss().exampleContainer());
		container.removeStyleName(css.getMainCss().codeContainer());
		
	}

}
