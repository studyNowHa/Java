package main;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class PersonModel implements TableModel {
	private ArrayList<TableModelListener> listeners;
	
	public void PersonModel() {
		listeners = new ArrayList<TableModelListener>();
	}

	@Override
	public void addTableModelListener(TableModelListener arg0) {
		listeners.add(arg0);
		
		
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		
		return String.class;
	}

	@Override
	public int getColumnCount() {	
		
		return 2;
	}

	@Override
	public String getColumnName(int index) {
		String return_string = "";
		
		switch (index) {
		case 0:
			return_string = "Name";			
			break;

		case 1:
			return_string = "Surname";
			break;
		}
		return return_string;
	}

	@Override
	public int getRowCount() {
		
		return 0;
	}

	@Override
	public Object getValueAt(int row, int col) {
		
		return null;
	}

	@Override
	public boolean isCellEditable(int row, int col) {
		
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		listeners.remove(arg0);
		
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		
		
	}

}
