/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rent_item;

import com.delivery_item.*;
import com.work_order.*;
import common.DB;
import com.main.Main_Menu;
import common.CommonM;
import common.SystemData;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author geeth
 */
public class Rent_Main extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Management
     */
    public Rent_Main() {
        initComponents();
       CommonM.setFullScreen(this);
       CommonM.tableSettings(tb1);
       tbData();
       jScrollPane1.setVisible(false);
       
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
        btnStartJob = new javax.swing.JButton();
        btnEndJob = new javax.swing.JButton();
        btnDashboard1 = new javax.swing.JButton();
        btnDashboard2 = new javax.swing.JButton();
        btnEndJob1 = new javax.swing.JButton();
        btnDashboard3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearchDash = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        memberTitle = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(lbCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 320, -1));

        btnDashboard.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
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
        jPanel1.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 320, 71));

        btnStartJob.setBackground(new java.awt.Color(0, 102, 204));
        btnStartJob.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnStartJob.setForeground(new java.awt.Color(255, 255, 255));
        btnStartJob.setText("Rent Item");
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
        jPanel1.add(btnStartJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 151, 320, 71));

        btnEndJob.setBackground(new java.awt.Color(0, 102, 204));
        btnEndJob.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnEndJob.setForeground(new java.awt.Color(255, 255, 255));
        btnEndJob.setText("Edite Order");
        btnEndJob.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEndJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEndJobMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEndJobMouseExited(evt);
            }
        });
        btnEndJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnEndJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 320, 71));

        btnDashboard1.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard1.setText("Register Item");
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
        jPanel1.add(btnDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 320, 71));

        btnDashboard2.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard2.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard2.setText("Delete Order");
        btnDashboard2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboard2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboard2MouseExited(evt);
            }
        });
        btnDashboard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDashboard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 71));

        btnEndJob1.setBackground(new java.awt.Color(0, 102, 204));
        btnEndJob1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnEndJob1.setForeground(new java.awt.Color(255, 255, 255));
        btnEndJob1.setText("Complete Order");
        btnEndJob1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEndJob1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEndJob1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEndJob1MouseExited(evt);
            }
        });
        btnEndJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndJob1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEndJob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 221, 320, 71));

        btnDashboard3.setBackground(new java.awt.Color(0, 102, 204));
        btnDashboard3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnDashboard3.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard3.setText("Payment");
        btnDashboard3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDashboard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboard3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboard3MouseExited(evt);
            }
        });
        btnDashboard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDashboard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 320, 71));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("Search");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 140, -1, -1));

        txtSearchDash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSearchDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchDashMouseClicked(evt);
            }
        });
        txtSearchDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDashActionPerformed(evt);
            }
        });
        txtSearchDash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchDashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchDashKeyReleased(evt);
            }
        });
        jLayeredPane1.add(txtSearchDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 140, 340, 40));

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

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 180, 340, 160));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Customer", "Vehicle", "Location", "Description", "Date", "Added By"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 1530, 850));

        memberTitle.setBackground(new java.awt.Color(0, 102, 204));
        memberTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 60)); // NOI18N
        memberTitle.setForeground(new java.awt.Color(255, 255, 255));
        memberTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberTitle.setText("Rent Item");
        memberTitle.setOpaque(true);
        jLayeredPane1.add(memberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 0, 1660, 120));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel13.setText("Category");
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 207, 43));

        jRadioButton3.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Pending");
        jLayeredPane1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 125, 41));

        jRadioButton4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jRadioButton4.setText("Complite");
        jLayeredPane1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 133, -1));

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

    private void txtSearchDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchDashMouseClicked

    }//GEN-LAST:event_txtSearchDashMouseClicked

    private void txtSearchDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDashActionPerformed

    private void txtSearchDashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDashKeyPressed

    }//GEN-LAST:event_txtSearchDashKeyPressed

    private void txtSearchDashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchDashKeyReleased
        try {
            if(txtSearchDash.getText().toUpperCase().contains("BN")){
                jScrollPane1.setVisible(true);
                ResultSet rs=  DB.search("select * from book_tb where book_id  like '"+txtSearchDash.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                while(rs.next()){
                    v.add(rs.getString("book_id")+"-"+rs.getString("book_name"));
                }
                list1.setListData(v);
            }else{
                jScrollPane1.setVisible(true);
                ResultSet rs=  DB.search("select * from book_tb where book_name like '"+txtSearchDash.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                while(rs.next()){
                    v.add(rs.getString("book_id")+"-"+rs.getString("book_name"));
                }
                list1.setListData(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchDashKeyReleased

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        if(evt.getClickCount()==2){
            txtSearchDash.setText(list1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);

        }
    }//GEN-LAST:event_list1MouseClicked

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
        try{

        }catch(Exception e){}
    }//GEN-LAST:event_tb1MousePressed

    private void btnStartJobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJobMouseEntered
        CommonM.setBlue(btnStartJob);
    }//GEN-LAST:event_btnStartJobMouseEntered

    private void btnStartJobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartJobMouseExited
        CommonM.setDefaultColor(btnStartJob);
    }//GEN-LAST:event_btnStartJobMouseExited

    private void btnStartJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartJobActionPerformed
        new Rent_Item().setVisible(true);
    }//GEN-LAST:event_btnStartJobActionPerformed

    private void btnEndJobMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndJobMouseEntered
        CommonM.setBlue(btnEndJob);
    }//GEN-LAST:event_btnEndJobMouseEntered

    private void btnEndJobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndJobMouseExited
        CommonM.setDefaultColor(btnEndJob);
    }//GEN-LAST:event_btnEndJobMouseExited

    private void btnEndJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndJobActionPerformed
        new End_Job().setVisible(true);
    }//GEN-LAST:event_btnEndJobActionPerformed

    private void btnDashboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1MouseEntered

    private void btnDashboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1MouseExited

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
      
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnDashboard2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard2MouseEntered

    private void btnDashboard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard2MouseExited

    private void btnDashboard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard2ActionPerformed
      new Driver_Salery().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnDashboard2ActionPerformed

    private void btnEndJob1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndJob1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEndJob1MouseEntered

    private void btnEndJob1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndJob1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEndJob1MouseExited

    private void btnEndJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndJob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEndJob1ActionPerformed

    private void btnDashboard3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard3MouseEntered

    private void btnDashboard3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboard3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard3MouseExited

    private void btnDashboard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard3ActionPerformed

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
            java.util.logging.Logger.getLogger(Rent_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rent_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rent_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rent_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Rent_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnDashboard2;
    private javax.swing.JButton btnDashboard3;
    private javax.swing.JButton btnEndJob;
    private javax.swing.JButton btnEndJob1;
    private javax.swing.JButton btnStartJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCons;
    private javax.swing.JLabel lbGKG;
    private javax.swing.JList<String> list1;
    private javax.swing.JLabel memberTitle;
    public static javax.swing.JTable tb1;
    private javax.swing.JTextField txtSearchDash;
    // End of variables declaration//GEN-END:variables

    private void tbData() {
        try {
            System.out.println(SystemData.getAccountCode());
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
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
              TableColumn col = tb1.getColumnModel().getColumn(6);
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



 class MyRenderer extends DefaultTableCellRenderer {
   Color bg, fg;
   public MyRenderer(Color bg, Color fg) {
      super();
      this.bg = bg;
      this.fg = fg;
   }
   public Component getTableCellRendererComponent(JTable table, Object 
   value, boolean isSelected, boolean hasFocus, int row, int column) 
   {
      Component cell = super.getTableCellRendererComponent(table, value, 
      isSelected, hasFocus, row, column);
      cell.setBackground(bg);
      cell.setForeground(fg);
      return cell;
   }
}
