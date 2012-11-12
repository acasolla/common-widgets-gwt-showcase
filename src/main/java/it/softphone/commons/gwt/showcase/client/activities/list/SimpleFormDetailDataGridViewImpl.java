package it.softphone.commons.gwt.showcase.client.activities.list;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;
import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid;
import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid.RowDetailWidget;
import it.softphone.rd.model.shared.Selectable;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SingleSelectionModel;

public class SimpleFormDetailDataGridViewImpl extends BaseViewImpl implements SimpleFormDetailDataGridView{

	private static final List<ExampleUser> users = new ArrayList<ExampleUser>();
	static{
		users.add(new ExampleUser("Mike", "Cunningam", 32));
		users.add(new ExampleUser("Loreen", "Francy", 22));
		users.add(new ExampleUser("Tolbian", "Berisky", 52));
		users.add(new ExampleUser("Tony", "Mellow", 16));
	
	}
	private FormDetailDataGrid<ExampleUser> dataGrid;

	public SimpleFormDetailDataGridViewImpl() {
		RowDetail rowDetail = new RowDetail();
		
		dataGrid = new FormDetailDataGrid<ExampleUser>(
				ExampleUser.KEY_PROVIDER,
				users, 
				rowDetail, 
				new ExampleUser("test", "test", 0),
				true);
		
		dataGrid.setHeight("300px");
		
		final SingleSelectionModel<ExampleUser> selectionModel = new SingleSelectionModel<ExampleUser>(ExampleUser.KEY_PROVIDER);
		dataGrid.setSelectionModel(selectionModel);
		dataGrid.setEmptyTableWidget(new Label("No Result"));
		dataGrid.setRowCount(users.size() , true);
		dataGrid.setRowData( users);
		
		initGrid();
		exampleContainer.add(dataGrid);
		
		
		StringBuilder sbStyle = new StringBuilder();
		
		sbStyle.append("<pre>");
		sbStyle.append("\n");
		sbStyle.append("@external formDetailDataGrid;");
		sbStyle.append("\n");
		sbStyle.append("@def selectionBorderWidth 0px;");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".formDetailDataGrid{");
		sbStyle.append("\n");
		sbStyle.append("	top:6px !important;");
		sbStyle.append("\n");
		sbStyle.append("	right:6px !important;");
		sbStyle.append("\n");
		sbStyle.append("	left:6px !important;");
		sbStyle.append("\n");
		sbStyle.append("	border:1px solid #4c4c4c;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append(".dataGridWidget {");
		sbStyle.append("\n");
		sbStyle.append(" ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridFirstColumn {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridLastColumn {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridFooter {");
		sbStyle.append("\n");
		sbStyle.append("  padding: 3px 15px;");
		sbStyle.append("\n");
		sbStyle.append("  text-align: left;");
		sbStyle.append("\n");
		sbStyle.append("  color: #4b4a4a;");
		sbStyle.append("\n");
		sbStyle.append("  text-shadow: #ddf 1px 1px 0;");
		sbStyle.append("\n");
		sbStyle.append("  overflow: hidden;");
		sbStyle.append("\n");
		sbStyle.append("  white-space: nowrap;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridHeader {");
		sbStyle.append("\n");
		sbStyle.append("  background: -webkit-gradient(linear, literal(\"left top\"),");
		sbStyle.append("\n");
		sbStyle.append("            literal(\"left bottom\"), from(#70A5A5), to(#618E8E) );");
		sbStyle.append("\n");
		sbStyle.append("  height: 35px;");
		sbStyle.append("\n");
		sbStyle.append("  color: #fff;");
		sbStyle.append("\n");
		sbStyle.append("  text-shadow: none;");
		sbStyle.append("\n");
		sbStyle.append("  padding:4px;");
		sbStyle.append("\n");
		sbStyle.append("  border-right-style: solid;");
		sbStyle.append("\n");
		sbStyle.append("  border-right-color:#7aa8a5;");
		sbStyle.append("\n");
		sbStyle.append("  border-right-width: 1px;");
		sbStyle.append("\n");
		sbStyle.append("  }");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridHeader:hover {");
		sbStyle.append("\n");
		sbStyle.append("	  background: -webkit-gradient(linear, literal(\"left top\"),");
		sbStyle.append("\n");
		sbStyle.append("            literal(\"left bottom\"), from(#678888), to(#557878) );");
		sbStyle.append("\n");
		sbStyle.append("  }");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridCell {");
		sbStyle.append("\n");
		sbStyle.append("  padding: 2px 15px;");
		sbStyle.append("\n");
		sbStyle.append("  overflow: hidden;");
		sbStyle.append("\n");
		sbStyle.append("  height: 30px;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridFirstColumnFooter {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridFirstColumnHeader {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridLastColumnFooter {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridLastColumnHeader {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSortableHeader {");
		sbStyle.append("\n");
		sbStyle.append("  cursor: pointer;");
		sbStyle.append("\n");
		sbStyle.append("  cursor: hand;");
		sbStyle.append("\n");
		sbStyle.append("  background-color: red;");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSortableHeader:hover {");
		sbStyle.append("\n");
		sbStyle.append("  color: #6c6b6b;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSortedHeaderAscending {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSortedHeaderDescending {");
		sbStyle.append("\n");
		sbStyle.append("  ");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridEvenRow {");
		sbStyle.append("\n");
		sbStyle.append("  background: #ffffff;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridEvenRowCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #ffffff;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridOddRow {");
		sbStyle.append("\n");
		sbStyle.append("  background: #f6f6f6;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridOddRowCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #f6f6f6;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridHoveredRow {");
		sbStyle.append("\n");
		sbStyle.append("  background: #dfdfdf;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridHoveredRowCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridKeyboardSelectedRow {");
		sbStyle.append("\n");
		sbStyle.append("  background: #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridKeyboardSelectedRowCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSelectedRow {");
		sbStyle.append("\n");
		sbStyle.append("  background: #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("  color: white;");
		sbStyle.append("\n");
		sbStyle.append("  height: auto;");
		sbStyle.append("\n");
		sbStyle.append("  overflow: auto;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".dataGridSelectedRowCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append("/**");
		sbStyle.append("\n");
		sbStyle.append(" * The keyboard selected cell is visible over selection.");
		sbStyle.append("\n");
		sbStyle.append(" */");
		sbStyle.append("\n");
		sbStyle.append(".dataGridKeyboardSelectedCell {");
		sbStyle.append("\n");
		sbStyle.append("  border: selectionBorderWidth solid #d4e4e4;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append(".rowDetailWidget{");
		sbStyle.append("\n");
		sbStyle.append("	background-color: #e7e7e7;");
		sbStyle.append("\n");
		sbStyle.append("	");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("");
		sbStyle.append("\n");
		sbStyle.append(".rowDetailWidget > .gwt-HTML{");
		sbStyle.append("\n");
		sbStyle.append("	text-align: center;	");
		sbStyle.append("\n");
		sbStyle.append("	font-weight: bold;");
		sbStyle.append("\n");
		sbStyle.append("}");
		sbStyle.append("\n");
		sbStyle.append("</pre>");

		sbStyle.append("\n");
		sbStyle.append("</pre>");

		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid.RowDetailWidget;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.model.shared.Selectable;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import java.util.ArrayList;");
		sbSource.append("\n");
		sbSource.append("import java.util.List;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.cell.client.NumberCell;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.cell.client.TextCell;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.cellview.client.Column;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.FlowPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.HTML;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Label;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.RootLayoutPanel;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.ui.Widget;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.view.client.ProvidesKey;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.view.client.SingleSelectionModel;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("public class CommonWidgetExample implements EntryPoint{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	private static final List<ExampleUser> users = new ArrayList<ExampleUser>();");
		sbSource.append("\n");
		sbSource.append("	static{");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleUser(\"Mike\", \"Cunningam\", 32));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleUser(\"Loreen\", \"Francy\", 22));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleUser(\"Tolbian\", \"Berisky\", 52));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleUser(\"Tony\", \"Mellow\", 16));");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	private FormDetailDataGrid<ExampleUser> dataGrid;");
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
		sbSource.append("		RowDetail rowDetail = new RowDetail();");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		dataGrid = new FormDetailDataGrid<ExampleUser>(");
		sbSource.append("\n");
		sbSource.append("				ExampleUser.KEY_PROVIDER,");
		sbSource.append("\n");
		sbSource.append("				users, ");
		sbSource.append("\n");
		sbSource.append("				rowDetail, ");
		sbSource.append("\n");
		sbSource.append("				new ExampleUser(\"test\", \"test\", 0),");
		sbSource.append("\n");
		sbSource.append("				true);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setHeight(\"300px\");");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		final SingleSelectionModel<ExampleUser> selectionModel = new SingleSelectionModel<ExampleUser>(ExampleUser.KEY_PROVIDER);");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setSelectionModel(selectionModel);");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setEmptyTableWidget(new Label(\"No Result\"));");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setRowCount(users.size() , true);");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setRowData( users);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		initGrid();");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(dataGrid);");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	private void initGrid(){");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		final Column<ExampleUser, String> name = new Column<ExampleUser, String>(new TextCell()) {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public String getValue(ExampleUser object) {");
		sbSource.append("\n");
		sbSource.append("				return object.getName();");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		};");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		dataGrid.addColumn(name,\"Name\");");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		final Column<ExampleUser, String> surname = new Column<ExampleUser, String>(new TextCell()) {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public String getValue(ExampleUser object) {");
		sbSource.append("\n");
		sbSource.append("				return object.getSurname();");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		};");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		dataGrid.addColumn(surname,\"Surname\");");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		final Column<ExampleUser, Number> age = new Column<ExampleUser, Number>(new NumberCell()) {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			@Override");
		sbSource.append("\n");
		sbSource.append("			public Number getValue(ExampleUser object) {");
		sbSource.append("\n");
		sbSource.append("				return object.getAge();");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("		};");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		dataGrid.addColumn(age,\"Age\");");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
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
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("class RowDetail implements RowDetailWidget<ExampleUser>,ResourceAware{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	private FlowPanel container = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	public RowDetail(){");
		sbSource.append("\n");
		sbSource.append("		container.addStyleName(css.getMainCss().rowDetailWidget());");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public Widget asWidget() {");
		sbSource.append("\n");
		sbSource.append("		return container;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public void setRowItem(ExampleUser item) {");
		sbSource.append("\n");
		sbSource.append("		container.clear();");
		sbSource.append("\n");
		sbSource.append("		container.add(new HTML(item.getName()));");
		sbSource.append("\n");
		sbSource.append("		container.add(new HTML(item.getSurname()));");
		sbSource.append("\n");
		sbSource.append("		container.add(new HTML(String.valueOf(item.getAge())));");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("class ExampleUser implements Selectable{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	private boolean selected = false;");
		sbSource.append("\n");
		sbSource.append("	private String name;");
		sbSource.append("\n");
		sbSource.append("	private String surname;");
		sbSource.append("\n");
		sbSource.append("	private int age;");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	public static final ProvidesKey<ExampleUser> KEY_PROVIDER = new ProvidesKey<ExampleUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		public Object getKey(ExampleUser item) {");
		sbSource.append("\n");
		sbSource.append("			return item == null ? null : item.getAge();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		 ");
		sbSource.append("\n");
		sbSource.append("	};");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	public ExampleUser(String name, String surname, int age) {");
		sbSource.append("\n");
		sbSource.append("		super();");
		sbSource.append("\n");
		sbSource.append("		this.name = name;");
		sbSource.append("\n");
		sbSource.append("		this.surname = surname;");
		sbSource.append("\n");
		sbSource.append("		this.age = age;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final String getName() {");
		sbSource.append("\n");
		sbSource.append("		return name;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setName(String name) {");
		sbSource.append("\n");
		sbSource.append("		this.name = name;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final String getSurname() {");
		sbSource.append("\n");
		sbSource.append("		return surname;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setSurname(String surname) {");
		sbSource.append("\n");
		sbSource.append("		this.surname = surname;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final int getAge() {");
		sbSource.append("\n");
		sbSource.append("		return age;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setAge(int age) {");
		sbSource.append("\n");
		sbSource.append("		this.age = age;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public void setSelected(boolean selected) {");
		sbSource.append("\n");
		sbSource.append("		this.selected = selected;");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public boolean isSelected() {");
		sbSource.append("\n");
		sbSource.append("		return selected;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("</pre>");
		sourceContainer.add(new HTML(sbSource.toString()));

		
	}

	private void initGrid(){
		
		final Column<ExampleUser, String> name = new Column<ExampleUser, String>(new TextCell()) {

			@Override
			public String getValue(ExampleUser object) {
				return object.getName();
			}
		};
		
		dataGrid.addColumn(name,"Name");

		final Column<ExampleUser, String> surname = new Column<ExampleUser, String>(new TextCell()) {

			@Override
			public String getValue(ExampleUser object) {
				return object.getSurname();
			}
		};
		
		dataGrid.addColumn(surname,"Surname");

		final Column<ExampleUser, Number> age = new Column<ExampleUser, Number>(new NumberCell()) {

			@Override
			public Number getValue(ExampleUser object) {
				return object.getAge();
			}
		};
		
		dataGrid.addColumn(age,"Age");

		
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

class RowDetail implements RowDetailWidget<ExampleUser>,ResourceAware{

	private FlowPanel container = new FlowPanel();
	
	public RowDetail(){
		container.addStyleName(css.getMainCss().rowDetailWidget());
	}
	@Override
	public Widget asWidget() {
		return container;
	}

	@Override
	public void setRowItem(ExampleUser item) {
		container.clear();
		container.add(new HTML(item.getName()));
		container.add(new HTML(item.getSurname()));
		container.add(new HTML(String.valueOf(item.getAge())));
		
	}
	
}

class ExampleUser implements Selectable{

	private boolean selected = false;
	private String name;
	private String surname;
	private int age;
	
	public static final ProvidesKey<ExampleUser> KEY_PROVIDER = new ProvidesKey<ExampleUser>() {

		public Object getKey(ExampleUser item) {
			return item == null ? null : item.getAge();
		}
		 
	};


	
	public ExampleUser(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	protected final String getName() {
		return name;
	}

	protected final void setName(String name) {
		this.name = name;
	}

	protected final String getSurname() {
		return surname;
	}

	protected final void setSurname(String surname) {
		this.surname = surname;
	}

	protected final int getAge() {
		return age;
	}

	protected final void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public void setSelected(boolean selected) {
		this.selected = selected;
		
	}

	@Override
	public boolean isSelected() {
		return selected;
	}
	
}

