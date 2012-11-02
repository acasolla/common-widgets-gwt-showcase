package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.HintTextBox;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class HintTextBoxViewImpl extends BaseViewImpl implements HintTextBoxView{

	public HintTextBoxViewImpl() {
	
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.add(new Label("Name:"));
		HintTextBox htb = new HintTextBox();
		htb.setHint("Insert your name");
		hp.add(htb);
		exampleContainer.add(hp);
		
		
		
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append(".textInput {\n" +
		"	border: 1px solid #C9C7BA;\n" +
		"	font-family:Tahoma, Verdana, Arial, Helvetica, sans-serif;\n" +
		"	font-size: 11px;\n"+
		"	padding-left: 2px;\n"+
		"	padding-top: 2px;\n"+
		"}\n\n" +
		".textInput-hint {\n"+
		"	font-style: italic;\n"+
		"	color: DarkGray;\n"+
		"}");

		sbStyle.append("</pre>");
		
		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.HintTextBox;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HorizontalPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Label;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.RootLayoutPanel;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("public class CommonWidgetExample implements EntryPoint {");
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
		sbSource.append("		HorizontalPanel hp = new HorizontalPanel();");
		sbSource.append("\n");
		sbSource.append("		hp.add(new Label(\"Name:\"));");
		sbSource.append("\n");
		sbSource.append("		HintTextBox htb = new HintTextBox();");
		sbSource.append("\n");
		sbSource.append("		htb.setHint(\"Insert your name\");");
		sbSource.append("\n");
		sbSource.append("		hp.add(htb);");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(hp);");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
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
	
		
}
