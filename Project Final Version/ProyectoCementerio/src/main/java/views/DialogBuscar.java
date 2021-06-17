/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import RAF.RAF;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import models.Registro;

/**
 *
 * @author JSLG
 */
public class DialogBuscar extends javax.swing.JDialog {

    RAF raf = new RAF();
    DefaultTableModel modelo;
    List<Registro> registros;
    TableRowSorter trs;
    TableColumnModel modeloColumna;

    public DialogBuscar(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();

        jtableRegistros.getTableHeader().setFont(new Font("Arial Black", Font.BOLD, 14));
        jtableRegistros.getTableHeader().setOpaque(false);

        DefaultTableCellRenderer renderizador = new DefaultTableCellRenderer();
        renderizador.setBackground(new Color(32, 136, 203));
        renderizador.setForeground(new java.awt.Color(255, 255, 255));
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
                                       registros.get(i).getPersonaDifunto().getNoCedula(),
                                       registros.get(i).getPersonaDifunto().getFechaDefuncion(),
                                       registros.get(i).getPersonaResponsable().getNombres(),
                                       registros.get(i).getPersonaResponsable().getApellidos(),
                                       registros.get(i).getPersonaResponsable().getNoCedula(),
                                       registros.get(i).getTierra().getCodigo(),
                                       registros.get(i).getTierra().getPagoSepultura()});

        }
        //Mo es hora
        jtableRegistros.setModel(modelo);
        
        
        modeloColumna = jtableRegistros.getColumnModel();
        int tamanio1 =0;
        for (int i = 0; i < modeloColumna.getColumnCount(); i++) {
            for (int j = 0; j < modelo.getRowCount(); j++) {
                if(modelo.getValueAt(j, i)!= null){
                    int tamanio2 = modelo.getValueAt(j, i).toString().length()*14;
                    if(tamanio2>tamanio1){
                        tamanio1=tamanio2;
                    }
                }modeloColumna.getColumn(i).setPreferredWidth(tamanio1);
            }
        }
        
        
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableRegistros = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        BuscarDifuntoNombre = new javax.swing.JTextField();
        BuscarCodigo = new javax.swing.JTextField();
        BuscarFechaDefuncion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BuscarResponsable = new javax.swing.JTextField();
        BuscarCedulaResponsable = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Captura.PNG"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1060, 120);

        jtableRegistros.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jtableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", " Difunto", "Apellido", "Cedula", " Defuncion", " Responsable", "Apellido", "Cedula", "Terreno", "Sepultura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableRegistros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtableRegistros.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(jtableRegistros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(290, 180, 760, 330);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nombres");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 260, 60, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Defuncion");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 60, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Codigo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 340, 40, 16);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(153, 0, 0));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(920, 520, 120, 30);

        BuscarDifuntoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarDifuntoNombreKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarDifuntoNombre);
        BuscarDifuntoNombre.setBounds(90, 250, 180, 30);

        BuscarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarCodigo);
        BuscarCodigo.setBounds(90, 330, 180, 30);

        BuscarFechaDefuncion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarFechaDefuncionKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarFechaDefuncion);
        BuscarFechaDefuncion.setBounds(90, 290, 180, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nombres");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 440, 60, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("No Cedula");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 470, 60, 20);

        BuscarResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarResponsableKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarResponsable);
        BuscarResponsable.setBounds(90, 430, 180, 30);

        BuscarCedulaResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarCedulaResponsableKeyTyped(evt);
            }
        });
        getContentPane().add(BuscarCedulaResponsable);
        BuscarCedulaResponsable.setBounds(90, 470, 180, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("   Llene uno de los campos del formulario de busqueda del difunto o del formulario de busqueda del reponsable.");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255)));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 140, 685, 21);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("  FORMULARIOS DE BUSQUEDA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 160, 250, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Busqueda Responsable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 220, 270, 170);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Busqueda Responsable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 400, 270, 120);

        setSize(new java.awt.Dimension(1060, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarDifuntoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarDifuntoNombreKeyTyped
        BuscarDifuntoNombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + BuscarDifuntoNombre.getText(), 1));
            }
        });
        trs = new TableRowSorter(modelo);
        jtableRegistros.setRowSorter(trs);
    }//GEN-LAST:event_BuscarDifuntoNombreKeyTyped

    private void BuscarCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarCodigoKeyTyped
        BuscarCodigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + BuscarCodigo.getText(), 0));
            }
        });
        trs = new TableRowSorter(modelo);
        jtableRegistros.setRowSorter(trs);
    }//GEN-LAST:event_BuscarCodigoKeyTyped

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BuscarFechaDefuncionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarFechaDefuncionKeyTyped
        BuscarFechaDefuncion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + BuscarFechaDefuncion.getText(), 4));
            }
        });
        trs = new TableRowSorter(modelo);
        jtableRegistros.setRowSorter(trs);
    }//GEN-LAST:event_BuscarFechaDefuncionKeyTyped

    private void BuscarResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarResponsableKeyTyped
        BuscarResponsable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + BuscarResponsable.getText(), 5));
            }
        });
        trs = new TableRowSorter(modelo);
        jtableRegistros.setRowSorter(trs);
    }//GEN-LAST:event_BuscarResponsableKeyTyped

    private void BuscarCedulaResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarCedulaResponsableKeyTyped
        BuscarCedulaResponsable.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + BuscarCedulaResponsable.getText(), 7));
            }
        });
        trs = new TableRowSorter(modelo);
        jtableRegistros.setRowSorter(trs);
    }//GEN-LAST:event_BuscarCedulaResponsableKeyTyped

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
            java.util.logging.Logger.getLogger(DialogBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
              //  try {
                //    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        //@Override
                        //public void windowClosing(java.awt.event.WindowEvent e) {
                            //System.exit(0);
                        //}
                    //});
                    //dialog.setVisible(true);
                //} catch (IOException ex) {
                   // Logger.getLogger(DialogBuscar.class.getName()).log(Level.SEVERE, null, ex);
                //}
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarCedulaResponsable;
    private javax.swing.JTextField BuscarCodigo;
    private javax.swing.JTextField BuscarDifuntoNombre;
    private javax.swing.JTextField BuscarFechaDefuncion;
    private javax.swing.JTextField BuscarResponsable;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableRegistros;
    // End of variables declaration//GEN-END:variables
}
