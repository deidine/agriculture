/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeen.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.table.DefaultTableModel;
 

/**
 * TableData es la clase encargada de recepcionar los datos y nombres de
 * columnas de la tabla, para aplicarlos a la tabla.
 */
public class TableData extends DefaultTableModel {

    // ATTRIBUTES
    private static Connection conn = null;

    PreparedStatement prepStatement = null;
    Statement statement = null;
    ResultSet resultSet = null;
    private static PreparedStatement preparedStatement;

    Date tanggal = new Date();
 
    /**
     * Establece que ninguna celda es editable de manera directa.
     */
    @Override
    public boolean isCellEditable(int row, int colum) {
        return false;
    }

    // public static Integer countRecords(String table) {

    //     ResultSet result = null;
    //     try {
    //         try {
    //             conn = new ConnectionFactory().getConn();
    //             // statement = conn.createStatement();
    //         } catch (Exception ex) {
    //             ex.printStackTrace();
    //         }

    //         preparedStatement = conn.prepareStatement("SELECT COUNT(*) FROM " + table);
    //         result = preparedStatement.executeQuery();

    //         if (result.next()) {
    //             return result.getInt(1);
    //         } else {
    //             return null;
    //         }

    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     } finally {
    //         // close(con);
    //         // close(preparedStatement);
    //     }
    // }

    
    
    static public DefaultTableModel generateTable(Object[][] rows, Object[] column) {

        return new DefaultTableModel(
                rows, column) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    } 
}
