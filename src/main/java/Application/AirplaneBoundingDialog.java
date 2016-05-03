/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Service.AirplaneService;
import Service.AirportService;
import Service.ManagementProvider;
import Service.RouteService;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

/**
 *
 * @author M
 */
public class AirplaneBoundingDialog extends javax.swing.JDialog {

    private ManagementProvider mgProvider;
    private Object detached = null;

    public AirplaneBoundingDialog(java.awt.Frame parent, boolean modal, ManagementProvider managementProvider, Object o) {
        super(parent, modal);
        detached = o;
        initDialog(managementProvider);
    }

    public AirplaneBoundingDialog(java.awt.Frame parent, boolean modal, ManagementProvider managementProvider) {
        super(parent, modal);
        initDialog(managementProvider);
    }

    private void initDialog(ManagementProvider managementProvider) {
        mgProvider = managementProvider;
        initComponents();
        setLocationRelativeTo(null);
        initLists();
    }

    private void initLists() {
        filteredAirplanesList.setSelectionMode(SINGLE_SELECTION);
        filteredAirplanesList.setListData(mgProvider.getRouteManager().findAll().toArray());
        currentAirplanesList.setSelectionMode(SINGLE_SELECTION);
        //currentRoutesList.setListData(mgProvider.getRouteManager().findAll().toArray());
        //detached
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        routeDiscardChangesButton = new javax.swing.JButton();
        routeSaveChangesButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        filteredAirplanesScrollPane = new javax.swing.JScrollPane();
        filteredAirplanesList = new javax.swing.JList();
        addBoudningToRouteButton = new javax.swing.JButton();
        applyFilterAirplaneButton = new javax.swing.JButton();
        airplaneFilterLabel = new javax.swing.JLabel();
        airplaneCodeLabel = new javax.swing.JLabel();
        airplaneCodeTextField = new javax.swing.JTextField();
        airplaneFuelGreaterLabel = new javax.swing.JLabel();
        airplaneFuelGreaterTextField = new javax.swing.JTextField();
        airplaneFuelLesserLabel = new javax.swing.JLabel();
        airplaneFuelLesserTextField = new javax.swing.JTextField();
        airplaneLoadingLesserLabel = new javax.swing.JLabel();
        airplaneLoadingLesserTextField = new javax.swing.JTextField();
        airplaneLoadingGreaterTextField = new javax.swing.JTextField();
        airplaneLoadingGreaterLabel = new javax.swing.JLabel();
        airplaneAirlineLabel = new javax.swing.JLabel();
        airplaneAirlineTextField = new javax.swing.JTextField();
        currentAirplanesScrollPane = new javax.swing.JScrollPane();
        currentAirplanesList = new javax.swing.JList();
        deleteRouteBoundingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Airplanes on selected Route");

        routeDiscardChangesButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        routeDiscardChangesButton.setForeground(new java.awt.Color(179, 107, 12));
        routeDiscardChangesButton.setText("Discard changes");
        routeDiscardChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeDiscardChangesButtonActionPerformed(evt);
            }
        });

        routeSaveChangesButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        routeSaveChangesButton.setText("Save changes");
        routeSaveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeSaveChangesButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        filteredAirplanesList.setBackground(new java.awt.Color(52, 52, 56));
        filteredAirplanesList.setForeground(new java.awt.Color(255, 255, 255));
        filteredAirplanesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        filteredAirplanesScrollPane.setViewportView(filteredAirplanesList);

        addBoudningToRouteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addBoudningToRouteButton.setText("Add selected Airplane");

        applyFilterAirplaneButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        applyFilterAirplaneButton.setForeground(new java.awt.Color(25, 62, 137));
        applyFilterAirplaneButton.setText("Apply filter");

        airplaneFilterLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        airplaneFilterLabel.setText("Filter settings for Airplane:");

        airplaneCodeLabel.setText("Code:");

        airplaneCodeTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneCodeTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneFuelGreaterLabel.setText("Fuel capacity greater than:");

        airplaneFuelGreaterTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneFuelGreaterTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneFuelLesserLabel.setText("Fuel capacity lesser than:");

        airplaneFuelLesserTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneFuelLesserTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneLoadingLesserLabel.setText("Loading capacity lesser than:");

        airplaneLoadingLesserTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneLoadingLesserTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneLoadingGreaterTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneLoadingGreaterTextField.setForeground(new java.awt.Color(255, 255, 255));

        airplaneLoadingGreaterLabel.setText("Loading capacity greater than:");

        airplaneAirlineLabel.setText("Airline:");

        airplaneAirlineTextField.setBackground(new java.awt.Color(52, 52, 56));
        airplaneAirlineTextField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airplaneFuelGreaterLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(airplaneFuelLesserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(airplaneFuelLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(airplaneFuelGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(airplaneFilterLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(airplaneCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(airplaneCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(airplaneAirlineLabel)
                                .addGap(31, 31, 31)
                                .addComponent(airplaneAirlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airplaneLoadingGreaterLabel)
                                    .addComponent(airplaneLoadingLesserLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airplaneLoadingLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airplaneLoadingGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filteredAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(applyFilterAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBoudningToRouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(airplaneFilterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneCodeLabel)
                            .addComponent(airplaneCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(airplaneFuelGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airplaneFuelGreaterLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(airplaneFuelLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airplaneFuelLesserLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneAirlineLabel)
                            .addComponent(airplaneAirlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneLoadingGreaterLabel)
                            .addComponent(airplaneLoadingGreaterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneLoadingLesserLabel)
                            .addComponent(airplaneLoadingLesserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(filteredAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyFilterAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBoudningToRouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        currentAirplanesList.setBackground(new java.awt.Color(52, 52, 56));
        currentAirplanesList.setForeground(new java.awt.Color(255, 255, 255));
        currentAirplanesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        currentAirplanesScrollPane.setViewportView(currentAirplanesList);

        deleteRouteBoundingButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteRouteBoundingButton.setForeground(new java.awt.Color(153, 0, 0));
        deleteRouteBoundingButton.setText("Delete selected Airplane");
        deleteRouteBoundingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRouteBoundingButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Current Airplanes for Route");

        warningLabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(routeDiscardChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(routeSaveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(currentAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 14, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(routeSaveChangesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(routeDiscardChangesButton)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentAirplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(warningLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routeDiscardChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeDiscardChangesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeDiscardChangesButtonActionPerformed

    private void routeSaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeSaveChangesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeSaveChangesButtonActionPerformed

    private void deleteRouteBoundingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRouteBoundingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRouteBoundingButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AirplaneBoundingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirplaneBoundingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirplaneBoundingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirplaneBoundingDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManagementProvider managementProvider = new ManagementProvider();
                managementProvider.setAirplaneManager(new AirplaneService());
                managementProvider.setAirportManager(new AirportService());
                managementProvider.setRouteManager(new RouteService());
                AirplaneBoundingDialog dialog = new AirplaneBoundingDialog(new javax.swing.JFrame(), true, managementProvider);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBoudningToRouteButton;
    private javax.swing.JLabel airplaneAirlineLabel;
    private javax.swing.JTextField airplaneAirlineTextField;
    private javax.swing.JLabel airplaneCodeLabel;
    private javax.swing.JTextField airplaneCodeTextField;
    private javax.swing.JLabel airplaneFilterLabel;
    private javax.swing.JLabel airplaneFuelGreaterLabel;
    private javax.swing.JTextField airplaneFuelGreaterTextField;
    private javax.swing.JLabel airplaneFuelLesserLabel;
    private javax.swing.JTextField airplaneFuelLesserTextField;
    private javax.swing.JLabel airplaneLoadingGreaterLabel;
    private javax.swing.JTextField airplaneLoadingGreaterTextField;
    private javax.swing.JLabel airplaneLoadingLesserLabel;
    private javax.swing.JTextField airplaneLoadingLesserTextField;
    private javax.swing.JButton applyFilterAirplaneButton;
    private javax.swing.JList currentAirplanesList;
    private javax.swing.JScrollPane currentAirplanesScrollPane;
    private javax.swing.JButton deleteRouteBoundingButton;
    private javax.swing.JList filteredAirplanesList;
    private javax.swing.JScrollPane filteredAirplanesScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton routeDiscardChangesButton;
    private javax.swing.JButton routeSaveChangesButton;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
