/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import RAF.RAF;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Difunto;
import models.Registro;
import models.Responsable;
import models.Terreno;

/**
 *
 * @author JSLG
 */
public class DialogNuevoRegistro extends javax.swing.JDialog {

    ArrayList<Registro> registros = new ArrayList<Registro>();
    //Registro RG = new Registro("1", "", null, null, null);
    //Arregla el tamaño de esa ventana amor no puedo darle al boton guardar

    public DialogNuevoRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtFecha.setText(FechaActual());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtNoPagina = new javax.swing.JTextField();
        txtApellidoDifunto = new javax.swing.JTextField();
        txtNomResponsable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCedulaResponsable = new javax.swing.JTextField();
        txtDirrecion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPagoTerreno = new javax.swing.JTextField();
        txtPagoCepultura = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNomDifunto = new javax.swing.JTextField();
        txtNoCedulaDifunto = new javax.swing.JFormattedTextField();
        txtFechaDefuncion = new javax.swing.JFormattedTextField();
        txtApellidoResponsable = new javax.swing.JLabel();
        txtAPELLIDOSResponsable = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbDatosGenerales = new javax.swing.JLabel();
        lbDatosDifunto1 = new javax.swing.JLabel();
        lbDatosResponsable = new javax.swing.JLabel();
        lbDatosPago = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("No Pagina:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 30));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 130, 20));

        txtNoPagina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNoPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoPaginaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNoPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, 20));

        txtApellidoDifunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidoDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidoDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 250, 20));

        txtNomResponsable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomResponsableKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 260, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("No Cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Apellidos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Nombres:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("No Cedula:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Dirección:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 30));

        txtCedulaResponsable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCedulaResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedulaResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 200, 20));

        txtDirrecion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtDirrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 560, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Pago de terreno de cepultura:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Pago permiso de cepultura:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 30));

        txtPagoTerreno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPagoTerreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoTerrenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 210, 20));

        txtPagoCepultura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPagoCepultura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoCepulturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoCepultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 210, 20));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 150, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Fecha defunción:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Nombres:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        txtNomDifunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 20));

        txtNoCedulaDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCedulaDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNoCedulaDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 170, 20));

        txtFechaDefuncion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDefuncionKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaDefuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, 20));

        txtApellidoResponsable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtApellidoResponsable.setText("Apellidos:");
        getContentPane().add(txtApellidoResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 30));

        txtAPELLIDOSResponsable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAPELLIDOSResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDOSResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtAPELLIDOSResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 260, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura (4).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbDatosGenerales.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosGenerales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 660, 90));

        lbDatosDifunto1.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosDifunto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosDifunto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Del Difunto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosDifunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 110));

        lbDatosResponsable.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosResponsable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Del Responsable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 660, 150));

        lbDatosPago.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosPago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos De Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 660, 90));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 150, 30));

        setSize(new java.awt.Dimension(716, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoPaginaActionPerformed

    }//GEN-LAST:event_txtNoPaginaActionPerformed

    private void txtCedulaResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaResponsableActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        /*if(ValidacionObligatoria() == false){
            JOptionPane.showMessageDialog(null,"El nombre del responsable es obligatorio","CAMPO OBLIGATORIO",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            Difunto D = new Difunto();
            D.setNombres(txtNomDifunto.getText());
            D.setApellidos(txtApellidoDifunto.getText());
            D.setFechaDefuncion(txtFechaDefuncion.getText());
            D.setNoCedula(txtNoCedulaDifunto.getText());
            Responsable R = new Responsable();
            R.setNombres(txtNomResponsable.getText());
            R.setApellidos(txtAPELLIDOSResponsable.getText());
            R.setDireccion(txtDirrecion.getText());
            R.setNoCedula(txtCedulaResponsable.getText());
            Terreno T = new Terreno();
            String codigo = txtFechaDefuncion.getText() + "-" + (registros.size()+1);
            T.setCodigo(codigo);
            T.setPagoSepultura(Integer.parseInt(txtPagoCepultura.getText()));
            T.setPagoTerreno(Integer.parseInt(txtPagoTerreno.getText()));
            
                    
            Registro RG = new Registro(codigo,"",D,R,T);
            System.out.println(RG.getCodigo());
            registros.add(RG);
            RAF rf = new RAF();
            try {
                rf.guardar(RG);
            } catch (IOException ex) {
                System.out.println("ERROR");
            }
            Limpiar();
        }*/
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtAPELLIDOSResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPELLIDOSResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPELLIDOSResponsableActionPerformed

    private void txtNomDifuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDifuntoKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNomDifuntoKeyTyped

    private void txtNoCedulaDifuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCedulaDifuntoKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtNoCedulaDifuntoKeyTyped

    private void txtApellidoDifuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoDifuntoKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtApellidoDifuntoKeyTyped

    private void txtNomResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomResponsableKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNomResponsableKeyTyped

    private void txtFechaDefuncionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaDefuncionKeyTyped
      soloNumeros(evt);
    }//GEN-LAST:event_txtFechaDefuncionKeyTyped

    private void txtPagoTerrenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoTerrenoKeyTyped
         soloNumeros(evt);
    }//GEN-LAST:event_txtPagoTerrenoKeyTyped

    private void txtPagoCepulturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoCepulturaKeyTyped
         soloNumeros(evt);
    }//GEN-LAST:event_txtPagoCepulturaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(ValidacionObligatoria() == false){
            JOptionPane.showMessageDialog(null,"El nombre del responsable es obligatorio","CAMPO OBLIGATORIO",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            Difunto D = new Difunto();
            D.setNombres(txtNomDifunto.getText());
            D.setApellidos(txtApellidoDifunto.getText());
            D.setFechaDefuncion(txtFechaDefuncion.getText());
            D.setNoCedula(txtNoCedulaDifunto.getText());
            Responsable R = new Responsable();
            R.setNombres(txtNomResponsable.getText());
            R.setApellidos(txtAPELLIDOSResponsable.getText());
            R.setDireccion(txtDirrecion.getText());
            R.setNoCedula(txtCedulaResponsable.getText());
            Terreno T = new Terreno();
            String codigo = txtFechaDefuncion.getText() + "-" + (registros.size()+1);
            T.setCodigo(codigo);
            T.setPagoSepultura(Integer.parseInt(txtPagoCepultura.getText()));
            T.setPagoTerreno(Integer.parseInt(txtPagoTerreno.getText()));
            
                    
            Registro RG = new Registro(codigo,"",D,R,T);
            System.out.println(RG.getCodigo());
            registros.add(RG);
            RAF rf = new RAF();
            try {
                rf.guardar(RG);
            } catch (IOException ex) {
                System.out.println("ERROR");
            }
            Limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogNuevoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogNuevoRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogNuevoRegistro dialog = new DialogNuevoRegistro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

     public boolean ValidacionObligatoria(){
        if(txtNomResponsable.getText().isEmpty() == true || txtAPELLIDOSResponsable.getText().isEmpty() == true){
            
            return false;
        }
        return true;
    
}
    public void Limpiar(){
        txtNomDifunto.setText("");
        txtApellidoDifunto.setText("");
        txtNoCedulaDifunto.setText("");
        txtFechaDefuncion.setText("");
        
        txtNomResponsable.setText("");
        txtAPELLIDOSResponsable.setText("");
        txtDirrecion.setText("");
        txtCedulaResponsable.setText("");
        
        txtPagoTerreno.setText("");
        txtPagoCepultura.setText("");
    }
    
    public void soloLetras(KeyEvent evt){
        if(Character.isLetter(evt.getKeyChar()) != true){
            evt.consume();
        }
    }
    public void soloNumeros(KeyEvent evt){
        if(Character.isDigit(evt.getKeyChar()) != true){
            evt.consume();
        }
    }
    public static String FechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDatosDifunto1;
    private javax.swing.JLabel lbDatosGenerales;
    private javax.swing.JLabel lbDatosPago;
    private javax.swing.JLabel lbDatosResponsable;
    private javax.swing.JTextField txtAPELLIDOSResponsable;
    private javax.swing.JTextField txtApellidoDifunto;
    private javax.swing.JLabel txtApellidoResponsable;
    private javax.swing.JTextField txtCedulaResponsable;
    private javax.swing.JTextField txtDirrecion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JFormattedTextField txtFechaDefuncion;
    private javax.swing.JFormattedTextField txtNoCedulaDifunto;
    private javax.swing.JTextField txtNoPagina;
    private javax.swing.JTextField txtNomDifunto;
    private javax.swing.JTextField txtNomResponsable;
    private javax.swing.JTextField txtPagoCepultura;
    private javax.swing.JTextField txtPagoTerreno;
    // End of variables declaration//GEN-END:variables
}
