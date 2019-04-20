
package Presenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;





public class Helper {
    
   public void ComboboxDersler(JComboBox combo){
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");           
            String sql="Select DersAdi from Dersler";
            PreparedStatement stat=conn.prepareStatement(sql);
            ResultSet resultSet=stat.executeQuery();
            while(resultSet.next()){   
               combo.addItem(resultSet.getString("DersAdi"));
            }
            
//            sql="Select ZorlukSeviyesi from ZorlukSeviyesi";
//            stat=conn.prepareStatement(sql);
//            resultSet=stat.executeQuery();
//            while(resultSet.next()){
//                
//                combo.addItem(resultSet.getString("ZorlukSeviyesi"));
//            }
        }catch (Exception e) {
            e.printStackTrace();
        }
   }
   
   public void ComboboxZorluk(JComboBox combo){
       try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");           
            String sql="Select ZorlukSeviyesi from ZorlukSeviyesi";
            PreparedStatement stat=conn.prepareStatement(sql);
            ResultSet resultSet=stat.executeQuery();
            
            
            
            
            while(resultSet.next()){
                
                combo.addItem(resultSet.getString("ZorlukSeviyesi"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
   }
    
}
