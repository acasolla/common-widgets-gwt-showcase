package it.softphone.commons.gwt.showcase.client.activities.social;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.social.ReplyBox;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class ReplyBoxViewImpl extends BaseViewImpl implements ReplyBoxView{

	public ReplyBoxViewImpl() {
	
		ReplyBox rb = new ReplyBox() {
			
			@Override
			public void reply() {
				 Window.alert("Msg replyed : " + getReplyText());
				
			}
		};
		
		exampleContainer.add(rb);
		
		
		
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Label;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-CheckBox;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-HTML;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Button;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-ListBox;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-RichTextArea;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer{");
		sbStyle.append("\n");
		sbStyle.append("  float:left;");
		sbStyle.append("\n");
		sbStyle.append("  width:91%;");
		sbStyle.append("\n");
		sbStyle.append("  background-color:#d0d0d0;");
		sbStyle.append("\n");
		sbStyle.append("  padding : 10px;");
		sbStyle.append("\n");
		sbStyle.append("  border: 1px solid #c4c4c4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxImageContainer {");
		sbStyle.append("\n");
		sbStyle.append(" }");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxImageContainer img {");
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
		sbStyle.append(".answerBoxContainer input{");
		sbStyle.append("\n");
		sbStyle.append("	height: 30px;");
		sbStyle.append("\n");
		sbStyle.append("	width: 100%");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-RichTextArea{");
		sbStyle.append("\n");
		sbStyle.append("	width:100%;");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #FFF;");
		sbStyle.append("\n");
		sbStyle.append("	height: 60px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Label{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 20px 20px 0px 10px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-HTML{");
		sbStyle.append("\n");
		sbStyle.append("	float:right;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 20px 20px 0px 10px;");
		sbStyle.append("\n");
		sbStyle.append("	color: #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-CheckBox input{");
		sbStyle.append("\n");
		sbStyle.append("	float:left;");
		sbStyle.append("\n");
		sbStyle.append("	width: 20px;");
		sbStyle.append("\n");
		sbStyle.append("	margin-top: 14px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-ListBox{");
		sbStyle.append("\n");
		sbStyle.append("	color: #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	margin: 13px 20px 0px 0px;");
		sbStyle.append("\n");
		sbStyle.append("	min-width: 20%;");
		sbStyle.append("\n");
		sbStyle.append("	max-width: 260px;");
		sbStyle.append("\n");
		sbStyle.append("	float:right;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Button {");
		sbStyle.append("\n");
		sbStyle.append("  background:none;");
		sbStyle.append("\n");
		sbStyle.append("  background-color: #719999;");
		sbStyle.append("\n");
		sbStyle.append("  border:1px solid #037DAB;");
		sbStyle.append("\n");
		sbStyle.append("  border-color:#000000;");
		sbStyle.append("\n");
		sbStyle.append("  color:#FFFFFF;");
		sbStyle.append("\n");
		sbStyle.append("  line-height:100% !important;");
		sbStyle.append("\n");
		sbStyle.append("  padding:6px 16px;");
		sbStyle.append("\n");
		sbStyle.append("  text-decoration:none;");
		sbStyle.append("\n");
		sbStyle.append("  text-shadow:#666666 -1px -1px 0;");
		sbStyle.append("\n");
		sbStyle.append("  margin-top:15px;");
		sbStyle.append("\n");
		sbStyle.append("  font-weight:700;");
		sbStyle.append("\n");
		sbStyle.append("  float:right;");
		sbStyle.append("\n");
		sbStyle.append("  margin-right:5px;");
		sbStyle.append("\n");
		sbStyle.append("  width:100px;");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Button:active {");
		sbStyle.append("\n");
		sbStyle.append("  border: 1px inset #ccc;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Button:hover {");
		sbStyle.append("\n");
		sbStyle.append("  border-color: #9cf #69e #69e #7af;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Button[disabled] {");
		sbStyle.append("\n");
		sbStyle.append("  cursor: default;");
		sbStyle.append("\n");
		sbStyle.append("  color: #888;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append(".answerBoxContainer .gwt-Button[disabled]:hover {");
		sbStyle.append("\n");
		sbStyle.append("  border: 1px outset #ccc;");
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
		sbSource.append("import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.social.ReplyBox;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.Window;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HTML;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Widget;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("public class ReplyBoxViewImpl extends BaseViewImpl implements ReplyBoxView{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	public ReplyBoxViewImpl() {");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		ReplyBox rb = new ReplyBox() {");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public void reply() {");
		sbSource.append("\n");
		sbSource.append("				 Window.alert(\"Msg replyed : \" + getReplyText());");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		};");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(rb);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("	}");
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
