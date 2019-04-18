
package Presenter;

import Model.DatabaseConnection;
import Model.Zorluk;
import View.IView;


public class ZorlukEklePresenter {
    IView iview;
    
    public ZorlukEklePresenter(IView iview){
        this.iview=iview;
    }
    
    public void VeritabaninaZorlukEkle(String zorlukAdi){
        
        DatabaseConnection connect=new DatabaseConnection();
        
        connect.ZorlukEkle(zorlukAdi);
        
        iview.IViewSoruEkle("Ekleme Başarılı");
    }
}
