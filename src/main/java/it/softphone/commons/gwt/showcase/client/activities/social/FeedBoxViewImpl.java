package it.softphone.commons.gwt.showcase.client.activities.social;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.HintTextBox;
import it.softphone.rd.gwt.client.widget.base.social.FeedBox;
import it.softphone.rd.model.shared.Feed;
import it.softphone.rd.model.shared.FeedAction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;

public class FeedBoxViewImpl extends BaseViewImpl implements FeedBoxView{

	public FeedBoxViewImpl() {
	
		HorizontalPanel hp = new HorizontalPanel();
		hp.setHeight("100px");
		final HintTextBox hintTextBox = new HintTextBox("", "Enter feed text");
		final FlowPanel container = new FlowPanel();
		final List<FeedBox> widgets = new ArrayList<FeedBox>();
		Button submit = new Button("Submit");
		submit.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				ExampleFeed feed = new ExampleFeed();
				feed.setText(hintTextBox.getText());
				feed.setDate(new Date());
			    FeedBox fb = new FeedBox(feed);
				container.clear();
				container.insert(fb, 0);
				for ( FeedBox ff : widgets )
					container.add(ff);
				widgets.add(0, fb);
				hintTextBox.reset();
				
			}
		});
		
		hp.add(hintTextBox);
		hp.add(submit);
		exampleContainer.add(hp);
		exampleContainer.add(container);
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external htmlLink;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-HTML;");
		sbStyle.append("\n");
		sbStyle.append("@external socialBoxContainer;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@-webkit-keyframes slideinfromright {");
		sbStyle.append("\n");
		sbStyle.append("    from { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateX(100%); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("    to { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateX(0); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@-webkit-keyframes slideinfromleft {");
		sbStyle.append("\n");
		sbStyle.append("    from { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateX(-100%); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("    to { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateX(0); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@-webkit-keyframes slideinfromtop {");
		sbStyle.append("\n");
		sbStyle.append("    from { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateY(-100%); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("    to { ");
		sbStyle.append("\n");
		sbStyle.append("    	-webkit-transform: translateY(0); ");
		sbStyle.append("\n");
		sbStyle.append("    }");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@-webkit-keyframes fade {");
		sbStyle.append("\n");
		sbStyle.append("	0%   { opacity: 0; }");
		sbStyle.append("\n");
		sbStyle.append("	100% { opacity: 1; }");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".socialBoxContainer{");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #FFF;");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%;");
		sbStyle.append("\n");
		sbStyle.append("	height: 60px;");
		sbStyle.append("\n");
		sbStyle.append("	border-bottom: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("	\\-webkit-animation-duration: 900ms;");
		sbStyle.append("\n");
		sbStyle.append("    \\-webkit-animation-iteration-count: 1;");
		sbStyle.append("\n");
		sbStyle.append("    \\-webkit-animation-timing-function: ease-in-out;");
		sbStyle.append("\n");
		sbStyle.append("    \\-webkit-animation-fill-mode: both;");
		sbStyle.append("\n");
		sbStyle.append("    \\-webkit-animation-name: slideinfromtop;");
		sbStyle.append("\n");
		sbStyle.append("    margin-top: 0px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".socialContentBox{}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxContainer{");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxImageContainer {");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%; ");
		sbStyle.append("\n");
		sbStyle.append("    height: 100%; ");
		sbStyle.append("\n");
		sbStyle.append("    left: 0px; ");
		sbStyle.append("\n");
		sbStyle.append("    top: 0px; ");
		sbStyle.append("\n");
		sbStyle.append("    ");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxImage {");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxImage img{");
		sbStyle.append("\n");
		sbStyle.append("	width:20px;");
		sbStyle.append("\n");
		sbStyle.append("    height:20px;");
		sbStyle.append("\n");
		sbStyle.append("    float:left;");
		sbStyle.append("\n");
		sbStyle.append("    padding:2px;");
		sbStyle.append("\n");
		sbStyle.append("    margin-top: 4px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxContainer .htmlLink{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	color:#3B5998;");
		sbStyle.append("\n");
		sbStyle.append("	font-size:12px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 2px 5px 2px 3px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append(".feedBoxContainer .gwt-HTML{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 2px 5px 2px 3px;");
		sbStyle.append("\n");
		sbStyle.append("	width: 70%;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("</pre>");

		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.HintTextBox;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.social.FeedBox;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.model.shared.Feed;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.model.shared.FeedAction;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import java.util.ArrayList;");
		sbSource.append("\n");
		sbSource.append("import java.util.Date;");
		sbSource.append("\n");
		sbSource.append("import java.util.List;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickEvent;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickHandler;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Button;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HorizontalPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.RootLayoutPanel;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("public class CommonWidgetExample implements EntryPoint,ResourceAware {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public void onModuleLoad() {");
		sbSource.append("\n");
		sbSource.append("		RootLayoutPanel rp = RootLayoutPanel.get();");
		sbSource.append("\n");
		sbSource.append("		rp.add(buildWidget());");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	private FlowPanel buildWidget(){");
		sbSource.append("\n");
		sbSource.append("		FlowPanel exampleContainer = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		HorizontalPanel hp = new HorizontalPanel();");
		sbSource.append("\n");
		sbSource.append("		hp.setHeight(\"100px\");");
		sbSource.append("\n");
		sbSource.append("		final HintTextBox hintTextBox = new HintTextBox(\"\", \"Enter feed text\");");
		sbSource.append("\n");
		sbSource.append("		final FlowPanel container = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("		final List<FeedBox> widgets = new ArrayList<FeedBox>();");
		sbSource.append("\n");
		sbSource.append("		Button submit = new Button(\"Submit\");");
		sbSource.append("\n");
		sbSource.append("		submit.addClickHandler(new ClickHandler() {");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public void onClick(ClickEvent event) {");
		sbSource.append("\n");
		sbSource.append("				ExampleFeed feed = new ExampleFeed();");
		sbSource.append("\n");
		sbSource.append("				feed.setText(hintTextBox.getText());");
		sbSource.append("\n");
		sbSource.append("				feed.setDate(new Date());");
		sbSource.append("\n");
		sbSource.append("			    FeedBox fb = new FeedBox(feed);");
		sbSource.append("\n");
		sbSource.append("				container.clear();");
		sbSource.append("\n");
		sbSource.append("				container.insert(fb, 0);");
		sbSource.append("\n");
		sbSource.append("				for ( FeedBox ff : widgets )");
		sbSource.append("\n");
		sbSource.append("					container.add(ff);");
		sbSource.append("\n");
		sbSource.append("				widgets.add(0, fb);");
		sbSource.append("\n");
		sbSource.append("				hintTextBox.reset();");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		});");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		hp.add(hintTextBox);");
		sbSource.append("\n");
		sbSource.append("		hp.add(submit);");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(hp);");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(container);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	class ExampleFeed implements Feed{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		private String text;");
		sbSource.append("\n");
		sbSource.append("		private Date date;");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public Long getId() {");
		sbSource.append("\n");
		sbSource.append("			return null;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setId(Long id) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public Long getIssueId() {");
		sbSource.append("\n");
		sbSource.append("			return 1L;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setIssueId(Long issueId) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getRequestorId() {");
		sbSource.append("\n");
		sbSource.append("			return null;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setRequestorId(String requestorId) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public FeedAction getAction() {");
		sbSource.append("\n");
		sbSource.append("			return FeedAction.REPLY;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setAction(FeedAction action) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getText() {");
		sbSource.append("\n");
		sbSource.append("			return text;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setText(String text) {");
		sbSource.append("\n");
		sbSource.append("			this.text = text;");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getUser() {");
		sbSource.append("\n");
		sbSource.append("			return \"Mike\";");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setUser(String user) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public Date getDate() {");
		sbSource.append("\n");
		sbSource.append("			 return date;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setDate(Date date) {");
		sbSource.append("\n");
		sbSource.append("			 this.date = date;");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getIcon() {");
		sbSource.append("\n");
		sbSource.append("			return resources.userMale().getSafeUri().asString();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setIcon(String icon) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("}");
		sbSource.append("\n");
		sbSource.append("</pre>");


		sourceContainer.add(new HTML(sbSource.toString()));

		
	}

	@Override
	protected Widget getStyle() {

		return styleContainer;
	}


	@Override
	protected Widget getSource() {
		return sourceContainer;
	}


	@Override
	protected Widget getExample() {
		return exampleContainer;
	}
	
	class ExampleFeed implements Feed{

		private String text;
		private Date date;
		@Override
		public Long getId() {
			return null;
		}

		@Override
		public void setId(Long id) {
		}

		@Override
		public Long getIssueId() {
			return 1L;
		}

		@Override
		public void setIssueId(Long issueId) {
		}

		@Override
		public String getRequestorId() {
			return null;
		}

		@Override
		public void setRequestorId(String requestorId) {
		}

		@Override
		public FeedAction getAction() {
			return FeedAction.REPLY;
		}

		@Override
		public void setAction(FeedAction action) {
		}

		@Override
		public String getText() {
			return text;
		}

		@Override
		public void setText(String text) {
			this.text = text;
			
		}

		@Override
		public String getUser() {
			return "Mike";
		}

		@Override
		public void setUser(String user) {
		}

		@Override
		public Date getDate() {
			 return date;
		}

		@Override
		public void setDate(Date date) {
			 this.date = date;
			
		}

		@Override
		public String getIcon() {
			return resources.userMale().getSafeUri().asString();
		}

		@Override
		public void setIcon(String icon) {
		}
		
	}
}
