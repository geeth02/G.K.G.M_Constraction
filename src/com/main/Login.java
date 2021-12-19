package com.main;

import common.SystemData;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import common.DB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        new Thread(new Runnable() {
            @Override
            public void run() {
                load();
            }
        }).start();
        txtUserName.grabFocus();
        jProgressBar1.setVisible(false);
    }

    void load() {
        for (float f = 0; f <= 10; f++) {
            float f1 = f / 10;
            com.sun.awt.AWTUtilities.setWindowOpacity(this, f1);

            try {
                Thread.sleep(80);
            } catch (InterruptedException ex) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        msg = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calisto MT", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System Login");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 570, 70));

        jLayeredPane2.setBackground(new java.awt.Color(0, 102, 204));
        jLayeredPane2.setForeground(new java.awt.Color(0, 102, 204));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 240, 20));

        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 480));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });
        jLayeredPane1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 410, 40));

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel1.setText("Password");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 120, 40));

        btnExit.setBackground(new java.awt.Color(0, 102, 204));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 50, 30));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);
        jLayeredPane1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 570, 20));

        btnLogin.setBackground(new java.awt.Color(0, 102, 204));
        btnLogin.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 140, 50));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 410, 40));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jLabel4.setText("User Name");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        common.CommonM.setBlue(btnLogin);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        common.CommonM.setDefaultColor(btnLogin);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(204, 0, 51));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        txtPassword.grabFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        loginProcess();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        loginProcess();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed


    }//GEN-LAST:event_txtUserNameKeyPressed
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
        } catch (Exception e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void loginProcess() {
        try {
            String userName = txtUserName.getText();
            String password = new String(txtPassword.getPassword());

            String sql = "SELECT * FROM user_account WHERE user_name=? and password=?";
            Connection con = DB.getNewConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, MD5.getMd5(password));
            ResultSet serch = ps.executeQuery();
            if (serch.next()) {
                boolean isActive = serch.getBoolean("status");
                if (isActive) {
                    SystemData.setCurrentUser(userName);
                    SystemData.setUEmployee(serch.getString("employee_id"));
                    SystemData.setAccountCode(serch.getString("account_code"));
                    loadingProgressBar();
                } else {
                    JOptionPane.showMessageDialog(this, "This user inActive");
                    txtUserName.setText(null);
                    txtPassword.setText(null);
                    txtUserName.grabFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid user name or password");
                txtUserName.setText(null);
                txtPassword.setText(null);
                txtUserName.grabFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadingProgressBar() {
        jProgressBar1.setVisible(true);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        jProgressBar1.setValue(i);
                        if (i == 5) {
                            msg.setText("Database Chexking...!");
                            Connection newConnection = DB.getNewConnection();
                            if (newConnection == null) {
                                break;
                            }
                        }
                        if (i >= 20 && i <= 30) {
                            msg.setText("DB Connected");
                            Thread.sleep(100);
                            continue;
                        }
                        if (i == 100) {
                            new Main_Menu().setVisible(true);
                            dispose();
                        }
                        Thread.sleep(20);
                    }
                } catch (Exception e) {
                }
            }
        });
        t.start();
    }

}
