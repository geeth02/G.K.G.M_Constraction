/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehicle_management;

import com.main.Main_Menu;
import common.CommonM;
import common.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geeth
 */
public class Vehicle_Management extends javax.swing.JFrame {

    /**
     * Creates new form Vehicle_Management
     */
    public Vehicle_Management() {
        initComponents();
        CommonM.setFullScreen(this);
        tbData();
        CommonM.tableSettings(tb1);
        
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
        btnStartJob = new javax.swing.JButton();
        btnStartJob1 = new javax.swing.JButton();
        btnStartJob2 = new javax.swing.JButton();
        btnStartJob3 = new javax.swing.JButton();
        btnStartJob5 = new javax.swing.JButton();
        btnStartJob6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        memberTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();

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

        btnStartJob.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob.setText("Dash");
        btnStartJob.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJobMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJobMouseExited(evt);
            }
        });
        btnStartJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJobActionPerformed(evt);
            }
        });

        btnStartJob1.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob1.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob1.setText("Add Vehicle");
        btnStartJob1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJob1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJob1MouseExited(evt);
            }
        });
        btnStartJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJob1ActionPerformed(evt);
            }
        });

        btnStartJob2.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob2.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob2.setText("Repair Vehicle");
        btnStartJob2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJob2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJob2MouseExited(evt);
            }
        });
        btnStartJob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJob2ActionPerformed(evt);
            }
        });

        btnStartJob3.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob3.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob3.setText("Edite Details");
        btnStartJob3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJob3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJob3MouseExited(evt);
            }
        });
        btnStartJob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJob3ActionPerformed(evt);
            }
        });

        btnStartJob5.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob5.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob5.setText("Vehicle Service");
        btnStartJob5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJob5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJob5MouseExited(evt);
            }
        });
        btnStartJob5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJob5ActionPerformed(evt);
            }
        });

        btnStartJob6.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob6.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob6.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob6.setText("Remove Vehicle");
        btnStartJob6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStartJob6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnStartJob6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnStartJob6MouseExited(evt);
            }
        });
        btnStartJob6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartJob6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStartJob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnStartJob1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnStartJob5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStartJob2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStartJob6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStartJob3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStartJob, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Registration Number", "Model", "Engine Oil Capacity", "Fuel Capacity", "Register Date"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 1560, 790));

        memberTitle.setBackground(new java.awt.Color(0, 102, 204));
        memberTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 60)); // NOI18N
        memberTitle.setForeground(new java.awt.Color(255, 255, 255));
        memberTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberTitle.setText("Vehicle Data");
        memberTitle.setOpaque(true);
        jLayeredPane1.add(memberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 0, 1660, 120));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Search");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 140, -1, -1));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jLayeredPane1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 140, 230, 40));

        list1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        list1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 180, 230, 90));

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

    private void btnStartJobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJobMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJobMouseEntered

    private void btnStartJobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJobMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJobMouseExited

    private void btnStartJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJobActionPerformed
        new Main_Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStartJobActionPerformed

    private void btnStartJob1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob1MouseEntered

    private void btnStartJob1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob1MouseExited

    private void btnStartJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJob1ActionPerformed
     new Add_Vehicle().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnStartJob1ActionPerformed

    private void btnStartJob2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob2MouseEntered

    private void btnStartJob2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob2MouseExited

    private void btnStartJob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJob2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob2ActionPerformed

    private void btnStartJob3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob3MouseEntered

    private void btnStartJob3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob3MouseExited

    private void btnStartJob3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJob3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob3ActionPerformed

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
        try{

        }catch(Exception e){}
    }//GEN-LAST:event_tb1MousePressed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked

    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
  

    }//GEN-LAST:event_txtSearchKeyReleased

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        if(evt.getClickCount()==2){
            txtSearch.setText(list1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);

        }
    }//GEN-LAST:event_list1MouseClicked

    private void btnStartJob5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob5MouseEntered

    private void btnStartJob5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob5MouseExited

    private void btnStartJob5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJob5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob5ActionPerformed

    private void btnStartJob6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob6MouseEntered

    private void btnStartJob6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJob6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob6MouseExited

    private void btnStartJob6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJob6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartJob6ActionPerformed

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
            java.util.logging.Logger.getLogger(Vehicle_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicle_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicle_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicle_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicle_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartJob;
    private javax.swing.JButton btnStartJob1;
    private javax.swing.JButton btnStartJob2;
    private javax.swing.JButton btnStartJob3;
    private javax.swing.JButton btnStartJob5;
    private javax.swing.JButton btnStartJob6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCons;
    private javax.swing.JLabel lbGKG;
    private javax.swing.JList<String> list1;
    private javax.swing.JLabel memberTitle;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

       private void tbData() {
        try {
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
           ResultSet search = DB.search("SELECT * FROM vehicle WHERE status=1");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("vehicle_id"));
               v.add(search.getString("province")+" "+search.getString("registration_number"));
               v.add(search.getString("model"));
               v.add(search.getString("engine_oil_capa"));
               v.add(search.getString("fuel_capa"));
                 v.add(search.getString("data_time"));
               dtm.addRow(v);
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
