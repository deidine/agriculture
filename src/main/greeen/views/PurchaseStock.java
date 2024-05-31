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
import greeen.utils.SalleTable;

/**
 *
 * @author deidine
 */
public class PurchaseStock extends javax.swing.JFrame {

    private static int counterPagination = 0;
    int limitPagination = 20;
    
    PurcahseTable prchtb; 

    ProductTable prtbl = new ProductTable();
    
    
    /**
     * Creates new form Dashboard2
     */
    static String username="deodone";

    public PurchaseStock(String username) {
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
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        serchOutput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nextPurchase2 = new javax.swing.JButton();
        prevPurchase1 = new javax.swing.JButton();
        deletePurchase1 = new javax.swing.JButton();
        addOutput = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jScrollTabelTransaksi10 = new javax.swing.JScrollPane();
        tabelIOutput = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

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
                .addGap(30, 30, 30)
                .addComponent(prevPurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(addPurchase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deletePurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prevPurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(nextPurchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(serchPurchase)
                .addGap(4, 4, 4))
        );

        tabelIPurchase.setOpaque(true);
        tabelIPurchase.setRowHeight(30);
        tabelIPurchase.getTableHeader().setReorderingAllowed(false);
        jScrollTabelTransaksi7.setViewportView(tabelIPurchase);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi7, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi7, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
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
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stock d'achts", jPanel2);

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));

        serchOutput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchOutputKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("Chercher");

        nextPurchase2.setBackground(new java.awt.Color(255, 255, 204));
        nextPurchase2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        nextPurchase2.setForeground(new java.awt.Color(51, 51, 0));
        nextPurchase2.setText("Next");
        nextPurchase2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        nextPurchase2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPurchase2ActionPerformed(evt);
            }
        });

        prevPurchase1.setBackground(new java.awt.Color(255, 255, 204));
        prevPurchase1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        prevPurchase1.setForeground(new java.awt.Color(51, 51, 0));
        prevPurchase1.setText("Prev");
        prevPurchase1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        prevPurchase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPurchase1ActionPerformed(evt);
            }
        });

        deletePurchase1.setBackground(new java.awt.Color(255, 51, 51));
        deletePurchase1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        deletePurchase1.setForeground(new java.awt.Color(51, 51, 0));
        deletePurchase1.setText("suprimer");
        deletePurchase1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 0), new java.awt.Color(102, 102, 0), new java.awt.Color(153, 153, 0)));
        deletePurchase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePurchase1ActionPerformed(evt);
            }
        });

        addOutput.setBackground(new java.awt.Color(51, 255, 51));
        addOutput.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addOutput.setForeground(new java.awt.Color(51, 0, 51));
        addOutput.setText("Ajouter");
        addOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOutputActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator9.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator14.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(addOutput)
                .addGap(32, 32, 32)
                .addComponent(deletePurchase1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(prevPurchase1)
                .addGap(31, 31, 31)
                .addComponent(nextPurchase2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(serchOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deletePurchase1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serchOutput)
                    .addComponent(addOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(prevPurchase1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextPurchase2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabelIOutput.setOpaque(true);
        tabelIOutput.setRowHeight(30);
        tabelIOutput.getTableHeader().setReorderingAllowed(false);
        jScrollTabelTransaksi10.setViewportView(tabelIOutput);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi10)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollTabelTransaksi10, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Stock de Sortie", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(17, 17, 17))
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
        new PurchaseForm("achat");
        refrech();        // TODO add your handling code here:
    }//GEN-LAST:event_addPurchaseActionPerformed

    private void serchOutputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchOutputKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_serchOutputKeyReleased

    private void nextPurchase2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPurchase2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextPurchase2ActionPerformed

    private void prevPurchase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPurchase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prevPurchase1ActionPerformed

    private void deletePurchase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePurchase1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletePurchase1ActionPerformed

    private void addOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOutputActionPerformed

        new PurchaseForm("output");  
          refrech();   // TODO add your handling code here:
    }//GEN-LAST:event_addOutputActionPerformed
private String getCureentTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dates = new Date();

        return dateFormat.format(dates);

    }
    private void loadData() throws SQLException {
 
        // loans table
        // tabelLouee.setModel(lntbl.generateTable());
        // product table
         tabelIPurchase.setModel(new PurcahseTable("achat").generateTable(limitPagination, counterPagination));
        tabelIOutput.setModel(new PurcahseTable("output").generateTable(limitPagination, counterPagination));
      }

    // public void loadSearchDataProduct(String text) {
    //     try {
    //         tabelProduit.setModel(prtbl.generateTable4Search(text));
    //     } catch (Exception throwables) {
    //         throwables.printStackTrace();
    //     }

    // }

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
    private javax.swing.JButton addOutput;
    private javax.swing.JButton addPurchase;
    private javax.swing.JButton deletePurchase;
    private javax.swing.JButton deletePurchase1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollTabelTransaksi10;
    private javax.swing.JScrollPane jScrollTabelTransaksi7;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton nextPurchase;
    private javax.swing.JButton nextPurchase2;
    private javax.swing.JButton prevPurchase;
    private javax.swing.JButton prevPurchase1;
    private javax.swing.JTextField serchOutput;
    private javax.swing.JTextField serchPurchase;
    private javax.swing.JTable tabelIOutput;
    private javax.swing.JTable tabelIPurchase;
    // End of variables declaration//GEN-END:variables
}