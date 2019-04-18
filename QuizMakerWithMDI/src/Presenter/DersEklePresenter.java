
package Presenter;

import Model.DatabaseConnection;
import Model.Ders;
import View.IView;

public class DersEklePresenter {
    
    IView iview;
    //Ders ders;
    public DersEklePresenter(IView iview){
        this.iview=iview;
    }
    
    public void VeritabanınaEkle(String dersAdi){
        Ders ders=new Ders(dersAdi);
        
        ders.setDers(dersAdi);
        
        DatabaseConnection connect=new DatabaseConnection();
        
        connect.DersInsert(ders.getDers());
        
        iview.IViewSoruEkle("Ders kaydedildi.");
    }
   
}
