package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.about.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.SearchBox;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class SearchBoxViewImpl extends BaseViewImpl implements SearchBoxView{
	
	private static final List<String> names = new ArrayList<String>();
	static{
		names.add("Adam");
		names.add("Bob");
		names.add("Carl");
		names.add("Dan");
		names.add("Elchior");
		names.add("Fiona");
		names.add("Gary");
		names.add("Albert");
		
	}
	public SearchBoxViewImpl() {
		
		final FlowPanel container = new FlowPanel();
			
		final SearchBox sb = new SearchBox();
		sb.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				String s = sb.getText();
				if ( s != null ){
					container.clear();
					for ( String name : names ){
						if ( name.toLowerCase().startsWith(s.toLowerCase())){
							HTML html = new HTML(name);
							container.add(html);
						}
					}			
				}
				
			}
		});
		for ( String name : names ){
			HTML html = new HTML(name);
			container.add(html);
		}
		
		exampleContainer.add(sb);
		exampleContainer.add(container);
		
		
		StringBuilder sbStyle = new StringBuilder();
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@url ss search;	");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".searchBoxContainer {");
		sbStyle.append("\n");
		sbStyle.append("	background-image: ss;	");
		sbStyle.append("\n");
		sbStyle.append("	background-repeat: no-repeat;");
		sbStyle.append("\n");
		sbStyle.append("	background-position:3px;");
		sbStyle.append("\n");
		sbStyle.append("	height: 20px;");
		sbStyle.append("\n");
		sbStyle.append("	width:180px;");
		sbStyle.append("\n");
		sbStyle.append("	border: 1px solid #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	font-size: 14px;");
		sbStyle.append("\n");
		sbStyle.append("	padding:2px 2px 2px 30px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("</pre>");

		
		styleContainer.add(new HTML(sbStyle.toString()));
		
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.SearchBox;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import java.util.ArrayList;");
		sbSource.append("\n");
		sbSource.append("import java.util.List;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.KeyUpEvent;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.KeyUpHandler;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HTML;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.RootLayoutPanel;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("public class CommonWidgetExample implements EntryPoint,ResourceAware {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	private static final List<String> names = new ArrayList<String>();");
		sbSource.append("\n");
		sbSource.append("	static{");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Adam\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Bob\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Carl\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Dan\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Elchior\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Fiona\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Gary\");");
		sbSource.append("\n");
		sbSource.append("		names.add(\"Albert\");");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
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
		sbSource.append("		final FlowPanel container = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		final SearchBox sb = new SearchBox();");
		sbSource.append("\n");
		sbSource.append("		sb.addKeyUpHandler(new KeyUpHandler() {");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public void onKeyUp(KeyUpEvent event) {");
		sbSource.append("\n");
		sbSource.append("				String s = sb.getText();");
		sbSource.append("\n");
		sbSource.append("				if ( s != null ){");
		sbSource.append("\n");
		sbSource.append("					container.clear();");
		sbSource.append("\n");
		sbSource.append("					for ( String name : names ){");
		sbSource.append("\n");
		sbSource.append("						if ( name.toLowerCase().startsWith(s.toLowerCase())){");
		sbSource.append("\n");
		sbSource.append("							HTML html = new HTML(name);");
		sbSource.append("\n");
		sbSource.append("							container.add(html);");
		sbSource.append("\n");
		sbSource.append("						}");
		sbSource.append("\n");
		sbSource.append("					}			");
		sbSource.append("\n");
		sbSource.append("				}");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		});");
		sbSource.append("\n");
		sbSource.append("		for ( String name : names ){");
		sbSource.append("\n");
		sbSource.append("			HTML html = new HTML(name);");
		sbSource.append("\n");
		sbSource.append("			container.add(html);");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(sb);");
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
