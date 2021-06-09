/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import RAF.RAF;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Difunto;
import models.Registro;
import models.Responsable;
import models.Terreno;

/**
 *
 * @author Ervin
 */
public class DialogNuevoRegistro extends javax.swing.JDialog {

    ArrayList<Registro> registros = new ArrayList<Registro>();
    Registro RG = new Registro("1", "", null, null, null);

    public DialogNuevoRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        btnGuardar = new javax.swing.JButton();
        btnSAlir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNomDifunto = new javax.swing.JTextField();
        txtNoCedulaDifunto = new javax.swing.JFormattedTextField();
        txtFechaDefuncion = new javax.swing.JFormattedTextField();
        txtApellidoResponsable = new javax.swing.JLabel();
        txtAPELLIDOSResponsable = new javax.swing.JTextField();
        lbCampoObligatorioFecha = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbCampoObligatorioNoPagina1 = new javax.swing.JLabel();
        lbCampoObligatorioNomR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("No Pagina:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 130, -1));

        txtNoPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoPaginaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNoPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        txtApellidoDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidoDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 240, -1));

        txtNomResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomResponsableKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("No Cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Apellidos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Nombres:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("No Cedula:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Dirección:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtCedulaResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedulaResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 190, 20));
        getContentPane().add(txtDirrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 550, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pago de terreno de cepultura:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Pago permiso de cepultura:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 545, -1, -1));

        txtPagoTerreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoTerrenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 180, 30));

        txtPagoCepultura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoCepulturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoCepultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 180, 30));

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
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 630, 150, 30));

        btnSAlir.setBackground(new java.awt.Color(255, 255, 255));
        btnSAlir.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnSAlir.setForeground(new java.awt.Color(0, 51, 204));
        btnSAlir.setText("SALIR");
        btnSAlir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        btnSAlir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAlirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSAlir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, 160, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Fecha defunción:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nombres:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        txtNomDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 240, -1));

        txtNoCedulaDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCedulaDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNoCedulaDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 160, -1));

        txtFechaDefuncion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDefuncionKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaDefuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 160, -1));

        txtApellidoResponsable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellidoResponsable.setText("Apellidos:");
        getContentPane().add(txtApellidoResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        txtAPELLIDOSResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDOSResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtAPELLIDOSResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 260, -1));

        lbCampoObligatorioFecha.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbCampoObligatorioFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 240, 20));

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 160, 20));

        lbCampoObligatorioNoPagina1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbCampoObligatorioNoPagina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 20));

        lbCampoObligatorioNomR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCampoObligatorioNomR.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lbCampoObligatorioNomR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 160, 20));

        setSize(new java.awt.Dimension(703, 736));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoPaginaActionPerformed

    }//GEN-LAST:event_txtNoPaginaActionPerformed

    private void txtCedulaResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaResponsableActionPerformed

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

    private void btnSAlirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAlirActionPerformed
       dispose();
    }//GEN-LAST:event_btnSAlirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSAlir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbCampoObligatorioFecha;
    private javax.swing.JLabel lbCampoObligatorioNoPagina1;
    private javax.swing.JLabel lbCampoObligatorioNomR;
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
