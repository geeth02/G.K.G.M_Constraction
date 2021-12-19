/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.customer_management;

import com.work_order.Start_Job;
import common.CommonM;
import common.DB;
import common.SystemData;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author geeth
 */
public class Add_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer_Befor_Start
     */
    public Add_Customer() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        generateCuId();
        txtNicNumber.grabFocus();
       
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
        redioFemale = new javax.swing.JRadioButton();
        redioMale = new javax.swing.JRadioButton();
        lbGender = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNicNumber = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtReId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(830, 839));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);

        buttonGroup1.add(redioFemale);
        redioFemale.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        redioFemale.setText("Female");

        buttonGroup1.add(redioMale);
        redioMale.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        redioMale.setSelected(true);
        redioMale.setText("Male");

        lbGender.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbGender.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("NIC Number");

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

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("First Name");

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

        txtReId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtReId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtReId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Customer Id");

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registation Form");
        jLabel5.setOpaque(true);

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Phone Number");

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

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("Address");

        lbLastName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbLastName.setText("Last Name");

        btnRegister.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
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

        ReForm.setLayer(redioFemale, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(redioMale, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(lbGender, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtNicNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtLname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(lbFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtFname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtReId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtPhoneNumber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(txtAddress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(lbLastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(btnRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ReFormLayout = new javax.swing.GroupLayout(ReForm);
        ReForm.setLayout(ReFormLayout);
        ReFormLayout.setHorizontalGroup(
            ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReFormLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReFormLayout.createSequentialGroup()
                        .addComponent(lbFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1209, 1209, 1209))
                    .addGroup(ReFormLayout.createSequentialGroup()
                        .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReFormLayout.createSequentialGroup()
                                .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(redioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(redioFemale))
                            .addGroup(ReFormLayout.createSequentialGroup()
                                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ReFormLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReFormLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReId, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ReFormLayout.createSequentialGroup()
                        .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ReFormLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ReFormLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ReFormLayout.setVerticalGroup(
            ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReFormLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redioFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnRegister)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 710, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicNumberActionPerformed
        txtFname.grabFocus();
    }//GEN-LAST:event_txtNicNumberActionPerformed

    private void txtNicNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNicNumberKeyTyped

    }//GEN-LAST:event_txtNicNumberKeyTyped

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        txtPhoneNumber.grabFocus();
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyTyped

    }//GEN-LAST:event_txtLnameKeyTyped

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        txtLname.grabFocus();
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyTyped

    }//GEN-LAST:event_txtFnameKeyTyped

    private void txtReIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReIdActionPerformed
        txtFname.grabFocus();
    }//GEN-LAST:event_txtReIdActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
      txtAddress.grabFocus();
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        CommonM.setBlue(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        CommonM.setDefaultColor(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        addDB();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        

    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JRadioButton redioFemale;
    private javax.swing.JRadioButton redioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNicNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtReId;
    // End of variables declaration//GEN-END:variables

    private void addDB() {
        try {
            ResultSet search = DB.search("SELECT * FROM customer WHERE nic_number='"+txtNicNumber.getText()+"'");
            if(search.next()){
             JOptionPane.showMessageDialog(this," Allready Registered this cusmomer");
            }else{
            String gender;
                if(redioMale.isSelected()){
                    gender="Male";
                }else{
                    gender="Female";
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dataTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

                DB.iud("INSERT INTO customer VALUES('"+txtReId.getText()+"','"+txtNicNumber.getText()+"','"+txtFname.getText().toUpperCase()+"','"+txtLname.getText().toUpperCase()+"',"
                        + "'"+txtPhoneNumber.getText()+"','"+gender.toUpperCase()+"','"+txtAddress.getText().toUpperCase()+"','"+SystemData.getemployee()+"','"+dataTime+"','"+1+"')");
                clearFealds();
                JOptionPane.showMessageDialog(this," successfull"); 
            }
            
            
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        private void generateCuId() {
              try {
            ResultSet rs = DB.search("select count(customer_id) as x from customer");
            if(rs.next()){
                String counts = rs.getString("x");
                int count = Integer.parseInt(counts);
               ++count;
                if(count<10){
                txtReId.setText("CN00000"+count);
                txtReId.setEditable(false);
                }else if(count<100){
                 txtReId.setText("CN0000"+count);
                txtReId.setEditable(false);
                }else if(count<1000){
                txtReId.setText("CN000"+count);
                txtReId.setEditable(false);
                }else if(count<10000){
                txtReId.setText("CN00"+count);
                txtReId.setEditable(false);
                }else if(count<100000){
                txtReId.setText("CN0"+count);
                txtReId.setEditable(false);
                }else if(count<1000000){
                txtReId.setText("CN"+count);
                txtReId.setEditable(false);
                }
            }
            txtFname.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void clearFealds() {
       txtFname.setText(null);
       txtAddress.setText(null);
       txtLname.setText(null);
       txtNicNumber.setText(null);
       txtPhoneNumber.setText(null);
       txtReId.setText(null);
       generateCuId();
    }
}
