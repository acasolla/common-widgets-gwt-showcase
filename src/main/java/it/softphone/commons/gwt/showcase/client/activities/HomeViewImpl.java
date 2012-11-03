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

import it.softphone.rd.gwt.client.widget.base.HTMLLink;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

/**
 * Sample implementation of {@link HomeView}.
 */
public class HomeViewImpl extends Composite implements HomeView {

	private FlowPanel container = new FlowPanel();
	
	public HomeViewImpl() {
		initWidget(container);
		container.add(new HTML("<h1>About</h1>"));
		HTMLLink link = new HTMLLink("javadoc");
		link.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				Window.Location.replace("http://acasolla.github.com/common-widgets-gwt/docs");
				
			}
		});
		
		container.add(link);
	}

	@Override
	public void setPresenter(Presenter listener) {
	
	}

	
	
	
	
}