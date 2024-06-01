
package greeen.views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import greeen.doa.CategoryDAO;
import greeen.doa.ProductDAO;
import greeen.models.Category;
import greeen.models.Product;

/**
 *
 * @author deidine
 */
public class CategoryForm extends javax.swing.JDialog {
    Product productDTO;
    String username = null;
    String supplier = null;
    int userID; 
    /**
     * Creates new form ProductForm
     */
    boolean edit;
    boolean add;
    Object[] data;

    public CategoryForm(boolean edit, boolean add, Object[] data) {
        // Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        // int x = (int) ((dimension.getWidth() - this.getWidth()) / 4);
        // int y = (int) ((dimension.getHeight() - this.getHeight()) / 6);
        // this.setLocation(x, y);
        this.add = add;
        this.data = data;
        this.edit = edit;
        // setAlwaysOnTop(true);
        // setUndecorated(true);
        // this.setResizable(false);
        initComponents(); 
        //////////// this have to be under the initCompoent to work in the jdialog plese
        //////////// dont forget to put under it
        setLocationRelativeTo(null);
        setResizable(false);
        setModal(true);
        setVisible(true);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // setLocationRelativeTo(null);// it hava to be the last to work and put the
        // frame in the centre of screen
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();

        labelHeader.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        labelHeader.setText("Formulaire du Category");
        if (!edit) {
            editButton.setEnabled(false);

        }else{
            loadDataSet();
        }
        if (!add) {
            codeText.setEnabled(false);
            addButton.setEnabled(false);
        }

        addButton.setBackground(new java.awt.Color(0, 255, 0));
        addButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addButton.setText("Inserer");
        addButton.setBorderPainted(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 255, 0));
        editButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(51, 51, 0));
        editButton.setText("Modifier");
        editButton.setBorderPainted(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        editButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editButtonKeyPressed(evt);
            }
        });

        nameText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("Code Category:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("Nom Category:");

        codeText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        codeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextActionPerformed(evt);
            }
        });

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
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearButton)
                        .addGap(148, 148, 148)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelHeader)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // productDTO = new Product();
        // if (nameText.getText().equals(""))
        //     JOptionPane.showMessageDialog(null, "il vaut remplis toute les chapms pour terminer l'operation.");
        // else {
        //     productDTO.setProductcode(codeText.getText());
        //     productDTO.setProductname(nameText.getText());
        //     productDTO.setQuantityPurchase(0); 
        //     productDTO.setQuantitySalle(0); 
        //      productDTO.setCategorie(jComboCategries.getSelectedItem().toString());
        //     new ProductDAO().addProductDAO(productDTO);
        //     codeText.setText("");
        //     nameText.setText("");
             
            // jComboCategries.set(0);
            // loadDataSet();
        // }
        Category cat=new Category();
        cat.setId(codeText.getText());
        cat.setName(nameText.getText());
        new CategoryDAO().save(cat);
    }// GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editButtonActionPerformed

    }// GEN-LAST:event_editButtonActionPerformed

    private void editButtonKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_editButtonKeyPressed

    }// GEN-LAST:event_editButtonKeyPressed

 
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        codeText.setText("");
        nameText.setText(""); 
        // sellText.setText("");
        // brandText.setText("");
    }// GEN-LAST:event_clearButtonActionPerformed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_clearButtonKeyPressed
        // TODO add your handling code here:

    }// GEN-LAST:event_clearButtonKeyPressed

    private void codeTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_codeTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_codeTextActionPerformed
     // Method to update combo box containing supplier names

    void loadDataSet() {
        // if(!edit){

        codeText.setText(data[0].toString());
        nameText.setText(data[1].toString());   
        // }
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    protected javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JTextField nameText;
    // End of variables declaration//GEN-END:variables

}
