/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import main.Main;
import models.KeyChain;
import views.Login;
import views.FirstUserForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author wsanchez
 */
public class UserController implements ActionListener{
    private Login login;
    private FirstUserForm firstUserForm;
    private KeyChain keyChain;

    public UserController(Login login) {
        this.login = login;
        keyChain = new KeyChain();
        keyChain.init();
    }

    public UserController(FirstUserForm firstUserForm) {
        this.firstUserForm = firstUserForm;
        keyChain = new KeyChain();
        keyChain.init();
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "login.login":
                login();
                break;
            case "login.cancel":
                this.login.dispose();
                break;
            case "firstuserform.save":
                saveFirstUser();
                break;
            case "firstuserform.cancel":
                this.firstUserForm.dispose();
                break;
                
        }
    }
    
    public void saveFirstUser(){
        keyChain.add(this.firstUserForm.getData());
        if(keyChain.save()){
            JOptionPane.showMessageDialog(firstUserForm, "Tu cuenta ha sido registrada correctamente. Ahora usa tus datos para iniciar sesión.", "Registrar", JOptionPane.INFORMATION_MESSAGE);
            this.firstUserForm.dispose();
            Main.showLoginForm();
        }
        else{
            JOptionPane.showMessageDialog(firstUserForm, "El usuario no pudo ser registrado.", "Registrar", JOptionPane.ERROR_MESSAGE);
        }        
    }
    public void login(){
        if(keyChain.isAuthorized(this.login.getData())){
            this.login.dispose();
            Main.showMainForm();
        }
        else
        {
            JOptionPane.showMessageDialog(login, "El intento de inicio de sesión ha fallado.", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }
}
