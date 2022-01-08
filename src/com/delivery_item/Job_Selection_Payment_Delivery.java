/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.delivery_item;



import static com.delivery_item.Delivery_Payment.*;
import common.CommonM;
import common.DB;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geeth
 */
public class Job_Selection_Payment_Delivery extends javax.swing.JFrame {

    /**
     * Creates new form Add_Customer_Befor_Start
     */
    public Job_Selection_Payment_Delivery() {
        initComponents();
        addJob();
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

        lbFirstName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName.setText("Select Job Vehicle");

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Job Selection");
        jLabel5.setOpaque(true);

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

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ReForm.setLayer(lbFirstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(btnRegister, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ReForm.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ReFormLayout = new javax.swing.GroupLayout(ReForm);
        ReForm.setLayout(ReFormLayout);
        ReFormLayout.setHorizontalGroup(
            ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReFormLayout.createSequentialGroup()
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(ReFormLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ReFormLayout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReFormLayout.setVerticalGroup(
            ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReFormLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(ReFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnRegister))
        );

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
        searchNic();
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
            java.util.logging.Logger.getLogger(Job_Selection_Payment_Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_Payment_Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_Payment_Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Job_Selection_Payment_Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Job_Selection_Payment_Delivery().setVisible(true);

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

    private void addJob() {
      //  if (Paymets.comboSearch.getSelectedItem().equals("NIC Number")) {
            try {
                String search = Delivery_Payment.jList1.getSelectedValue().split("-")[0];
                ResultSet search1 = DB.search("SELECT * FROM delivery_order WHERE customer_id='" + search + "'");
                while (search1.next()) {
                        String date = search1.getString("data_time").split("-")[0] + "-" + search1.getString("data_time").split("-")[1] + "-" + search1.getString("data_time").split("-")[2] + ")";
                        jComboBox1.addItem(search1.getString("order_id") + "-" + "(Date:" + date);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
       // }
    }

    private void searchNic() {
        try {
              String search=jComboBox1.getSelectedItem().toString().split("-")[0];

                 Delivery_Payment.txtOrderId.setText(search);
                       ResultSet search7 = DB.search("SELECT * FROM customer where customer_id='"+Delivery_Payment.jList1.getSelectedValue().split("-")[0]+"' AND status=1");
                       if(search7.next()){
                        Delivery_Payment.txtSearch.setText(search7.getString("nic_number"));
                      Delivery_Payment.txtCustomer.setText(search7.getString("customer_id")+"-"+search7.getString("first_name")+" "+search7.getString("last_name"));
                       }
                     ResultSet search5 = DB.search("SELECT * FROM payment where order_id='"+search+"' AND status=1");
                    DefaultTableModel dtm =(DefaultTableModel) Delivery_Payment.tb1.getModel();
                    dtm.setRowCount(0);
                    while(search5.next()){
                    Vector v = new Vector();
                    v.add(search5.getString("payment_id"));
                    v.add(search5.getString("amount"));
                    v.add(search5.getString("data_time"));
                    dtm.addRow(v);
                    }
                       calculate();
                       avPayment();
                     Delivery_Payment.txtAmount.grabFocus();    
                  Delivery_Payment.jScrollPane1.setVisible(false);
                  this.dispose();
                  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      private  void calculate() {
        double pAmount=0;
        for(int row =0; row < Delivery_Payment.tb1.getRowCount();row++){
            String pAmount1=Delivery_Payment.tb1.getValueAt(row, 1).toString().trim();
            double pAmount2=Double.parseDouble(pAmount1);
            pAmount=pAmount+pAmount2;
            System.out.println(pAmount);
           }
             String setValue=String.valueOf(pAmount);
            BigDecimal bd = new BigDecimal( setValue ) ;
            DecimalFormat formatterBd = new DecimalFormat( "##.00" );
            Delivery_Payment.txtCustomerPayment.setText(formatterBd.format( bd ) );
   }


   
    private void avPayment() {
           try {
              ResultSet search = DB.search("SELECT * FROM rent_order WHERE order_id='"+Delivery_Payment.txtOrderId.getText()+"' AND status=0");
              if(search.next()){
                  double amount=0.00;
                  double value=0.00;
               ResultSet search1 = DB.search("SELECT * FROM rent_item_payment WHERE order_id='"+Delivery_Payment.txtOrderId.getText()+"'");
               while(search1.next()){
                   value=search1.getDouble("amount");
                   amount=amount+value;
               }
         
                  
             Delivery_Payment.txtNetAmount.setText(String.valueOf(amount-Double.parseDouble(Delivery_Payment.txtCustomerPayment.getText())));
              if(amount==Double.parseDouble(Delivery_Payment.txtCustomerPayment.getText())){
                txtAmount.setEditable(false);
                txtPayment.setEditable(false);
                btnClear.setVisible(true);
                btnPay.setEnabled(false);
                txtPaymentId.setText("Complete Payment");
                txtPaymentId.setForeground(Color.red);
                txtbalance.setEditable(false);
                txtSearch.setEditable(false);
                JOptionPane.showMessageDialog(this,"All payments are Seccessful. View only Report");  
              }else{
               JOptionPane.showMessageDialog(this,"Total bill amount is Rs."+amount);
              }
              }else{
              txtNetAmount.setText("Panding Payments...........");
              }

          } catch (Exception e) {
              e.printStackTrace();
          }
    }
}
