/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Comtech
 */

public class Busqueda {
    DefaultTableModel ModeloTabla;
    public void Buscar (String valor, String filtro, JTable tabla){
        String [] columnas = {"ID","Nombres", "Fecha","Lote"};
        String [] registros = new String [4];
        ModeloTabla = new DefaultTableModel(null,columnas);
    }
}
