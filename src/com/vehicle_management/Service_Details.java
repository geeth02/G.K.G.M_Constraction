package com.vehicle_management;

import static common.CommonM.checkNull;
import common.DB;
import common.SystemData;
import java.awt.Color;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author geeth
 */
public class Service_Details extends javax.swing.JFrame {

    /**
     * Creates new form Start_Job
     */
    public Service_Details() {
        initComponents();
        fealdSettings();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    Service_Details(String vehicleId1, String meter) {
        System.out.println(meter);
        initComponents();
        fealdSettings();
        loadData(vehicleId1, meter);
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        ReForm = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        txtRegNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtServiceCharge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiscription = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtLastMeter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNextService = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lbFirstName1 = new javax.swing.JLabel();
        txtServiceDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReForm.setBackground(new java.awt.Color(255, 255, 255));
        ReForm.setOpaque(true);
        ReForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel9.setText("Service Date");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel9KeyPressed(evt);
            }
        });
        ReForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 175, 42));

        txtRegNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRegNumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRegNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegNumberActionPerformed(evt);
            }
        });
        txtRegNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRegNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRegNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegNumberKeyTyped(evt);
            }
        });
        ReForm.add(txtRegNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 450, 43));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Registration Number");
        ReForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 43));

        jLabel5.setBackground(new java.awt.Color(204, 0, 51));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vehicle Service");
        jLabel5.setOpaque(true);
        ReForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 69));

        txtServiceCharge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtServiceCharge.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtServiceCharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServiceChargeMouseReleased(evt);
            }
        });
        txtServiceCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceChargeActionPerformed(evt);
            }
        });
        ReForm.add(txtServiceCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 450, 43));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("Last Meter");
        ReForm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 43));

        lbDate.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbDate.setText("2021-10-09");
        ReForm.add(lbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 310, 42));

        txtDiscription.setColumns(20);
        txtDiscription.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtDiscription.setRows(5);
        txtDiscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtDiscriptionMouseReleased(evt);
            }
        });
        txtDiscription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiscriptionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDiscription);

        ReForm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 450, 150));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Service Charges");
        ReForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 175, 43));

        txtLastMeter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastMeter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLastMeter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtLastMeterMouseReleased(evt);
            }
        });
        txtLastMeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastMeterActionPerformed(evt);
            }
        });
        txtLastMeter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastMeterKeyTyped(evt);
            }
        });
        ReForm.add(txtLastMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 450, 43));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Next Service");
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel11KeyPressed(evt);
            }
        });
        ReForm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 175, 42));

        txtNextService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNextService.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNextService.setOpaque(false);
        txtNextService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNextServiceMouseReleased(evt);
            }
        });
        txtNextService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNextServiceActionPerformed(evt);
            }
        });
        txtNextService.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNextServiceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNextServiceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNextServiceKeyTyped(evt);
            }
        });
        ReForm.add(txtNextService, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 450, 43));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        ReForm.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 450, 43));

        lbFirstName1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbFirstName1.setText("Id");
        ReForm.add(lbFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 42));

        txtServiceDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtServiceDateMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServiceDateMouseReleased(evt);
            }
        });
        ReForm.add(txtServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 450, 40));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setText("discreption");
        ReForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 175, 42));

        lbName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lbName.setText("Created By - Geeth Dilshan");
        ReForm.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, 390, 42));

        jLayeredPane2.add(ReForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegNumberActionPerformed

    }//GEN-LAST:event_txtRegNumberActionPerformed

    private void txtServiceChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceChargeActionPerformed

    }//GEN-LAST:event_txtServiceChargeActionPerformed

    private void txtRegNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNumberKeyReleased

    }//GEN-LAST:event_txtRegNumberKeyReleased

    private void txtRegNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNumberKeyTyped

    }//GEN-LAST:event_txtRegNumberKeyTyped

    private void jLabel9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyPressed

    }//GEN-LAST:event_jLabel9KeyPressed

    private void txtLastMeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastMeterActionPerformed

    }//GEN-LAST:event_txtLastMeterActionPerformed

    private void txtLastMeterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastMeterKeyTyped

    }//GEN-LAST:event_txtLastMeterKeyTyped

    private void txtRegNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegNumberKeyPressed

    }//GEN-LAST:event_txtRegNumberKeyPressed

    private void txtLastMeterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastMeterMouseReleased

    }//GEN-LAST:event_txtLastMeterMouseReleased

    private void txtServiceChargeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServiceChargeMouseReleased

    }//GEN-LAST:event_txtServiceChargeMouseReleased

    private void txtDiscriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscriptionKeyReleased

    }//GEN-LAST:event_txtDiscriptionKeyReleased

    private void txtDiscriptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiscriptionMouseReleased


    }//GEN-LAST:event_txtDiscriptionMouseReleased

    private void jLabel11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11KeyPressed

    private void txtNextServiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNextServiceMouseReleased

    }//GEN-LAST:event_txtNextServiceMouseReleased

    private void txtNextServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNextServiceActionPerformed

    }//GEN-LAST:event_txtNextServiceActionPerformed

    private void txtNextServiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNextServiceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNextServiceKeyPressed

    private void txtNextServiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNextServiceKeyReleased

    }//GEN-LAST:event_txtNextServiceKeyReleased

    private void txtNextServiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNextServiceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNextServiceKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased


    }//GEN-LAST:event_txtIdKeyReleased

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtServiceDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServiceDateMouseClicked


    }//GEN-LAST:event_txtServiceDateMouseClicked

    private void txtServiceDateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServiceDateMouseReleased

    }//GEN-LAST:event_txtServiceDateMouseReleased

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
            java.util.logging.Logger.getLogger(Service_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ReForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbFirstName1;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextArea txtDiscription;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastMeter;
    public static javax.swing.JTextField txtNextService;
    public static javax.swing.JTextField txtRegNumber;
    private javax.swing.JTextField txtServiceCharge;
    private com.toedter.calendar.JDateChooser txtServiceDate;
    // End of variables declaration//GEN-END:variables

    private void fealdSettings() {
        txtDiscription.setEditable(false);
        txtId.setEditable(false);
        txtLastMeter.setEditable(false);
        txtNextService.setEditable(false);
        txtRegNumber.setEditable(false);
        txtServiceCharge.setEditable(false);
        txtServiceDate.setEnabled(false);

    }

    private void loadData(String vehicleId1, String meter) {
        try {
            double lastMeter = 0.0;
            double next = 0.0;
            ResultSet search = DB.search("SELECT * FROM vehicle_service WHERE vehicle_id='" + vehicleId1 + "' AND last_meter='" + meter + "'");
            if (search.next()) {
                txtId.setText(search.getString("vehicle_id"));
                ResultSet search1 = DB.search("SELECT * FROM vehicle WHERE vehicle_id='" + vehicleId1 + "'");
                if (search1.next()) {
                    txtRegNumber.setText(search1.getString("province") + " " + search1.getString("registration_number"));
                }
                txtServiceDate.setDate(search.getDate("service_date"));
                lastMeter = Double.parseDouble(search.getString("last_meter"));
                next = Double.parseDouble(search.getString("next_service"));
                txtNextService.setText(String.valueOf(lastMeter + next));
                txtLastMeter.setText(meter);
                txtServiceCharge.setText("Rs."+search.getString("service_charges"));
                txtDiscription.setText(search.getString("discription"));
                
                
                if(SystemData.getAccountCode().equals("ADM")){
                lbDate.setText(search.getString("data_time"));
                    ResultSet search2 = DB.search("SELECT * FROM employee WHERE employee_id='"+search.getString("added_by")+"'");
                    if(search2.next()){
                    lbName.setText("Create By -"+search.getString("added_by")+"-"+search2.getString("first_name")+" "+search2.getString("last_name"));
                       lbDate.setForeground(Color.black);
                lbName.setForeground(Color.black);
                    }
                
                
                }else{
                lbDate.setText("ADMIN ONLY");
                lbName.setText("ADMIN ONLY");
                lbDate.setForeground(Color.red);
                lbName.setForeground(Color.red);
                
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}