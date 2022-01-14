/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delivery_item;

import common.CommonM;
import common.DB;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geeth
 */
public class End_Delivery_Order1 extends javax.swing.JFrame {

    /**
     * Creates new form End_Job
     */
    public End_Delivery_Order1() {
        initComponents();
        txtSearch.grabFocus();
        CommonM.tableSettingSm(tb3);
        jScrollPane1.setVisible(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtCustomer.setEditable(false);
        txtCustomerPayment.setText("0.00");
        txtCustomerPayment.setEditable(false);
        txtOrderId.setEditable(false);

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnRegister3 = new javax.swing.JButton();
        lbFirstName = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        comboSearch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        txtCustomer1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerPayment = new javax.swing.JTextField();
        txtCostName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        txtAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 300, 140));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("End Delivery Order");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 69));

        btnRegister3.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 30)); // NOI18N
        btnRegister3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister3.setText("End");
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
        ReForm.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1181, 620, 210, 60));

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Search By");
        ReForm.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 42));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        ReForm.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 80, 300, 43));

        comboSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC Number", "Customer Name" }));
        ReForm.add(comboSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 40));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Customer Name");
        ReForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 175, 42));

        txtCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });
        ReForm.add(txtCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 480, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Order Id");
        ReForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 175, -1));

        txtOrderId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrderId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });
        ReForm.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 480, 40));

        txtCustomer1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCustomer1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomer1ActionPerformed(evt);
            }
        });
        ReForm.add(txtCustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 480, 40));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Delivery Date");
        ReForm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 175, 42));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Location");
        ReForm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 40));

        txtCustomerPayment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCustomerPayment.setForeground(new java.awt.Color(0, 204, 0));
        txtCustomerPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCustomerPayment.setVerifyInputWhenFocusTarget(false);
        txtCustomerPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPaymentActionPerformed(evt);
            }
        });
        txtCustomerPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerPaymentKeyTyped(evt);
            }
        });
        ReForm.add(txtCustomerPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 480, 43));

        txtCostName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCostName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCostName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostNameActionPerformed(evt);
            }
        });
        txtCostName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostNameKeyTyped(evt);
            }
        });
        ReForm.add(txtCostName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 480, 40));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel16.setText("Customer Payments");
        ReForm.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 40));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material Name", "QTY", "Price"
            }
        ));
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb3MousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tb3);

        ReForm.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 480, 160));

        txtAmount.setBackground(new java.awt.Color(255, 255, 102));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });
        ReForm.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, 480, 43));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel8.setText("Delivery Charges");
        ReForm.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 180, 40));

        txtPayment.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPayment.setForeground(new java.awt.Color(204, 0, 0));
        txtPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentActionPerformed(evt);
            }
        });
        txtPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaymentKeyTyped(evt);
            }
        });
        ReForm.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 700, 480, 43));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel13.setText("Total Amount");
        ReForm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 190, 40));

        txtbalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtbalance.setForeground(new java.awt.Color(204, 0, 0));
        txtbalance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalanceActionPerformed(evt);
            }
        });
        txtbalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbalanceKeyTyped(evt);
            }
        });
        ReForm.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 750, 480, 43));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel14.setText("Balance");
        ReForm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 190, 40));

        txtAmount1.setBackground(new java.awt.Color(255, 255, 102));
        txtAmount1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmount1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmount1ActionPerformed(evt);
            }
        });
        txtAmount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmount1KeyTyped(evt);
            }
        });
        ReForm.add(txtAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 480, 43));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Material Charges");
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 180, 40));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 780, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbalanceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalanceKeyTyped

    private void txtbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalanceActionPerformed

    private void txtPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentKeyTyped

    private void txtPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentActionPerformed
        double paidAmount= Double.parseDouble(txtAmount.getText());
        double payment=Double.parseDouble(txtPayment.getText());
        double balance= payment-paidAmount;
        String setValue=String.valueOf(balance);
        BigDecimal bd = new BigDecimal( setValue ) ;
        DecimalFormat formatterBd = new DecimalFormat( "##.00" );
        txtbalance.setText(formatterBd.format( bd ) );

    }//GEN-LAST:event_txtPaymentActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        txtPayment.grabFocus();
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchOrder();
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode()==40){
            jList1.setSelectedIndex(0);
            jList1.grabFocus();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void btnRegister3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseExited

    private void btnRegister3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseEntered

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        if(evt.getKeyCode()==10){
            jScrollPane1.setVisible(false);
            searchDetails();
        }
    }//GEN-LAST:event_jList1KeyPressed

    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseEntered

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if(evt.getClickCount()==2){
            jScrollPane1.setVisible(false);
            searchDetails();
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void txtCustomer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomer1ActionPerformed

    private void txtCustomerPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPaymentActionPerformed

    private void txtCustomerPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerPaymentKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerPaymentKeyTyped

    private void txtCostNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostNameActionPerformed
        txtAmount.grabFocus();
    }//GEN-LAST:event_txtCostNameActionPerformed

    private void txtCostNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostNameKeyReleased

    private void txtCostNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostNameKeyTyped

    private void tb3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MousePressed

    }//GEN-LAST:event_tb3MousePressed

    private void txtAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmount1ActionPerformed

    private void txtAmount1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmount1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmount1KeyTyped

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
            java.util.logging.Logger.getLogger(End_Delivery_Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(End_Delivery_Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(End_Delivery_Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(End_Delivery_Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new End_Delivery_Order1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister3;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JTable tb3;
    private javax.swing.JTextField txtAmount;
    public static javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtCostName;
    private javax.swing.JTextField txtCustomer;
    public static javax.swing.JTextField txtCustomer1;
    public static javax.swing.JTextField txtCustomerPayment;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtbalance;
    // End of variables declaration//GEN-END:variables

    private void searchOrder() {
         try {
            if(!txtSearch.getText().trim().equals("")){
            if(comboSearch.getSelectedItem().equals("NIC Number")){
                ResultSet rs=  DB.search("SELECT * FROM customer WHERE status=1 AND nic_number LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                       jScrollPane1.setVisible(false);
                while(rs.next()){
                     jScrollPane1.setVisible(true);
                        v.add(rs.getString("customer_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                          jList1.setListData(v);   
                }
            }else if(comboSearch.getSelectedItem().equals(("Customer Name"))){
                ResultSet rs=  DB.search("SELECT * FROM customer WHERE status=1 AND first_name LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                 jScrollPane1.setVisible(false);
                while(rs.next()){
                    jScrollPane1.setVisible(true);
                        v.add(rs.getString("customer_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                }
                jList1.setListData(v);
            }
            }else{
             jScrollPane1.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchDetails() {
    searchNic();
        }            
    
     private void searchNic() {
                try {
                    String search=jList1.getSelectedValue().split("-")[0];
                    int i=0;
                    ResultSet search1 = DB.search("SELECT * FROM delivery_order where customer_id='"+search+"'");
                  while(search1.next()){ 
                  i++;
                  }
                  if(i==1){
                    ResultSet search3 = DB.search("SELECT * FROM delivery_order where customer_id='"+search+"'");
                  if(search3.next()){
                  txtOrderId.setText(search3.getString("order_id"));
                       ResultSet search7 = DB.search("SELECT * FROM customer where customer_id='"+search3.getString("customer_id")+"' AND status=1");
                       if(search7.next()){
                        txtSearch.setText(search7.getString("nic_number"));
                       txtCustomer.setText(search7.getString("customer_id")+"-"+search7.getString("first_name")+" "+search7.getString("last_name"));
                       }
                     ResultSet search5 = DB.search("SELECT * FROM payment where order_id='"+search3.getString("order_id")+"' AND status=1");
                    DefaultTableModel dtm =(DefaultTableModel) tb3.getModel();
                    dtm.setRowCount(0);
                    while(search5.next()){
                    Vector v = new Vector();
                    v.add(search5.getString("payment_id"));
                    v.add(search5.getString("amount"));
                    v.add(search5.getString("data_time"));
                    dtm.addRow(v);
                    }
                     
                     txtAmount.grabFocus();    
                  jScrollPane1.setVisible(false);
                  }
                  }else if(i>1){
                    new Job_Selection_Payment_Delivery().setVisible(true);
                    
                  }
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
     
    

   
   

   

   



}