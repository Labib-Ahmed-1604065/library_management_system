/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.pkgfor.java.lab;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author L
 */
public class addLibrarian extends javax.swing.JFrame {

    static Connection con = null;
    PreparedStatement statement = null;
    ResultSet rs = null;
    public String name, mobile, password;

    /**
     * Creates new form addLibrarian
     */

    public void addData(String name, String mobile, String pass) {

        try {
            PreparedStatement statement = (PreparedStatement) con.prepareStatement("INSERT INTO `librarianinfo`(`Name`, `Mobile`, `Password`) VALUES (?,?,?)");

            statement.setString(1, name);
            statement.setString(2, mobile);
            statement.setString(3, pass);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Librarian Added!!!");
            Lnamef.setText(null);
            Lmobilef.setText(null);
            Lpassf.setText(null);
            clpassf.setText(null);
            System.out.println("Librarian Added");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public addLibrarian() {
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
            //JOptionPane.showMessageDialog(null, "Connected");
            //return con;
        } catch (SQLException ex) {
            Logger.getLogger(addLibrarian.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Not Connected");
            //return con;
        }
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
        confirm = new javax.swing.JButton();
        cpass = new javax.swing.JLabel();
        clpassf = new javax.swing.JPasswordField();
        LnameL = new javax.swing.JLabel();
        Lnamef = new javax.swing.JTextField();
        Lpass = new javax.swing.JLabel();
        Lpassf = new javax.swing.JPasswordField();
        LmobileL = new javax.swing.JLabel();
        Lmobilef = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Librarian");

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cpass.setText("Confirm Password:");

        clpassf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clpassfActionPerformed(evt);
            }
        });

        LnameL.setText("Name:");

        Lnamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnamefActionPerformed(evt);
            }
        });

        Lpass.setText("Password:");

        Lpassf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LpassfActionPerformed(evt);
            }
        });

        LmobileL.setText("Mobile No:");

        Lmobilef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LmobilefActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LmobileL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LnameL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lnamef, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Lmobilef, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Lpassf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clpassf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(confirm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LnameL)
                    .addComponent(Lnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lmobilef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LmobileL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lpassf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clpassf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm)
                    .addComponent(back))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clpassfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clpassfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clpassfActionPerformed

    private void LnamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnamefActionPerformed

    private void LpassfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LpassfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LpassfActionPerformed

    private void LmobilefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LmobilefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LmobilefActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        //id=LIDf.getText();
        name = Lnamef.getText();
        mobile = Lmobilef.getText();
        password = new String(Lpassf.getPassword());
        String cf = new String(clpassf.getPassword());

        if ("".equals(name) || "".equals(mobile) || "".equals(password) || "".equals(cf)) {
            JOptionPane.showMessageDialog(null, "Please input all fields correctly");
        } else {
            if (password.equals(cf)) {
                addData(name, mobile, password);
            } else {
                JOptionPane.showMessageDialog(null, "Please input passwords correctly");
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addLibrarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LmobileL;
    private javax.swing.JTextField Lmobilef;
    private javax.swing.JLabel LnameL;
    private javax.swing.JTextField Lnamef;
    private javax.swing.JLabel Lpass;
    private javax.swing.JPasswordField Lpassf;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField clpassf;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel cpass;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}