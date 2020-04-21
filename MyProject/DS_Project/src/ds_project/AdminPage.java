/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_project;

/**
 *
 * @author Aili
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
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

        adminPanel = new javax.swing.JPanel();
        navigationBarPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addDropDown = new javax.swing.JComboBox<>();
        selectedSensorText = new javax.swing.JTextField();
        selectedSensorLabel = new javax.swing.JLabel();
        floorSelectDropDown = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();
        statusText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        floorNoText = new javax.swing.JTextField();
        roomNoText = new javax.swing.JTextField();
        smokeLevelLabel = new javax.swing.JLabel();
        smokeLevelText = new javax.swing.JTextField();
        floorNoLabel = new javax.swing.JLabel();
        roomNoLabel = new javax.swing.JLabel();
        co2LevelLabel = new javax.swing.JLabel();
        smokeLevelText1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminPanel.setBackground(new java.awt.Color(255, 255, 255));

        logoutButton.setBackground(new java.awt.Color(0, 51, 204));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");

        searchText.setText("Search");

        searchButton.setText("Search");

        addDropDown.setBackground(new java.awt.Color(0, 153, 153));
        addDropDown.setForeground(new java.awt.Color(255, 255, 255));
        addDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add", "Add User", "Add Sensor" }));
        addDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationBarPanelLayout = new javax.swing.GroupLayout(navigationBarPanel);
        navigationBarPanel.setLayout(navigationBarPanelLayout);
        navigationBarPanelLayout.setHorizontalGroup(
            navigationBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navigationBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        navigationBarPanelLayout.setVerticalGroup(
            navigationBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationBarPanelLayout.createSequentialGroup()
                .addGroup(navigationBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(addDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        selectedSensorLabel.setText("Selected Sensor");

        floorSelectDropDown.setBackground(new java.awt.Color(204, 0, 51));
        floorSelectDropDown.setForeground(new java.awt.Color(255, 255, 255));
        floorSelectDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sensor 1", "Sensor 2", "Sensor 3", "Sensor 4", "Sensor 5", " ", " " }));

        statusLabel.setText("Status          : ");

        jLabel1.setText("Location       : ");

        roomNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNoTextActionPerformed(evt);
            }
        });

        smokeLevelLabel.setText("Smoke Level : ");

        floorNoLabel.setText(" Floor No ");

        roomNoLabel.setText(" Room No");

        co2LevelLabel.setText("CO2 Level    :");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(selectedSensorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedSensorText, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(floorSelectDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(statusLabel)
                    .addComponent(smokeLevelLabel)
                    .addComponent(co2LevelLabel))
                .addGap(23, 23, 23)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(floorNoLabel)
                    .addComponent(roomNoLabel)
                    .addComponent(statusText, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(floorNoText)
                    .addComponent(roomNoText)
                    .addComponent(smokeLevelText)
                    .addComponent(smokeLevelText1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(navigationBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(selectedSensorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedSensorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusLabel)
                    .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floorSelectDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(floorNoLabel)))
                .addGap(3, 3, 3)
                .addComponent(floorNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomNoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smokeLevelLabel)
                    .addComponent(smokeLevelText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(co2LevelLabel)
                    .addComponent(smokeLevelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDropDownActionPerformed

    private void roomNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomNoTextActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addDropDown;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel co2LevelLabel;
    private javax.swing.JLabel floorNoLabel;
    private javax.swing.JTextField floorNoText;
    private javax.swing.JComboBox<String> floorSelectDropDown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel navigationBarPanel;
    private javax.swing.JLabel roomNoLabel;
    private javax.swing.JTextField roomNoText;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel selectedSensorLabel;
    private javax.swing.JTextField selectedSensorText;
    private javax.swing.JLabel smokeLevelLabel;
    private javax.swing.JTextField smokeLevelText;
    private javax.swing.JTextField smokeLevelText1;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusText;
    // End of variables declaration//GEN-END:variables
}
