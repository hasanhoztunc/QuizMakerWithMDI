
package Presenter;

import Model.DatabaseConnection;
import Model.Ders;
import Model.DogruYanlisSoru;
import Model.Soru;
import Model.Zorluk;
import View.IView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;


public class DogruYanlisPresenter {
    
    IView iview;
    
    public DogruYanlisPresenter(IView iview){
        this.iview=iview;
    }
    
    public void veritabaninaEkle(String soruMetni,int soruZorlugu,int puan,int dogruCevap,int dersAdi){
             
        DogruYanlisSoru soru=new DogruYanlisSoru();
        
        Zorluk zorluk=new Zorluk(soruZorlugu);
        
        Ders ders=new Ders(dersAdi);
        
        soru.setSoruMetni(soruMetni);
       
        soru.setDogruCevap(dogruCevap);
        soru.setZorluk(zorluk);
        soru.setPuan(puan);
        soru.setDers(ders);
        
        
        DatabaseConnection baglan=new DatabaseConnection();
        
        baglan.DogruYanlisInsert(soru.getSoruMetni(),zorluk.getZorluk(),soru.getPuan(),soru.getDogruCevap(),dersAdi);
    
        iview.IViewSoruEkle("Soru kaydedildi");
    }
    
    
}
