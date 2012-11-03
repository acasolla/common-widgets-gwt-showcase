package it.softphone.commons.gwt.showcase.client.activities.base;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.rd.gwt.client.widget.base.HintTextBox;
import it.softphone.rd.gwt.client.widget.base.Mask;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class MaskViewImpl extends BaseViewImpl implements MaskView{
	
	public MaskViewImpl() {
	
		final Mask m = new Mask(true);
	
		final HintTextBox update = new HintTextBox("", "Update message...");
		exampleContainer.add(update);

		final HintTextBox end = new HintTextBox("", "End message...");
		exampleContainer.add(end);

		Button mask = new Button("Start Mask !");
		exampleContainer.add(mask);
	
		mask.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				m.mask();
				Timer t1 = new Timer() {
					
					@Override
					public void run() {
						m.updateMsg(update.getValue());
						
					}
				};
				
				t1.schedule(1000);

				Timer t2 = new Timer() {
					
					@Override
					public void run() {
						m.endLoading(end.getText());
						
					}
				};
				
				t2.schedule(2000);


			}
		});
		
		
		StringBuilder sbStyle = new StringBuilder();
		
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Label;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-PopupPanelGlass;");
		sbStyle.append("\n");
		sbStyle.append("@external gwt-Button;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".maskContainer{");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #FFF;");
		sbStyle.append("\n");
		sbStyle.append("	border: none;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".maskContainer .gwt-Label{");
		sbStyle.append("\n");
		sbStyle.append("	height: 40px;");
		sbStyle.append("\n");
		sbStyle.append("	text-align: center;");
		sbStyle.append("\n");
		sbStyle.append("	padding:30px 3px 5px 3px; ");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".maskContainer img{");
		sbStyle.append("\n");
		sbStyle.append("	margin: 10px 0px 0px 75px;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".maskContainer .gwt-Button{");
		sbStyle.append("\n");
		sbStyle.append("	margin-left:40%;");
		sbStyle.append("\n");
		sbStyle.append("	width: 20%;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".gwt-PopupPanelGlass{");
		sbStyle.append("\n");
		sbStyle.append("	background-color:#4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("	opacity:0.5;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("</pre>");


		
		styleContainer.add(new HTML(sbStyle.toString()));

		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.HintTextBox;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.Mask;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickEvent;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.event.dom.client.ClickHandler;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.Timer;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Button;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
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
		sbSource.append("		final Mask m = new Mask(true);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		final HintTextBox update = new HintTextBox(\"\", \"Update message...\");");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(update);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		final HintTextBox end = new HintTextBox(\"\", \"End message...\");");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(end);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		Button mask = new Button(\"Start Mask !\");");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(mask);");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		mask.addClickHandler(new ClickHandler() {");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public void onClick(ClickEvent event) {");
		sbSource.append("\n");
		sbSource.append("				m.mask();");
		sbSource.append("\n");
		sbSource.append("				Timer t1 = new Timer() {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void run() {");
		sbSource.append("\n");
		sbSource.append("						m.updateMsg(update.getValue());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				t1.schedule(1000);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				Timer t2 = new Timer() {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void run() {");
		sbSource.append("\n");
		sbSource.append("						m.endLoading(end.getText());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				t2.schedule(2000);");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		});");
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
