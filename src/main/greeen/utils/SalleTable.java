package greeen.utils;

import greeen.doa.InputSaleProductDAO;
import greeen.models.InputSaleProduct;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SalleTable extends DefaultTableModel {

    private InputSaleProductDAO salleDAO = new InputSaleProductDAO();

    public SalleTable() {
        // Default constructor
    }

    public int countRecords() {
        return salleDAO.getAll().size();
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
           
            "id","CategorieProduit", "image_produit" ,   "Quantite", "Unite"
        };
    }

    public List<InputSaleProduct> getData(int limit, int offset) {
        return salleDAO.getQueryResult(limit, offset);
    }

    public int getRowsCount() {
        return salleDAO.getAll().size();
    }

    public Object[][] getRows(int limit, int offset) {
        List<InputSaleProduct> productList = this.getData(limit, offset);
        if (productList == null) {
            return new Object[0][getColumnCount()];
        }

        int rowCount = productList.size();
        Object[][] rows = new Object[rowCount][getColumnCount()];

        for (int i = 0; i < rowCount; i++) {
            InputSaleProduct salle = productList.get(i);
            rows[i][0] = salle.getId();
            rows[i][1] = salle.getTypeProduit();
            rows[i][2] = salle.getImageProduit();
            rows[i][3] = salle.getQuantite();
            rows[i][4] = salle.getUnite(); 
        }

        return rows;
    }
}
