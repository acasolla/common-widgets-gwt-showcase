package it.softphone.commons.gwt.showcase.client.activities.social;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.social.CommentBoxList;
import it.softphone.rd.model.shared.Feed;
import it.softphone.rd.model.shared.FeedAction;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class CommentBoxListViewImpl extends BaseViewImpl implements CommentBoxListView{

	public CommentBoxListViewImpl() {
		
		List<Feed> feeds = new ArrayList<Feed>();
		{
			ExampleFeed feed = new ExampleFeed();
			feed.setUser("Mike");
			feed.setIcon(resources.userMale().getSafeUri().asString());
			feeds.add(feed);
		}
		{
			ExampleFeed feed = new ExampleFeed();
			feed.setUser("Mike");
			feed.setIcon(resources.userMale().getSafeUri().asString());
			feeds.add(feed);
		}
		{
			ExampleFeed feed = new ExampleFeed();
			feed.setUser("Loreen");
			feed.setIcon(resources.userFemale().getSafeUri().asString());
			feeds.add(feed);
		}
		{
			ExampleFeed feed = new ExampleFeed();
			feed.setUser("Mike");
			feed.setIcon(resources.userMale().getSafeUri().asString());
			feeds.add(feed);
		}
	
		CommentBoxList<Feed> cbl = new CommentBoxList<Feed>(feeds);

		
		exampleContainer.add(cbl);
		
		
		
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-HTML;");
		sbStyle.append("\n");
		sbStyle.append("@external htmlLink;");
		sbStyle.append("\n");
		sbStyle.append("@external commentBoxImageUser;");
		sbStyle.append("\n");
		sbStyle.append("@external commentBoxImageCustomer;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxContainer{");
		sbStyle.append("\n");
		sbStyle.append("	width: 91%;");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #FFF;");
		sbStyle.append("\n");
		sbStyle.append("	padding : 10px;");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxImageCustomer{");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxImageCustomer img{");
		sbStyle.append("\n");
		sbStyle.append("	float:right;");
		sbStyle.append("\n");
		sbStyle.append("	clear:both;");
		sbStyle.append("\n");
		sbStyle.append("	margin-left:10px;");
		sbStyle.append("\n");
		sbStyle.append("	margin-right:0px;");
		sbStyle.append("\n");
		sbStyle.append("	width: 40px;");
		sbStyle.append("\n");
		sbStyle.append("	height:40px;");
		sbStyle.append("\n");
		sbStyle.append("	padding:0px 0px 5px 0px;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxImageUser{");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxImageUser img{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	clear:both;");
		sbStyle.append("\n");
		sbStyle.append("	margin-left:0px;");
		sbStyle.append("\n");
		sbStyle.append("	margin-right:10px;");
		sbStyle.append("\n");
		sbStyle.append("	width: 40px;");
		sbStyle.append("\n");
		sbStyle.append("	height:40px;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("	padding:0px 0px 5px 0px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxInfoContainer{");
		sbStyle.append("\n");
		sbStyle.append("	float:right;");
		sbStyle.append("\n");
		sbStyle.append("	width:100%;	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxInfoContainer .gwt-HTML{");
		sbStyle.append("\n");
		sbStyle.append("	float:right;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 0px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 0px;");
		sbStyle.append("\n");
		sbStyle.append("	color:#4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	font-style: italic;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 10px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxInfoContainer .htmlLink{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 0px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 0px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxListItem{");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%;");
		sbStyle.append("\n");
		sbStyle.append("	height: 100%;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".commentBoxListExternal{");
		sbStyle.append("\n");
		sbStyle.append("	padding: 5px 0px 5px 0px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("</pre>");

		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.social.CommentBoxList;");
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
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
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
		sbSource.append("		List<Feed> feeds = new ArrayList<Feed>();");
		sbSource.append("\n");
		sbSource.append("		{");
		sbSource.append("\n");
		sbSource.append("			ExampleFeed feed = new ExampleFeed();");
		sbSource.append("\n");
		sbSource.append("			feed.setUser(\"Mike\");");
		sbSource.append("\n");
		sbSource.append("			feed.setIcon(resources.userMale().getSafeUri().asString());");
		sbSource.append("\n");
		sbSource.append("			feeds.add(feed);");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		{");
		sbSource.append("\n");
		sbSource.append("			ExampleFeed feed = new ExampleFeed();");
		sbSource.append("\n");
		sbSource.append("			feed.setUser(\"Mike\");");
		sbSource.append("\n");
		sbSource.append("			feed.setIcon(resources.userMale().getSafeUri().asString());");
		sbSource.append("\n");
		sbSource.append("			feeds.add(feed);");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		{");
		sbSource.append("\n");
		sbSource.append("			ExampleFeed feed = new ExampleFeed();");
		sbSource.append("\n");
		sbSource.append("			feed.setUser(\"Loreen\");");
		sbSource.append("\n");
		sbSource.append("			feed.setIcon(resources.userFemale().getSafeUri().asString());");
		sbSource.append("\n");
		sbSource.append("			feeds.add(feed);");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		{");
		sbSource.append("\n");
		sbSource.append("			ExampleFeed feed = new ExampleFeed();");
		sbSource.append("\n");
		sbSource.append("			feed.setUser(\"Mike\");");
		sbSource.append("\n");
		sbSource.append("			feed.setIcon(resources.userMale().getSafeUri().asString());");
		sbSource.append("\n");
		sbSource.append("			feeds.add(feed);");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		CommentBoxList<Feed> cbl = new CommentBoxList<Feed>(feeds);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(cbl);");
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
		sbSource.append("		private String user;");
		sbSource.append("\n");
		sbSource.append("		private String icon;");
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
		sbSource.append("			return null;");
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
		sbSource.append("			return null;");
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
		sbSource.append("			StringBuilder sb = new StringBuilder();");
		sbSource.append("\n");
		sbSource.append("			sb.append(\"Lorem ipsum dolor sit amet, consectetur adipisicing elit, \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"in voluptate velit esse cillum dolore eu fugiat nulla pariatur. \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"Excepteur sint occaecat cupidatat non proident, \")");
		sbSource.append("\n");
		sbSource.append("			  .append(\"sunt in culpa qui officia deserunt mollit anim id est laborum.\");");
		sbSource.append("\n");
		sbSource.append("			return sb.toString();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setText(String text) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getUser() {");
		sbSource.append("\n");
		sbSource.append("			return user;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setUser(String user) {");
		sbSource.append("\n");
		sbSource.append("			this.user = user;");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public Date getDate() {");
		sbSource.append("\n");
		sbSource.append("			return new Date();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setDate(Date date) {");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getIcon() {");
		sbSource.append("\n");
		sbSource.append("			return icon;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setIcon(String icon) {");
		sbSource.append("\n");
		sbSource.append("			this.icon = icon;");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
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

		private String user;
		private String icon;
		@Override
		public Long getId() {
			return null;
		}

		@Override
		public void setId(Long id) {
		}

		@Override
		public Long getIssueId() {
			return null;
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
			return null;
		}

		@Override
		public void setAction(FeedAction action) {
		}

		@Override
		public String getText() {
			StringBuilder sb = new StringBuilder();
			sb.append("Lorem ipsum dolor sit amet, consectetur adipisicing elit, ")
			  .append("sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ")
			  .append("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ")
			  .append("ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit ")
			  .append("in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ")
			  .append("Excepteur sint occaecat cupidatat non proident, ")
			  .append("sunt in culpa qui officia deserunt mollit anim id est laborum.");
			return sb.toString();
		}

		@Override
		public void setText(String text) {
		}

		@Override
		public String getUser() {
			return user;
		}

		@Override
		public void setUser(String user) {
			this.user = user;
			
		}

		@Override
		public Date getDate() {
			return new Date();
		}

		@Override
		public void setDate(Date date) {
		}

		@Override
		public String getIcon() {
			return icon;
		}

		@Override
		public void setIcon(String icon) {
			this.icon = icon;
			
		}
		
	}
	
		
}
