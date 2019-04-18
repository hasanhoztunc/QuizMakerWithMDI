
package Presenter;

import Model.DatabaseConnection;
import View.IView;


public class DersGuncellePresenter {
    IView iview;
    
    public DersGuncellePresenter(IView iview){      
        this.iview=iview;
    }
    
    public void VeritabaniGuncelle(String eskiDersAdi,String guncelDersAdi){
        DatabaseConnection connect=new DatabaseConnection();
        
        connect.DersGuncelle(eskiDersAdi, guncelDersAdi);
        
        iview.IViewSoruEkle("Ders Guncellendi");
    }
    
}
