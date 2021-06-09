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
public class Registro {
    String codigo;
    String fechaRegistro;
    Difunto personaDifunto;
    Responsable personaResponsable;
    Terreno tierra;

    public Registro() {
    }

    public Registro(String codigo, String fechaRegistro, Difunto personaDifunto, Responsable personaResponsable, Terreno tierra) {
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
        this.personaDifunto = personaDifunto;
        this.personaResponsable = personaResponsable;
        this.tierra = tierra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Difunto getPersonaDifunto() {
        return personaDifunto;
    }

    public void setPersonaDifunto(Difunto personaDifunto) {
        this.personaDifunto = personaDifunto;
    }

    public Responsable getPersonaResponsable() {
        return personaResponsable;
    }

    public void setPersonaResponsable(Responsable personaResponsable) {
        this.personaResponsable = personaResponsable;
    }

    public Terreno getTierra() {
        return tierra;
    }

    public void setTierra(Terreno tierra) {
        this.tierra = tierra;
    }

    @Override
    public String toString() {
        return "Registro{" + "codigo=" + codigo + ", fechaRegistro=" + fechaRegistro + ", personaDifunto=" + personaDifunto + ", personaResponsable=" + personaResponsable + ", tierra=" + tierra + '}';
    }
    
    
}
