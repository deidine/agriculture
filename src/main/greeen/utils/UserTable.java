package greeen.utils;

import greeen.doa.UserDAO;
import greeen.models.User;
import greeen.models.User;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class UserTable extends DefaultTableModel {

    private UserDAO userDAO = new UserDAO();
     public UserTable( ) {
    // Default constructor
    }

    public int countRecords() {
        return userDAO.getQueryResult().size();
    }

    public DefaultTableModel generateTable(int limit, int offset) {
         return TableData.generateTable(this.getRows(limit, offset), this.getColumns());
    }

    @Override
    public int getColumnCount() {
        return  this.getColumns().length ;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3; // Allow editing only for the fourth column
    }

    public String[] getColumns() {
        return new String[]{
           
            "Code_Vendeur", "Nom_Complet", "Lieu", "Telephone","username"
        };
    }

    public List<User> getData(int limit, int offset) {
        return userDAO.getQueryResult(limit, offset);
    }

    public int getRowsCount() {
        return userDAO.getQueryResult().size();
    }

    public Object[][] getRows(int limit, int offset) {
        List<User> productList = this.getData(limit, offset);
        if (productList == null) {
            return new Object[0][getColumnCount()];
        }

        int rowCount = productList.size();
        Object[][] rows = new Object[rowCount][getColumnCount()];

        for (int i = 0; i < rowCount; i++) {
            User salle = productList.get(i);
            rows[i][0] = salle.getId();
            rows[i][1] = salle.getFullName();
            rows[i][2] = salle.getLocation();
            rows[i][3] = salle.getPhone();
            rows[i][4] = salle.getUsername(); 
        }

        return rows;
    }
}
