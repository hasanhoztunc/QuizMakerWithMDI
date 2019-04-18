
package Presenter;

import Model.DatabaseConnection;
import Model.Ders;
import Model.KlasikSoru;
import Model.Soru;
import Model.Zorluk;
import View.IView;


public class KlasikPresenter {
    
    IView iview;
    
    public KlasikPresenter(IView iview){
        this.iview=iview;
    }
    
        public void veritabaninaEkle(String soruMetni,int soruZorlugu,int puan,String dogruCevap,int dersAdi){
             
        KlasikSoru soru=new KlasikSoru();
        
        Zorluk zorluk=new Zorluk(soruZorlugu);
        
        Ders ders=new Ders(dersAdi);
        
        soru.setSoruMetni(soruMetni);
       
        soru.setDogruCevap(dogruCevap);
        soru.setZorluk(zorluk);
        soru.setPuan(puan);
        soru.setDers(ders);
        
        
        DatabaseConnection baglan=new DatabaseConnection();
        
        baglan.KlasikInsert(soru.getSoruMetni(),zorluk.getZorluk(),soru.getPuan(),soru.getDogruCevap(),dersAdi);
    
        iview.IViewSoruEkle("Soru kaydedildi");
    }
}
