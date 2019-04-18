
package Model;


public class Ders { 
    
    private int dersAdi;
    private String ders;

    public Ders(int dersAdi) {
        this.dersAdi=dersAdi;
    }
    
    public Ders(String ders){
        this.ders=ders;
    }
    

    public int getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(int dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }
    
    
}
