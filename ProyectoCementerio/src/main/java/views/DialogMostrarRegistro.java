/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import RAF.RAF;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import models.Registro;

/**
 *
 * @author Ervin
 */
public class DialogMostrarRegistro extends javax.swing.JDialog {
    RAF raf = new RAF();
    DefaultTableModel modelo;
    List<Registro> registros;

    /**
     * Creates new form BuscarDialog
     */
    public DialogMostrarRegistro(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        jtableRegistros.getTableHeader().setFont(new Font("Arial Black",Font.BOLD,14));
        jtableRegistros.getTableHeader().setOpaque(false);
        
        DefaultTableCellRenderer renderizador = new DefaultTableCellRenderer();
        renderizador.setBackground(new Color(32,136,203));
        renderizador.setForeground(new java.awt.Color(255,255,255));
        renderizador.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer renderCelda = new DefaultTableCellRenderer();
        renderCelda.setHorizontalAlignment(JLabel.CENTER);
    
        
        for (int i = 0; i < jtableRegistros.getModel().getColumnCount(); i++) {
            jtableRegistros.getColumnModel().getColumn(i).setHeaderRenderer(renderizador);
            jtableRegistros.getColumnModel().getColumn(i).setCellRenderer(renderCelda);
        }
        
        modelo = (DefaultTableModel) jtableRegistros.getModel();
        registros = raf.vertodo();
        for (int i = 0; i < registros.size(); i++) {
            modelo.addRow(new Object[] {registros.get(i).getCodigo(),
                                        registros.get(i).getPersonaDifunto().getNombres(),
                                        registros.get(i).getPersonaDifunto().getApellidos(),
                                        registros.get(i).getPersonaDifunto().getFechaDefuncion(),
                                        registros.get(i).getPersonaDifunto().getNoCedula(),
                                        registros.get(i).getPersonaResponsable().getNombres(),
                                        registros.get(i).getPersonaResponsable().getApellidos(),
                                        registros.get(i).getPersonaResponsable().getNoCedula(),
                                        registros.get(i).getTierra().getCodigo(),
                                        registros.get(i).getTierra().getPagoSepultura(),
                                        registros.get(i).getTierra().getPagoTerreno()});
            
        }
        //Mo es hora
        jtableRegistros.setModel(modelo);
        System.out.println(registros.size());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarRecientes = new javax.swing.JButton();
        btnMostrarRecientes2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableRegistros = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        btnMostrarRecientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarRecientes.setText("Mostrar Por Mes");
        btnMostrarRecientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btnMostrarRecientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarRecientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 200, 40));

        btnMostrarRecientes2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMostrarRecientes2.setText("Recientes");
        btnMostrarRecientes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btnMostrarRecientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecientes2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarRecientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 200, 40));

        jtableRegistros.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jtableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Pagina", " Difunto", "Apellido", "Cedula", " Defuncion", " Responsable", "Apellido", "Cedula", "Terreno", "Cepultura"
            }
        ));
        jtableRegistros.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jScrollPane2.setViewportView(jtableRegistros);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 980, -1));

        setSize(new java.awt.Dimension(1056, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarRecientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarRecientesActionPerformed

    private void btnMostrarRecientes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecientes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarRecientes2ActionPerformed

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
            java.util.logging.Logger.getLogger(DialogMostrarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogMostrarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogMostrarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogMostrarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DialogMostrarRegistro dialog = new DialogMostrarRegistro(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DialogMostrarRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarRecientes;
    private javax.swing.JButton btnMostrarRecientes2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtableRegistros;
    // End of variables declaration//GEN-END:variables
}
