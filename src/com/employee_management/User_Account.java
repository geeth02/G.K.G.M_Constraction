/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee_management;

import com.main.MD5;
import common.CommonM;
import common.DB;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geeth
 */
public class User_Account extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Management
     */
    public User_Account() {
        initComponents();
        CommonM.setFullScreen(this);
        LoadAccType();
        CommonM.tableSettings(tb1);
        tbData();
        comboData();
        txtReId.grabFocus();
        txtNicNumber.setEditable(false);
        txtName.setEditable(false);
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
        btnBack = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        txtNicNumber = new javax.swing.JTextField();
        txtReId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAccType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

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
                .addComponent(lbCons, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
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

        btnBack.setBackground(new java.awt.Color(0, 102, 204));
        btnBack.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBack1.setBackground(new java.awt.Color(0, 102, 204));
        btnBack1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Change Status");
        btnBack1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack1MouseExited(evt);
            }
        });
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnBack2.setBackground(new java.awt.Color(0, 102, 204));
        btnBack2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 27)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("Change Password");
        btnBack2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack2MouseExited(evt);
            }
        });
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(695, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 1080));

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 570, 120));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("NIC Number");
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 246, 193, 42));

        txtNicNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNicNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicNumberActionPerformed(evt);
            }
        });
        txtNicNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicNumberKeyTyped(evt);
            }
        });
        ReForm.add(txtNicNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 249, 569, 43));

        txtReId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtReId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtReId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReIdActionPerformed(evt);
            }
        });
        txtReId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReIdKeyReleased(evt);
            }
        });
        ReForm.add(txtReId, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 148, 570, 43));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Registration Id");
        ReForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 148, 192, 43));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create User Account");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 69));

        comboAccType.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        comboAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAccTypeActionPerformed(evt);
            }
        });
        ReForm.add(comboAccType, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 87, 200, 43));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setText("User Name");
        ReForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 304, 193, 37));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });
        ReForm.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 303, 569, 43));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Password");
        ReForm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 357, 193, 43));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Comform Password");
        ReForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 411, 207, 37));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        ReForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 197, 160, 43));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        ReForm.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 197, 570, 43));
        ReForm.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 357, 569, 43));
        ReForm.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 411, 569, 43));

        btnRegister.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Create");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        ReForm.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, 250, 70));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 1360, 550));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Id", "Account Type", "Name", "NIC Number", "User Name", "Status"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tb1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 1360, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2174, Short.MAX_VALUE)
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

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        CommonM.setBlue(btnBack);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
      CommonM.setDefaultColor(btnBack);
    }//GEN-LAST:event_btnBackMouseExited

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      new Employee_Management().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lbConsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseExited
        lbGKG.setForeground(Color.WHITE);
        lbCons.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbConsMouseExited

    private void lbConsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsMouseEntered
        lbGKG.setForeground(Color.YELLOW);
        lbCons.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lbConsMouseEntered

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        createUserAcc();
        tbData();
    
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        CommonM.setBlue(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
       CommonM.setDefaultColor(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void txtReIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReIdActionPerformed
        try {
              ResultSet search1 = DB.search("select * from book_tb where book_id='"+txtReId.getText().toUpperCase()+"'");
                  if(search1.next()){
                     txtName.setText(search1.getString("first_name")+" "+search1.getString("last_name"));
                     txtNicNumber.setText(search1.getString("nic_number"));
                  }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtReIdActionPerformed

    private void txtNicNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicNumberKeyTyped

    }//GEN-LAST:event_txtNicNumberKeyTyped

    private void txtNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicNumberActionPerformed

    }//GEN-LAST:event_txtNicNumberActionPerformed

    private void comboAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAccTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAccTypeActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
        try{

        }catch(Exception e){}
    }//GEN-LAST:event_tb1MousePressed

    private void btnBack1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1MouseEntered

    private void btnBack1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1MouseExited

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
     new Edite_user_Acc().setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtReIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReIdKeyReleased
      searchPro();
    }//GEN-LAST:event_txtReIdKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       if(evt.getClickCount()==2){
            txtReId.setText(jList1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);
            try {
                ResultSet search = DB.search("SELECT * from employee WHERE employee_id='"+txtReId.getText().toUpperCase()+"'");
                if(search.next()){
                txtName.setText(search.getString("first_name")+" "+search.getString("last_name"));
                txtNicNumber.setText(search.getString("nic_number"));
                txtUserName.grabFocus();
                }

           } catch (Exception e) {
               e.printStackTrace();
           }
            

        }
    }//GEN-LAST:event_jList1MouseClicked

    private void btnBack2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack2MouseEntered

    private void btnBack2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack2MouseExited

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack2ActionPerformed

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
            java.util.logging.Logger.getLogger(User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboAccType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCons;
    private javax.swing.JLabel lbGKG;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNicNumber;
    private javax.swing.JTextField txtReId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void LoadAccType() {
        
    }

    private void searchPro() {
        try{
          if(!txtReId.getText().trim().equals("")){
            if(txtReId.getText().toUpperCase().contains("E")){
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=1 AND employee_id  LIKE '"+txtReId.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                       jScrollPane1.setVisible(false);
                while(rs.next()){
                     jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));
                }
                jList1.setListData(v);
            }else{
                ResultSet rs=  DB.search("SELECT * FROM employee WHERE status=1 AND first_name LIKE '"+txtReId.getText().toUpperCase()+"%'");
                Vector v = new Vector();
                 jScrollPane1.setVisible(false);
                while(rs.next()){
                    jScrollPane1.setVisible(true);
                    v.add(rs.getString("employee_id")+"-"+rs.getString("first_name")+" "+rs.getString("last_name"));  
                }
                jList1.setListData(v);
            }
            }else{
             jScrollPane1.setVisible(false);
            }
        }catch(Exception e){
        e.printStackTrace();
        }
    }

    private void comboData() {

        try {
            ResultSet search = DB.search("SELECT * FROM account_type WHERE status=1");
            comboAccType.addItem("Account Type");
            while(search.next()){
            comboAccType.addItem(search.getString("acc_type"));
            }
        } catch (Exception e) {
        }
    }

    private void createUserAcc() {
       if(!txtUserName.getText().equals("")){
           if(String.valueOf(pass1.getPassword()).equals(String.valueOf(pass2.getPassword()))){
               if(!comboAccType.getSelectedItem().equals("Account Type")){
                   try {
                      String accId=null;
                       ResultSet search = DB.search("SELECT * FROM account_type WHERE acc_type='"+comboAccType.getSelectedItem()+"'");
                          if(search.next()){
                         accId=search.getString("acc_code");
                          }
                       ResultSet search1 = DB.search("SELECT * FROM user_account WHERE employee_id='"+txtReId.getText()+"'");
                       if(search1.next()){
                       JOptionPane.showMessageDialog (null, "Already you have account", "Error", JOptionPane.ERROR_MESSAGE);
                       }else{
                         String dataTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                       DB.iud("INSERT INTO user_account VALUES('"+txtUserName.getText()+"','"+txtReId.getText()+"','"+accId+"','"+MD5.getMd5(String.valueOf(pass1.getPassword()))+"','"+dataTime+"',1)");
                       clearFeald();
                       
                       } 
                   } catch (Exception e) {
                       JOptionPane.showMessageDialog (null, "Error Found", "Error", JOptionPane.ERROR_MESSAGE);
                       e.printStackTrace();
                   }
               }else{
                  JOptionPane.showMessageDialog (null, "Select user type", "User Type", JOptionPane.ERROR_MESSAGE);
               }
           }else{
               JOptionPane.showMessageDialog (null, "Password not match", "Password", JOptionPane.ERROR_MESSAGE);
           }
       }else{
           JOptionPane.showMessageDialog (null, "User name not found !!!", "User Name", JOptionPane.ERROR_MESSAGE);
       }
    }   

    private void clearFeald() {
       txtName.setText(null);
       txtNicNumber.setText(null);
       txtReId.setText(null);
       txtUserName.setText(null);
       pass1.setText(null);
       pass2.setText(null);
       comboAccType.setSelectedIndex(0);
    }

    private void tbData() {
        try {
            DefaultTableModel dtm =(DefaultTableModel) tb1.getModel();
           ResultSet search = DB.search("SELECT * FROM user_account");
           dtm.setRowCount(0);
           while(search.next()){
               Vector v = new Vector();
               v.add(search.getString("employee_id"));
               ResultSet search1 = DB.search("SELECT * FROM account_type WHERE acc_code='"+search.getString("account_code")+"'");
             if(search1.next()){
             v.add(search1.getString("acc_type"));
             }
             ResultSet search2 = DB.search("SELECT * FROM employee WHERE employee_id='"+search.getString("employee_id")+"'");
           if(search2.next()){
           v.add(search2.getString("first_name")+" "+search2.getString("last_name"));
           v.add(search2.getString("nic_number"));
           }
           v.add(search.getString("user_name"));
            if(search.getInt("status")==1){
           v.add("Active");
            }else{
           v.add("Inactive");
            }
               
               dtm.addRow(v);
               }
    }catch(Exception e){
    e.printStackTrace();
    }
}
}
