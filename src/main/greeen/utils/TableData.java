/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeen.utils;

import java.util.Date;

import javax.swing.table.DefaultTableModel;
 

/**
 * TableData es la clase encargada de recepcionar los datos y nombres de
 * columnas de la tabla, para aplicarlos a la tabla.
 */
public class TableData extends DefaultTableModel {
 

    Date tanggal = new Date();
 
    /**
     * Establece que ninguna celda es editable de manera directa.
     */
    @Override
    public boolean isCellEditable(int row, int colum) {
        return false;
    }
 
    static public DefaultTableModel generateTable(Object[][] rows, Object[] column) {

        return new DefaultTableModel(
                rows, column) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    } 
}
