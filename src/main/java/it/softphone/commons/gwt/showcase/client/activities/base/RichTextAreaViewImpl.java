package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.RichTextAreaHint;
import it.softphone.rd.gwt.client.widget.base.RichTextToolbar;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class RichTextAreaViewImpl extends BaseViewImpl implements RichTextAreaView{	
	
	public RichTextAreaViewImpl() {
		
		FlowPanel container = new FlowPanel();
		RichTextAreaHint rth = new RichTextAreaHint("", "hint");
		RichTextToolbar tb = new RichTextToolbar(rth);
		rth.setWidth("100%");
		container.add(tb);
		container.add(rth);
		
		exampleContainer.add(container);
		
		
		StringBuilder sbStyle = new StringBuilder();
		
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append(".textInput {");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #C9C7BA;");
		sbStyle.append("\n");
		sbStyle.append("	font-family:Tahoma, Verdana, Arial, Helvetica, sans-serif;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 11px;");
		sbStyle.append("\n");
		sbStyle.append("	padding-left: 2px;");
		sbStyle.append("\n");
		sbStyle.append("	padding-top: 2px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".textInput-hint {");
		sbStyle.append("\n");
		sbStyle.append("   font-style: italic;");
		sbStyle.append("\n");
		sbStyle.append("   color: DarkGray;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("</pre>");

		styleContainer.add(new HTML(sbStyle.toString()));
		
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");

		sbSource.append("import it.softphone.rd.gwt.client.widget.base.RichTextAreaHint;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.RichTextToolbar;");
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
		sbSource.append("		FlowPanel container = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("		RichTextAreaHint rth = new RichTextAreaHint(\"\", \"hint\");");
		sbSource.append("\n");
		sbSource.append("		RichTextToolbar tb = new RichTextToolbar(rth);");
		sbSource.append("\n");
		sbSource.append("		rth.setWidth(\"100%\");");
		sbSource.append("\n");
		sbSource.append("		container.add(tb);");
		sbSource.append("\n");
		sbSource.append("		container.add(rth);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(container);");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
		sbSource.append("\n");
		sbSource.append("	}");
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
	
		
}
