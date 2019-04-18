
package Presenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class ListeleHelper {
    
    public void TipListeleCoktanSecmeli(JTable table){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
           
            String sql="Select CoktanSecmeliSoru.SoruMetni,Dersler.DersAdi,CoktanSecmeliSoru.Puan,ZorlukSeviyesi.ZorlukSeviyesi from CoktanSecmeliSoru join Dersler on(CoktanSecmeliSoru.DersID=Dersler.DersID) join ZorlukSeviyesi on(CoktanSecmeliSoru.ZorlukSeviyesiID=ZorlukSeviyesi.ZorlukSeviyesiID)";
            
            PreparedStatement prepared=conn.prepareStatement(sql);
            ResultSet result=prepared.executeQuery();
           
            table.setModel(DbUtils.resultSetToTableModel(result));
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void TipListeleKlasikSoru(JTable table){
      try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
         
            String sql="Select KlasikSoru.SoruMetni,Dersler.DersAdi,KlasikSoru.Puan,ZorlukSeviyesi.ZorlukSeviyesi from KlasikSoru join Dersler on(KlasikSoru.DersID=Dersler.DersID) join ZorlukSeviyesi on(KlasikSoru.ZorlukSeviyesiID=ZorlukSeviyesi.ZorlukSeviyesiID)";
           
            PreparedStatement prepared=conn.prepareStatement(sql);
            ResultSet result=prepared.executeQuery();
           
            table.setModel(DbUtils.resultSetToTableModel(result));
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void TipListeleDogruYanlis(JTable table){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
         
            String sql="Select DogruYanlisSoru.SoruMetni,Dersler.DersAdi,DogruYanlisSoru.Puan,ZorlukSeviyesi.ZorlukSeviyesi from DogruYanlisSoru join Dersler on(DogruYanlisSoru.DersID=Dersler.DersID) join ZorlukSeviyesi on(DogruYanlisSoru.ZorlukSeviyesiID=ZorlukSeviyesi.ZorlukSeviyesiID)";
           
            PreparedStatement prepared=conn.prepareStatement(sql);
            ResultSet result=prepared.executeQuery();
           
            table.setModel(DbUtils.resultSetToTableModel(result));
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
