
package Model;

import java.sql.*;

public class DatabaseConnection {
   
    
   
    // public void Baglan(){
//         try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//            //Connection conn =DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;");
//            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//                    
//                    
//            System.out.println("connected");
//            Statement statement=conn.createStatement();
//            ResultSet resultSet=statement.executeQuery("select * from  [Dersler]");
//            while(resultSet.next()){
//                System.out.println(" "+resultSet.getString(1)+"    "+resultSet.getNString(2));
//            }
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void CoktanSecmeliInsert(String soruMetni,String aSecenegi,String bSecenegi,String cSecenegi,String dSecenegi,int soruZorlugu,int Puan,int dogruCevap,int Ders){
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            //Connection conn =DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;");
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            StringBuilder build=new StringBuilder();
//            build.append("Insert into Soru([SoruMetni],[ZorlukSeviyesiID],[DogruCevap],[Puan],[DersID],[ASecenegi],[BSecenegi],[CSecenegi],[DSecenegi]) values('"+soruMetni+"','"+soruZorlugu+"','"+dogruCevap+"','"+Puan+"','"+Ders+"','"+aSecenegi+"','"+bSecenegi+"','"+cSecenegi+"','"+dSecenegi"')";
//            build.append(soruMetni).append("\\,\\");
//            build.append(soruZorlugu).append("\\,\\");
//            build.append(dogruCevap).append("\\,\\");
//            build.append(Puan).append("\\,\\");
//            build.append(Ders).append("\\,\\");
//            build.append(aSecenegi).append("\\,\\");
//            build.append(bSecenegi).append("\\,\\");
//            build.append(cSecenegi).append("\\,\\");
//            build.append(dSecenegi);
//            String sql=build.toString();
            String sql="Insert into CoktanSecmeliSoru([SoruMetni],[ZorlukSeviyesiID],[DogruCevapID],[Puan],[DersID],[ASecenegi],[BSecenegi],[CSecenegi],[DSecenegi]) values(?,?,?,?,?,?,?,?,?)";
//            String sql="Insert into Soru([SoruMetni],[ZorlukSeviyesiID],[DogruCevap],[Puan],[DersID],[ASecenegi],[BSecenegi],[CSecenegi],[DSecenegi]) values('"dersAdi"','"soruZorlugu"','"dogruCevap"','"Puan"','"Ders"','"aSecenegi"','"bSecenegi"','"cSecenegi"','"dSecenegi"')";
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,soruMetni);
            prepared.setInt(2,soruZorlugu);
            prepared.setInt(3,dogruCevap);
            prepared.setInt(4, Puan);
            prepared.setInt(5, Ders);
            prepared.setString(6,aSecenegi);
            prepared.setString(7,bSecenegi);
            prepared.setString(8,cSecenegi);
            prepared.setString(9,dSecenegi);
            
            prepared.executeUpdate();
//            Statement statement=conn.createStatement();
//            ResultSet resultSet=statement.executeQuery("Insert into Soru(SoruMetni,ZorlukSeviyesiID,DogruCevap,Puan,DersID,ASecenegi,BSecenegi,CSecenegi,DSecenegi) values('"dersAdi"','"soruZorlugu"','"dogruCevap"','"Puan"','"Ders"','"aSecenegi"','"bSecenegi"','"cSecenegi"','"dSecenegi"')");
//            while(resultSet.next()){
//                System.out.println(" "+resultSet.getString(1)+"    "+resultSet.getNString(2));
//            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void DogruYanlisInsert(String soruMetni,int soruZorlugu,int Puan,int dogruCevap,int Ders){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Insert into DogruYanlisSoru([ZorlukSeviyesiID],[DogruCevapID],[Puan],[DersID],[SoruMetni]) values(?,?,?,?,?)";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(5,soruMetni);
            prepared.setInt(1,soruZorlugu);
            prepared.setInt(2,dogruCevap);
            prepared.setInt(3, Puan);
            prepared.setInt(4, Ders);
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void KlasikInsert(String soruMetni,int soruZorlugu,int Puan,String dogruCevap,int Ders){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Insert into KlasikSoru([ZorlukSeviyesiID],[DogruCevap],[Puan],[DersID],[SoruMetni]) values(?,?,?,?,?)";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(5,soruMetni);
            prepared.setInt(1,soruZorlugu);
            prepared.setString(2,dogruCevap);
            prepared.setInt(3, Puan);
            prepared.setInt(4, Ders);
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void DersInsert(String ders){
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Insert into Dersler(DersAdi) values(?)";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,ders);
            
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void DersDelete(String ders){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Delete from Dersler Where DersAdi=?";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,ders);
            
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void DersGuncelle(String eskiDersAdi,String guncelDersAdi){
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Update Dersler set DersAdi=? Where DersAdi=?";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(2,eskiDersAdi);
            prepared.setString(1, guncelDersAdi);
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void ZorlukEkle(String zorlukAdi){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Insert into ZorlukSeviyesi(ZorlukSeviyesi) values(?)";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,zorlukAdi);
            
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void ZorlukSil(String zorluk){
          try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            Connection conn=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4O8NDO1;databaseName=QuizMaker;integratedSecurity=true");
//            
            String sql="Delete from ZorlukSeviyesi Where ZorlukSeviyesi=?";
//            
            PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,zorluk);
            
           
            
            prepared.executeUpdate();
//            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
