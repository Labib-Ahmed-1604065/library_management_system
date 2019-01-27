/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.pkgfor.java.lab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author L
 */
public class LibraryManagementForJAVALab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Process process1 = Runtime.getRuntime().exec("G:\\xampp\\xampp_start.exe");
            Process process2 = Runtime.getRuntime().exec("G:\\xampp\\mysql\\bin\\mysqld.exe");
        } catch (IOException ex) {
            Logger.getLogger(LibraryManagementForJAVALab.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        LogIn li = new LogIn();
        li.setVisible(true);
    }

}
