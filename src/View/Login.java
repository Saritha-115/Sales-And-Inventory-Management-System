/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CLogin;
import Model.MyJDBConnection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_userId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        lbl_signUp = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 210, -1, -1));

        txt_userId.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txt_userId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_userIdKeyPressed(evt);
            }
        });
        getContentPane().add(txt_userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 120, 105, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 123, -1, -1));

        txt_password.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 207, 105, -1));

        btn_login.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 318, 218, -1));

        btn_clear.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 362, 218, -1));

        lbl_signUp.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        lbl_signUp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_signUp.setText("Don't have account Click Here");
        lbl_signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_signUpMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 412, -1, -1));

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show password");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 280, 420));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/red-x-mark-transparent-background-3.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/pexels-mario-cuadros-2887582 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
         int userId= 0;
         String inputText = txt_userId.getText();
         if(!inputText.isEmpty()){
             userId = Integer.parseInt(txt_userId.getText());
         }
         String password = txt_password.getText();
        try
        {
            if(userId == 0){
            JOptionPane.showMessageDialog(null, "User Id cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(password.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String sql = "select * from tbl_users where user_id = '"+userId+"' and password = '" + password + "'";
             ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {                
                JOptionPane.showMessageDialog(null,"login successful","Login",JOptionPane.INFORMATION_MESSAGE);
                 this.setVisible(false);
                 Home frame = new Home();
                 frame.setVisible(true);  
            }
            else
            {               
                JOptionPane.showMessageDialog(null,"fail to login username and password does not match","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Editing failed","Customer",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed
    void clear(){
        txt_userId.setText("");  
        txt_password.setText("");
    }
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
          clear();      // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        txt_password.setEchoChar(jCheckBox1.isSelected() ? '\u0000' : '•');       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txt_userIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userIdKeyPressed
        char c = evt.getKeyChar();
         if(Character.isLetter(c)){
             txt_userId.setEditable(false);
             JOptionPane.showMessageDialog(null, "Please enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else{
             txt_userId.setEditable(true);
         }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userIdKeyPressed

    private void lbl_signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signUpMouseClicked
        this.setVisible(false);
        SignUp frame = new SignUp();
        frame.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_lbl_signUpMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int a =JOptionPane.showConfirmDialog(null,"Do you really want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
            if(a ==0)
            {
                System.exit(0);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
                 // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_login;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_signUp;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_userId;
    // End of variables declaration//GEN-END:variables
}
