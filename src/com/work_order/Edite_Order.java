/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work_order;

import com.customer_management.Add_Customer_Befor_Start;
import common.DB;
import common.CommonM;
import common.SystemData;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author geeth
 */
public class Edite_Order extends javax.swing.JFrame {

    /**
     * Creates new form Start_Job
     */
    public Edite_Order() {
        initComponents();
//        jScrollPane4.setVisible(false);
//        jScrollPane3.setVisible(false);
//        jScrollPane2.setVisible(false);
        txtCustomerId.grabFocus();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        CommonM.tableSettings(tb3);
        generateOrId();
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jScrollPane5.setVisible(false);
        tableSize();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        vehicleList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtVehicleNumber = new javax.swing.JTextField();
        txtDirvers = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtCustomerId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiscription = new javax.swing.JTextArea();
        btnRegister3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtLastMeter = new javax.swing.JTextField();
        comboSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setViewportView(jList2);

        ReForm.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 280, -1));

        customerList.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        customerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerListMouseClicked(evt);
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

        jList1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList1);

        ReForm.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 450, -1));

        txtVehicleNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVehicleNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtVehicleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNumberActionPerformed(evt);
            }
        });
        txtVehicleNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyTyped(evt);
            }
        });
        ReForm.add(txtVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 450, 43));

        txtDirvers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDirvers.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDirvers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirversActionPerformed(evt);
            }
        });
        txtDirvers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirversKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirversKeyTyped(evt);
            }
        });
        ReForm.add(txtDirvers, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 450, 43));

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Search By");
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
        ReForm.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 280, 43));

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCustomerId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });
        txtCustomerId.addKeyListener(new java.awt.event.KeyAdapter() {
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
        jLabel5.setText("Edite Order");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 69));

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLocation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        ReForm.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 450, 43));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Start Meter");
        ReForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, 43));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel14.setText("Drivers");
        ReForm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 175, 43));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setText("discreption");
        ReForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 175, 42));

        txtDiscription.setColumns(20);
        txtDiscription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtDiscription.setRows(5);
        jScrollPane1.setViewportView(txtDiscription);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 450, 150));

        btnRegister3.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 30)); // NOI18N
        btnRegister3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister3.setText("Edite");
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
        ReForm.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 210, 60));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Id", "NIC Number", "Name", "Phone Number", "Type"
            }
        ));
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb3MousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tb3);

        ReForm.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 660, 150));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Location");
        ReForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 175, 43));

        txtLastMeter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastMeter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLastMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastMeterActionPerformed(evt);
            }
        });
        txtLastMeter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastMeterKeyTyped(evt);
            }
        });
        ReForm.add(txtLastMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 450, 43));

        comboSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC Number", "Customer Name", "Order Id" }));
        ReForm.add(comboSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 40));

        jLayeredPane2.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 840));

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
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNumberActionPerformed

    }//GEN-LAST:event_txtVehicleNumberActionPerformed

    private void txtVehicleNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyTyped

    }//GEN-LAST:event_txtVehicleNumberKeyTyped

    private void txtDirversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirversActionPerformed
        addTb();
    }//GEN-LAST:event_txtDirversActionPerformed

    private void txtDirversKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirversKeyTyped

    }//GEN-LAST:event_txtDirversKeyTyped

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        txtDirvers.grabFocus();
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtOrderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyTyped

    }//GEN-LAST:event_txtOrderIdKeyTyped

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        txtOrderId.grabFocus();
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtCustomerIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyReleased
        if (evt.getKeyCode() == 107) {
            txtCustomerId.setText("");
            new Add_Customer_Befor_Start().setVisible(true);
            this.dispose();

        }
        searchPro();
    }//GEN-LAST:event_txtCustomerIdKeyReleased

    private void txtCustomerIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyTyped

    }//GEN-LAST:event_txtCustomerIdKeyTyped

    private void tb3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MousePressed

    }//GEN-LAST:event_tb3MousePressed

    private void btnRegister3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseEntered

    private void btnRegister3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseExited

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        startJob();
    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed

    }//GEN-LAST:event_jLabel9KeyPressed

    private void txtVehicleNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyReleased
        searchVehicle();
    }//GEN-LAST:event_txtVehicleNumberKeyReleased

    private void txtDirversKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirversKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jScrollPane5.setVisible(false);
        } else {
            searchDriver();
        }

    }//GEN-LAST:event_txtDirversKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 2) {
            txtDirvers.setText(jList1.getSelectedValue().split("-")[0]);
            jScrollPane5.setVisible(false);
            txtDirvers.grabFocus();

        }
    }//GEN-LAST:event_jList1MouseClicked

    private void txtLastMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastMeterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastMeterActionPerformed

    private void txtLastMeterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastMeterKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLastMeterKeyTyped

    private void vehicleListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleListMouseEntered

    private void vehicleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleListMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                ResultSet search = DB.search("SELECT * FROM work_order WHERE status=1 AND vehicle_id='" + vehicleList.getSelectedValue().split("-")[0].split(":")[0] + "'");
                if (search.next()) {
                    JOptionPane.showMessageDialog(this, "This vehicle have active job", "Error", JOptionPane.ERROR_MESSAGE);
                    txtVehicleNumber.setText(null);
                    txtVehicleNumber.grabFocus();
                    jScrollPane3.setVisible(false);
                } else {
                    txtVehicleNumber.setText(vehicleList.getSelectedValue().split("-")[0].split(":")[0]);
                    jScrollPane3.setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_vehicleListMouseClicked

    private void customerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListMouseClicked
        if (evt.getClickCount() == 2) {
            txtCustomerId.setText(customerList.getSelectedValue().split("-")[0]);
            jScrollPane2.setVisible(false);

        }
    }//GEN-LAST:event_customerListMouseClicked

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
            java.util.logging.Logger.getLogger(Edite_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edite_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edite_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edite_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edite_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister3;
    public static javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JList<String> customerList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JTable tb3;
    public static javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtDirvers;
    private javax.swing.JTextArea txtDiscription;
    private javax.swing.JTextField txtLastMeter;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtOrderId;
    public static javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JList<String> vehicleList;
    // End of variables declaration//GEN-END:variables
 private void generateOrId() {
        try {
            txtOrderId.setEditable(false);
            ResultSet rs = DB.search("select count(order_id) as x from work_order");
            if (rs.next()) {
                String counts = rs.getString("x");
                int count = Integer.parseInt(counts);
                ++count;
                if (count < 10) {
                    txtOrderId.setText("IN00000" + count);
                } else if (count < 100) {
                    txtOrderId.setText("IN0000" + count);
                } else if (count < 1000) {
                    txtOrderId.setText("IN000" + count);
                } else if (count < 10000) {
                    txtOrderId.setText("IN00" + count);
                } else if (count < 100000) {
                    txtOrderId.setText("IN0" + count);
                } else if (count < 1000000) {
                    txtOrderId.setText("IN" + count);
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

    private void searchDriver() {
        try {
            if (!txtDirvers.getText().trim().equals("")) {
                if (txtDirvers.getText().toUpperCase().contains("E")) {
                    ResultSet rs = DB.search("SELECT * FROM employee WHERE status=1 AND employee_id  LIKE '" + txtDirvers.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane5.setVisible(false);
                    while (rs.next()) {
                        jScrollPane5.setVisible(true);
                        v.add(rs.getString("employee_id") + "-" + rs.getString("first_name") + " " + rs.getString("last_name"));
                    }
                    jList1.setListData(v);
                } else {
                    ResultSet rs = DB.search("SELECT * FROM employee WHERE status=1 AND first_name LIKE '" + txtDirvers.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane5.setVisible(false);
                    while (rs.next()) {
                        jScrollPane5.setVisible(true);
                        v.add(rs.getString("employee_id") + "-" + rs.getString("first_name") + " " + rs.getString("last_name"));
                    }
                    jList1.setListData(v);
                }
            } else {
                jScrollPane5.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addTb() {
        try {

            DefaultTableModel dtm = (DefaultTableModel) tb3.getModel();
            ResultSet search = DB.search("SELECT * FROM employee WHERE status=1 AND employee_id='" + txtDirvers.getText().toUpperCase() + "'");
            while (search.next()) {
                Vector v = new Vector();
                v.add(search.getString("employee_id"));
                v.add(search.getString("nic_number"));
                v.add(search.getString("first_name") + " " + search.getString("last_name"));
                v.add(search.getString("phone_number"));
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='" + search.getString("type_code") + "'");
                if (search1.next()) {
                    v.add(search1.getString("type"));
                }
                dtm.addRow(v);
            }
            txtDirvers.setText(null);
            txtDirvers.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startJob() {
        try {
            DB.getNewConnection().setAutoCommit(false);
            Savepoint savepoint = DB.getNewConnection().setSavepoint();
            try {
                ResultSet search = DB.search("SELECT * FROM work_order WHERE status=1 AND vehicle_id='" + txtVehicleNumber.getText() + "'");
                if (search.next()) {
                    JOptionPane.showMessageDialog(this, "This vehicle have active job", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String date = new SimpleDateFormat("yyyy-MM-dd- HH:mm:ss").format(new Date());
                    String inSql = "insert into work_order values('" + txtOrderId.getText().toUpperCase() + "','" + txtCustomerId.getText().toUpperCase() + "','" + txtVehicleNumber.getText().toUpperCase() + "','" + txtLocation.getText().toUpperCase() + "','" + txtDiscription.getText() + "','" + date + "','" + SystemData.getemployee() + "','"+txtLastMeter.getText()+"','" + 1 + "')";
                    DB.iud(inSql);
                    for (int row = 0; row < tb3.getRowCount(); row++) {
                        String employeeId = tb3.getValueAt(row, 0).toString().trim();

                        String invitemSQL = "insert into employee_job (order_id,employee_id,data_time,status,payment) values('" + txtOrderId.getText().toUpperCase() + "','" + employeeId + "','" + date + "','" + 1 + "','" + 1 + "')";
                        DB.iud(invitemSQL);
                    }
                    clearFeald();
                    JOptionPane.showMessageDialog(this, " successfull");
                    loadTb();
                }
            } catch (Exception e) {
                DB.getNewConnection().rollback(savepoint);
                System.out.println(e);
            }
            DB.getNewConnection().commit();
            DB.getNewConnection().setAutoCommit(true);
        } catch (Exception e) {

        }
    }

    private void clearFeald() {
        txtCustomerId.setText(null);
        txtDirvers.setText(null);
        txtDiscription.setText(null);
        txtLocation.setText(null);
        txtOrderId.setText(null);
        txtLastMeter.setEditable(false);
        txtVehicleNumber.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tb3.getModel();
        dtm.setRowCount(0);
        generateOrId();
    }

    private void tableSize() {
        tb3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tb3.getColumnModel().getColumn(0).setPreferredWidth(120);
        tb3.getColumnModel().getColumn(1).setPreferredWidth(120);
        tb3.getColumnModel().getColumn(2).setPreferredWidth(160);
        tb3.getColumnModel().getColumn(3).setPreferredWidth(150);
        tb3.getColumnModel().getColumn(4).setPreferredWidth(104);
    }

    private void loadTb() {
          try {
            System.out.println(SystemData.getAccountCode());
            DefaultTableModel dtm =(DefaultTableModel) Work_Order.tb1.getModel();
           ResultSet search = DB.search("SELECT * FROM work_order WHERE status=1");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("order_id"));
                ResultSet search1 = DB.search("SELECT * FROM customer WHERE customer_id='"+search.getString("customer_id")+"'");
                if(search1.next()){
                v.add(search1.getString("customer_id")+"-"+search1.getString("first_name")+" "+search1.getString("last_name"));
                }
                ResultSet search2 = DB.search("SELECT * FROM vehicle WHERE vehicle_id='"+search.getString("vehicle_id")+"'");
               if(search2.next()){
               v.add(search2.getString("vehicle_id")+"-"+search2.getString("registration_number"));
               }
               v.add(search.getString("location"));
               v.add(search.getString("discription"));
               v.add(search.getString("data_time"));
               if(SystemData.getAccountCode().equals("ADM")){
                   ResultSet search3 = DB.search("SELECT * FROM employee WHERE employee_id='"+search.getString("adding_employee")+"'");
                   if(search3.next()){
                  v.add(search.getString("adding_employee")+"-"+search3.getString("first_name")+" "+search3.getString("last_name"));
                   }
               }else{
              TableColumn col = Work_Order.tb1.getColumnModel().getColumn(6);
             col.setCellRenderer(new MyRenderer(Color.WHITE, Color.RED));
               v.add("ADMIN ONLY");
               }
               dtm.addRow(v);
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
