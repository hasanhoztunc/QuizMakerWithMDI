
package Presenter;

import Model.DatabaseConnection;
import View.IView;

public class DersSilPresenter {
    IView iview;
    
    public DersSilPresenter(IView iview){
        this.iview=iview;
    }
    
    public void VeritabanındanDersSil(String ders){
        
        DatabaseConnection connect=new DatabaseConnection();
        
        connect.DersDelete(ders);
        
        iview.IViewSoruEkle("Ders Silindi");
    }
    
}
