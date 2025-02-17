/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

import Model.MyJDBConnection;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import Controller.COrders;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author USER
 */
public class Orders extends javax.swing.JFrame {
COrders orders = new COrders();
DefaultTableModel orderModel;
    /**
     * Creates new form Orders
     */
    public Orders() {
        initComponents();
        lbl_qEmpty.setVisible(false);
        txt_cName.setEditable(false);
        lbl_inventId.setVisible(false);
        lbl_pId.setVisible(false);
        txt_cId.setVisible(false);
        txt_price.setEditable(false);
        txt_oId.setEditable(false);
        txt_oId.setText(Integer.toString (orders.getId()));   
        tbl_product.setModel(DbUtils.resultSetToTableModel(orders.populateProduct()));
        tbl_customer.setModel(DbUtils.resultSetToTableModel(orders.populateCustomer()));
        lbl_date.setText(orders.getDate());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_product = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_orders = new javax.swing.JTable();
        btn_addOrder = new javax.swing.JButton();
        btn_Home = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_oId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        btn_addCart = new javax.swing.JButton();
        lbl_date = new javax.swing.JLabel();
        lbl_totPrice = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        lbl_totPrice1 = new javax.swing.JLabel();
        lbl_inventId = new javax.swing.JLabel();
        lbl_pId = new javax.swing.JLabel();
        txt_cId = new javax.swing.JTextField();
        lbl_name1 = new javax.swing.JLabel();
        lbl_name2 = new javax.swing.JLabel();
        lbl_name3 = new javax.swing.JLabel();
        lbl_name4 = new javax.swing.JLabel();
        txt_cName = new javax.swing.JTextField();
        lbl_qEmpty = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 217));

        tbl_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "p_id", "p_name", "discription", "price", "quntity", "inventory_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_product);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, 217));

        tbl_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Product Name", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ordersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_orders);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, 229));

        btn_addOrder.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_addOrder.setText("Add Order");
        btn_addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        btn_Home.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Order ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txt_oId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_oId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_oIdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_oId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 180, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 28));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        txt_price.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 160, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantiy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        txt_qty.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });
        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtyKeyPressed(evt);
            }
        });
        getContentPane().add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 160, -1));

        btn_addCart.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_addCart.setText("Add To Cart");
        btn_addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCartActionPerformed(evt);
            }
        });
        getContentPane().add(btn_addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        lbl_date.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 180, 28));

        lbl_totPrice.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_totPrice.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_totPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, 104, 33));

        btn_report.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_report.setText("Get Report");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        getContentPane().add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        lbl_totPrice1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_totPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_totPrice1.setText("Total Price");
        getContentPane().add(lbl_totPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, 32));
        getContentPane().add(lbl_inventId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 104, 22));
        getContentPane().add(lbl_pId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 104, 22));

        txt_cId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cIdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 166, -1));

        lbl_name1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name1.setText("Customer");
        getContentPane().add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 80, 28));

        lbl_name2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_name2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name2.setText("Product");
        getContentPane().add(lbl_name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 70, 28));

        lbl_name3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_name3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name3.setText("Orders");
        getContentPane().add(lbl_name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 60, 28));

        lbl_name4.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lbl_name4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name4.setText("Orders Page");
        getContentPane().add(lbl_name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 140, 40));

        txt_cName.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_cName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cNameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 180, -1));

        lbl_qEmpty.setText("jLabel3");
        getContentPane().add(lbl_qEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/red-x-mark-transparent-background-3.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1050, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1070, 580));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/pexels-tiger-lily-4483610.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int flag = 0;
    private void tbl_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbl_product.getModel();
        int myIndex = tbl_product.getSelectedRow();
       lbl_pId.setText(model.getValueAt(myIndex,0).toString());
        productName= model.getValueAt(myIndex,1).toString();
//        txt_discription.setText(model.getValueAt(myIndex,2).toString());
        txt_price.setText(model.getValueAt(myIndex,3).toString());
        lbl_qEmpty.setText(model.getValueAt(myIndex,4).toString()); 
    lbl_inventId.setText(model.getValueAt(myIndex,5).toString());
        flag = 1;// TODO add your handling code here:
    }//GEN-LAST:event_tbl_productMouseClicked

    void clear(){
        lbl_pId.setText("");
        txt_price.setText("");
        txt_qty.setText("");
        lbl_inventId.setText("");
        productName = "";
        txt_cId.setText("");
        txt_cName.setText("");
    }
    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
             DefaultTableModel model = (DefaultTableModel)tbl_customer.getModel();
             int myIndex = tbl_customer.getSelectedRow();
        txt_cId.setText(model.getValueAt(myIndex,0).toString());
             txt_cName.setText(model.getValueAt(myIndex,1).toString() +" "+ model.getValueAt(myIndex,2).toString());
//             lbl_name.setText(model.getValueAt(myIndex,2).toString());
//        txt_contact.setText(model.getValueAt(myIndex,3).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_customerMouseClicked

    int i = 1,tot=0,qty,totalP;
    String productName;
    Vector v;
    private void btn_addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCartActionPerformed
        
         int qty1 = 0;
          String id1 = txt_qty.getText(); // Get the text from your input field
        if (!id1.isEmpty()) {
            qty1 = Integer.parseInt(lbl_qEmpty.getText());
        }
        String id = txt_qty.getText(); // Get the text from your input field
        if (!id.isEmpty()) {
             qty = Integer.parseInt(txt_qty.getText());
        }
        
        if(flag == 0 || txt_qty.getText().isEmpty()||txt_price.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select the product and enter the quantity", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else if(qty1 <= 0||qty1<qty ){
            JOptionPane.showMessageDialog(null, "Quantity insufficient", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else{
               tot =Integer.parseInt(txt_qty.getText())*Integer.parseInt(txt_price.getText());
               v = new Vector();
        v.add(i);
        v.add(productName);
        v.add(qty);
        v.add(txt_price.getText());
        v.add(tot);
        orderModel = (DefaultTableModel)tbl_orders.getModel();
        orderModel.addRow(v);
        totalP = totalP + tot;
        lbl_totPrice.setText("Rs"+totalP);
        orders.add(Integer.parseInt(lbl_pId.getText()), qty, Integer.parseInt(lbl_inventId.getText()));
        tbl_product.setModel(DbUtils.resultSetToTableModel(orders.populateProduct()));
        clear();
        i++; 
        
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_addCartActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        try
           {
               JasperDesign js = JRXmlLoader.load("C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\SalesandInventoryManagementSystem\\src\\report1.jrxml");
               JRDesignQuery dq = new JRDesignQuery();
               dq.setText("Select * from tbl_sales_order");
               js.setQuery(dq);
               JasperReport report = JasperCompileManager.compileReport(js);
               JasperPrint print = JasperFillManager.fillReport(report, null, MyJDBConnection.createDBConnection());
               JasperViewer.viewReport(print);
               
           }
           catch(Exception e)
           {
               System.err.println(e.getMessage());
               
           }
    }//GEN-LAST:event_btn_reportActionPerformed

    private void tbl_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ordersMouseClicked
                      // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ordersMouseClicked

    private void btn_addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addOrderActionPerformed
         int custId = 0;
        
        String id = txt_cId.getText(); // Get the text from your input field
        if (!id.isEmpty()) {
            custId = Integer.parseInt(txt_cId.getText());
        }
//        int qty = Integer.parseInt(txt_qty.getText());
//        int prc = Integer.parseInt(txt_price.getText());
       
         if(flag == 0 && txt_cId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No orders to add the sales order", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else if(txt_cId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select customer", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else if(lbl_totPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No orders to add the sales order", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
         orders.addSalesOrder(orders.getDate(), totalP, custId);
         orders.autoIncrement();
         txt_oId.setText(Integer.toString (orders.getId()));   
         clear();
         lbl_totPrice.setText("");
         orderModel.setRowCount(0);
        }
//        orders.addSalesOrder(orders.getDate(), totalP, custId);
//         orders.autoIncrement();
//         txt_oId.setText(Integer.toString (orders.getId()));   
//        clear();
    }//GEN-LAST:event_btn_addOrderActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        Home frame = new Home();
        frame.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed

    private void txt_cNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cNameActionPerformed

    private void txt_oIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_oIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_oIdActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_cIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cIdActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
            if(a ==0)
            {
                System.exit(0);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txt_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyPressed
          char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txt_qty.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            txt_qty.setEditable(true);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_addCart;
    private javax.swing.JButton btn_addOrder;
    private javax.swing.JButton btn_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_inventId;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name2;
    private javax.swing.JLabel lbl_name3;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JLabel lbl_pId;
    private javax.swing.JLabel lbl_qEmpty;
    private javax.swing.JLabel lbl_totPrice;
    private javax.swing.JLabel lbl_totPrice1;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTable tbl_orders;
    private javax.swing.JTable tbl_product;
    private javax.swing.JTextField txt_cId;
    private javax.swing.JTextField txt_cName;
    private javax.swing.JTextField txt_oId;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
