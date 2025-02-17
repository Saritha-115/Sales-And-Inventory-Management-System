/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CCustomer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER
 */
public class Customer extends javax.swing.JFrame {
CCustomer customer = new CCustomer();
    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        txt_custId.setEditable(false);
        txt_custId.setText(Integer.toString (customer.getId()));
        tbl_customer.setModel(DbUtils.resultSetToTableModel(customer.populate()));
    }
  private boolean isContactNumberValid(String contactNumber) {
    // Remove any formatting characters (e.g., spaces, dashes)
    contactNumber = contactNumber.replaceAll("[\\s-]+", "");

    // Check if the contact number contains only numeric digits
    if (!contactNumber.matches("\\d+")) {
        return false;
    }

    // Check the length of the contact number (adjust min and max lengths as needed)
    int minLength = 10;  // Minimum length requirement
    int maxLength = 10; // Maximum length requirement
    int length = contactNumber.length();

    if (length < minLength || length > maxLength) {
        return false;
    }
    if (!contactNumber.startsWith("07")) {
        return false;
    }

    // Additional custom rules can be added here

    // If all validation checks pass, the contact number is considered valid
    return true;
}
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_custId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_fName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_lName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_dlt = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_contact = new javax.swing.JLabel();
        txt_home = new javax.swing.JButton();
        lbl_name1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_name4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/red-x-mark-transparent-background-3.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 580));
        setMinimumSize(new java.awt.Dimension(1080, 580));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1080, 580));
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
        ));
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_customer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Id ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        txt_custId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_custId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_custIdKeyPressed(evt);
            }
        });
        getContentPane().add(txt_custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        txt_fName.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_fName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fNameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 140, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txt_lName.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_lName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lNameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        txt_contact.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_contactKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contactKeyReleased(evt);
            }
        });
        getContentPane().add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 140, -1));

        btn_add.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, 80, 30));

        btn_edit.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 312, 80, 30));

        btn_dlt.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_dlt.setText("Delete");
        btn_dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dltActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 308, -1, -1));

        btn_clear.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 80, 30));

        lbl_contact.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(lbl_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 290, 21));

        txt_home.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_home.setText("Home");
        txt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, -1, 30));

        lbl_name1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name1.setText("Customer");
        getContentPane().add(lbl_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 80, 28));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        lbl_name4.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        lbl_name4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name4.setText("Customer Page");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/red-x-mark-transparent-background-3.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(lbl_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1020, 540));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/pexels-photomix-company-518244.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         String contactNumber = txt_contact.getText().trim();
         int contact = 0;
    // Perform the contact number validation
    if(!contactNumber.isEmpty())
    {
         boolean isValid = isContactNumberValid(contactNumber);

    // Update a label or display a message based on the validation result
    // Update a label or display a message based on the validation result
        if (isValid) {
            String num = txt_contact.getText(); // Get the text from your input field
        if (!num.isEmpty()) {
            contact = Integer.parseInt(txt_contact.getText());
        }
    } else {
        lbl_contact.setText("Invalid contact number(Ex-07****).");
        lbl_contact.setForeground(Color.RED);
        }
    }
    else {
        lbl_contact.setText("");
    } 
        
        String fName = txt_fName.getText();
        String lName = txt_lName.getText();
        
        
        
         
        
        customer.add(fName,lName,contact);
        customer.autoIncrement();
        txt_custId.setText(Integer.toString (customer.getId()));
        tbl_customer.setModel(DbUtils.resultSetToTableModel(customer.populate()));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbl_customer.getModel();
        int myIndex = tbl_customer.getSelectedRow();
        txt_custId.setText(model.getValueAt(myIndex,0).toString());
        txt_fName.setText(model.getValueAt(myIndex,1).toString());
        txt_lName.setText(model.getValueAt(myIndex,2).toString());
        txt_contact.setText(model.getValueAt(myIndex,3).toString());
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void txt_custIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_custIdKeyPressed
                // TODO add your handling code here:
    }//GEN-LAST:event_txt_custIdKeyPressed

    private void txt_contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txt_contact.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            txt_contact.setEditable(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactKeyPressed

    private void txt_fNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fNameKeyPressed
         char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            txt_fName.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter characters only", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            txt_fName.setEditable(true);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txt_fNameKeyPressed

    private void txt_lNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lNameKeyPressed
         char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            txt_lName.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter characters only", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            txt_lName.setEditable(true);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_txt_lNameKeyPressed
    void clear(){
        txt_fName.setText(""); 
        txt_lName.setText(""); 
        txt_contact.setText("");
    }
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();  // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int userId = 0;
        String id = txt_custId.getText(); // Get the text from your input field
        if (!id.isEmpty()) {
            userId = Integer.parseInt(txt_custId.getText());
        }
        String fName = txt_fName.getText();
        String lName = txt_lName.getText();
        
        int contact = 0;
        
        String num = txt_contact.getText(); // Get the text from your input field
        if (!num.isEmpty()) {
            contact = Integer.parseInt(txt_contact.getText());
        }  
        
        customer.edit(userId,fName,lName,contact);
        customer.autoIncrement();
        txt_custId.setText(Integer.toString (customer.getId()));
        tbl_customer.setModel(DbUtils.resultSetToTableModel(customer.populate()));    
        clear();// TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dltActionPerformed
           int userId = 0;
        String id = txt_custId.getText(); // Get the text from your input field
        if (!id.isEmpty()) {
            userId = Integer.parseInt(txt_custId.getText());
        }
        customer.delete(userId);
        customer.autoIncrement();
        txt_custId.setText(Integer.toString (customer.getId()));
        tbl_customer.setModel(DbUtils.resultSetToTableModel(customer.populate()));  
        clear();// TODO add your handling code here:
    }//GEN-LAST:event_btn_dltActionPerformed

    private void txt_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactKeyReleased
           String contactNumber = txt_contact.getText().trim();

    // Perform the contact number validation
    if(!contactNumber.isEmpty())
    {
         boolean isValid = isContactNumberValid(contactNumber);

    // Update a label or display a message based on the validation result
    // Update a label or display a message based on the validation result
        if (isValid) {
            lbl_contact.setText("Valid contact number.");
            lbl_contact.setForeground(Color.GREEN);

            // Clear the label text after a certain delay (e.g., 2 seconds)
            Timer timer = new Timer(2000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbl_contact.setText("");
                }
            });
            timer.setRepeats(false); // Set it to only run once
            timer.start();
    } else {
        lbl_contact.setText("Invalid contact number(Ex-07****).");
        lbl_contact.setForeground(Color.RED);
        }
    }
    else {
        lbl_contact.setText("");
    }
    }//GEN-LAST:event_txt_contactKeyReleased

    private void txt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_homeActionPerformed
        Home frame = new Home();
        frame.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_txt_homeActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
            if(a ==0)
            {
                System.exit(0);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_dlt;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_contact;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_name4;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_custId;
    private javax.swing.JTextField txt_fName;
    private javax.swing.JButton txt_home;
    private javax.swing.JTextField txt_lName;
    // End of variables declaration//GEN-END:variables
}
