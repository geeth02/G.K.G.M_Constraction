/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee_management;

import common.DB;
import com.main.Main_Menu;
import common.CommonM;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geeth
 */
public class Employee_Management extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Management
     */
    public Employee_Management() {
        initComponents();
        CommonM.setFullScreen(this);
        CommonM.tableSettings(tb1);
        jScrollPane1.setVisible(false);
        tbData();
        comboData();
        
           
 
    }
String typeCode;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbGKG = new javax.swing.JLabel();
        lbCons = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnUserAccount = new javax.swing.JButton();
        btnAddEmployee1 = new javax.swing.JButton();
        btnEdite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        memberTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        comboType = new javax.swing.JComboBox<>();

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

        btnAddEmployee.setBackground(new java.awt.Color(0, 102, 204));
        btnAddEmployee.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setText("Add");
        btnAddEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddEmployeeMouseExited(evt);
            }
        });
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnUserAccount.setBackground(new java.awt.Color(0, 102, 204));
        btnUserAccount.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnUserAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnUserAccount.setText("User Account");
        btnUserAccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUserAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUserAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUserAccountMouseExited(evt);
            }
        });
        btnUserAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountActionPerformed(evt);
            }
        });

        btnAddEmployee1.setBackground(new java.awt.Color(0, 102, 204));
        btnAddEmployee1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnAddEmployee1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee1.setText("Remove ");
        btnAddEmployee1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddEmployee1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddEmployee1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddEmployee1MouseExited(evt);
            }
        });
        btnAddEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployee1ActionPerformed(evt);
            }
        });

        btnEdite.setBackground(new java.awt.Color(0, 102, 204));
        btnEdite.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnEdite.setForeground(new java.awt.Color(255, 255, 255));
        btnEdite.setText("Edite Details");
        btnEdite.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEdite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditeMouseExited(evt);
            }
        });
        btnEdite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnAddEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEdite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        memberTitle.setBackground(new java.awt.Color(0, 102, 204));
        memberTitle.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 60)); // NOI18N
        memberTitle.setForeground(new java.awt.Color(255, 255, 255));
        memberTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberTitle.setText("Employee Data");
        memberTitle.setOpaque(true);
        jLayeredPane1.add(memberTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 0, 1660, 120));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration Id", "Name", "Type", "NIC Number", "Phone Number", "Birthday", "Address", "Gender", "Register Date"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 1540, 770));

        comboType.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        comboType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboTypeMouseClicked(evt);
            }
        });
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 160, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
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

    private void btnAddEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseEntered
       CommonM.setBlue(btnAddEmployee);
    }//GEN-LAST:event_btnAddEmployeeMouseEntered

    private void btnAddEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployeeMouseExited
        CommonM.setDefaultColor(btnAddEmployee);
    }//GEN-LAST:event_btnAddEmployeeMouseExited

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        new Add_Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked

    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
       searchPro();
      

    }//GEN-LAST:event_txtSearchKeyReleased

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        if(evt.getClickCount()==2){
            txtSearch.setText(list1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);

        }
    }//GEN-LAST:event_list1MouseClicked

    private void lbConsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseExited
        lbGKG.setForeground(Color.WHITE);
        lbCons.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbConsMouseExited

    private void lbConsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseEntered
        lbGKG.setForeground(Color.YELLOW);
        lbCons.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbConsMouseEntered

    private void btnUserAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserAccountMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserAccountMouseEntered

    private void btnUserAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserAccountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserAccountMouseExited

    private void btnUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountActionPerformed
       new User_Account().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnUserAccountActionPerformed

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
        try{

        }catch(Exception e){}
    }//GEN-LAST:event_tb1MousePressed

    private void btnAddEmployee1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployee1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmployee1MouseEntered

    private void btnAddEmployee1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddEmployee1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmployee1MouseExited

    private void btnAddEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployee1ActionPerformed
    new Delete_employee().setVisible(true);
    }//GEN-LAST:event_btnAddEmployee1ActionPerformed

    private void comboTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboTypeMouseClicked

    }//GEN-LAST:event_comboTypeMouseClicked

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
       if(comboType.getSelectedItem()=="ACTIVE"){
       try {
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
           ResultSet search = DB.search("SELECT * FROM employee WHERE status=1");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("employee_id"));
               v.add(search.getString("first_name")+" "+search.getString("last_name"));
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='"+search.getString("type_code")+"'");
               if(search1.next()){
               v.add(search1.getString("type"));
               }
               v.add(search.getString("nic_number"));
               v.add(search.getString("phone_number"));
               v.add(search.getString("birthday"));
                v.add(search.getString("address_line_01")+","+search.getString("address_line_02")+","+search.getString("city"));
                 v.add(search.getString("gender"));
                 v.add(search.getString("data_time"));
               dtm.addRow(v);
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       }else if(comboType.getSelectedItem()=="DEACTIVE"){
          try {
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
           ResultSet search = DB.search("SELECT * FROM employee WHERE status=0");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("employee_id"));
               v.add(search.getString("first_name")+" "+search.getString("last_name"));
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='"+search.getString("type_code")+"'");
               if(search1.next()){
               v.add(search1.getString("type"));
               }
               v.add(search.getString("nic_number"));
               v.add(search.getString("phone_number"));
               v.add(search.getString("birthday"));
                v.add(search.getString("address_line_01")+","+search.getString("address_line_02")+","+search.getString("city"));
                 v.add(search.getString("gender"));
                 v.add(search.getString("data_time"));
               dtm.addRow(v);
               }
          }
           catch (Exception e) {
            e.printStackTrace();
        }
       }else{
          try {
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
           ResultSet search2 = DB.search("SELECT * FROM employee_type WHERE type='"+comboType.getSelectedItem()+"'");
             if(search2.next()){
              typeCode=search2.getString("type_code");
               }
           ResultSet search = DB.search("SELECT * FROM employee WHERE status=1 AND type_code='"+typeCode+"'");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("employee_id"));
               v.add(search.getString("first_name")+" "+search.getString("last_name"));
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='"+search.getString("type_code")+"'");
               if(search1.next()){
               v.add(search1.getString("type"));
               }
               v.add(search.getString("nic_number"));
               v.add(search.getString("phone_number"));
               v.add(search.getString("birthday"));
                v.add(search.getString("address_line_01")+","+search.getString("address_line_02")+","+search.getString("city"));
                 v.add(search.getString("gender"));
                 v.add(search.getString("data_time"));
               dtm.addRow(v);
               }
          }
           catch (Exception e) {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_comboTypeActionPerformed

    private void btnEditeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditeMouseEntered

    private void btnEditeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditeMouseExited

    private void btnEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeActionPerformed
       new Edite_Emplooyee_Data().setVisible(true);
    }//GEN-LAST:event_btnEditeActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnAddEmployee1;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEdite;
    private javax.swing.JButton btnUserAccount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboType;
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
           ResultSet search = DB.search("SELECT * FROM employee WHERE status=1");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("employee_id"));
               v.add(search.getString("first_name")+" "+search.getString("last_name"));
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='"+search.getString("type_code")+"'");
               if(search1.next()){
               v.add(search1.getString("type"));
               }
               v.add(search.getString("nic_number"));
               v.add(search.getString("phone_number"));
               v.add(search.getString("birthday"));
                v.add(search.getString("address_line_01")+","+search.getString("address_line_02")+","+search.getString("city"));
                 v.add(search.getString("gender"));
                 v.add(search.getString("data_time"));
               dtm.addRow(v);
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void comboData() {
        try {
            ResultSet search = DB.search("SELECT * FROM employee_type WHERE status=1");
            comboType.addItem("ACTIVE");
            comboType.addItem("DEACTIVE");
            while(search.next()){
            comboType.addItem(search.getString("type"));
            }
        } catch (Exception e) {
        }
    }

    private void searchPro() {
         try {
             if(comboType.getSelectedItem()!="DEACTIVE"){
            if(!txtSearch.getText().trim().equals("")){
            if(txtSearch.getText().toUpperCase().contains("E")){
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=1 AND employee_id  LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                       jScrollPane1.setVisible(false);
                while(rs.next()){
                     jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                }
                list1.setListData(v);
            }else{
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=1 AND first_name LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                 jScrollPane1.setVisible(false);
                while(rs.next()){
                    jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));  
                }
                list1.setListData(v);
            }
            }else{
             jScrollPane1.setVisible(false);
            }
             }else{
                 
             if(!txtSearch.getText().trim().equals("")){
            if(txtSearch.getText().toUpperCase().contains("E")){
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=0 AND employee_id  LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                       jScrollPane1.setVisible(false);
                while(rs.next()){
                     jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                }
                list1.setListData(v);
            }else{
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=0 AND first_name LIKE '"+txtSearch.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                 jScrollPane1.setVisible(false);
                while(rs.next()){
                    jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));  
                }
                list1.setListData(v);
            }
            }else{
             jScrollPane1.setVisible(false);
            }
                 
                 
                 
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
