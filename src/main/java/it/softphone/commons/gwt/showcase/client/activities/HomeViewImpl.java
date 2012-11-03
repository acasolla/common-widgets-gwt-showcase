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
package it.softphone.commons.gwt.showcase.client.activities;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Sample implementation of {@link HomeView}.
 */
public class HomeViewImpl extends Composite implements HomeView {

	interface  HomeViewImplUiBinder extends UiBinder<Widget, HomeViewImpl>{}
	
	private static HomeViewImplUiBinder uiBinder = GWT
			.create(HomeViewImplUiBinder.class);
	
	public HomeViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(Presenter listener) {
	
	}

	@UiHandler("soul")
	void onSoulClick(ClickEvent event) {
		Window.Location.replace("http://www.soulsoftware.it/");
	}

	@UiHandler("docs")
	void onDocsClick(ClickEvent event) {
		Window.Location.replace("http://acasolla.github.com/common-widgets-gwt/docs");
	}

	@UiHandler("libsource")
	void onLibClick(ClickEvent event) {
		Window.Location.replace("https://github.com/acasolla/common-widgets-gwt");
	}
	
	@UiHandler("showsource")
	void onShowClick(ClickEvent event) {
		Window.Location.replace("https://github.com/acasolla/common-widgets-gwt-showcase");
	}
	
	
	
}
