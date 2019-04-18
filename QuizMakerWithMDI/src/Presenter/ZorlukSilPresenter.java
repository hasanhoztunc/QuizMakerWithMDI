
package Presenter;

import Model.DatabaseConnection;
import View.IView;


public class ZorlukSilPresenter {
    
    IView iview;
    public ZorlukSilPresenter(IView iview){
        this.iview=iview;
    }
    
    public void VeritabanindanZorlukSil(String zorluk){
        DatabaseConnection connect=new DatabaseConnection();
        
        connect.ZorlukSil(zorluk);
        
        iview.IViewSoruEkle("Başarıyla silindi.");
    }
}
