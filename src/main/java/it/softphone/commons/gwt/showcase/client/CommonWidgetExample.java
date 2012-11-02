package it.softphone.commons.gwt.showcase.client;

import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid;
import it.softphone.rd.gwt.client.widget.base.list.FormDetailDataGrid.RowDetailWidget;
import it.softphone.rd.model.shared.Selectable;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SingleSelectionModel;

public class CommonWidgetExample implements EntryPoint{

	private static final List<ExampleUser> users = new ArrayList<ExampleUser>();
	static{
		users.add(new ExampleUser("Mike", "Cunningam", 32));
		users.add(new ExampleUser("Loreen", "Francy", 22));
		users.add(new ExampleUser("Tolbian", "Berisky", 52));
		users.add(new ExampleUser("Tony", "Mellow", 16));
	
	}
	private FormDetailDataGrid<ExampleUser> dataGrid;


	@Override
	public void onModuleLoad() {
		RootLayoutPanel rp = RootLayoutPanel.get();
		rp.add(buildWidget());

		
	}
	
	private FlowPanel buildWidget(){
		FlowPanel exampleContainer = new FlowPanel();

		RowDetail rowDetail = new RowDetail();

		dataGrid = new FormDetailDataGrid<ExampleUser>(
				ExampleUser.KEY_PROVIDER,
				users, 
				rowDetail, 
				new ExampleUser("test", "test", 0));
		
		dataGrid.setHeight("300px");
		
		final SingleSelectionModel<ExampleUser> selectionModel = new SingleSelectionModel<ExampleUser>(ExampleUser.KEY_PROVIDER);
		dataGrid.setSelectionModel(selectionModel);
		dataGrid.setEmptyTableWidget(new Label("No Result"));
		dataGrid.setRowCount(users.size() , true);
		dataGrid.setRowData( users);
		
		initGrid();
		exampleContainer.add(dataGrid);
		return exampleContainer;
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
	
	



}

class RowDetail implements RowDetailWidget<ExampleUser>{

	private HTML detail = new HTML();
		
	@Override
	public Widget asWidget() {
		return detail;
	}

	@Override
	public void setRowItem(ExampleUser item) {
		StringBuilder sb = new StringBuilder();
		sb.append("Name : ").append(item.getName());
		sb.append("<br></br>Surame : ").append(item.getSurname());
		sb.append("<br></br>Age : ").append(item.getAge());
		detail.setHTML(sb.toString());
		
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

