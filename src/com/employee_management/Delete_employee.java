/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee_management;

import common.CommonM;
import common.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author geeth
 */
public class Delete_employee extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer_Befor_Start
     */
    public Delete_employee() {
        initComponents();
        jScrollPane1.setVisible(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txtNic.setEditable(false);
        txtName.setEditable(false);
        txtAddress.setEditable(false);
        txtPhoneNumber.setEditable(false);
      
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
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        tbnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        list1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                list1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(list1);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 122, 230, 130));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Phone Number");
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 175, 42));

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });
        ReForm.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 359, 43));

        txtNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });
        txtNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNicKeyTyped(evt);
            }
        });
        ReForm.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 360, 43));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Delete From");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, 69));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        ReForm.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 360, 43));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        ReForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 43));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        ReForm.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 360, 43));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Address");
        ReForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 175, 42));

        lbLastName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbLastName.setText("NIC Number");
        ReForm.add(lbLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 175, 42));

        tbnDelete.setBackground(new java.awt.Color(0, 102, 204));
        tbnDelete.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        tbnDelete.setForeground(new java.awt.Color(255, 255, 255));
        tbnDelete.setText("Delete");
        tbnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbnDeleteMouseExited(evt);
            }
        });
        tbnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnDeleteActionPerformed(evt);
            }
        });
        ReForm.add(tbnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 556, 204, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel3.setText("Search");
        ReForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 82, -1, -1));

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
        ReForm.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 82, 230, 40));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 710, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed

    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped

    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        txtPhoneNumber.grabFocus();
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtNicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicKeyTyped

    }//GEN-LAST:event_txtNicKeyTyped

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void tbnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnDeleteMouseEntered
        CommonM.setBlue(tbnDelete);
    }//GEN-LAST:event_tbnDeleteMouseEntered

    private void tbnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbnDeleteMouseExited
        CommonM.setDefaultColor(tbnDelete);
    }//GEN-LAST:event_tbnDeleteMouseExited

    private void tbnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnDeleteActionPerformed
        try {
         if(!txtSearch.getText().equals("")){
             if(!txtNic.getText().equals("")){
        DB.iud("update employee set status='"+"0"+"' where employee_id='"+txtSearch.getText()+"'");
        JOptionPane.showMessageDialog(this, "Delete "+ txtName.getText()+" Member");
        clearFeald();
        this.dispose();
             }else{
               JOptionPane.showMessageDialog(this, "Invalid Employee Id", "Error",JOptionPane.ERROR_MESSAGE); 
               txtSearch.grabFocus();
             }
         }else{
             JOptionPane.showMessageDialog(this, "Error Try Again", "Error",JOptionPane.ERROR_MESSAGE);
             txtSearch.grabFocus();
         }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error Try Again", "Error",JOptionPane.ERROR_MESSAGE); 
           txtSearch.grabFocus();
        }
    }//GEN-LAST:event_tbnDeleteActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked

    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed

    }//GEN-LAST:event_txtSearchKeyPressed

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
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JList<String> list1;
    private javax.swing.JButton tbnDelete;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void searchPro() {
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchDetails() {
        try {
              ResultSet rs=  DB.search("SELECT * FROM employee WHERE employee_id='"+txtSearch.getText().toUpperCase()+"'");
              if(rs.next()){
              txtNic.setText(rs.getString("nic_number"));
              txtName.setText(rs.getString("first_name")+" "+rs.getString("last_name"));
              txtPhoneNumber.setText(rs.getString("phone_number"));
              txtAddress.setText(rs.getString("address_line_01")+","+rs.getString("address_line_02")+","+rs.getString("city"));
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearFeald() {
      txtAddress.setText(null);
      txtName.setText(null);
      txtNic.setText(null);
      txtPhoneNumber.setText(null);
      txtSearch.setText(null);
    }
}
