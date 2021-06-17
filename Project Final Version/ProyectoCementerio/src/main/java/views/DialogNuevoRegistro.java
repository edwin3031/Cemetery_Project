/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import RAF.RAF;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    RAF raf = new RAF();
    List<Registro> registros = new ArrayList<Registro>();
    int xx,yy;
    int indice=0;
    //Registro RG = new Registro("1", "", null, null, null);
    //Arregla el tamaño de esa ventana amor no puedo darle al boton guardar

    public DialogNuevoRegistro(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        txtFecha.setText(FechaActual());
        btnActualizar.setVisible(false);
        registros = raf.vertodo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtApellidoDifunto = new javax.swing.JTextField();
        txtNomResponsable = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtCedulaResponsable = new javax.swing.JFormattedTextField();
        txtDirecion = new javax.swing.JTextField();
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
        lblApellidos = new javax.swing.JLabel();
        txtApellidosResponsable = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lbDatosResponsable = new javax.swing.JLabel();
        lbDatosDifunto1 = new javax.swing.JLabel();
        lbDatosPago = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Fecha registro:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, 20));

        txtApellidoDifunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidoDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidoDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 30));

        txtNomResponsable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomResponsableKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("No Cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Apellidos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Nombres:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("No Cedula:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Dirección:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 170, 30));

        try {
            txtCedulaResponsable.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCedulaResponsable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedulaResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedulaResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 170, 30));

        txtDirecion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 570, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Pago de terreno de sepultura:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Pago permiso de sepultura:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 30));

        txtPagoTerreno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPagoTerreno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoTerrenoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 210, 30));

        txtPagoCepultura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPagoCepultura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoCepulturaActionPerformed(evt);
            }
        });
        txtPagoCepultura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoCepulturaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPagoCepultura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 210, 30));

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 204));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 150, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Fecha defunción:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Nombres:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        txtNomDifunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNomDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, 30));

        try {
            txtNoCedulaDifunto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNoCedulaDifunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNoCedulaDifunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCedulaDifuntoKeyTyped(evt);
            }
        });
        getContentPane().add(txtNoCedulaDifunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 170, 30));

        try {
            txtFechaDefuncion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaDefuncion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaDefuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDefuncionActionPerformed(evt);
            }
        });
        txtFechaDefuncion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaDefuncionKeyTyped(evt);
            }
        });
        getContentPane().add(txtFechaDefuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, 30));

        lblApellidos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblApellidos.setText("Apellidos:");
        getContentPane().add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        txtApellidosResponsable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellidosResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosResponsableActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidosResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 260, 30));

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura (4).png"))); // NOI18N
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbDatosResponsable.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosResponsable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosResponsable.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Del Responsable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 680, 170));

        lbDatosDifunto1.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosDifunto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosDifunto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos Del Difunto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosDifunto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 110));

        lbDatosPago.setBackground(new java.awt.Color(255, 255, 255));
        lbDatosPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDatosPago.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Datos De Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 13), new java.awt.Color(0, 0, 255))); // NOI18N
        getContentPane().add(lbDatosPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 680, 110));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 204));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 150, 30));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 204));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 150, 30));

        setSize(new java.awt.Dimension(700, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
       
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtApellidosResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosResponsableActionPerformed

    private void txtNomDifuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomDifuntoKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNomDifuntoKeyTyped

    private void txtNoCedulaDifuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCedulaDifuntoKeyTyped
        //soloNumeros(evt);
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
        if (ValidacionObligatoria() == false) {
            JOptionPane.showMessageDialog(null, "El nombre del responsable es obligatorio", "CAMPO OBLIGATORIO", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                if(validarFechaMayor(txtFechaDefuncion.getText())==false){
                    JOptionPane.showMessageDialog(null, "La fecha es invalida", "ERROR DE FECHA", JOptionPane.ERROR_MESSAGE);
                }else{
                    Difunto D = new Difunto();
                D.setNombres(txtNomDifunto.getText());
                D.setApellidos(txtApellidoDifunto.getText());
                StringBuilder fechaDefuncion = new StringBuilder(txtFechaDefuncion.getText());
                fechaDefuncion.deleteCharAt(2);
                fechaDefuncion.deleteCharAt(4);
                D.setFechaDefuncion(txtFechaDefuncion.getText());
                D.setNoCedula(txtNoCedulaDifunto.getText());
                Responsable R = new Responsable();
                R.setNombres(txtNomResponsable.getText());
                R.setApellidos(txtApellidosResponsable.getText());
                R.setDireccion(txtDirecion.getText());
                R.setNoCedula(txtCedulaResponsable.getText());
                Terreno T = new Terreno();
                String codigo = fechaDefuncion + "-" + (registros.size() + 1);
                T.setCodigo(codigo);
                T.setPagoSepultura(Integer.parseInt(txtPagoCepultura.getText()));
                T.setPagoTerreno(Integer.parseInt(txtPagoTerreno.getText()));
                
                Registro RG = new Registro(codigo, "", D, R, T);
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
                
            } catch (ParseException ex) {
                Logger.getLogger(DialogNuevoRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPagoCepulturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoCepulturaActionPerformed
        
    }//GEN-LAST:event_txtPagoCepulturaActionPerformed

    private void txtFechaDefuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDefuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaDefuncionActionPerformed

    private void txtCedulaResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaResponsableActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            registros.get(indice).getPersonaDifunto().setNombres(txtNomDifunto.getText());
            registros.get(indice).getPersonaDifunto().setApellidos(txtApellidoDifunto.getText());
            registros.get(indice).getPersonaDifunto().setNoCedula(txtNoCedulaDifunto.getText());
            //registros.get(indice).getPersonaDifunto().setFechaDefuncion(txtFechaDefuncion.getText());
            registros.get(indice).getPersonaResponsable().setNombres(txtNomResponsable.getText());
            registros.get(indice).getPersonaResponsable().setApellidos(txtApellidosResponsable.getText());
            registros.get(indice).getPersonaResponsable().setDireccion(txtDirecion.getText());
            registros.get(indice).getPersonaResponsable().setNoCedula(txtCedulaResponsable.getText());
            registros.get(indice).getTierra().setPagoTerreno(Integer.parseInt(txtPagoTerreno.getText()));
            registros.get(indice).getTierra().setPagoSepultura(Integer.parseInt(txtPagoCepultura.getText()));
            //StringBuffer codigoActualizar = new StringBuffer(registros.get(indice).getCodigo());
            //StringBuilder fechaDefuncion = new StringBuilder(txtFechaDefuncion.getText());
            //fechaDefuncion.deleteCharAt(2);
            //fechaDefuncion.deleteCharAt(4);
            //codigoActualizar.replace(0,8,fechaDefuncion+"");
            //registros.get(indice).setCodigo(codigoActualizar+"");
            raf.actualizar(registros.get(indice));
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(DialogNuevoRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
    
    public boolean validarFechaMayor(String validar) throws ParseException{
        //Date fechaactual = new Date(System.currentTimeMillis());
        //String fechaInicio = "2008-01-12"; //fecha de ejemplo
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");
        Date fechaValidar = date.parse(validar);  //String a date
        
        
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        String fechaActual =formatoFecha.format(fecha);
        Date fechaAct = formatoFecha.parse(fechaActual);

        //comprueba si es que inicio esta después que fecha actual       
        if (fechaValidar.after(fechaAct) == true) {
            return false;
        } else {
            return true;
}
    }
    public void MostrarInfo(int index){
        btnGuardar.setVisible(false);
        btnActualizar.setVisible(true);
        txtFechaDefuncion.setEnabled(false);
        txtNomDifunto.setText(registros.get(index).getPersonaDifunto().getNombres());
        txtApellidoDifunto.setText(registros.get(index).getPersonaDifunto().getApellidos());
        txtNoCedulaDifunto.setText(registros.get(index).getPersonaDifunto().getNoCedula());
        txtFechaDefuncion.setText(registros.get(index).getPersonaDifunto().getFechaDefuncion());
        txtNomResponsable.setText(registros.get(index).getPersonaResponsable().getNombres());
        txtApellidosResponsable.setText(registros.get(index).getPersonaResponsable().getApellidos());
        txtDirecion.setText(registros.get(index).getPersonaResponsable().getDireccion());
        txtCedulaResponsable.setText(registros.get(index).getPersonaResponsable().getNoCedula());
        txtPagoTerreno.setText(String.valueOf(registros.get(index).getTierra().getPagoTerreno()));
        txtPagoCepultura.setText(String.valueOf(registros.get(index).getTierra().getPagoSepultura()));
        
        indice = index;
        
    }
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
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
        }*/
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //DialogNuevoRegistro dialog = new DialogNuevoRegistro(new javax.swing.JFrame(), true);
                //dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    //@Override
                    //public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    //}
                //});
                //dialog.setVisible(true);
            //}
        //});
    //}

    public boolean ValidacionObligatoria() {
        if (txtNomResponsable.getText().isEmpty() == true || txtApellidosResponsable.getText().isEmpty() == true) {

            return false;
        }
        return true;

    }

    public void Limpiar() {
        txtNomDifunto.setText("");
        txtApellidoDifunto.setText("");
        txtNoCedulaDifunto.setText("");
        txtFechaDefuncion.setText("");

        txtNomResponsable.setText("");
        txtApellidosResponsable.setText("");
        txtDirecion.setText("");
        txtCedulaResponsable.setText("");
        txtPagoTerreno.setText("");
        txtPagoCepultura.setText("");
    }

    public void soloLetras(KeyEvent evt) {
        if (Character.isLetter(evt.getKeyChar()) != true && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    public void soloNumeros(KeyEvent evt) {
        if (Character.isDigit(evt.getKeyChar()) != true) {
            evt.consume();
        }
    }

    public static String FechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    /*
    public static String ValidarFecha(String texto){
        return texto.matches("(0?[1-9])[\\/] [\\/] ()");
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbDatosDifunto1;
    private javax.swing.JLabel lbDatosPago;
    private javax.swing.JLabel lbDatosResponsable;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellidoDifunto;
    private javax.swing.JTextField txtApellidosResponsable;
    private javax.swing.JFormattedTextField txtCedulaResponsable;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JFormattedTextField txtFechaDefuncion;
    private javax.swing.JFormattedTextField txtNoCedulaDifunto;
    private javax.swing.JTextField txtNomDifunto;
    private javax.swing.JTextField txtNomResponsable;
    private javax.swing.JTextField txtPagoCepultura;
    private javax.swing.JTextField txtPagoTerreno;
    // End of variables declaration//GEN-END:variables
}
