package Application;

import Application.GUIDesigners.BoundingUpdater;
import Application.GUIDesigners.DialogDesigner;
import Model.Route;
import Service.ManagementProvider;
import Validator.InvalidAttributeException;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

/**
 *
 * @author M
 */
public class RouteAttributesDialog extends javax.swing.JDialog {

    private ManagementProvider mgProvider;
    private Object detached = null;
    private BoundingUpdater boundingUpdater;
    private boolean updated = false;

    public RouteAttributesDialog(java.awt.Frame parent, boolean modal, ManagementProvider managementProvider, Object o) {
        super(parent, modal);
        if (o == null) {
            detached = Route.createRoute();
            updated = false;
            this.setTitle("Create Route");
        } else {
            detached = managementProvider.getRouteManager().find(((Route) o).getIdRoute());
            updated = true;
            this.setTitle("Update Route Attributes");
        }
        initDialog(managementProvider);
    }

    public RouteAttributesDialog(java.awt.Frame parent, boolean modal, ManagementProvider managementProvider) {
        super(parent, modal);
        detached = Route.createRoute();
        this.setTitle("Create Route");
        initDialog(managementProvider);
    }

    private void initDialog(ManagementProvider managementProvider) {
        mgProvider = managementProvider;
        boundingUpdater = new BoundingUpdater(managementProvider);
        initComponents();
        setLocationRelativeTo(null);
        initLists();
    }

    private void initLists() {
        routeHasAirplanesList.setSelectionMode(SINGLE_SELECTION);
        updateLists();
    }

    private void updateLists() {
        routeHasAirplanesList.setListData(((Route) detached).getAirplanes().toArray());
        updateTextFields();
    }

    private void updateTextFields() {
        Route route = (Route) detached;
        if (route.getDestination() != null) {
            destinationNameTextField.setText(route.getDestination().getAirportName());
            destinationCityTextField.setText(route.getDestination().getCity());
            destinationCountryTextField.setText(route.getDestination().getCountry());
            destinationIataTextField.setText(route.getDestination().getIata());
            destinationIcaoTextField.setText(route.getDestination().getIcao());
        }
        if (route.getOrigin() != null) {
            originNameTextField.setText(route.getOrigin().getAirportName());
            originCountryTextField.setText(route.getOrigin().getCountry());
            originCityTextField.setText(route.getOrigin().getCity());
            originIataTextField.setText(route.getOrigin().getIata());
            originIcaoTextField.setText(route.getOrigin().getIcao());
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

        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        originFilterLabel = new javax.swing.JLabel();
        destinationFilterLabel = new javax.swing.JLabel();
        routeHeadingLabel = new javax.swing.JLabel();
        routeNameLabel1 = new javax.swing.JLabel();
        routeCityLabel1 = new javax.swing.JLabel();
        routeIcaoLabel1 = new javax.swing.JLabel();
        routeIataLabel1 = new javax.swing.JLabel();
        routeIcaoLabel2 = new javax.swing.JLabel();
        routeIataLabel2 = new javax.swing.JLabel();
        routeNameLabel2 = new javax.swing.JLabel();
        routeCityLabel2 = new javax.swing.JLabel();
        routeIataLabel3 = new javax.swing.JLabel();
        routeIataLabel4 = new javax.swing.JLabel();
        destinationNameTextField = new javax.swing.JTextField();
        originCityTextField = new javax.swing.JTextField();
        originIcaoTextField = new javax.swing.JTextField();
        originIataTextField = new javax.swing.JTextField();
        originCountryTextField = new javax.swing.JTextField();
        originNameTextField = new javax.swing.JTextField();
        destinationIcaoTextField = new javax.swing.JTextField();
        destinationCityTextField = new javax.swing.JTextField();
        destinationCountryTextField = new javax.swing.JTextField();
        destinationIataTextField = new javax.swing.JTextField();
        routeChangeDestinationButton = new javax.swing.JButton();
        routeChangeOriginButton = new javax.swing.JButton();
        routeSaveButton = new javax.swing.JButton();
        routeAirplanesHeaderLabel = new javax.swing.JLabel();
        airplanesScrollPane = new javax.swing.JScrollPane();
        routeHasAirplanesList = new javax.swing.JList();
        addAirplanesToFlyOnRouteButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(165, 165, 178));
        jTextField8.setText("jTextField1");
        jTextField8.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Route Attributes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        originFilterLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        originFilterLabel.setText("Origin Airport:");

        destinationFilterLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        destinationFilterLabel.setText("Destination Airport:");

        routeHeadingLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        routeHeadingLabel.setText("Selected Route is defined by:");

        routeNameLabel1.setText("Name:");

        routeCityLabel1.setText("City:");

        routeIcaoLabel1.setText("ICAO:");

        routeIataLabel1.setText("IATA:");

        routeIcaoLabel2.setText("ICAO:");

        routeIataLabel2.setText("IATA:");

        routeNameLabel2.setText("Name:");

        routeCityLabel2.setText("City:");

        routeIataLabel3.setText("Country:");

        routeIataLabel4.setText("Country:");

        destinationNameTextField.setEditable(false);
        destinationNameTextField.setBackground(new java.awt.Color(165, 165, 178));
        destinationNameTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        destinationNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationNameTextFieldActionPerformed(evt);
            }
        });

        originCityTextField.setEditable(false);
        originCityTextField.setBackground(new java.awt.Color(165, 165, 178));
        originCityTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        originCityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originCityTextFieldActionPerformed(evt);
            }
        });

        originIcaoTextField.setEditable(false);
        originIcaoTextField.setBackground(new java.awt.Color(165, 165, 178));
        originIcaoTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        originIcaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originIcaoTextFieldActionPerformed(evt);
            }
        });

        originIataTextField.setEditable(false);
        originIataTextField.setBackground(new java.awt.Color(165, 165, 178));
        originIataTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        originIataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originIataTextFieldActionPerformed(evt);
            }
        });

        originCountryTextField.setEditable(false);
        originCountryTextField.setBackground(new java.awt.Color(165, 165, 178));
        originCountryTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        originCountryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originCountryTextFieldActionPerformed(evt);
            }
        });

        originNameTextField.setEditable(false);
        originNameTextField.setBackground(new java.awt.Color(165, 165, 178));
        originNameTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        originNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originNameTextFieldActionPerformed(evt);
            }
        });

        destinationIcaoTextField.setEditable(false);
        destinationIcaoTextField.setBackground(new java.awt.Color(165, 165, 178));
        destinationIcaoTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        destinationIcaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationIcaoTextFieldActionPerformed(evt);
            }
        });

        destinationCityTextField.setEditable(false);
        destinationCityTextField.setBackground(new java.awt.Color(165, 165, 178));
        destinationCityTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        destinationCityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationCityTextFieldActionPerformed(evt);
            }
        });

        destinationCountryTextField.setEditable(false);
        destinationCountryTextField.setBackground(new java.awt.Color(165, 165, 178));
        destinationCountryTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        destinationCountryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationCountryTextFieldActionPerformed(evt);
            }
        });

        destinationIataTextField.setEditable(false);
        destinationIataTextField.setBackground(new java.awt.Color(165, 165, 178));
        destinationIataTextField.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        destinationIataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationIataTextFieldActionPerformed(evt);
            }
        });

        routeChangeDestinationButton.setText("Change DESTINATION");
        routeChangeDestinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeChangeDestinationButtonActionPerformed(evt);
            }
        });

        routeChangeOriginButton.setText("Change ORIGIN");
        routeChangeOriginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeChangeOriginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(originFilterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(routeChangeOriginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeCityLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIcaoLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originIcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIataLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originIataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeNameLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destinationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIcaoLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destinationIcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeCityLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destinationCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(destinationFilterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(routeChangeDestinationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIataLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destinationCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIataLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(destinationIataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeIataLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(routeNameLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(originNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(routeHeadingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {routeChangeDestinationButton, routeChangeOriginButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(routeHeadingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(originFilterLabel)
                    .addComponent(routeChangeOriginButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNameLabel1)
                    .addComponent(originNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routeCityLabel1)
                    .addComponent(originCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routeIcaoLabel1)
                    .addComponent(originIcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routeIataLabel1)
                    .addComponent(originIataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeIataLabel4)
                    .addComponent(originCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationFilterLabel)
                    .addComponent(routeChangeDestinationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeNameLabel2)
                    .addComponent(destinationNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeCityLabel2)
                    .addComponent(destinationCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeIcaoLabel2)
                    .addComponent(destinationIcaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(routeIataLabel2)
                    .addComponent(destinationIataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeIataLabel3)
                    .addComponent(destinationCountryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        routeSaveButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        routeSaveButton.setText("Save Route");
        routeSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeSaveButtonActionPerformed(evt);
            }
        });

        routeAirplanesHeaderLabel.setText("Airplanes flying on this route:");

        airplanesScrollPane.setMaximumSize(new java.awt.Dimension(1000, 800));
        airplanesScrollPane.setMinimumSize(new java.awt.Dimension(50, 50));

        routeHasAirplanesList.setBackground(new java.awt.Color(165, 165, 178));
        routeHasAirplanesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        airplanesScrollPane.setViewportView(routeHasAirplanesList);

        addAirplanesToFlyOnRouteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addAirplanesToFlyOnRouteButton.setText("Find & add Airplanes to fly on this route");
        addAirplanesToFlyOnRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirplanesToFlyOnRouteButtonActionPerformed(evt);
            }
        });

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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addAirplanesToFlyOnRouteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(airplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(routeSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 4, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(routeAirplanesHeaderLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(routeSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(routeAirplanesHeaderLabel)
                        .addGap(15, 15, 15)
                        .addComponent(airplanesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addAirplanesToFlyOnRouteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void destinationNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationNameTextFieldActionPerformed

    private void originCityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originCityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originCityTextFieldActionPerformed

    private void originIcaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originIcaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originIcaoTextFieldActionPerformed

    private void originIataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originIataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originIataTextFieldActionPerformed

    private void originCountryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originCountryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originCountryTextFieldActionPerformed

    private void originNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originNameTextFieldActionPerformed

    private void destinationIcaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationIcaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationIcaoTextFieldActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        //current origin might be send
        DestinationSetterDialog destinationSetterDialog = new DestinationSetterDialog(null, true, mgProvider, detached, boundingUpdater);
        DialogDesigner.centerDialog(destinationSetterDialog);
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void destinationCityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationCityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationCityTextFieldActionPerformed

    private void destinationCountryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationCountryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationCountryTextFieldActionPerformed

    private void destinationIataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationIataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationIataTextFieldActionPerformed

    private void routeChangeOriginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeChangeOriginButtonActionPerformed
        //current origin might be send
        warningLabel.setText(" ");
        OriginSetterDialog originSetterDialog = new OriginSetterDialog(null, true, mgProvider, detached, boundingUpdater);
        DialogDesigner.centerDialog(originSetterDialog);
        updateLists();
        updateTextFields();
    }//GEN-LAST:event_routeChangeOriginButtonActionPerformed

    private void routeSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeSaveButtonActionPerformed
        warningLabel.setText(" ");
        try {
            Route route = (Route) detached;
            if (updated) {
                detached = mgProvider.getRouteManager().updateRoute(route);
            } else {
                detached = mgProvider.getRouteManager().createRoute(route);
                updated = true;
                this.setTitle("Update Route Attributes");
            }
            boundingUpdater.updateBoundings();
        } catch (InvalidAttributeException e) {
            warningLabel.setText(e.getMessage());
        }

// TODO add your handling code here:
    }//GEN-LAST:event_routeSaveButtonActionPerformed

    private void addAirplanesToFlyOnRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirplanesToFlyOnRouteButtonActionPerformed
        warningLabel.setText(" ");
        RouteBoundingDialog airplaneBoundingDialog = new RouteBoundingDialog(null, true, mgProvider, detached, boundingUpdater);
        DialogDesigner.centerDialog(airplaneBoundingDialog);
        updateLists();
    }//GEN-LAST:event_addAirplanesToFlyOnRouteButtonActionPerformed

    private void routeChangeDestinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeChangeDestinationButtonActionPerformed
        warningLabel.setText(" ");
        DestinationSetterDialog originSetterDialog = new DestinationSetterDialog(null, true, mgProvider, detached, boundingUpdater);
        DialogDesigner.centerDialog(originSetterDialog);
        updateLists();
        updateTextFields();
    }//GEN-LAST:event_routeChangeDestinationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RouteAttributesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouteAttributesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouteAttributesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouteAttributesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManagementProvider managementProvider = new ManagementProvider();
//                managementProvider.setAirplaneManager(new AirplaneDAO());
//                managementProvider.setAirportManager(new AirportDAO());
//                managementProvider.setRouteManager(new RouteDAO());
                RouteAttributesDialog dialog = new RouteAttributesDialog(new javax.swing.JFrame(), true, managementProvider);
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
    private javax.swing.JButton addAirplanesToFlyOnRouteButton;
    private javax.swing.JScrollPane airplanesScrollPane;
    private javax.swing.JTextField destinationCityTextField;
    private javax.swing.JTextField destinationCountryTextField;
    private javax.swing.JLabel destinationFilterLabel;
    private javax.swing.JTextField destinationIataTextField;
    private javax.swing.JTextField destinationIcaoTextField;
    private javax.swing.JTextField destinationNameTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField originCityTextField;
    private javax.swing.JTextField originCountryTextField;
    private javax.swing.JLabel originFilterLabel;
    private javax.swing.JTextField originIataTextField;
    private javax.swing.JTextField originIcaoTextField;
    private javax.swing.JTextField originNameTextField;
    private javax.swing.JLabel routeAirplanesHeaderLabel;
    private javax.swing.JButton routeChangeDestinationButton;
    private javax.swing.JButton routeChangeOriginButton;
    private javax.swing.JLabel routeCityLabel1;
    private javax.swing.JLabel routeCityLabel2;
    private javax.swing.JList routeHasAirplanesList;
    private javax.swing.JLabel routeHeadingLabel;
    private javax.swing.JLabel routeIataLabel1;
    private javax.swing.JLabel routeIataLabel2;
    private javax.swing.JLabel routeIataLabel3;
    private javax.swing.JLabel routeIataLabel4;
    private javax.swing.JLabel routeIcaoLabel1;
    private javax.swing.JLabel routeIcaoLabel2;
    private javax.swing.JLabel routeNameLabel1;
    private javax.swing.JLabel routeNameLabel2;
    private javax.swing.JButton routeSaveButton;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
