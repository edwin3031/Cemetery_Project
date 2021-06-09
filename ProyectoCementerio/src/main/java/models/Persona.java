/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Comtech
 */
public class Persona {
   private String nombres;
   private String apellidos;
   private String noCedula;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String noCedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.noCedula = noCedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNoCedula() {
        return noCedula;
    }

    public void setNoCedula(String noCedula) {
        this.noCedula = noCedula;
    }

   

   
   
   
}
