package greeen.views;

  
import javax.swing.JOptionPane;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

import greeen.doa.CategoryDAO;
import greeen.doa.InputSaleProductDAO;
import greeen.doa.ProductDAO;
import greeen.models.Category;
import greeen.models.InputSaleProduct;
import greeen.models.Product;
import greeen.utils.UnitConverter;

/**
 *
 * @author deidine
 */
public class SalleForm extends javax.swing.JDialog {
    String imagePath ; 
    String username = null;
    String supplier = null;
    int quantity;
    String prodCode = null;
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private byte[] imageBytes;
    Date tanggal = new Date();
    Date dates = new Date();
    String unite;

    /**
     * Creates new form PurchaseForm
     */
        String type;
    public SalleForm( String type) {
  this.type=  type;
        initComponents();
        productTable(); 

        // setAlwaysOnTop(true);
        // setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        codeText = new javax.swing.JTextField();
        productQtnt = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        categoryText = new javax.swing.JTextField();
        jComboBUnite = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduct = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnEntrer = new javax.swing.JButton();
        labelHeader1 = new javax.swing.JLabel();
        labelHeader2 = new javax.swing.JLabel();
        searchProduct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("image");

        jPanel5.setBackground(new java.awt.Color(102, 102, 0));

        codeText.setEditable(false);
        codeText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        productQtnt.setEditable(false);
        productQtnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQtntActionPerformed(evt);
            }
        });

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 102));
        jLabel4.setText(" Nom du produit:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nameText)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(productQtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productQtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        quantityText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        quantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setText("Quantite:");

        jLabel3.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantityText)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("categories");

        categoryText.setEditable(false);
        categoryText.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(categoryText))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(categoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBUnite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tone", "Kg", "Litre","M" }));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel11.setText("unite");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBUnite, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBUnite, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProduct);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        btnEntrer.setBackground(new java.awt.Color(102, 102, 0));
        btnEntrer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrer.setForeground(new java.awt.Color(255, 255, 102));
        btnEntrer.setText(">");
        btnEntrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrerActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnEntrer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEntrer)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEntrer)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        labelHeader1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        labelHeader1.setText("Nouvelle quqntite Produit");

        labelHeader2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        labelHeader2.setText("Table  Produit");

        searchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchProductKeyReleased(evt);
            }
        });

        jLabel1.setText("Chercher");

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        clearButton.setBackground(new java.awt.Color(255, 255, 0));
        clearButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(51, 51, 0));
        clearButton.setText("inisialiser");
        clearButton.setBorderPainted(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(0, 255, 0));
        addButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addButton.setText("ajouter");
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(clearButton)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelHeader1)
                            .addComponent(labelHeader2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productQtntActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_productQtntActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_productQtntActionPerformed

    private void codeTextKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_codeTextKeyReleased

        // TODO add your handling code here:
    }// GEN-LAST:event_codeTextKeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
      
        InputSaleProduct salleProduct = new InputSaleProduct();
        ProductDAO prdDao = new ProductDAO();
        InputSaleProductDAO salleProductdoa = new InputSaleProductDAO();
        if (categoryText.getText().equals("")  
                || quantityText.getText().equals(""))
            JOptionPane.showMessageDialog(null, "il vaut remplis toute les chapms .");
        else {
            salleProduct.setTypeProduit( categoryText.getText() );
            salleProduct.setQuantite(Double.parseDouble(quantityText.getText()));

            salleProduct.setImageProduit(imagePath); 
          salleProduct.setUnite(jComboBUnite.getSelectedItem().toString());
        //  biometicl engennerie;
            double newQunt = 0;
            if( type.equals("vente")){
                newQunt = Double.parseDouble(productQtnt.getText()) - 
                UnitConverter.convert(Double.parseDouble(quantityText.getText()), salleProduct.getUnite(), 
               this.unite);
                 salleProduct.setType("vente"); 

            }else{
                newQunt = Double.parseDouble(productQtnt.getText()) + 
                UnitConverter.convert(Double.parseDouble(quantityText.getText()), salleProduct.getUnite(), 
               this.unite);
                 salleProduct.setType("input"); 
            }

            salleProductdoa.save(salleProduct);
            prdDao.updateSalleQuantity(newQunt,  codeText.getText()) ;
            this.inisialiser();
            this.productTable();
          
            // loadDataSet();

        }
    }// GEN-LAST:event_addButtonActionPerformed

    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_addButtonKeyPressed

    }// GEN-LAST:event_addButtonKeyPressed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        inisialiser();
    }// GEN-LAST:event_clearButtonActionPerformed

    private void sellTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sellTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_sellTextActionPerformed

    private void brandTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_brandTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_brandTextActionPerformed

    private void btnEntrerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEntrerActionPerformed
        DefaultTableModel listProds = (DefaultTableModel) jTableProduct.getModel();
        if (jTableProduct.getSelectedRow() >= 0) {
            // dateText2.setText(getCureentTime());
            codeText.setText(listProds.getValueAt(jTableProduct.getSelectedRow(),
                    0).toString());
            productQtnt.setText(listProds.getValueAt(jTableProduct.getSelectedRow(),
                    2).toString());
            nameText.setText(listProds.getValueAt(jTableProduct.getSelectedRow(),
                    1).toString());
         categoryText.setText(listProds.getValueAt(jTableProduct.getSelectedRow(),
                    3).toString());
                    this.unite=listProds.getValueAt(jTableProduct.getSelectedRow(),
                    4).toString();

                    
              imagePath = (String) listProds.getValueAt(jTableProduct.getSelectedRow(),
            5).toString();
            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
            jLabel3.setIcon(new ImageIcon(image));
        } else {
            JOptionPane.showMessageDialog(null, "il veut selectionner un produit dans le   table");

        }
        quantityText.requestFocus();

        quantityText.setSelectionStart(0);
        quantityText.setSelectionEnd(quantityText.getText().length());
        // TODO add your handling code here:
    }// GEN-LAST:event_btnEntrerActionPerformed

    private void quantityTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_quantityTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_quantityTextActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_dateTextActionPerformed

    private void btnEntrer1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEntrer1ActionPerformed
       
        // TODO add your handling code here:
    }// GEN-LAST:event_btnEntrer1ActionPerformed

    private void searchProductKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_searchProductKeyReleased
        String txt = searchProduct.getText();

        sarchProductTable(txt); // TODO add your handling code here:
    }// GEN-LAST:event_searchProductKeyReleased
 
    public void inisialiser() {
        categoryText.setText("");
        nameText.setText("");
        // useDateText.setText("");
        codeText.setText("");
  
        quantityText.setText("");
        // dateText.setDate( );
    }

    private String stringToDaTe(Date s) {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;

        return formatter.format(s);
    }

    private String getCureentTime() {
        // DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dates = new Date();
        // System.out.println(dateFormat.format(jDateChooser1.getDate()));
        // System.out.println( dateFormat.format(dates));
        return dateFormat.format(dates);

    }

    private void productTable() {
        try {
            ProductDAO prDoa = new ProductDAO();
            List<Product> allProd = prDoa.getProdInfo();

            DefaultTableModel laporan = new DefaultTableModel();
            laporan.addColumn("code produit");
            laporan.addColumn("nom produit");
            laporan.addColumn("quentite");
laporan.addColumn("categories");
            laporan.addColumn("unite");
            laporan.addColumn("image");

            laporan.getDataVector().removeAllElements();
            laporan.fireTableDataChanged();
            laporan.setRowCount(0);
            for (Product product : allProd) {
                laporan.addRow(
                        new Object[] { product.getProductcode(), product.getProductname(), product.getQuantitySalle(), product.getCategorie(),product.getMainUnit(),product.getImageProduit() });
            }

            jTableProduct.setModel(laporan);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cek Kembali " + e + "");
        }
    }
 
    private void sarchProductTable(String txt) {
        try {
            ProductDAO prDoa = new ProductDAO();
            List<Product> allProd = prDoa.getProdInfo();

            // Filter products based on the search text
            List<Product> filteredProducts = allProd.stream()
                    .filter(product -> product.getProductcode().toLowerCase().contains(txt.toLowerCase()) ||
                            product.getProductname().toLowerCase().contains(txt.toLowerCase()))
                    .collect(Collectors.toList());

            // Create a new model with filtered data
            DefaultTableModel laporan = new DefaultTableModel();
            laporan.addColumn("Code Produit");
            laporan.addColumn("Nom Produit");
            laporan.addColumn("Quantité");
   laporan.addColumn("categories");

               laporan.addColumn("unite");
               laporan.addColumn("image");
            // Add filtered products to the model
            for (Product product : filteredProducts) {
                laporan.addRow(
                        new Object[] { product.getProductcode(), product.getProductname(), product.getQuantitySalle(), product.getCategorie() ,product.getMainUnit(),product.getImageProduit()});
            }

            jTableProduct.setModel(laporan);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addButton;
    private javax.swing.JButton btnEntrer;
    private javax.swing.JTextField categoryText;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JComboBox<String> jComboBUnite;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JLabel labelHeader1;
    private javax.swing.JLabel labelHeader2;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField productQtnt;
    private javax.swing.JTextField quantityText;
    private javax.swing.JTextField searchProduct;
    // End of variables declaration//GEN-END:variables
}
