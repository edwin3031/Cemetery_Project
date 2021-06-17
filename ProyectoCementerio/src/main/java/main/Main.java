/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.KeyChain;
import views.Login;
import views.DialogPrincipal;
import views.FirstUserForm;
import java.awt.Frame;
import javax.swing.ImageIcon;


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
            java.util.logging.Logger.getLogger(DialogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        DialogPrincipal mf =new DialogPrincipal(new javax.swing.JFrame(), true);
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
