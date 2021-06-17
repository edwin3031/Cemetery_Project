/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Frame;
import models.KeyChain;
import views.Login;
import views.FirstUserForm;
import javax.swing.ImageIcon;
import views.Principal;


/**
 *
 * @author Sistemas-14
 */
public class Main {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

              KeyChain kc = new KeyChain();
              kc.init();
              if(kc.getSize()>0){
                showLoginForm();
              }
              else{
                showFirstUserForm();
              }
              
        });
    }
    public static void showMainForm(){
        //Inicio init = new Inicio();
        //init.setVisible(true);
        
        Principal mf =new Principal();
        mf.setIconImage(new ImageIcon(Main.class.getResource("/images/app.png")).getImage());
        //mf.setExtendedState(Frame.MAXIMIZED_BOTH);
        mf.setVisible(true);
    }
    public static void showLoginForm(){
        Login l= new Login();
        l.setIconImage(new ImageIcon(Main.class.getResource("/images/login_icon.png")).getImage());
        l.setLocationRelativeTo(null);
        l.setVisible(true);        
    }
    public static void showFirstUserForm(){
        FirstUserForm uf  = new FirstUserForm();
        uf.setIconImage(new ImageIcon(Main.class.getResource("/images/user_icon.png")).getImage());
        uf.setLocationRelativeTo(null);
        uf.setVisible(true);       
    }
}
