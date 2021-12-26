/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.work_order;

import static com.work_order.End_Job.txtCustomer;
import common.CommonM;
import common.DB;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static com.work_order.Driver_Salery.txtOrderId;
import static com.work_order.Start_Job.txtCustomerId;

/**
 *
 * @author geeth
 */
public class Job_Selection_delete extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer_Befor_Start
     */
    public Job_Selection_delete() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
     public Job_Selection_delete(String customerId) {
        initComponents();
        searchJob(customerId);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        lbFirstName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Select Job Vehicle");
        ReForm.add(lbFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 42));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Job Selection");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 708, 69));

        btnRegister.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Select");
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
        ReForm.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 204, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReForm.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 390, 50));

        jLayeredPane1.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 710, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
      String orderId=jComboBox1.getSelectedItem().toString().split("-")[0];
        System.out.println(orderId);
        searchDetails(orderId);
         
                     
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        CommonM.setDefaultColor(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        CommonM.setBlue(btnRegister);
    }//GEN-LAST:event_btnRegisterMouseEntered

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
            java.util.logging.Logger.getLogger(Job_Selection_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Job_Selection_delete().setVisible(true);
           
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbFirstName;
    // End of variables declaration//GEN-END:variables

    private void searchJob(String customerId) {
        try {
            ResultSet search = DB.search("SELECT * FROM work_order WHERE status=1 AND customer_id='"+customerId+"'");
            while(search.next()){
                ResultSet search1 = DB.search("SELECT * FROM vehicle WHERE vehicle_id='"+search.getString("vehicle_id")+"'");
                if(search1.next()){
            jComboBox1.addItem(search.getString("order_id")+"-"+search1.getString("registration_number")+"("+search.getString("data_time")+")");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchDetails(String orderId) {
        try {
            
            ResultSet search = DB.search("SELECT * FROM work_order WHERE order_id='"+orderId+"'");
            if(search.next()){
            Delete_Order.txtOrderId.setText(search.getString("order_id"));
                ResultSet search2 = DB.search("SELECT * FROM customer WHERE status=1 AND customer_id='" + search.getString("customer_id") + "'");
                  if(search2.next()){
                   Delete_Order.txtCustomerId.setText(search.getString("customer_id")+"-"+search2.getString("first_name")+" "+search2.getString("last_name"));
                  }
                   ResultSet search3 = DB.search("SELECT * FROM vehicle WHERE status=1 AND vehicle_id='" + search.getString("vehicle_id") + "'");
                  if(search3.next()){
                 Delete_Order.txtVehicleNumber.setText(search3.getString("vehicle_id")+"-"+search3.getString("model")+" ("+search3.getString("registration_number")+")");
                  }
                   Delete_Order.txtLastMeter.setText(search.getString("start_meter"));
                  Delete_Order.txtLocation.setText(search.getString("location"));
                  Delete_Order.txtDiscription.setText(search.getString("discription"));
                   driverData(search.getString("order_id"));
            
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  
    }

    private void driverData(String orderId) {
         try {
            ResultSet search = DB.search("SELECT * FROM employee_job WHERE status=1 AND order_id='"+orderId+"'");
                DefaultTableModel dtm = (DefaultTableModel) Delete_Order.tb3.getModel();
                dtm.setRowCount(0);
            while(search.next()){
                Vector v = new Vector();
                v.add(search.getString("employee_id"));
                ResultSet search1 = DB.search("SELECT * FROM employee WHERE employee_id='"+search.getString("employee_id")+"'");
                if(search1.next()){
                v.add(search1.getString("nic_number"));
                v.add(search1.getString("first_name")+" "+search1.getString("last_name"));
                v.add(search1.getString("phone_number"));
                    ResultSet search2 = DB.search("SELECT * FROM employee_type WHERE type_code='"+search1.getString("type_code")+"'");
                    if(search2.next()){
                    v.add(search2.getString("type"));
                    }
                
                }
            dtm.addRow(v);
            this.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    }
    
  
