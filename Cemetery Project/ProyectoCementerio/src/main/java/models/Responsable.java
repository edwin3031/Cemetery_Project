/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Responsable extends Persona {
    private String direccion;

    public Responsable() {
    }


    public Responsable(String nombres, String apellidos, String noCedula,String direccion) {
        super(nombres, apellidos, noCedula);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
