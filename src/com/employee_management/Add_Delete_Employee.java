/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee_management;

import com.customer_management.*;
import common.CommonM;
import common.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author geeth
 */
public class Add_Delete_Employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer_Befor_Start
     */
    public Add_Delete_Employee() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jScrollPane1.setVisible(false);
        this.setResizable(false);
        txtFname.setEditable(false);
        txtLname.setEditable(false);
        txtType.setEditable(false);
        txtPhoneNumber.setEditable(false);
        txtAddressLine1.setEditable(false);
        txtAddressLine2.setEditable(false);
        txtCity.setEditable(false);
        txtBirthDay.setEnabled(false);
        redioMale.setEnabled(false);
        redioFemale.setEnabled(false);
        txtNicNumber.setEditable(false);
    }

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
        ReForm = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        redioFemale = new javax.swing.JRadioButton();
        redioMale = new javax.swing.JRadioButton();
        lbGender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        btnUpdte = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBirthDay = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNicNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        list1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                list1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 300, 140));

        buttonGroup1.add(redioFemale);
        redioFemale.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        redioFemale.setText("Female");
        ReForm.add(redioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 632, -1, -1));

        buttonGroup1.add(redioMale);
        redioMale.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        redioMale.setSelected(true);
        redioMale.setText("Male");
        ReForm.add(redioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 635, 125, 41));

        lbGender.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbGender.setText("Gender");
        ReForm.add(lbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 632, 175, 43));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("NIC Number");
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 208, 175, 42));

        txtType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtType.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        txtType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTypeKeyTyped(evt);
            }
        });
        ReForm.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 440, 43));

        txtLname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLnameKeyTyped(evt);
            }
        });
        ReForm.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 317, 440, 43));

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("First Name");
        ReForm.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 261, 155, 42));

        txtFname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFnameKeyTyped(evt);
            }
        });
        ReForm.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 264, 440, 43));

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
        });
        ReForm.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 300, 43));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Employee Id");
        ReForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 175, 43));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add Delete Employee");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 69));

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        ReForm.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 367, 440, 43));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Phone Number");
        ReForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 367, -1, 43));

        txtAddressLine1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressLine1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine1ActionPerformed(evt);
            }
        });
        txtAddressLine1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressLine1KeyTyped(evt);
            }
        });
        ReForm.add(txtAddressLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 476, 440, 43));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Address Line 01");
        ReForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 473, 175, 42));

        lbLastName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbLastName.setText("Last Name");
        ReForm.add(lbLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 314, 175, 42));

        btnUpdte.setBackground(new java.awt.Color(0, 102, 204));
        btnUpdte.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        btnUpdte.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdte.setText("Add");
        btnUpdte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdteMouseExited(evt);
            }
        });
        btnUpdte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdteActionPerformed(evt);
            }
        });
        ReForm.add(btnUpdte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 204, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Birthday");
        ReForm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 417, 148, 43));

        txtBirthDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBirthDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBirthDayMouseClicked(evt);
            }
        });
        txtBirthDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBirthDayKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBirthDayKeyReleased(evt);
            }
        });
        ReForm.add(txtBirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 417, 440, 43));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel14.setText("Address Line 02");
        ReForm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 526, 175, 42));

        txtAddressLine2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddressLine2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddressLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine2ActionPerformed(evt);
            }
        });
        txtAddressLine2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressLine2KeyTyped(evt);
            }
        });
        ReForm.add(txtAddressLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 529, 440, 43));

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCityKeyTyped(evt);
            }
        });
        ReForm.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 582, 440, 43));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel15.setText("City");
        ReForm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 579, 175, 42));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel10.setText("Type");
        ReForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 159, 175, 42));

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
        ReForm.add(txtNicNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 211, 440, 43));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 780, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed

    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeKeyTyped

    }//GEN-LAST:event_txtTypeKeyTyped

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        txtType.grabFocus();
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyTyped

    }//GEN-LAST:event_txtLnameKeyTyped

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        txtLname.grabFocus();
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyTyped

    }//GEN-LAST:event_txtFnameKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        txtFname.grabFocus();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAddressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1ActionPerformed

    private void txtAddressLine1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1KeyTyped

    private void btnUpdteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdteMouseEntered
        CommonM.setBlue(btnUpdte);
    }//GEN-LAST:event_btnUpdteMouseEntered

    private void btnUpdteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdteMouseExited
        CommonM.setDefaultColor(btnUpdte);
    }//GEN-LAST:event_btnUpdteMouseExited

    private void btnUpdteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdteActionPerformed
        updateDetails();
    }//GEN-LAST:event_btnUpdteActionPerformed

    private void txtBirthDayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBirthDayMouseClicked

    }//GEN-LAST:event_txtBirthDayMouseClicked

    private void txtBirthDayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthDayKeyPressed

    }//GEN-LAST:event_txtBirthDayKeyPressed

    private void txtBirthDayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthDayKeyReleased

    }//GEN-LAST:event_txtBirthDayKeyReleased

    private void txtAddressLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine2ActionPerformed

    private void txtAddressLine2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressLine2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine2KeyTyped

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityKeyTyped

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if(evt.getKeyCode()!=10){
              searchPro();
        }
        
         if(evt.getKeyCode()==40){
        list1.setSelectedIndex(0);
        list1.grabFocus();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
         if(evt.getClickCount()==2){
            txtSearch.setText(list1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);
            searchDetails();

        }
    }//GEN-LAST:event_list1MouseClicked

    private void txtNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicNumberActionPerformed

    private void txtNicNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicNumberKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicNumberKeyTyped

    private void list1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_list1KeyPressed
                   if(evt.getKeyCode()==10){
            txtSearch.setText(list1.getSelectedValue().split("-")[0]);
            jScrollPane1.setVisible(false);
            searchDetails();

        }
    }//GEN-LAST:event_list1KeyPressed

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
            java.util.logging.Logger.getLogger(Add_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Delete_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Delete_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnUpdte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JList<String> list1;
    private javax.swing.JRadioButton redioFemale;
    private javax.swing.JRadioButton redioMale;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private com.toedter.calendar.JDateChooser txtBirthDay;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNicNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
    private void searchPro() {
        try {
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
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error While Searching System", "Dialog",JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void searchDetails() {
        try {
              ResultSet rs=  DB.search("SELECT * FROM employee WHERE employee_id='"+txtSearch.getText().toUpperCase()+"'");
              if(rs.next()){
                ResultSet search1 = DB.search("SELECT * FROM employee_type WHERE type_code='"+rs.getString("type_code")+"'");
               if(search1.next()){
               txtType.setText(search1.getString("type"));
               }
              txtNicNumber.setText(rs.getString("nic_number"));
              txtFname.setText(rs.getString("first_name"));
              txtLname.setText(rs.getString("last_name"));
              txtPhoneNumber.setText(rs.getString("phone_number"));
              txtBirthDay.setDate(rs.getDate("birthday"));
              txtAddressLine1.setText(rs.getString("address_line_01"));
              txtAddressLine2.setText(rs.getString("address_line_02"));
              txtCity.setText(rs.getString("city"));
              
              if(rs.getString("gender")=="MALE"){
              redioMale.setSelected(true);
              }else{
              redioFemale.setSelected(true);
              }
            
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateDetails() {
        try {
            ResultSet search = DB.search("SELECT * FROM employee WHERE employee_id='"+txtSearch.getText()+"'");
            if(search.next()){
          DB.iud("update employee set status='"+"1"+"' where employee_id='"+txtSearch.getText()+"'");
          clearFeald();
         JOptionPane.showMessageDialog(this," successfull");
            }else{
            JOptionPane.showMessageDialog(this, "Invalid Employee Id", "Error",JOptionPane.ERROR_MESSAGE); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error Try Again", "Error",JOptionPane.ERROR_MESSAGE); 
        }
    }

    private void clearFeald() {
      txtAddressLine1.setText(null);
      txtAddressLine2.setText(null);
      txtBirthDay.setDate(null);
      txtCity.setText(null);
      txtFname.setText(null);
      txtLname.setText(null);
      txtLname.setText(null);
      txtNicNumber.setText(null);
      txtPhoneNumber.setText(null);
      txtSearch.setText(null);
      txtType.setText(null);
      
      redioMale.isSelected();
      
    }

}
