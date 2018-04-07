/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package earmusicmvc;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author abiiaka
 */
public class ClientTableModel extends AbstractTableModel {

    private String[] columnNames = {"Name", "Value"};
    private String[] rowNames = {"ID", "First Name", "Last Name", "Brand", "Headset", "Wireless", "Microphone", "Total Cost"};

    private Client client;

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return rowNames.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        if (col==0) {
            return rowNames[row];
        } else {
            if (client!=null) {
                switch (row) {
                    case 0:
                        return client.getId();
                    case 1:
                        return client.getFirstName();
                    case 2:
                        return client.getLastName();
                    case 3:
                        return client.getBrandName() + ":" + " " + client.getBrandCost() ;
                    case 4:
                        return client.getHeadsetName() + ":" + " " + client.getHeadsetCost();
                    case 5:
                        return client.getWirelessName() + ":" + " " + client.getWirelessCost();
                    case 6:
                        return client.getmicrophoneName() + ":" + " " + client.getmicrophoneCost();
                    case 7:
                        return client.getTotalCost();
                    default:
                        return "";
                }
            } else {
                return "";
            }
        }
    }

    /*
     * JTable uses this method to determine the default renderer/ editor for
     * each cell. If we didn't implement this method, then the last column
     * would contain text ("true"/"false"), rather than a check box.
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 1) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Don't need to implement this method unless your table's data can
     * change.
     */
    public void setValueAt(Object value, int row, int col) {
        
    }
  
    public void setClient(Client client) {
        this.client = client;
        for (int c=0; c<columnNames.length; c++) {
            for (int r=0; r<rowNames.length; r++) {
                fireTableCellUpdated(r, c);
            }    
        }
    }

}
