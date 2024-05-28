package greeen.utils;

import greeen.doa.InputPurchaseProductDAO;
import greeen.models.InputPurchaseProduct;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PurcahseTable extends DefaultTableModel {

    private InputPurchaseProductDAO purchaseDAO = new InputPurchaseProductDAO();

    public PurcahseTable() {
        // Default constructor
    }

    public int countRecords() {
        return purchaseDAO.getAll().size();
    }

    public DefaultTableModel generateTable(int limit, int offset) {
        System.out.println("deidine");
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
            "id","CategorieProduit", "NomProduit", "Quantite", "Unite", "DateAchat", "DateExpiration", "Utilisation"
        };
    }

    public List<InputPurchaseProduct> getData(int limit, int offset) {
        return purchaseDAO.getQueryResult(limit, offset);
    }

    public int getRowsCount() {
        return purchaseDAO.getAll().size();
    }

    public Object[][] getRows(int limit, int offset) {
        List<InputPurchaseProduct> productList = this.getData(limit, offset);
        if (productList == null) {
            return new Object[0][getColumnCount()];
        }

        int rowCount = productList.size();
        Object[][] rows = new Object[rowCount][getColumnCount()];

        for (int i = 0; i < rowCount; i++) {
            InputPurchaseProduct purchase = productList.get(i);
            rows[i][0] = purchase.getId();
            rows[i][1] = purchase.getCategorieProduit();
            rows[i][2] = purchase.getNomProduit();
            rows[i][3] = purchase.getQuantite();
            rows[i][4] = purchase.getUnite();
            rows[i][5] = purchase.getDateAchat();
            rows[i][6] = purchase.getDateExpiration();
            rows[i][7] = purchase.getUtilisation();
        }

        return rows;
    }
}
