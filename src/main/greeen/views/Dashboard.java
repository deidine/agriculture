/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package greeen.views;



import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import greeen.doa.InputPurchaseProductDAO;
import greeen.doa.ProductDAO;
import greeen.utils.ProductTable;
import greeen.utils.PurcahseTable;

/**
 *
 * @author deidine
 */
public class Dashboard extends javax.swing.JFrame {

    private static int counterPagination = 0;
    int limitPagination = 20;
    
    PurcahseTable prchtb = new PurcahseTable();

    ProductTable prtbl = new ProductTable();
    
    
    /**
     * Creates new form Dashboard2
     */
    static String username="deodone";

    public Dashboard(String username) {
        this.username = username; 
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("resources/logo.png").getImage());

        // setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        try {
            loadData();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        setExtendedState(JFrame.MAXIMIZED_BOTH); // this for full screen
        // setUndecorated(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        serchProduct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nextProduct = new javax.swing.JButton();
        prevProduct = new javax.swing.JButton();
        deleteProduit = new javax.swing.JButton();
        editProduit = new javax.swing.JButton();
        addProduit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jScrollTabelTransaksi9 = new javax.swing.JScrollPane();
        tabelProduit = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        serchPurchase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nextPurchase = new javax.swing.JButton();
        prevPurchase = new javax.swing.JButton();
        deletePurchase = new javax.swing.JButton();
        addPurchase = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jPanel12 = new javax.swing.JPanel();
        jScrollTabelTransaksi7 = new javax.swing.JScrollPane();
        tabelIPurchase = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serchProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchProductKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Chercher");

        nextProduct.setBackground(new java.awt.Color(255, 255, 204));
        nextProduct.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        nextProduct.setForeground(new java.awt.Color(51, 51, 0));
        nextProduct.setText("Next");
        nextProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        nextProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextProductActionPerformed(evt);
            }
        });

        prevProduct.setBackground(new java.awt.Color(255, 255, 204));
        prevProduct.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        prevProduct.setForeground(new java.awt.Color(51, 51, 0));
        prevProduct.setText("Prev");
        prevProduct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        prevProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevProductActionPerformed(evt);
            }
        });

        deleteProduit.setBackground(new java.awt.Color(255, 51, 51));
        deleteProduit.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        deleteProduit.setForeground(new java.awt.Color(51, 51, 0));
        deleteProduit.setText("suprimer");
        deleteProduit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        deleteProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProduitActionPerformed(evt);
            }
        });

        editProduit.setBackground(new java.awt.Color(255, 255, 0));
        editProduit.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        editProduit.setForeground(new java.awt.Color(51, 51, 0));
        editProduit.setText("editer");
        editProduit.setBorderPainted(false);
        editProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProduitActionPerformed(evt);
            }
        });
        editProduit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editProduitKeyPressed(evt);
            }
        });

        addProduit.setBackground(new java.awt.Color(51, 255, 51));
        addProduit.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addProduit.setForeground(new java.awt.Color(51, 0, 51));
        addProduit.setText("Ajouter");
        addProduit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProduitActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator11.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(addProduit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(deleteProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(prevProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextProduct)
                .addGap(8, 8, 8)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(serchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(serchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prevProduct)
                            .addComponent(nextProduct))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(editProduit, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(addProduit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelProduit.setIntercellSpacing(new java.awt.Dimension(10, 5));
        tabelProduit.setOpaque(true);
        tabelProduit.setRowHeight(30);
        tabelProduit.getTableHeader().setReorderingAllowed(false);
        jScrollTabelTransaksi9.setViewportView(tabelProduit);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollTabelTransaksi9))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollTabelTransaksi9, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Les Produits", jPanel3);

        serchPurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchPurchaseKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("Chercher");

        nextPurchase.setBackground(new java.awt.Color(255, 255, 204));
        nextPurchase.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        nextPurchase.setForeground(new java.awt.Color(51, 51, 0));
        nextPurchase.setText("Next");
        nextPurchase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        nextPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPurchaseActionPerformed(evt);
            }
        });

        prevPurchase.setBackground(new java.awt.Color(255, 255, 204));
        prevPurchase.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        prevPurchase.setForeground(new java.awt.Color(51, 51, 0));
        prevPurchase.setText("Prev");
        prevPurchase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        prevPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPurchaseActionPerformed(evt);
            }
        });

        deletePurchase.setBackground(new java.awt.Color(255, 51, 51));
        deletePurchase.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        deletePurchase.setForeground(new java.awt.Color(51, 51, 0));
        deletePurchase.setText("suprimer");
        deletePurchase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        deletePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePurchaseActionPerformed(evt);
            }
        });

        addPurchase.setBackground(new java.awt.Color(51, 255, 51));
        addPurchase.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addPurchase.setForeground(new java.awt.Color(51, 0, 51));
        addPurchase.setText("Ajouter");
        addPurchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPurchaseActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator12.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(addPurchase)
                .addGap(32, 32, 32)
                .addComponent(deletePurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(prevPurchase)
                .addGap(31, 31, 31)
                .addComponent(nextPurchase)
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(serchPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serchPurchase)
                            .addComponent(jLabel2))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletePurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prevPurchase)
                            .addComponent(nextPurchase)))))
        );

        tabelIPurchase.setOpaque(true);
        tabelIPurchase.setRowHeight(30);
        tabelIPurchase.getTableHeader().setReorderingAllowed(false);
        jScrollTabelTransaksi7.setViewportView(tabelIPurchase);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi7)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi7, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Les Commende", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProduitActionPerformed
        new ProductForm(false, true, null);
        refrech();        // TODO add your handling code here:
    }//GEN-LAST:event_addProduitActionPerformed

    private void editProduitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editProduitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_editProduitKeyPressed

    private void editProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProduitActionPerformed
        if (tabelProduit.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "il vaut selectionner un line dans le tableau.");
        } else {
            int row = tabelProduit.getSelectedRow();
            int col = tabelProduit.getColumnCount();
            Object[] data = new Object[col];

            for (int i = 0; i < col; i++) {

                data[i] = tabelProduit.getValueAt(row, i);
            }
            System.out.println(data[0]);
            new ProductForm(true, false, data);
            refrech();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_editProduitActionPerformed

    private void deleteProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProduitActionPerformed
        if (tabelProduit.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "il vaut slectionner un line dans le tableau.");
        } else {
            int opt = JOptionPane.showConfirmDialog(
                this,
                "tu es sur de suprimer?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                new ProductDAO()
                .deleteProductDAO(tabelProduit.getValueAt(tabelProduit.getSelectedRow(), 0).toString());
                refrech();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteProduitActionPerformed

    private void prevProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevProductActionPerformed
        --counterPagination;
        // Set Tabel Model for Barang
        if (counterPagination * limitPagination <= 0) {
            prevProduct.setEnabled(false);
            nextProduct.setEnabled(true);
        } else {
            prevProduct.setEnabled(true);
            nextProduct.setEnabled(true);
        }
        tabelProduit.setModel(prtbl.generateTable(limitPagination, counterPagination));
        // TODO add your handling code here:
    }//GEN-LAST:event_prevProductActionPerformed

    private void nextProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextProductActionPerformed
        ++counterPagination;

        if (counterPagination >= prtbl.countRecords() / limitPagination) {
            nextProduct.setEnabled(false);
            prevProduct.setEnabled(true);
        } else {
            nextProduct.setEnabled(true);
            prevProduct.setEnabled(true);
        }
        tabelProduit.setModel(prtbl.generateTable(limitPagination, counterPagination));

        // TODO add your handling code here:
    }//GEN-LAST:event_nextProductActionPerformed

    private void serchProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchProductKeyReleased
        String text = serchProduct.getText();
        loadSearchDataProduct(text);
        // TODO add your handling code here:
    }//GEN-LAST:event_serchProductKeyReleased

    private void serchPurchaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchPurchaseKeyReleased
        String text = serchPurchase.getText();
        loadSearchDataPurchase(text);
        // TODO add your handling code here:
    }//GEN-LAST:event_serchPurchaseKeyReleased

    private void nextPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPurchaseActionPerformed
        ++counterPagination;

        if (counterPagination >= prtbl.countRecords() / limitPagination) {
            nextPurchase.setEnabled(false);
            prevPurchase.setEnabled(true);
        } else {
            nextPurchase.setEnabled(true);
            prevPurchase.setEnabled(true);
        }
        tabelIPurchase.setModel(prchtb.generateTable(limitPagination, counterPagination));
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPurchaseActionPerformed

    private void prevPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPurchaseActionPerformed

        --counterPagination;
        // Set Tabel Model for Barang
        if (counterPagination * limitPagination <= 0) {
            prevPurchase.setEnabled(false);
            nextPurchase.setEnabled(true);
        } else {
            prevPurchase.setEnabled(true);
            nextPurchase.setEnabled(true);
        }
        tabelIPurchase.setModel(prchtb.generateTable(limitPagination, counterPagination));
        // TODO add your handling code here:
    }//GEN-LAST:event_prevPurchaseActionPerformed

    private void deletePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePurchaseActionPerformed
        InputPurchaseProductDAO purchaseProductdoa=new InputPurchaseProductDAO();
             DefaultTableModel listProds = (DefaultTableModel) tabelIPurchase.getModel();

        
        if (tabelIPurchase.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "il vaut selection un line dans le table.");
        } else {
            int opt = JOptionPane.showConfirmDialog(
                null,
                "tu es sure de suprimer?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                purchaseProductdoa.deleteById(Long.parseLong(listProds.getValueAt(tabelIPurchase.getSelectedRow(),
                0).toString()) );

                refrech();
            }
        }      // TODO add your handling code here:
    }//GEN-LAST:event_deletePurchaseActionPerformed

    private void addPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPurchaseActionPerformed
        new PurchaseForm();
        refrech();        // TODO add your handling code here:
    }//GEN-LAST:event_addPurchaseActionPerformed
private String getCureentTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dates = new Date();

        return dateFormat.format(dates);

    }
    private void loadData() throws SQLException {
 
        // loans table
        // tabelLouee.setModel(lntbl.generateTable());
        // product table
        tabelProduit.setModel(prtbl.generateTable(limitPagination, counterPagination));
        tabelIPurchase.setModel(prchtb.generateTable(limitPagination, counterPagination));
 
    }

    public void loadSearchDataProduct(String text) {
        try {
            tabelProduit.setModel(prtbl.generateTable4Search(text));
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

    }

    public void loadSearchDataPurchase(String text) {

        // try {
        //     ProductDAO productDAO = new ProductDAO();
        //     tabelIPurchase.setModel(productDAO.buildTableModel(productDAO.getPurchaseSearch(text)));
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }
    }
    
    
    void refrech() {
        try {
            loadData();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduit;
    private javax.swing.JButton addPurchase;
    private javax.swing.JButton deleteProduit;
    private javax.swing.JButton deletePurchase;
    private javax.swing.JButton editProduit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollTabelTransaksi7;
    private javax.swing.JScrollPane jScrollTabelTransaksi9;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nextProduct;
    private javax.swing.JButton nextPurchase;
    private javax.swing.JButton prevProduct;
    private javax.swing.JButton prevPurchase;
    private javax.swing.JTextField serchProduct;
    private javax.swing.JTextField serchPurchase;
    private javax.swing.JTable tabelIPurchase;
    private javax.swing.JTable tabelProduit;
    // End of variables declaration//GEN-END:variables
}
