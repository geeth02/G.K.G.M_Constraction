/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work_order;

import common.DB;
import static common.CommonM.checkNull;
import static common.CommonM.frameIcan;
import common.SystemData;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author geeth
 */
public class List_Order extends javax.swing.JFrame {

    /**
     * Creates new form Start_Job
     */
    public List_Order() {
        initComponents();
        txtCustomerId.grabFocus();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        generateOrId();
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
         frameIcan(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        vehicleList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnRegister3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiscription = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        customerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerListMouseClicked(evt);
            }
        });
        customerList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerListKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(customerList);

        ReForm.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 450, 130));

        vehicleList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        vehicleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vehicleListMouseEntered(evt);
            }
        });
        vehicleList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vehicleListKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vehicleListKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(vehicleList);

        ReForm.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 450, 130));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Vehicle Number");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 175, 42));

        txtVehicleNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVehicleNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtVehicleNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtVehicleNumberMouseReleased(evt);
            }
        });
        txtVehicleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNumberActionPerformed(evt);
            }
        });
        txtVehicleNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyTyped(evt);
            }
        });
        ReForm.add(txtVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 450, 43));

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Order Id");
        ReForm.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 175, 42));

        txtOrderId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrderId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });
        txtOrderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrderIdKeyTyped(evt);
            }
        });
        ReForm.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 450, 43));

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCustomerId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });
        txtCustomerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerIdKeyTyped(evt);
            }
        });
        ReForm.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 450, 43));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Customer Id/Name");
        ReForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 43));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("List Order");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 69));

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtLocationMouseReleased(evt);
            }
        });
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        ReForm.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 450, 43));

        btnRegister3.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 30)); // NOI18N
        btnRegister3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister3.setText("Add");
        btnRegister3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegister3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegister3MouseExited(evt);
            }
        });
        btnRegister3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister3ActionPerformed(evt);
            }
        });
        ReForm.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 210, 60));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Date");
        ReForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 175, 43));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Location");
        ReForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 175, 43));
        ReForm.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 450, 40));

        txtDiscription.setColumns(20);
        txtDiscription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtDiscription.setRows(5);
        txtDiscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDiscriptionMouseReleased(evt);
            }
        });
        txtDiscription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscriptionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDiscription);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 450, 150));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setText("discreption");
        ReForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 175, 42));

        jLayeredPane2.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNumberActionPerformed
        checkNull(txtVehicleNumber, "Vehicle Number", txtLocation);
        try {
            ResultSet search = DB.search("SELECT * FROM vehicle WHERE vehicle_id='" + txtVehicleNumber.getText() + "'");
            if (search.next()) {
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Vehicle Id", "Error", JOptionPane.ERROR_MESSAGE);
                txtVehicleNumber.setText(null);
                txtVehicleNumber.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_txtVehicleNumberActionPerformed

    private void txtVehicleNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyTyped

    }//GEN-LAST:event_txtVehicleNumberKeyTyped

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed

    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtOrderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyTyped

    }//GEN-LAST:event_txtOrderIdKeyTyped

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed

    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed


    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtCustomerIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyReleased
        if (evt.getKeyCode() == 107) {
            txtCustomerId.setText("");
            new Add_Customer_List_Order().setVisible(true);
            this.dispose();
        }

        searchPro();
    }//GEN-LAST:event_txtCustomerIdKeyReleased

    private void txtCustomerIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyTyped

    }//GEN-LAST:event_txtCustomerIdKeyTyped

    private void btnRegister3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseEntered

    private void btnRegister3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseExited

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        Date date = txtDate.getDate();
        if (!txtCustomerId.getText().equals("")) {
            if (!txtVehicleNumber.getText().equals("")) {
                if (!txtLocation.getText().equals("")) {
                    if (date != null) {
                        
                        addData();
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Add Job Date", "Error", JOptionPane.ERROR_MESSAGE);
                        txtDate.grabFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please Enter Location", "Error", JOptionPane.ERROR_MESSAGE);
                    txtLocation.grabFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter Vehicle Id", "Error", JOptionPane.ERROR_MESSAGE);
                txtVehicleNumber.grabFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter Customer Id", "Error", JOptionPane.ERROR_MESSAGE);
            txtCustomerId.grabFocus();
        }

    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void customerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListMouseClicked
        if (evt.getClickCount() == 2) {
            txtCustomerId.setText(customerList.getSelectedValue().split("-")[0]);
            jScrollPane2.setVisible(false);
            txtVehicleNumber.grabFocus();
            checkNull(txtCustomerId, "Customer Id", txtVehicleNumber);

        }
    }//GEN-LAST:event_customerListMouseClicked

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed

    }//GEN-LAST:event_jLabel9KeyPressed

    private void txtVehicleNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyReleased
        searchVehicle();
        if (txtVehicleNumber.getText().equals("")) {
            txtLocation.setText(null);
        }
    }//GEN-LAST:event_txtVehicleNumberKeyReleased

    private void vehicleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleListMouseClicked
        txtVehicleNumber.setText(vehicleList.getSelectedValue().split("-")[0]);
        jScrollPane3.setVisible(false);
        txtLocation.grabFocus();

    }//GEN-LAST:event_vehicleListMouseClicked

    private void vehicleListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleListMouseEntered

    private void customerListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerListKeyPressed
        if (evt.getKeyCode() == 10) {
            txtCustomerId.setText(customerList.getSelectedValue().split("-")[0]);
            jScrollPane2.setVisible(false);
            txtVehicleNumber.grabFocus();
        }
        checkNull(txtCustomerId, "Customer Id", txtVehicleNumber);
    }//GEN-LAST:event_customerListKeyPressed

    private void vehicleListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicleListKeyPressed
        if (evt.getKeyCode() == 10) {
            txtVehicleNumber.setText(vehicleList.getSelectedValue().split(":")[0]);
            jScrollPane3.setVisible(false);
            txtLocation.grabFocus();

        }
    }//GEN-LAST:event_vehicleListKeyPressed

    private void txtCustomerIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyPressed
        if (evt.getKeyCode() == 40) {
            customerList.grabFocus();
            customerList.setSelectedIndex(0);

        }
    }//GEN-LAST:event_txtCustomerIdKeyPressed

    private void txtVehicleNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyPressed
        if (evt.getKeyCode() == 40) {
            vehicleList.setSelectedIndex(0);
            vehicleList.grabFocus();
        }

    }//GEN-LAST:event_txtVehicleNumberKeyPressed

    private void txtVehicleNumberMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVehicleNumberMouseReleased
        if (txtCustomerId.getText().equals("")) {
            txtCustomerId.grabFocus();
        }
    }//GEN-LAST:event_txtVehicleNumberMouseReleased

    private void txtLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLocationMouseReleased

    }//GEN-LAST:event_txtLocationMouseReleased

    private void vehicleListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicleListKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleListKeyReleased

    private void txtDiscriptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiscriptionMouseReleased

        if(txtCustomerId.getText().equals("")){
            txtCustomerId.grabFocus();
        }else if(txtVehicleNumber.getText().equals("")){
            txtVehicleNumber.grabFocus();
        }else if(txtLocation.getText().equals("")){
            txtLocation.grabFocus();
        }
    }//GEN-LAST:event_txtDiscriptionMouseReleased

    private void txtDiscriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscriptionKeyReleased

    }//GEN-LAST:event_txtDiscriptionKeyReleased

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
            java.util.logging.Logger.getLogger(List_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister3;
    private javax.swing.JList<String> customerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbFirstName;
    public static javax.swing.JTextField txtCustomerId;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextArea txtDiscription;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtOrderId;
    public static javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JList<String> vehicleList;
    // End of variables declaration//GEN-END:variables
 private void generateOrId() {
        try {
            txtOrderId.setEditable(false);
            ResultSet rs = DB.search("select count(id) as x from order_list");
            if (rs.next()) {
                String counts = rs.getString("x");
                int count = Integer.parseInt(counts);
                ++count;
                if (count < 10) {
                    txtOrderId.setText("PN00000" + count);
                } else if (count < 100) {
                    txtOrderId.setText("PN0000" + count);
                } else if (count < 1000) {
                    txtOrderId.setText("PN000" + count);
                } else if (count < 10000) {
                    txtOrderId.setText("PN00" + count);
                } else if (count < 100000) {
                    txtOrderId.setText("PN0" + count);
                } else if (count < 1000000) {
                    txtOrderId.setText("PN" + count);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void searchPro() {
        try {
            if (!txtCustomerId.getText().trim().equals("")) {
                if (txtCustomerId.getText().toUpperCase().contains("CN")) {
                    ResultSet rs = DB.search("SELECT * FROM customer WHERE status=1 AND customer_id  LIKE '" + txtCustomerId.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane2.setVisible(false);
                    while (rs.next()) {
                        jScrollPane2.setVisible(true);
                        v.add(rs.getString("customer_id") + "-" + rs.getString("first_name") + " " + rs.getString("last_name") + "  -  " + rs.getString("nic_number"));
                    }
                    customerList.setListData(v);
                } else {
                    ResultSet rs = DB.search("SELECT * FROM customer WHERE first_name LIKE '" + txtCustomerId.getText().toUpperCase() + "%'or nic_number  LIKE '" + txtCustomerId.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane2.setVisible(false);
                    while (rs.next()) {
                        jScrollPane2.setVisible(true);
                        v.add(rs.getString("customer_id") + "-" + rs.getString("first_name") + " " + rs.getString("last_name") + "  -  " + rs.getString("nic_number"));
                    }
                    customerList.setListData(v);
                }
            } else {
                jScrollPane2.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchVehicle() {
        try {
            if (!txtVehicleNumber.getText().trim().equals("")) {
                if (txtVehicleNumber.getText().toUpperCase().contains("VN")) {
                    ResultSet rs = DB.search("SELECT * FROM vehicle WHERE status=1 AND vehicle_id  LIKE '" + txtVehicleNumber.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane3.setVisible(false);
                    while (rs.next()) {
                        jScrollPane3.setVisible(true);
                        v.add(rs.getString("vehicle_id") + ": " + rs.getString("registration_number") + "  -  " + rs.getString("model"));
                    }
                    vehicleList.setListData(v);
                } else {
                    ResultSet rs = DB.search("SELECT * FROM vehicle WHERE status=1 AND registration_number  LIKE '" + txtVehicleNumber.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane2.setVisible(false);
                    while (rs.next()) {
                        jScrollPane3.setVisible(true);
                        v.add(rs.getString("vehicle_id") + ": " + rs.getString("registration_number") + "  -  " + rs.getString("model"));
                    }
                    vehicleList.setListData(v);
                }
            } else {
                jScrollPane3.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addData() {
        try {
            String discription=null;
            if(txtDiscription.getText().equals("")){
            discription="None";
            }else{
            discription=txtDiscription.getText();
            }
             String date = new SimpleDateFormat("yyyy-MM-dd- HH:mm:ss").format(new Date());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            DB.iud("INSERT INTO order_list VALUES('"+txtOrderId.getText()+"','"+txtCustomerId.getText().toUpperCase()+"','"+txtVehicleNumber.getText().toUpperCase()+"','"+txtLocation.getText().toUpperCase()+"','"+sdf.format(txtDate.getDate())+"','"+discription+"','"+SystemData.getemployee()+"',"
                    + "'"+date+"','"+1+"')");
            clearFeald();
             JOptionPane.showMessageDialog(this, " successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearFeald() {
       txtCustomerId.setText(null);
       txtDate.setDate(null);
       txtLocation.setText(null);
       txtOrderId.setText(null);
       txtVehicleNumber.setText(null);
       txtDiscription.setText(null);
       generateOrId();
    }
}