package greeen.views;

import javax.swing.JOptionPane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import greeen.doa.InputPurchaseProductDAO;
import greeen.doa.ProductDAO;
import greeen.models.InputPurchaseProduct;
import greeen.models.Product;
import greeen.utils.UnitConverter;

/**
 *
 * @author deidine
 */
public class PurchaseForm extends javax.swing.JDialog {

    String username = null;
    String supplier = null;
    int quantity;
    String prodCode = null;
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
String unite;
    Date tanggal = new Date();
    Date dates = new Date();

    /**
     * Creates new form PurchaseForm
     */
    String type;
    public PurchaseForm(String type) {
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
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        codeText = new javax.swing.JTextField();
        productQtnt = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        categoryText = new javax.swing.JTextField();
        quantityText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateText = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        useDateText2 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        utilusationTexta = new javax.swing.JTextArea();
        jComboBUnite = new javax.swing.JComboBox<>();
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

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel10.setText("unite");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(productQtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(codeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(productQtnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        quantityText.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        quantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setText("Quantite:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("Achat Date:");

        Locale locale = new Locale("fr", "london");
        dateText.setLocale(locale);
        dateText.setDate(dates);
        //jDateChooser1.setDate(getCureentTime());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityText))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("date_utilusation exp");

        Locale locale2 = new Locale("fr", "london");
        useDateText2.setLocale(locale2);
        useDateText2.setDate(dates);
        //jDateChooser1.setDate(getCureentTime());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("utilisation:");

        utilusationTexta.setColumns(20);
        utilusationTexta.setRows(5);
        jScrollPane3.setViewportView(utilusationTexta);

        jComboBUnite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tone", "Kg", "Litre","M"  }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(useDateText2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBUnite, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBUnite)
                    .addComponent(useDateText2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
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

        btnEntrer.setBackground(new java.awt.Color(102, 255, 102));
        btnEntrer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrer.setForeground(new java.awt.Color(255, 102, 102));
        btnEntrer.setText(">>");
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
                .addComponent(btnEntrer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEntrer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(74, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelHeader1)
                        .addComponent(labelHeader2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productQtntActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_productQtntActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_productQtntActionPerformed
 

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        InputPurchaseProduct purchaseProduct = new InputPurchaseProduct();
        ProductDAO prdDao = new ProductDAO();
        InputPurchaseProductDAO purchaseProductdoa = new InputPurchaseProductDAO();
        if (categoryText.getText().equals("") ||
                dateText.getDate().equals("")
                || quantityText.getText().equals(""))
            JOptionPane.showMessageDialog(null, "il vaut remplis toute les chapms .");
        else {
            purchaseProduct.setCategorieProduit(categoryText.getText());
            purchaseProduct.setNomProduit(nameText.getText());
            purchaseProduct.setDateExpiration(LocalDate.now().plusDays(30));
            purchaseProduct.setQuantite(Double.parseDouble(quantityText.getText()));
            purchaseProduct.setUtilisation(utilusationTexta.getText());
            purchaseProduct.setUnite(jComboBUnite.getSelectedItem().toString());
         
         
            double newQunt = 0;
            if( type.equals("achat")){
                purchaseProduct.setType("achat"); 
                newQunt = Double.parseDouble(productQtnt.getText()) + 
                UnitConverter.convert(Double.parseDouble(quantityText.getText()), purchaseProduct.getUnite(), 
               this.unite);
                
            }else{
                newQunt = Double.parseDouble(productQtnt.getText()) - UnitConverter.convert(Double.parseDouble(quantityText.getText()), purchaseProduct.getUnite(), this.unite);
                
                //    newQunt= Double.parseDouble(productQtnt.getText())- Double.parseDouble(quantityText.getText());
               purchaseProduct.setType("output"); 
            }
            purchaseProduct.setDateAchat(LocalDate.now());
// ,jComboBUnite.getSelectedItem().toString()
            purchaseProductdoa.save(purchaseProduct);
            prdDao.updatePurchaseQuantite(newQunt,  codeText.getText()) ;
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

 
    private void searchProductKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_searchProductKeyReleased
        String txt = searchProduct.getText();

        sarchProductTable(txt); // TODO add your handling code here:
    }// GEN-LAST:event_searchProductKeyReleased
 
    public void inisialiser() {
        categoryText.setText("");
        nameText.setText("");
        // useDateText.setText("");
        codeText.setText("");
        utilusationTexta.setText("");
    
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

            laporan.getDataVector().removeAllElements();
            laporan.fireTableDataChanged();
            laporan.setRowCount(0);
            for (Product product : allProd) {
                laporan.addRow(
                        new Object[] { product.getProductcode(), product.getProductname(), product.getQuantityPurchase() , product.getCategorie(),product.getMainUnit() });
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

            // Add filtered products to the model
            for (Product product : filteredProducts) {
                laporan.addRow(
                        new Object[] { product.getProductcode(), product.getProductname(), product.getQuantityPurchase()  , product.getCategorie(),product.getMainUnit() });
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
    private com.toedter.calendar.JDateChooser dateText;
    private javax.swing.JComboBox<String> jComboBUnite;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JLabel labelHeader1;
    private javax.swing.JLabel labelHeader2;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField productQtnt;
    private javax.swing.JTextField quantityText;
    private javax.swing.JTextField searchProduct;
    private com.toedter.calendar.JDateChooser useDateText2;
    private javax.swing.JTextArea utilusationTexta;
    // End of variables declaration//GEN-END:variables
}
