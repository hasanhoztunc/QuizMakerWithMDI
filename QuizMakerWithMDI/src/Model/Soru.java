
package Model;


public class Soru {
    
    private String soruMetni;
    
    private Zorluk zorluk;
    private int puan;
    
    private Ders ders;

    public String getSoruMetni() {
        return soruMetni;
    }

   

    public void setSoruMetni(String soruMetni) {
        this.soruMetni = soruMetni;
    }

   

    public Zorluk getZorluk() {
        return zorluk;
    }

    public int getPuan() {
        return puan;
    }

   

    public Ders getDers() {
        return ders;
    }

    public void setZorluk(Zorluk zorluk) {
        this.zorluk = zorluk;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

   

    public void setDers(Ders ders) {
        this.ders = ders;
    }
    
    
}
