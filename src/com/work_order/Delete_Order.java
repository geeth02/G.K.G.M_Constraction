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
public class Delete_Order extends javax.swing.JFrame {

    /**
     * Creates new form Start_Job
     */
    public Delete_Order() {
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
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
        btnRegister3.setText("Delete");
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

        ReForm.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 660, 150));

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

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed

    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtOrderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyTyped

    }//GEN-LAST:event_txtOrderIdKeyTyped

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed

    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtCustomerIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIdKeyReleased

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

    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed

    }//GEN-LAST:event_jLabel9KeyPressed

    private void txtVehicleNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyReleased
;
    }//GEN-LAST:event_txtVehicleNumberKeyReleased

    private void txtLastMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastMeterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastMeterActionPerformed

    private void txtLastMeterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastMeterKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLastMeterKeyTyped

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
            java.util.logging.Logger.getLogger(Delete_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister3;
    public static javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JTable tb3;
    public static javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextArea txtDiscription;
    private javax.swing.JTextField txtLastMeter;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtOrderId;
    public static javax.swing.JTextField txtVehicleNumber;
    // End of variables declaration//GEN-END:variables

    



}
