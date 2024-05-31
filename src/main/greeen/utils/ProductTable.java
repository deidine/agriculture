package greeen.utils;

import javax.swing.table.DefaultTableModel;

import greeen.doa.ProductDAO;
import greeen.models.Product;

import java.util.List;

public class ProductTable extends DefaultTableModel {

    public ProductTable() {
    }

    public int countRecords() {
        ProductDAO pr = new ProductDAO();
        return pr.getProductCount();

    }

    public DefaultTableModel generateTable(int limit, int offset) {
        return TableData.generateTable(this.getRows(limit, offset), this.getColumns());
    }

    public DefaultTableModel generateTable4Search(String txt) {
        return TableData.generateTable(this.getRowsForEarch(txt), this.getColumns());
    }

    @Override
    public int getColumnCount() {
        System.out.println("deidineidne"+this.getColumns().length);
        return  this.getColumns().length ;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 3;
    }

    String getTableName() {
        return "products";
    }

    public String[] getColumns() {
        return new String[] { "Code_Produit", "Nom_Produit",   "Categorie" };
    }

    public List<Product> getData(int limit, int offset) {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.getQueryResult(limit, offset);
    }

    public List<Product> getDataForEarch(String txt) {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.searchProducts(txt);
    }

    public Object[][] getRows(int limit, int offset) {
        List<Product> productList = this.getData(limit, offset);
        if (productList == null) {
            return new Object[0][getColumnCount()];
        }
        int rowCount = productList.size();
        Object[][] ROWS = new Object[rowCount][getColumnCount()];
        for (int i = 0; i < rowCount; i++) {
            Product product = productList.get(i);
            ROWS[i][0] = product.getProductcode();
            ROWS[i][1] = product.getProductname(); 
            ROWS[i][2] = product.getCategorie() ;
        }
        return ROWS;
    }

    public Object[][] getRowsForEarch(String txt) {
        List<Product> productList = this.getDataForEarch(txt);
        if (productList == null) {
            return new Object[0][getColumnCount()];
        }
        int rowCount = productList.size();
        Object[][] ROWS = new Object[rowCount][getColumnCount()];
        for (int i = 0; i < rowCount; i++) {
            Product product = productList.get(i);
            ROWS[i][0] = product.getProductcode();
            ROWS[i][1] = product.getProductname();
            ROWS[i][2] = product.getCategorie() ;
            
        }
        return ROWS;
    }

    public int getRowsCount(String txt) {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.getProdSearch2Count(txt);
    }

}
