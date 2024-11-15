/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author feffo
 * @param <T>
 */
public abstract class GenericTableModel<T> implements TableModel {

    private EventListenerList listeners;
    private List columnIndentifiers;
    private List<T> data;

    public GenericTableModel() {
        this.data = new ArrayList();
        this.columnIndentifiers = new ArrayList();
        this.listeners = new EventListenerList();
    }

    public GenericTableModel(List identifiers) {
        this();
        if (identifiers == null) {
            throw new IllegalArgumentException("Column Identifiers needed");
        }
        this.columnIndentifiers.addAll(identifiers);
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        this.listeners.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        this.listeners.remove(TableModelListener.class, l);
    }

    @Override
    public int getRowCount() {
        return this.data.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnIndentifiers.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex < 0 || columnIndex >= this.getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
        return this.columnIndentifiers.get(columnIndex).toString();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public TableModelListener[] getTableModelListeners() {
        return this.listeners.getListeners(TableModelListener.class);
    }

    protected void notifyTableChanged(TableModelEvent e) {
        TableModelListener[] list = getTableModelListeners();
        for (int i = 0; i < list.length; i++) {
            list[i].tableChanged(e);
        }
    }

    protected void notifyTableHeaderChanged() {
        TableModelEvent e = new TableModelEvent(this, TableModelEvent.HEADER_ROW);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsInserted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsUpdated(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);
        notifyTableChanged(e);
    }

    protected void notifyTableRowsDeleted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        notifyTableChanged(e);
    }

    protected void notifyTableCellUpdate(int row, int column) {
        TableModelEvent e = new TableModelEvent(this, row, row, column);
    }

   
    public void addRow(T object) {
        int rowIndex = this.data.size();
        this.data.add(object);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }

    public void addRows(List<T> objects) {
        if (!objects.isEmpty()) {
            int firstRow = this.data.size();
            this.data.addAll(objects);
            int lastRow = this.data.size() - 1;
            notifyTableRowsInserted(firstRow, lastRow);
        }
    }

    public void insertRow(T object, int rowIndex) {
        this.data.add(rowIndex, object);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }

    public void notifyDomainObjectUpdated(T object) {
        T[] elements = (T[]) this.data.toArray();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == object) {
                notifyTableRowsUpdated(i, i);
            }
        }
    }

    public void deleteRow(int rowIndex) {
        if (this.data.remove(this.data.get(rowIndex))) {
            notifyTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    public void deleteRow(T object) {
        int rowIndex = -1;
        while ((rowIndex = this.data.indexOf(object)) > -1) {
            this.data.remove(object);
            notifyTableRowsDeleted(rowIndex, rowIndex);
        }
    }

    public void clearTableModelData() {
        if (!this.data.isEmpty()) {
            int lastRow = this.data.size() - 1;
            this.data.clear();
            notifyTableRowsDeleted(0, lastRow);
        }
    }

    public T getDomainObject(int rowIndex) {
        return this.data.get(rowIndex);
    }

    public List<T> getDomainObjects(int firstRow, int lastRow) {
        return Collections.unmodifiableList(this.data.subList(firstRow, lastRow + 1));
    }
    
    public List<T> getDomainObjects() {
        return Collections.unmodifiableList(this.data);
    }
    
    public void setColumnIdentifiers(List identifiers) {
        this.columnIndentifiers.clear();
        this.columnIndentifiers.addAll(identifiers);
        notifyTableHeaderChanged();
    }
}