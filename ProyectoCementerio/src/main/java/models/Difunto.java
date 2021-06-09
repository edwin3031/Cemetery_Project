/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Ervin
 */
public class Difunto extends Persona {
    private String fechaDefuncion;

    public Difunto() {
    }


    public Difunto(String nombres, String apellidos, String noCedula,String fechaDefuncion) {
        super(nombres, apellidos, noCedula);
        this.fechaDefuncion = fechaDefuncion;
    }

    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(String fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }
    
    
}
