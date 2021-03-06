/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Controllers.UserController;
import models.User;
import java.util.Arrays;

/**
 *
 * @author wsanchez
 */
public class Login extends javax.swing.JFrame {
    UserController uc;
    int xx,yy;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setupController();
    }
    public User getData(){
        User user = new User();
        user.setUserName(this.userNameTextField.getText());
        user.setPassword(Arrays.toString(this.passwordField.getPassword()));
        return user;
    }
    public void setupController(){
        uc = new UserController(this);
        this.loginButton.addActionListener(uc);
        this.cancelButton.addActionListener(uc);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        cancelButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(115, 189, 234));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel3.setText("Constrase??a");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        userNameTextField.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 238, -1));

        passwordField.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 238, -1));

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 255));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancelar.png"))); // NOI18N
        cancelButton.setText("CANCELAR");
        cancelButton.setActionCommand("login.cancel");
        cancelButton.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 50));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_icon.png"))); // NOI18N
        loginButton.setText("ENTRAR");
        loginButton.setActionCommand("login.login");
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_2561496_user_icon_24px.png"))); // NOI18N
        jLabel1.setText("Inicio de sesi??n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 48));

        lblFondo.setBackground(new java.awt.Color(115, 189, 234));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoCeleste.jpg"))); // NOI18N
        lblFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblFondoMouseDragged(evt);
            }
        });
        lblFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblFondoMousePressed(evt);
            }
        });
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, -1, 440));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 360);

        setSize(new java.awt.Dimension(598, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMousePressed
        xx=evt.getX();
        yy= evt.getY();
        
    }//GEN-LAST:event_lblFondoMousePressed

    private void lblFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFondoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_lblFondoMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
