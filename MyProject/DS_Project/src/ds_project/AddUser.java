/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_project;

/**
 *
 * @author Sewwandi
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add_floorNoText = new javax.swing.JTextField();
        add_floorNoText1 = new javax.swing.JTextField();
        add_floorNoText2 = new javax.swing.JTextField();
        add_floorNoText3 = new javax.swing.JTextField();
        add_addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ADD USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 46));

        jLabel3.setText("User Id:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel5.setText("User First Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setText("User Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel2.setText("User Email:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        add_floorNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_floorNoTextActionPerformed(evt);
            }
        });
        jPanel1.add(add_floorNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 270, -1));

        add_floorNoText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_floorNoText1ActionPerformed(evt);
            }
        });
        jPanel1.add(add_floorNoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 270, -1));

        add_floorNoText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_floorNoText2ActionPerformed(evt);
            }
        });
        jPanel1.add(add_floorNoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 270, -1));

        add_floorNoText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_floorNoText3ActionPerformed(evt);
            }
        });
        jPanel1.add(add_floorNoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 270, -1));

        add_addButton.setBackground(new java.awt.Color(255, 0, 51));
        add_addButton.setForeground(new java.awt.Color(255, 255, 255));
        add_addButton.setText(" Add");
        jPanel1.add(add_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_floorNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_floorNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_floorNoTextActionPerformed

    private void add_floorNoText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_floorNoText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_floorNoText1ActionPerformed

    private void add_floorNoText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_floorNoText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_floorNoText2ActionPerformed

    private void add_floorNoText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_floorNoText3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_floorNoText3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_addButton;
    private javax.swing.JTextField add_floorNoText;
    private javax.swing.JTextField add_floorNoText1;
    private javax.swing.JTextField add_floorNoText2;
    private javax.swing.JTextField add_floorNoText3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
