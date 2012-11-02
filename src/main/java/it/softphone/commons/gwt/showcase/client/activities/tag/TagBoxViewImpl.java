package it.softphone.commons.gwt.showcase.client.activities.tag;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.tag.TagBox;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class TagBoxViewImpl extends BaseViewImpl implements TagBoxView{

	public TagBoxViewImpl() {
	
		TagBox tb = new TagBox();
		tb.addSuggestedTag("lake");
		tb.addSuggestedTag("sea");
		
		exampleContainer.add(tb);
		
		
		
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("#tagBox");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Label;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagContainer{");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid black;");
		sbStyle.append("\n");
		sbStyle.append("	background-color: white;");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	width: 99%;");
		sbStyle.append("\n");
		sbStyle.append("	height: 65px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagContainer input{");
		sbStyle.append("\n");
		sbStyle.append("	margin:5px;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 13px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 20px;");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagContainer .gwt-Label{");
		sbStyle.append("\n");
		sbStyle.append("	color: #313131;");
		sbStyle.append("\n");
		sbStyle.append("	font-weight: bold;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 10px;");
		sbStyle.append("\n");
		sbStyle.append("	float: left;");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagExternalContainer {");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%;");
		sbStyle.append("\n");
		sbStyle.append("	float: left;");
		sbStyle.append("\n");
		sbStyle.append("	height: 160px;");
		sbStyle.append("\n");
		sbStyle.append("	padding:10px 0px 0px 0px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagExternalContainer .gwt-Label{");
		sbStyle.append("\n");
		sbStyle.append("	color: #313131;");
		sbStyle.append("\n");
		sbStyle.append("	font-weight: bold;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 10px;");
		sbStyle.append("\n");
		sbStyle.append("	float: left;");
		sbStyle.append("\n");
		sbStyle.append("	margin-right: 5px;");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		
		sbStyle.append("\n");
		sbStyle.append("#tagElement");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Button;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-HTML;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer {");
		sbStyle.append("\n");
		sbStyle.append("	background-color:#EEEEEE;");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	display: -webkit-box;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-orient: horizontal;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-pack: center;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-align: center;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 5px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 25px;");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer-Suggested {");
		sbStyle.append("\n");
		sbStyle.append("	background-color:#EEEEEE;");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	display: -webkit-box;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-orient: horizontal;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-pack: center;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-align: center;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 5px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 25px;");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("	cursor:pointer;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer-Suggested:hover {");
		sbStyle.append("\n");
		sbStyle.append("	background-color:#4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	display: -webkit-box;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-orient: horizontal;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-pack: center;");
		sbStyle.append("\n");
		sbStyle.append("	-webkit-box-align: center;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 5px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 25px;");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer .gwt-HTML {");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 13px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 5px 8px 2px 8px;");
		sbStyle.append("\n");
		sbStyle.append("	color: #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer-Suggested .gwt-HTML {");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 13px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 5px 8px 2px 8px;");
		sbStyle.append("\n");
		sbStyle.append("	color: #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer-Suggested .gwt-HTML:hover {");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 13px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 5px 8px 2px 8px;");
		sbStyle.append("\n");
		sbStyle.append("	color: #fff;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer-Suggested .gwt-Button {");
		sbStyle.append("\n");
		sbStyle.append("	display: none;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer .gwt-Button {");
		sbStyle.append("\n");
		sbStyle.append("	margin:0px 3px 6px 3px;");
		sbStyle.append("\n");
		sbStyle.append("	color:black;");
		sbStyle.append("\n");
		sbStyle.append("	background:none;");
		sbStyle.append("\n");
		sbStyle.append("	background-color: transparent;");
		sbStyle.append("\n");
		sbStyle.append("	border: none;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 10px;");
		sbStyle.append("\n");
		sbStyle.append("	padding: 0px 1px 5px 1px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".tagElementContainer .gwt-Button:hover {");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #CBCBCB;");
		sbStyle.append("\n");
		sbStyle.append("	border-radius:50%;");
		sbStyle.append("\n");
		sbStyle.append("	color:white;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("</pre>");
	

		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.tag.TagBox;");
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
		sbSource.append("public class CommonWidgetExample implements EntryPoint{");
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
		sbSource.append("		TagBox tb = new TagBox();");
		sbSource.append("\n");
		sbSource.append("		tb.addSuggestedTag(\"lake\");");
		sbSource.append("\n");
		sbSource.append("		tb.addSuggestedTag(\"sea\");");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(tb);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
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
	

}
