/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Monster
 */
public class Zorluk {
    
    private int Zorluk;
    private String zorluk;
    
    public Zorluk(int zorluk){
        this.Zorluk=zorluk;
    }
    
    public Zorluk(String zorluk){
        this.zorluk=zorluk;
    }

    public int getZorluk() {
        return Zorluk;
    }

    public void setZorluk(int Zorluk) {
        this.Zorluk = Zorluk;
    }

    public String getzorluk() {
        return zorluk;
    }

    public void setzorluk(String zorluk) {
        this.zorluk = zorluk;
    }
    
    
}
