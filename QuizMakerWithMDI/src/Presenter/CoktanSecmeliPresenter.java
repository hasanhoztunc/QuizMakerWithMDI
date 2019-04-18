/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.CoktanSecmeliSoru;
import Model.DatabaseConnection;
import Model.Ders;
import Model.Soru;
import Model.Zorluk;
import View.IView;

/**
 *
 * @author Monster
 */
public class CoktanSecmeliPresenter {
    
    IView soruEkle;
    
    
    
    public CoktanSecmeliPresenter(IView iview){
        soruEkle=iview;
    }
    
    public void veritabaninaEkle(String soruMetni,String aSecenegi,String bSecenegi,String cSecenegi,String dSecenegi,int soruZorlugu,int puan,int dogruCevap,int dersAdi){
             
        CoktanSecmeliSoru soru=new CoktanSecmeliSoru();
        
        Zorluk zorluk=new Zorluk(soruZorlugu);
        
        Ders ders=new Ders(dersAdi);
        
        soru.setSoruMetni(soruMetni);
        soru.setaSecenegi(aSecenegi);
        soru.setbSecenegi(bSecenegi);
        soru.setcSecenegi(cSecenegi);
        soru.setdSecenegi(dSecenegi);
        soru.setdogruCevap(dogruCevap);
        soru.setZorluk(zorluk);
        soru.setPuan(puan);
        soru.setDers(ders);
        
        
        DatabaseConnection baglan=new DatabaseConnection();
        
        baglan.CoktanSecmeliInsert(soru.getSoruMetni(),soru.getaSecenegi(),soru.getbSecenegi(),soru.getcSecenegi(),soru.getdSecenegi(),zorluk.getZorluk(),soru.getPuan(),soru.getdogruCevap(),dersAdi);
    
        soruEkle.IViewSoruEkle("Soru kaydedildi");
    }
    
    
    
}
