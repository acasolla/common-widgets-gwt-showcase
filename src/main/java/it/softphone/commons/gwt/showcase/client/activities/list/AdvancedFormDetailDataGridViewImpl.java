package it.softphone.commons.gwt.showcase.client.activities.list;

import it.softphone.commons.gwt.showcase.client.activities.BaseViewImpl;
import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;
import it.softphone.rd.gwt.client.widget.base.filter.FilterCalendarViewImpl;
import it.softphone.rd.gwt.client.widget.base.filter.FilterEnum;
import it.softphone.rd.gwt.client.widget.base.filter.FilterTextBox;
import it.softphone.rd.gwt.client.widget.base.filter.SortFilterButtonCell;
import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid;
import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid.RowDetailWidget;
import it.softphone.rd.gwt.client.widget.base.list.NamedColumn;
import it.softphone.rd.gwt.client.widget.base.list.NamedTooltipTextColumn;
import it.softphone.rd.model.shared.Selectable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SingleSelectionModel;

public class AdvancedFormDetailDataGridViewImpl extends BaseViewImpl implements AdvancedFormDetailDataGridView{

	private static final List<ExampleAdvancedUser> users = new ArrayList<ExampleAdvancedUser>();
	private ListDataProvider<ExampleAdvancedUser> dataProvider;
	final static DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy");
	static{
	
		users.add(new ExampleAdvancedUser("Mike", 
				"Cunningham", "5h Avenue", "New York", 
				States.USA, 1,dtf.parseStrict("01/12/1980")));
		users.add(new ExampleAdvancedUser("Loreen", 
				"Francy", "Piccadilly Circus","London",
				States.ENGLAND,2,dtf.parseStrict("10/04/1960")));
		users.add(new ExampleAdvancedUser("Tolbian", 
				"Berisky", "Red Square","Moscow",
				States.RUSSIA,3,dtf.parseStrict("04/22/1974")));
		users.add(new ExampleAdvancedUser("Tony", 
				"Mellow","Via Roma","Naples",
				States.ITALY, 4,dtf.parseStrict("11/29/1989")));
	
	}
	private FormDetailDataGrid<ExampleAdvancedUser> dataGrid;

	public AdvancedFormDetailDataGridViewImpl() {
		dataProvider = new ListDataProvider<ExampleAdvancedUser>(ExampleAdvancedUser.KEY_PROVIDER);
		dataProvider.setList(users);
		ListHandler<ExampleAdvancedUser> sortHandler = new ListHandler<ExampleAdvancedUser>(dataProvider.getList());
		
		RowDetail rowDetail = new RowDetail();
	
		dataGrid = new FormDetailDataGrid<ExampleAdvancedUser>(
				ExampleAdvancedUser.KEY_PROVIDER,
				users, 
				rowDetail, 
				new ExampleAdvancedUser("test", "test", 0),
				true,
				true);
		
		dataProvider.addDataDisplay(dataGrid);
		dataGrid.setHeight("300px");
		
		final SingleSelectionModel<ExampleAdvancedUser> selectionModel = new SingleSelectionModel<ExampleAdvancedUser>(ExampleAdvancedUser.KEY_PROVIDER);
		dataGrid.setSelectionModel(selectionModel);
		dataGrid.setEmptyTableWidget(new Label("No Result"));
		dataGrid.setRowCount(users.size() , true);
		dataGrid.setRowData( users);
		
		initGrid( sortHandler );
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


		styleContainer.add(new HTML(sbStyle.toString()));
		
		StringBuilder sbSource = new StringBuilder();
		sbSource.append("<pre>");

		sbSource.append("import it.softphone.commons.gwt.showcase.client.resources.ResourceAware;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.filter.FilterCalendarViewImpl;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.filter.FilterEnum;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.filter.FilterTextBox;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.filter.SortFilterButtonCell;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid.RowDetailWidget;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.NamedColumn;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.gwt.client.widget.base.list.NamedTooltipTextColumn;");
		sbSource.append("\n");
		sbSource.append("import it.softphone.rd.model.shared.Selectable;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import java.util.ArrayList;");
		sbSource.append("\n");
		sbSource.append("import java.util.Comparator;");
		sbSource.append("\n");
		sbSource.append("import java.util.Date;");
		sbSource.append("\n");
		sbSource.append("import java.util.List;");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.cell.client.TextCell;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.core.client.EntryPoint;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.dom.client.Style.Unit;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.i18n.client.DateTimeFormat;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.cellview.client.Header;");
		sbSource.append("\n");
		sbSource.append("import com.google.gwt.user.client.Window;");
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
		sbSource.append("import com.google.gwt.view.client.ListDataProvider;");
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
		sbSource.append("	private static final List<ExampleAdvancedUser> users = new ArrayList<ExampleAdvancedUser>();");
		sbSource.append("\n");
		sbSource.append("	private ListDataProvider<ExampleAdvancedUser> dataProvider;");
		sbSource.append("\n");
		sbSource.append("	final static DateTimeFormat dtf = DateTimeFormat.getFormat(\"MM/dd/yyyy\");");
		sbSource.append("\n");
		sbSource.append("	static{");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleAdvancedUser(\"Mike\", ");
		sbSource.append("\n");
		sbSource.append("				\"Cunningham\", \"5h Avenue\", \"New York\", ");
		sbSource.append("\n");
		sbSource.append("				States.USA, 1,dtf.parseStrict(\"01/12/1980\")));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleAdvancedUser(\"Loreen\", ");
		sbSource.append("\n");
		sbSource.append("				\"Francy\", \"Piccadilly Circus\",\"London\",");
		sbSource.append("\n");
		sbSource.append("				States.ENGLAND,2,dtf.parseStrict(\"10/04/1960\")));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleAdvancedUser(\"Tolbian\", ");
		sbSource.append("\n");
		sbSource.append("				\"Berisky\", \"Red Square\",\"Moscow\",");
		sbSource.append("\n");
		sbSource.append("				States.RUSSIA,3,dtf.parseStrict(\"04/22/1974\")));");
		sbSource.append("\n");
		sbSource.append("		users.add(new ExampleAdvancedUser(\"Tony\", ");
		sbSource.append("\n");
		sbSource.append("				\"Mellow\",\"Via Roma\",\"Naples\",");
		sbSource.append("\n");
		sbSource.append("				States.ITALY, 4,dtf.parseStrict(\"11/29/1989\")));");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	private FormDetailDataGrid<ExampleAdvancedUser> dataGrid;");
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
		sbSource.append("		dataProvider = new ListDataProvider<ExampleAdvancedUser>(ExampleAdvancedUser.KEY_PROVIDER);");
		sbSource.append("\n");
		sbSource.append("		dataProvider.setList(users);");
		sbSource.append("\n");
		sbSource.append("		ListHandler<ExampleAdvancedUser> sortHandler = new ListHandler<ExampleAdvancedUser>(dataProvider.getList());");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		dataGrid = new FormDetailDataGrid<ExampleAdvancedUser>(");
		sbSource.append("\n");
		sbSource.append("				ExampleAdvancedUser.KEY_PROVIDER,");
		sbSource.append("\n");
		sbSource.append("				users, ");
		sbSource.append("\n");
		sbSource.append("				rowDetail, ");
		sbSource.append("\n");
		sbSource.append("				new ExampleAdvancedUser(\"test\", \"test\", 0),");
		sbSource.append("\n");
		sbSource.append("				true,");
		sbSource.append("\n");
		sbSource.append("				true);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		dataProvider.addDataDisplay(dataGrid);");
		sbSource.append("\n");
		sbSource.append("		dataGrid.setHeight(\"300px\");");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		final SingleSelectionModel<ExampleAdvancedUser> selectionModel = new SingleSelectionModel<ExampleAdvancedUser>(ExampleAdvancedUser.KEY_PROVIDER);");
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
		sbSource.append("		initGrid( sortHandler );");
		sbSource.append("\n");
		sbSource.append("		exampleContainer.add(dataGrid);");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("		return exampleContainer;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("		private void initGrid( ListHandler<ExampleAdvancedUser> sortHandler ){");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			dataGrid.addColumnSortHandler(sortHandler);");
		sbSource.append("\n");
		sbSource.append("			//NAME");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedColumn<ExampleAdvancedUser, String> column = ");
		sbSource.append("\n");
		sbSource.append("						new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),\"Name\") {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("							@Override");
		sbSource.append("\n");
		sbSource.append("							public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("								return object.getName();");
		sbSource.append("\n");
		sbSource.append("							}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("						};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getName().compareTo(o2.getName());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				FilterTextBox filter = new FilterTextBox(\"\",\"Enter Filter Here\") {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action\");");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			//SURNAME");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedColumn<ExampleAdvancedUser, String> column = ");
		sbSource.append("\n");
		sbSource.append("						new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),\"Surname\") {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("							@Override");
		sbSource.append("\n");
		sbSource.append("							public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("								return object.getSurname();");
		sbSource.append("\n");
		sbSource.append("							}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("						};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getSurname().compareTo(o2.getSurname());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				FilterTextBox filter = new FilterTextBox(\"\",\"Enter Filter Here\") {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action \" + getValue());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			//ADDRESS");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedTooltipTextColumn<ExampleAdvancedUser> column = new NamedTooltipTextColumn<ExampleAdvancedUser>(\"Address\") {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getTooltipValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("						StringBuilder sb = new StringBuilder();");
		sbSource.append("\n");
		sbSource.append("						sb.append(\"Name : \").append(object.getName());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" Surame : \").append(object.getSurname());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" Address : \").append(object.getAddress());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" City : \").append(object.getCity());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" State : \").append(object.getState());");
		sbSource.append("\n");
		sbSource.append("						return sb.toString();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("						return object.getAddress();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getAddress().compareTo(o2.getAddress());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				FilterTextBox filter = new FilterTextBox(\"\",\"Enter Filter Here\") {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action \" + getValue());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				dataGrid.setColumnWidth(column, 200,Unit.PX);");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("			");
		sbSource.append("\n");
		sbSource.append("			//CITY");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedColumn<ExampleAdvancedUser, String> column = ");
		sbSource.append("\n");
		sbSource.append("						new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),\"City\") {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("							@Override");
		sbSource.append("\n");
		sbSource.append("							public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("								return object.getCity();");
		sbSource.append("\n");
		sbSource.append("							}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("						};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getCity().compareTo(o2.getCity());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				FilterTextBox filter = new FilterTextBox(\"\",\"Enter Filter Here\") {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action \" + getValue());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			//STATE");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedColumn<ExampleAdvancedUser, String> column = ");
		sbSource.append("\n");
		sbSource.append("						new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),\"State\") {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("							@Override");
		sbSource.append("\n");
		sbSource.append("							public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("								return object.getState().name();");
		sbSource.append("\n");
		sbSource.append("							}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("						};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getState().compareTo(o2.getState());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		  	    FilterEnum filter = new FilterEnum(States.ENGLAND) {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action \" + getValue());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("			//DATE OF BIRTH");
		sbSource.append("\n");
		sbSource.append("			{");
		sbSource.append("\n");
		sbSource.append("				final NamedTooltipTextColumn<ExampleAdvancedUser> column = new NamedTooltipTextColumn<ExampleAdvancedUser>(\"Date of Birth\") {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getTooltipValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("						StringBuilder sb = new StringBuilder();");
		sbSource.append("\n");
		sbSource.append("						sb.append(\"Name : \").append(object.getName());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" Surame : \").append(object.getSurname());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" Address : \").append(object.getAddress());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" City : \").append(object.getCity());");
		sbSource.append("\n");
		sbSource.append("						sb.append(\" State : \").append(object.getState());");
		sbSource.append("\n");
		sbSource.append("						return sb.toString();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue(ExampleAdvancedUser object) {");
		sbSource.append("\n");
		sbSource.append("						return object.getAddress();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("		  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("				  			@Override");
		sbSource.append("\n");
		sbSource.append("				  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {");
		sbSource.append("\n");
		sbSource.append("				  				return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());");
		sbSource.append("\n");
		sbSource.append("				  			}");
		sbSource.append("\n");
		sbSource.append("				  	    	");
		sbSource.append("\n");
		sbSource.append("				  	    });");
		sbSource.append("\n");
		sbSource.append("		  	    ");
		sbSource.append("\n");
		sbSource.append("		  	    ");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		  	  FilterCalendarViewImpl filter = new FilterCalendarViewImpl() {");
		sbSource.append("\n");
		sbSource.append("					");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public void processEnterKeyDown() {");
		sbSource.append("\n");
		sbSource.append("						Window.alert(\"Filter action, from: \" + getFrom() + \" to: \" + getTo());");
		sbSource.append("\n");
		sbSource.append("						");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);");
		sbSource.append("\n");
		sbSource.append("				");
		sbSource.append("\n");
		sbSource.append("				Header<String> headerName = new Header<String>(sfbc) {");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("					@Override");
		sbSource.append("\n");
		sbSource.append("					public String getValue() {");
		sbSource.append("\n");
		sbSource.append("						return column.getName();");
		sbSource.append("\n");
		sbSource.append("					}");
		sbSource.append("\n");
		sbSource.append("				};");
		sbSource.append("\n");
		sbSource.append("				dataGrid.addColumn(column,headerName);");
		sbSource.append("\n");
		sbSource.append("			}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	class RowDetail implements RowDetailWidget<ExampleAdvancedUser>,ResourceAware{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		private FlowPanel container = new FlowPanel();");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		public RowDetail(){");
		sbSource.append("\n");
		sbSource.append("			container.addStyleName(css.getMainCss().rowDetailWidget());");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public Widget asWidget() {");
		sbSource.append("\n");
		sbSource.append("			return container;");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		@Override");
		sbSource.append("\n");
		sbSource.append("		public void setRowItem(ExampleAdvancedUser item) {");
		sbSource.append("\n");
		sbSource.append("			container.clear();");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(item.getName()));");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(item.getSurname()));");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(item.getAddress()));");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(item.getCity()));");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(item.getState().name()));");
		sbSource.append("\n");
		sbSource.append("			container.add(new HTML(dtf.format(item.getDateOfBirth())));");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("enum States{");
		sbSource.append("\n");
		sbSource.append("	USA,ENGLAND,ITALY,RUSSIA;");
		sbSource.append("\n");
		sbSource.append("}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("class ExampleAdvancedUser implements Selectable{");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	private boolean selected = false;");
		sbSource.append("\n");
		sbSource.append("	private String name;");
		sbSource.append("\n");
		sbSource.append("	private String surname;");
		sbSource.append("\n");
		sbSource.append("	private String address;");
		sbSource.append("\n");
		sbSource.append("	private String city;");
		sbSource.append("\n");
		sbSource.append("	private States state;");
		sbSource.append("\n");
		sbSource.append("	private Date dateOfBirth;");
		sbSource.append("\n");
		sbSource.append("	private int id;");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	public static final ProvidesKey<ExampleAdvancedUser> KEY_PROVIDER = new ProvidesKey<ExampleAdvancedUser>() {");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("		public Object getKey(ExampleAdvancedUser item) {");
		sbSource.append("\n");
		sbSource.append("			return item == null ? null : item.getId();");
		sbSource.append("\n");
		sbSource.append("		}");
		sbSource.append("\n");
		sbSource.append("		 ");
		sbSource.append("\n");
		sbSource.append("	};");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	public ExampleAdvancedUser(String name, String surname,");
		sbSource.append("\n");
		sbSource.append("			String address, String city, States state, int id, Date dateOfBirth) {");
		sbSource.append("\n");
		sbSource.append("		super();");
		sbSource.append("\n");
		sbSource.append("		this.name = name;");
		sbSource.append("\n");
		sbSource.append("		this.surname = surname;");
		sbSource.append("\n");
		sbSource.append("		this.address = address;");
		sbSource.append("\n");
		sbSource.append("		this.city = city;");
		sbSource.append("\n");
		sbSource.append("		this.state = state;");
		sbSource.append("\n");
		sbSource.append("		this.id = id;");
		sbSource.append("\n");
		sbSource.append("		this.dateOfBirth = dateOfBirth;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	public ExampleAdvancedUser(String name, String surname, int id) {");
		sbSource.append("\n");
		sbSource.append("		super();");
		sbSource.append("\n");
		sbSource.append("		this.name = name;");
		sbSource.append("\n");
		sbSource.append("		this.surname = surname;");
		sbSource.append("\n");
		sbSource.append("		this.id = id;");
		sbSource.append("\n");
		sbSource.append("		this.address = \"\";");
		sbSource.append("\n");
		sbSource.append("		this.city = \"\";");
		sbSource.append("\n");
		sbSource.append("		this.state = States.ENGLAND;");
		sbSource.append("\n");
		sbSource.append("		this.dateOfBirth = new Date();");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	protected final Date getDateOfBirth() {");
		sbSource.append("\n");
		sbSource.append("		return dateOfBirth;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setDateOfBirth(Date dateOfBirth) {");
		sbSource.append("\n");
		sbSource.append("		this.dateOfBirth = dateOfBirth;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final String getAddress() {");
		sbSource.append("\n");
		sbSource.append("		return address;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setAddress(String address) {");
		sbSource.append("\n");
		sbSource.append("		this.address = address;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final String getCity() {");
		sbSource.append("\n");
		sbSource.append("		return city;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setCity(String city) {");
		sbSource.append("\n");
		sbSource.append("		this.city = city;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final States getState() {");
		sbSource.append("\n");
		sbSource.append("		return state;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setState(States state) {");
		sbSource.append("\n");
		sbSource.append("		this.state = state;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
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
		sbSource.append("	protected final int getId() {");
		sbSource.append("\n");
		sbSource.append("		return id;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("");
		sbSource.append("\n");
		sbSource.append("	protected final void setId(int id) {");
		sbSource.append("\n");
		sbSource.append("		this.id = id;");
		sbSource.append("\n");
		sbSource.append("	}");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	");
		sbSource.append("\n");
		sbSource.append("	@Override");
		sbSource.append("\n");
		sbSource.append("	public void setSelected(boolean selected) {");
		sbSource.append("\n");
		sbSource.append("		this.selected = selected;");
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
		sbSource.append("</pre>");


		sourceContainer.add(new HTML(sbSource.toString()));

		
	}


	private void initGrid( ListHandler<ExampleAdvancedUser> sortHandler ){

		dataGrid.addColumnSortHandler(sortHandler);
		//NAME
		{
			final NamedColumn<ExampleAdvancedUser, String> column = 
					new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),"Name") {
	
						@Override
						public String getValue(ExampleAdvancedUser object) {
							return object.getName();
						}
				
					};
					
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getName().compareTo(o2.getName());
			  			}
			  	    	
			  	    });

			FilterTextBox filter = new FilterTextBox("","Enter Filter Here") {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action");
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			
			dataGrid.addColumn(column,headerName);
		}

		//SURNAME
		{
			final NamedColumn<ExampleAdvancedUser, String> column = 
					new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),"Surname") {
	
						@Override
						public String getValue(ExampleAdvancedUser object) {
							return object.getSurname();
						}
				
					};
					
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getSurname().compareTo(o2.getSurname());
			  			}
			  	    	
			  	    });

			FilterTextBox filter = new FilterTextBox("","Enter Filter Here") {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action " + getValue());
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			
			dataGrid.addColumn(column,headerName);
		}

		//ADDRESS
		{
			final NamedTooltipTextColumn<ExampleAdvancedUser> column = new NamedTooltipTextColumn<ExampleAdvancedUser>("Address") {

				@Override
				public String getTooltipValue(ExampleAdvancedUser object) {
					StringBuilder sb = new StringBuilder();
					sb.append("Name : ").append(object.getName());
					sb.append("/n<br></br>Surame : ").append(object.getSurname());
					sb.append("/n<br></br>Address : ").append(object.getAddress());
					sb.append("/n<br></br>City : ").append(object.getCity());
					sb.append("/n<br></br>State : ").append(object.getState());
					return sb.toString();
				}

				@Override
				public String getValue(ExampleAdvancedUser object) {
					return object.getAddress();
				}
				
			};
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getAddress().compareTo(o2.getAddress());
			  			}
			  	    	
			  	    });
		
			
			FilterTextBox filter = new FilterTextBox("","Enter Filter Here") {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action " + getValue());
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			dataGrid.setColumnWidth(column, 200,Unit.PX);
			dataGrid.addColumn(column,headerName);
		}
		
		//CITY
		{
			final NamedColumn<ExampleAdvancedUser, String> column = 
					new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),"City") {
	
						@Override
						public String getValue(ExampleAdvancedUser object) {
							return object.getCity();
						}
				
					};
					
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getCity().compareTo(o2.getCity());
			  			}
			  	    	
			  	    });

			FilterTextBox filter = new FilterTextBox("","Enter Filter Here") {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action " + getValue());
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			
			dataGrid.addColumn(column,headerName);
		}

		//STATE
		{
			final NamedColumn<ExampleAdvancedUser, String> column = 
					new NamedColumn<ExampleAdvancedUser, String>(new TextCell(),"State") {
	
						@Override
						public String getValue(ExampleAdvancedUser object) {
							return object.getState().name();
						}
				
					};
					
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getState().compareTo(o2.getState());
			  			}
			  	    	
			  	    });

	  	    FilterEnum filter = new FilterEnum(States.ENGLAND) {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action " + getValue());
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			
			dataGrid.addColumn(column,headerName);
		}

		//DATE OF BIRTH
		{
			final NamedTooltipTextColumn<ExampleAdvancedUser> column = new NamedTooltipTextColumn<ExampleAdvancedUser>("Date of Birth") {

				@Override
				public String getTooltipValue(ExampleAdvancedUser object) {
					StringBuilder sb = new StringBuilder();
					sb.append("Name : ").append(object.getName());
					sb.append("/n<br></br>Surame : ").append(object.getSurname());
					sb.append("/n<br></br>Address : ").append(object.getAddress());
					sb.append("/n<br></br>City : ").append(object.getCity());
					sb.append("/n<br></br>State : ").append(object.getState());
					return sb.toString();
				}

				@Override
				public String getValue(ExampleAdvancedUser object) {
					return object.getAddress();
				}
				
			};
					
					
	  	    sortHandler.setComparator(column, new Comparator<ExampleAdvancedUser>() {

			  			@Override
			  			public int compare(ExampleAdvancedUser o1, ExampleAdvancedUser o2) {
			  				return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
			  			}
			  	    	
			  	    });
	  	    
	  	    

	  	  FilterCalendarViewImpl filter = new FilterCalendarViewImpl() {
				
				@Override
				public void processEnterKeyDown() {
					Window.alert("Filter action, from: " + getFrom() + " to: " + getTo());
					
				}
			};
			
			SortFilterButtonCell<ExampleAdvancedUser, String> sfbc = new SortFilterButtonCell<ExampleAdvancedUser, String>(dataGrid, column, filter);
			
			Header<String> headerName = new Header<String>(sfbc) {
	
				@Override
				public String getValue() {
					return column.getName();
				}
			};
			dataGrid.addColumn(column,headerName);
		}


	
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
	
	class RowDetail implements RowDetailWidget<ExampleAdvancedUser>,ResourceAware{

		private FlowPanel container = new FlowPanel();

		public RowDetail(){
			container.addStyleName(css.getMainCss().rowDetailWidget());
		}

		@Override
		public Widget asWidget() {
			return container;
		}

		@Override
		public void setRowItem(ExampleAdvancedUser item) {
			container.clear();
			container.add(new HTML(item.getName()));
			container.add(new HTML(item.getSurname()));
			container.add(new HTML(item.getAddress()));
			container.add(new HTML(item.getCity()));
			container.add(new HTML(item.getState().name()));
			container.add(new HTML(dtf.format(item.getDateOfBirth())));
		}
		
	}


}

enum States{
	USA,ENGLAND,ITALY,RUSSIA;
}

class ExampleAdvancedUser implements Selectable{

	private boolean selected = false;
	private String name;
	private String surname;
	private String address;
	private String city;
	private States state;
	private Date dateOfBirth;
	private int id;
	

	public static final ProvidesKey<ExampleAdvancedUser> KEY_PROVIDER = new ProvidesKey<ExampleAdvancedUser>() {

		public Object getKey(ExampleAdvancedUser item) {
			return item == null ? null : item.getId();
		}
		 
	};

	
	public ExampleAdvancedUser(String name, String surname,
			String address, String city, States state, int id, Date dateOfBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
	}

	public ExampleAdvancedUser(String name, String surname, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.address = "";
		this.city = "";
		this.state = States.ENGLAND;
		this.dateOfBirth = new Date();
	}
	
	protected final Date getDateOfBirth() {
		return dateOfBirth;
	}

	protected final void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	protected final String getAddress() {
		return address;
	}

	protected final void setAddress(String address) {
		this.address = address;
	}

	protected final String getCity() {
		return city;
	}

	protected final void setCity(String city) {
		this.city = city;
	}

	protected final States getState() {
		return state;
	}

	protected final void setState(States state) {
		this.state = state;
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

	protected final int getId() {
		return id;
	}

	protected final void setId(int id) {
		this.id = id;
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

