
package Model;


public class CoktanSecmeliSoru extends Soru{
    
    private String aSecenegi;
    private String bSecenegi;
    private String cSecenegi;
    private String dSecenegi;
    private int dogruCevap;
    
    
    public String getaSecenegi() {
        return aSecenegi;
    }

    public String getbSecenegi() {
        return bSecenegi;
    }

    public String getcSecenegi() {
        return cSecenegi;
    }

    public String getdSecenegi() {
        return dSecenegi;
    }
    
    public int getdogruCevap(){
        return dogruCevap;
    }

    public void setaSecenegi(String aSecenegi) {
        this.aSecenegi = aSecenegi;
    }

    public void setbSecenegi(String bSecenegi) {
        this.bSecenegi = bSecenegi;
    }

    public void setcSecenegi(String cSecenegi) {
        this.cSecenegi = cSecenegi;
    }

    public void setdSecenegi(String dSecenegi) {
        this.dSecenegi = dSecenegi;
    }
    
    public void setdogruCevap(int dogruCevap){
        this.dogruCevap=dogruCevap;
    }
    
}
