/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table_Model;

import entitys.passenger;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author feffo
 */
public class Pass_Table_Model extends GenericTableModel <passenger> {

    public Pass_Table_Model (){
        List<String> identifiers = Arrays.asList(new String[]{"Id", "Nombre", "Apellido", "DNI" ,"Email", "Telefono"});
        this.setColumnIdentifiers(identifiers);
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
         switch (columnIndex) {
            case 0 -> {
                return Long.class;
            }
            case 1 -> {
                return String.class;
            }
            case 2 -> {
                return String.class;
            }
            case 3 -> {
                return Long.class;
            }
            case 4 -> {
                return String.class;
            }
            case 5 -> {
                return Long.class;
            }
            default -> throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        passenger p = this.getDomainObject(rowIndex);
            switch (columnIndex) {
            case 0: return p.getId();
            case 1: return p.getName();
            case 2: return p.getLast_Name();
            case 3: return p.getDni();
            case 4: return p.getEmail();
            case 5: return p.getPhone_Number();
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);    }
        }

    public void setValueAt(Object aValue, int rowIndex) {
        passenger p = this.getDomainObject(rowIndex);
        String columnIndex = null;
            switch (rowIndex) {
            case 0: p.setId((Long) aValue);
                break;
            case 1: p.setName ((String) aValue);
                break;
            case 2: p.setLast_Name ( (String) aValue);
                break;
            case 3 : p.setDni ((Long) aValue);
                break;
            case 4 : p.setEmail ((String) aValue);
                break;
            case 5 : p.setPhone_Number((Long) aValue);
                break;
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
        this.notifyTableCellUpdate( aValue, rowIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void notifyTableCellUpdate(Object aValue, int rowIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

 
 }
    

