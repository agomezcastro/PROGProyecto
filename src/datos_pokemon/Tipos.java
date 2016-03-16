/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_pokemon;

/**
 *
 * @author agomezcastro & mgonzalezlorenzo
 */
public class Tipos {
    private String nomTip;
    private int mult;

    public Tipos() {
    }

    public Tipos(String nomTip) {
        this.nomTip = nomTip;
    }

    public String getNomTip() {
        return nomTip;
    }

    public void setNomTip(String nomTip) {
        this.nomTip = nomTip;
    }

    public int getMult() {
        return mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }
    
    
}
