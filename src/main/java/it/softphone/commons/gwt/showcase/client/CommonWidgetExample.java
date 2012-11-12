package it.softphone.commons.gwt.showcase.client;

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
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SingleSelectionModel;

public class CommonWidgetExample implements EntryPoint{

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


	@Override
	public void onModuleLoad() {
		RootLayoutPanel rp = RootLayoutPanel.get();
		rp.add(buildWidget());

		
	}
	
	private FlowPanel buildWidget(){
		FlowPanel exampleContainer = new FlowPanel();

		RowDetail rowDetail = new RowDetail();

		dataProvider = new ListDataProvider<ExampleAdvancedUser>(ExampleAdvancedUser.KEY_PROVIDER);
		dataProvider.setList(users);
		ListHandler<ExampleAdvancedUser> sortHandler = new ListHandler<ExampleAdvancedUser>(dataProvider.getList());
		
	
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
		
		return exampleContainer;
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
