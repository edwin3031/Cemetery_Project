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
public class Terreno {
    private String codigo;
    private int pagoTerreno;
    private int pagoSepultura;

    public Terreno() {
    }

    public Terreno(String codigo, int pagoTerreno, int pagoSepultura) {
        this.codigo = codigo;
        this.pagoTerreno = pagoTerreno;
        this.pagoSepultura = pagoSepultura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPagoTerreno() {
        return pagoTerreno;
    }

    public void setPagoTerreno(int pagoTerreno) {
        this.pagoTerreno = pagoTerreno;
    }

    public int getPagoSepultura() {
        return pagoSepultura;
    }

    public void setPagoSepultura(int pagoSepultura) {
        this.pagoSepultura = pagoSepultura;
    }
    
    
}
