/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import logins.login;
import nurses.nurse;
import doctors.Doctor;
import Pharmacys.pharmacy;
import admin.Admins;
import homepage.Homepage;


public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jAdmin = new javax.swing.JButton();
        jNurse = new javax.swing.JButton();
        jDoctor = new javax.swing.JButton();
        jPharmacy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("OPERATE AS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 160, 320, 40);

        jAdmin.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jAdmin.setText("ADMIN");
        jAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdminActionPerformed(evt);
            }
        });
        jPanel1.add(jAdmin);
        jAdmin.setBounds(170, 260, 160, 70);

        jNurse.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jNurse.setText("NURSE");
        jNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNurseActionPerformed(evt);
            }
        });
        jPanel1.add(jNurse);
        jNurse.setBounds(670, 260, 150, 70);

        jDoctor.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jDoctor.setText("DOCTOR");
        jDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(jDoctor);
        jDoctor.setBounds(680, 390, 150, 80);

        jPharmacy.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jPharmacy.setText("PHARMACY");
        jPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPharmacyActionPerformed(evt);
            }
        });
        jPanel1.add(jPharmacy);
        jPharmacy.setBounds(170, 390, 170, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homepage/healthPic (2).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -40, 1000, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdminActionPerformed
       Admins Info = new Admins();
       Info.setVisible(true);
       
     
    }//GEN-LAST:event_jAdminActionPerformed

    private void jPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPharmacyActionPerformed
        pharmacy Info = new pharmacy();
        Info.setVisible(true);
        
    }//GEN-LAST:event_jPharmacyActionPerformed

    private void jNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNurseActionPerformed
     nurse Info = new nurse();
     Info.setVisible(true);
        
    }//GEN-LAST:event_jNurseActionPerformed

    private void jDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoctorActionPerformed
     Doctor Info = new Doctor();
     Info.setVisible(true);
        
    }//GEN-LAST:event_jDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               login Info = new login();
               Info.setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdmin;
    private javax.swing.JButton jDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jNurse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPharmacy;
    // End of variables declaration//GEN-END:variables
}
