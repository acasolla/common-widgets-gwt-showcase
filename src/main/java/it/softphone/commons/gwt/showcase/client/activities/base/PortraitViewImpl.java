package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.Portrait;
import it.softphone.rd.model.shared.BaseUser;

import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class PortraitViewImpl extends BaseViewImpl implements PortraitView{
	
	
	public PortraitViewImpl() {
	
		ExampleUser user = new ExampleUser();
		
		Portrait<BaseUser> portrait = new Portrait<BaseUser>(user);
		exampleContainer.add(portrait);
		
		StringBuilder sbStyle = new StringBuilder();
		
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-HTML;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".portraitContainer{");
		sbStyle.append("\n");
		sbStyle.append("	width: 140px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 180px;");
		sbStyle.append("\n");
		sbStyle.append("	float: left;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 5px;");
		sbStyle.append("\n");
		sbStyle.append("   -webkit-box-shadow: inset 0px 1px 0px #c4c4c4, 1px 5px 0px 0px #4c4c4c, 1px 6px 5px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("   -moz-box-shadow: inset 0px 1px 0px #c4c4c4, 1px 5px 0px 0px #4c4c4c, 1px 6px 5px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("   -o-box-shadow: inset 0px 1px 0px #c4c4c4, 1px 5px 0px 0px #4c4c4c, 1px 6px 5px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("   box-shadow: inset 0px 1px 0px #c4c4c4, 1px 5px 0px 0px #4c4c4c, 1px 6px 5px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("   left:30px;");
		sbStyle.append("\n");
		sbStyle.append("   margin: 0px 10px 20px 10px;");
		sbStyle.append("\n");
		sbStyle.append("   background-color: #ffffff;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".portraitContainer:active{");
		sbStyle.append("\n");
		sbStyle.append("	top:3px;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-shadow: inset 0px 1px 0px #c4c4c4, 0px 2px 0px 0px #4c4c4c, 0px 3px 3px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	-moz-box-shadow: inset 0px 1px 0px #c4c4c4, 0px 2px 0px 0px #4c4c4c, 0px 3px 3px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	-o-box-shadow: inset 0px 1px 0px #c4c4c4, 0px 2px 0px 0px #4c4c4c, 0px 3px 3px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	box-shadow: inset 0px 1px 0px #c4c4c4, 0px 2px 0px 0px #4c4c4c, 0px 3px 3px #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".portraitContainer img{");
		sbStyle.append("\n");
		sbStyle.append("	width: 135px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 135px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 3px 0px 0px 0px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".portraitContainer .gwt-HTML{");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 12px;");
		sbStyle.append("\n");
		sbStyle.append("	font-weight: normal;");
		sbStyle.append("\n");
		sbStyle.append("	color: #000;");
		sbStyle.append("\n");
		sbStyle.append("	float: none;");
		sbStyle.append("\n");
		sbStyle.append("	padding:0px 0px 0px 3px;");
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
		sbStyle.append("</pre>");
		
		styleContainer.add(new HTML(sbStyle.toString()));
		
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.Portrait;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.model.shared.BaseUser;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.safehtml.shared.SafeUri;");
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
		sbSource.append("		ExampleUser user = new ExampleUser();");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		Portrait<BaseUser> portrait = new Portrait<BaseUser>(user);");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(portrait);");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	class ExampleUser implements BaseUser{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getName() {");
		sbSource.append("\n");
		sbSource.append("			return \"Scarlett\";");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public String getSurname() {");
		sbSource.append("\n");
		sbSource.append("			return \"Johansson\";");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public SafeUri getImageUri() {");
		sbSource.append("\n");
		sbSource.append("			return resources.scarlett().getSafeUri();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
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

	class ExampleUser implements BaseUser{

		@Override
		public String getName() {
			return "Scarlett";
		}

		@Override
		public String getSurname() {
			return "Johansson";
		}

		@Override
		public SafeUri getImageUri() {
			return resources.scarlett().getSafeUri();
		}

	}
}
