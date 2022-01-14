/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author geeth
 */
public class CommonM {

    public static void setBlue(JButton button) {
        button.setBackground(Color.BLUE);
    }

    public static void setDefaultColor(JButton button) {
        button.setBackground(new Color(0, 102, 204));
    }

    public static void setFullScreen(JFrame a) {
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void tableSettings(JTable tb1) {
        tb1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 17));
        tb1.getTableHeader().setOpaque(false);
        tb1.getTableHeader().setBackground(Color.white);
        tb1.getTableHeader().setForeground(Color.BLACK);
        tb1.setBackground(new Color(253, 253, 253));
        tb1.setRowHeight(50);
        tb1.setFont(new Font("Arial", Font.BOLD, 15));
        hederCenter(tb1);
        dataCenter(tb1);
    }

    public static void tableSettingSm(JTable tb1) {
        tb1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 17));
        tb1.getTableHeader().setOpaque(false);
        tb1.getTableHeader().setBackground(Color.white);
        tb1.getTableHeader().setForeground(Color.BLACK);
        tb1.setBackground(new Color(253, 253, 253));
        tb1.setRowHeight(30);
        tb1.setFont(new Font("Arial", Font.BOLD, 15));
        hederCenter(tb1);
        dataCenter(tb1);

    }

    public static void checkNull(JTextField text, String name, JTextField grab) {
        if (!text.getText().trim().equals("")) {
            text.setBorder(BorderFactory.createLineBorder(Color.decode("#cccccc")));
            grab.grabFocus();
        } else {
            text.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            
        }
    }
    public static void colorBack(JTextField text){
     text.setBorder(BorderFactory.createLineBorder(Color.decode("#cccccc")));
    }

    private static void hederCenter(JTable tb1) {

        TableCellRenderer rendererFromHeader = tb1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    private static void dataCenter(JTable tb1) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < tb1.getColumnCount(); x++) {
            tb1.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }
     public static void frameIcan(JFrame frame) {
         try {
            Image icone =Toolkit.getDefaultToolkit().getImage("sd.jpg");
            frame.setIconImage(icone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
