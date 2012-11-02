package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.HTMLLink;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class HtmlLinkViewImpl extends BaseViewImpl implements HtmlLinkView{
	

	public HtmlLinkViewImpl() {
		
				
		HTMLLink link = new HTMLLink("Click me !");
		link.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Clicked !");
				
			}
		});
		
		
		exampleContainer.add(new HTML("This is a simple HTML, styled as an hyper link "));
		exampleContainer.add(link);
		
		StringBuilder sbStyle = new StringBuilder();
		
		sbStyle.append("<pre>");
		sbStyle.append(".htmlLink{\n");
		sbStyle.append("	color:#06C;\n");
		sbStyle.append("	cursor:pointer;\n");
		sbStyle.append("}\n");
		
		sbStyle.append(".htmlLink:hover{\n");
		sbStyle.append("	text-decoration: underline;\n");
		sbStyle.append("}\n");
		
		sbStyle.append("</pre>");
		
		styleContainer.add(new HTML(sbStyle.toString()));
		
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.HTMLLink;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickEvent;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickHandler;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.Window;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HTML;");
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
		sbSource.append("		HTMLLink link = new HTMLLink(\"Click me !\");");
		sbSource.append("\n");
		sbSource.append("		link.addClickHandler(new ClickHandler() {");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public void onClick(ClickEvent event) {");
		sbSource.append("\n");
		sbSource.append("				Window.alert(\"Clicked !\");");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		});");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(new HTML(\"This is a simple HTML, styled as an hyper link \"));");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(link);");
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
