package Application;

import Application.GUIDesigners.BoundingUpdater;
import Application.GUIDesigners.Utils;
import Model.Airplane;
import Model.Route;
import Service.ManagementProvider;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

/**
 *
 * @author M
 */
public class AirplaneBoundingDialog extends javax.swing.JDialog {

    private ManagementProvider mgProvider;
    private Object detached = null;
    private BoundingUpdater boundingUpdater;

    private String name1 = null;
    private String name2 = null;
    private String city1 = null;
    private String city2 = null;
    private String country1 = null;
    private String country2 = null;
    private String iata1 = null;
    private String iata2 = null;
    private String icao1 = null;
    private String icao2 = null;

    public AirplaneBoundingDialog(java.awt.Frame parent, boolean modal,
            ManagementProvider managementProvider, Object o, BoundingUpdater boundingUpdater) {
        super(parent, modal);
        this.boundingUpdater = boundingUpdater;
        detached = o;
        initDialog(managementProvider);
    }

    private void initDialog(ManagementProvider managementProvider) {
        mgProvider = managementProvider;
        initComponents();
        setLocationRelativeTo(null);
        initLists();
    }

    private void initLists() {
        filteredRoutesList.setSelectionMode(SINGLE_SELECTION);
        currentRoutesList.setSelectionMode(SINGLE_SELECTION);
        updateLists();
    }

    private void updateLists() {
        //needed to edit
        filteredRoutesList.setListData(mgProvider.getRouteManager().findSpecified(
                city1, city2, name1, name2, icao1, icao2, iata1, iata2, country1, country2).toArray());
        currentRoutesList.setListData(((Airplane) detached).getRoutes().toArray());
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
        routeFilterLabel = new javax.swing.JLabel();
        originFilterLabel = new javax.swing.JLabel();
        routeNameLabel1 = new javax.swing.JLabel();
        routeCityLabel1 = new javax.swing.JLabel();
        routeCountryLabel1 = new javax.swing.JLabel();
        destinationFilterLabel = new javax.swing.JLabel();
        routeNameLabel2 = new javax.swing.JLabel();
        routeCityLabel2 = new javax.swing.JLabel();
        routeCountryLabel2 = new javax.swing.JLabel();
        routeCountryTextField2 = new javax.swing.JTextField();
        routeCityTextField2 = new javax.swing.JTextField();
        routeNameTextField2 = new javax.swing.JTextField();
        routeCountryTextField1 = new javax.swing.JTextField();
        routeCityTextField1 = new javax.swing.JTextField();
        routeNameTextField1 = new javax.swing.JTextField();
        routeIcaoTextField1 = new javax.swing.JTextField();
        routeIcaoLabel1 = new javax.swing.JLabel();
        routeIataLabel1 = new javax.swing.JLabel();
        routeIataTextField1 = new javax.swing.JTextField();
        routeIcaoLabel2 = new javax.swing.JLabel();
        routeIcaoTextField2 = new javax.swing.JTextField();
        routeIataLabel2 = new javax.swing.JLabel();
        routeIataTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        filteredRoutesList = new javax.swing.JList();
        addBoudningToAirplaneButton = new javax.swing.JButton();
        applyFilterAirplaneButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentRoutesList = new javax.swing.JList();
        deleteRouteBoundingButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Routes of selected Airplane");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        routeFilterLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        routeFilterLabel.setText("Filter settings for Route:");

        originFilterLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        originFilterLabel.setText("Origin airport:");

        routeNameLabel1.setText("Name:");

        routeCityLabel1.setText("City:");

        routeCountryLabel1.setText("Country:");

        destinationFilterLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        destinationFilterLabel.setText("Destination airport:");

        routeNameLabel2.setText("Name:");

        routeCityLabel2.setText("City:");

        routeCountryLabel2.setText("Country:");

        routeCountryTextField2.setEditable(false);
        routeCountryTextField2.setBackground(new java.awt.Color(52, 52, 56));
        routeCountryTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeCountryTextField2ActionPerformed(evt);
            }
        });

        routeCityTextField2.setBackground(new java.awt.Color(52, 52, 56));
        routeCityTextField2.setForeground(new java.awt.Color(255, 255, 255));

        routeNameTextField2.setBackground(new java.awt.Color(52, 52, 56));
        routeNameTextField2.setForeground(new java.awt.Color(255, 255, 255));

        routeCountryTextField1.setEditable(false);
        routeCountryTextField1.setBackground(new java.awt.Color(52, 52, 56));
        routeCountryTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeCountryTextField1ActionPerformed(evt);
            }
        });

        routeCityTextField1.setBackground(new java.awt.Color(52, 52, 56));
        routeCityTextField1.setForeground(new java.awt.Color(255, 255, 255));

        routeNameTextField1.setBackground(new java.awt.Color(52, 52, 56));
        routeNameTextField1.setForeground(new java.awt.Color(255, 255, 255));

        routeIcaoTextField1.setBackground(new java.awt.Color(52, 52, 56));
        routeIcaoTextField1.setForeground(new java.awt.Color(255, 255, 255));

        routeIcaoLabel1.setText("ICAO:");

        routeIataLabel1.setText("IATA:");

        routeIataTextField1.setBackground(new java.awt.Color(52, 52, 56));
        routeIataTextField1.setForeground(new java.awt.Color(255, 255, 255));

        routeIcaoLabel2.setText("ICAO:");

        routeIcaoTextField2.setBackground(new java.awt.Color(52, 52, 56));
        routeIcaoTextField2.setForeground(new java.awt.Color(255, 255, 255));

        routeIataLabel2.setText("IATA:");

        routeIataTextField2.setBackground(new java.awt.Color(52, 52, 56));
        routeIataTextField2.setForeground(new java.awt.Color(255, 255, 255));

        filteredRoutesList.setBackground(new java.awt.Color(52, 52, 56));
        filteredRoutesList.setForeground(new java.awt.Color(255, 255, 255));
        filteredRoutesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(filteredRoutesList);

        addBoudningToAirplaneButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addBoudningToAirplaneButton.setText("Add selected Route");
        addBoudningToAirplaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoudningToAirplaneButtonActionPerformed(evt);
            }
        });

        applyFilterAirplaneButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        applyFilterAirplaneButton.setForeground(new java.awt.Color(25, 62, 137));
        applyFilterAirplaneButton.setText("Apply filter");
        applyFilterAirplaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterAirplaneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(applyFilterAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addBoudningToAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(originFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(routeNameLabel1)
                                                    .addComponent(routeCityLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(routeCityTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(routeNameTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(routeCountryLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                .addComponent(routeCountryTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(routeFilterLabel)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(routeIcaoLabel1)
                                    .addComponent(routeIataLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(routeIataTextField1)
                                    .addComponent(routeIcaoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(routeCountryLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(routeCountryTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(routeNameLabel2)
                                                    .addComponent(routeCityLabel2))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(routeCityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(routeNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(routeIcaoLabel2)
                                            .addComponent(routeIataLabel2)))
                                    .addComponent(destinationFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(routeIataTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(routeIcaoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addBoudningToAirplaneButton, applyFilterAirplaneButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(routeFilterLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeIcaoLabel1)
                            .addComponent(routeIcaoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeIataLabel1)
                            .addComponent(routeIataTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(originFilterLabel)
                            .addComponent(routeNameLabel1)
                            .addComponent(routeNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(routeCityLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(routeCityTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeCountryLabel1)
                            .addComponent(routeCountryTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinationFilterLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeNameLabel2)
                            .addComponent(routeNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeCityLabel2)
                            .addComponent(routeCityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeIcaoLabel2)
                            .addComponent(routeIcaoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(routeIataLabel2)
                            .addComponent(routeIataTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeCountryLabel2)
                    .addComponent(routeCountryTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBoudningToAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyFilterAirplaneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addBoudningToAirplaneButton, applyFilterAirplaneButton});

        currentRoutesList.setBackground(new java.awt.Color(52, 52, 56));
        currentRoutesList.setForeground(new java.awt.Color(255, 255, 255));
        currentRoutesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(currentRoutesList);

        deleteRouteBoundingButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteRouteBoundingButton.setForeground(new java.awt.Color(153, 0, 0));
        deleteRouteBoundingButton.setText("Delete selected Route");
        deleteRouteBoundingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRouteBoundingButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Current Routes for this Airplane:");

        warningLabel.setForeground(new java.awt.Color(204, 0, 0));
        warningLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteRouteBoundingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(warningLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routeCountryTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeCountryTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeCountryTextField2ActionPerformed

    private void routeCountryTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeCountryTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeCountryTextField1ActionPerformed

    private void deleteRouteBoundingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRouteBoundingButtonActionPerformed
        warningLabel.setText(" ");
// TODO add your handling code here:
    }//GEN-LAST:event_deleteRouteBoundingButtonActionPerformed

    private void addBoudningToAirplaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoudningToAirplaneButtonActionPerformed
        warningLabel.setText(" ");
        Airplane airplane = (Airplane) detached;
        Route route = (Route) filteredRoutesList.getSelectedValue();
        airplane.getRoutes().add(route);
        route.getAirplanes().add(airplane);
        boundingUpdater.addRoute(route);
    }//GEN-LAST:event_addBoudningToAirplaneButtonActionPerformed

    private void applyFilterAirplaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterAirplaneButtonActionPerformed
        warningLabel.setText(" ");
        name1 = Utils.emptyStringToNull(routeNameTextField1);
        name2 = Utils.emptyStringToNull(routeNameTextField2);
        city1 = Utils.emptyStringToNull(routeCityTextField1);
        city2 = Utils.emptyStringToNull(routeCityTextField2);
        country1 = Utils.emptyStringToNull(routeCountryTextField1);
        country2 = Utils.emptyStringToNull(routeCountryTextField2);
        iata1 = Utils.emptyStringToNull(routeIataTextField1);
        iata2 = Utils.emptyStringToNull(routeIataTextField2);
        icao1 = Utils.emptyStringToNull(routeIcaoTextField1);
        icao2 = Utils.emptyStringToNull(routeIcaoTextField2);
        updateLists();
    }//GEN-LAST:event_applyFilterAirplaneButtonActionPerformed

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
//                managementProvider.setAirplaneManager(new AirplaneDAO());
//                managementProvider.setAirportManager(new AirportDAO());
//                managementProvider.setRouteManager(new RouteDAO());
                AirplaneBoundingDialog dialog = new AirplaneBoundingDialog(new javax.swing.JFrame(),
                        true, managementProvider, Airplane.createAirplane("", "", 0, 0, 0, 0), new BoundingUpdater(managementProvider));
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
    private javax.swing.JButton addBoudningToAirplaneButton;
    private javax.swing.JButton applyFilterAirplaneButton;
    private javax.swing.JList currentRoutesList;
    private javax.swing.JButton deleteRouteBoundingButton;
    private javax.swing.JLabel destinationFilterLabel;
    private javax.swing.JList filteredRoutesList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel originFilterLabel;
    private javax.swing.JLabel routeCityLabel1;
    private javax.swing.JLabel routeCityLabel2;
    private javax.swing.JTextField routeCityTextField1;
    private javax.swing.JTextField routeCityTextField2;
    private javax.swing.JLabel routeCountryLabel1;
    private javax.swing.JLabel routeCountryLabel2;
    private javax.swing.JTextField routeCountryTextField1;
    private javax.swing.JTextField routeCountryTextField2;
    private javax.swing.JLabel routeFilterLabel;
    private javax.swing.JLabel routeIataLabel1;
    private javax.swing.JLabel routeIataLabel2;
    private javax.swing.JTextField routeIataTextField1;
    private javax.swing.JTextField routeIataTextField2;
    private javax.swing.JLabel routeIcaoLabel1;
    private javax.swing.JLabel routeIcaoLabel2;
    private javax.swing.JTextField routeIcaoTextField1;
    private javax.swing.JTextField routeIcaoTextField2;
    private javax.swing.JLabel routeNameLabel1;
    private javax.swing.JLabel routeNameLabel2;
    private javax.swing.JTextField routeNameTextField1;
    private javax.swing.JTextField routeNameTextField2;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
