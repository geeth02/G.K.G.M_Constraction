/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work_order;

import com.main.Main_Menu;
import common.CommonM;
import common.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author geeth
 */
public class Driver_Salery extends javax.swing.JFrame {

    /**
     * Creates new form End_Job
     */
    public Driver_Salery() {
        initComponents();
        CommonM.setFullScreen(this);
        CommonM.tableSettings(tb1);
        textMod();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbGKG = new javax.swing.JLabel();
        lbCons = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        btnRegister3 = new javax.swing.JButton();
        lbFirstName = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        comboSearch = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtVehicle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbGKG.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lbGKG.setForeground(new java.awt.Color(255, 255, 255));
        lbGKG.setText("G.KG.M");
        lbGKG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbGKGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbGKGMouseExited(evt);
            }
        });

        lbCons.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lbCons.setForeground(new java.awt.Color(255, 255, 255));
        lbCons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCons.setText("Construction");
        lbCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbConsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbConsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbGKG, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbCons, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbGKG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCons, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDashboard.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Back");
        btnDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnDashboard1.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard1.setText("End Job");
        btnDashboard1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboard1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboard1MouseExited(evt);
            }
        });
        btnDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDashboard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDashboard1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(756, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jList1);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 310, -1));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Driver Salary");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 69));

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
        ReForm.add(btnRegister3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 880, 210, 60));

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Search By");
        ReForm.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 170, 42));

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
        ReForm.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 310, 43));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Vehicle", "Salery", "Date"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(tb1);

        ReForm.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 1358, 389));

        comboSearch.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC Number", "Name", "Id" }));
        ReForm.add(comboSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 160, 40));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Vehicle");
        ReForm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 40));

        txtVehicle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtVehicle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleActionPerformed(evt);
            }
        });
        txtVehicle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVehicleKeyTyped(evt);
            }
        });
        ReForm.add(txtVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 480, 43));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Order Id");
        ReForm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 40));

        txtOrderId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtOrderId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtOrderId.setVerifyInputWhenFocusTarget(false);
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
        ReForm.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 480, 43));

        jLabel8.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Salary Amount");
        ReForm.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 750, 1360, 30));

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
        ReForm.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 480, 43));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel13.setText("Date");
        ReForm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 190, 40));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });
        ReForm.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 480, 43));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        ReForm.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 610, 260));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Salary Amount");
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, 40));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 1470, 990));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbGKGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGKGMouseEntered
        lbGKG.setForeground(Color.YELLOW);
        lbCons.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbGKGMouseEntered

    private void lbGKGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGKGMouseExited
        lbGKG.setForeground(Color.WHITE);
        lbCons.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbGKGMouseExited

    private void lbConsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseEntered
        lbGKG.setForeground(Color.YELLOW);
        lbCons.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbConsMouseEntered

    private void lbConsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseExited
        lbGKG.setForeground(Color.WHITE);
        lbCons.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbConsMouseExited

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
      CommonM.setBlue(btnDashboard);
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        CommonM.setDefaultColor(btnDashboard);
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        new Main_Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnDashboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1MouseExited

    private void btnDashboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1MouseEntered

    private void btnRegister3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseEntered

    private void btnRegister3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegister3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3MouseExited

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        search();
        System.out.println(evt.getKeyCode());
        if(evt.getKeyCode()==40){
            jList1.setSelectedIndex(0);
            jList1.grabFocus();
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyTyped

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed

    }//GEN-LAST:event_tb1MousePressed

    private void txtVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleActionPerformed

    private void txtVehicleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleKeyTyped

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtOrderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdKeyTyped

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountKeyTyped

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateKeyTyped

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
            java.util.logging.Logger.getLogger(Driver_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver_Salery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Driver_Salery().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnRegister3;
    public static javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbCons;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbGKG;
    public static javax.swing.JTable tb1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDate;
    public static javax.swing.JTextField txtOrderId;
    public static javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtVehicle;
    // End of variables declaration//GEN-END:variables

      

    private void textMod() {
        jScrollPane1.setVisible(false);
       txtOrderId.setEditable(false);
       txtVehicle.setEditable(false);
       txtDate.setEditable(false);
    }

    private void search() {
        try {
            if(!txtSearch.getText().equals("")){
            if(comboSearch.getSelectedItem().equals("NIC Number")){
                    ResultSet rs = DB.search("SELECT * FROM employee WHERE status=1 AND nic_number LIKE '" + txtSearch.getText().toUpperCase() + "%'");
                    Vector v = new Vector();
                    jScrollPane1.setVisible(false);
                    while (rs.next()) {
                        jScrollPane1.setVisible(true);
                        v.add(rs.getString("employee_id") + "-" + rs.getString("first_name") + " " + rs.getString("last_name"));
                        jList1.setListData(v);
                    }
                
                
            }else if(comboSearch.getSelectedItem().equals("Name")){
            
                
                
            }else if(comboSearch.getSelectedItem().equals("Id")){
            
            }
            }else{
            jScrollPane1.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
