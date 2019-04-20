
package Model;

import java.sql.*;

public class DatabaseConnection {
   
    SqlServerConnect scon;
   
    // public void Baglan(){
//         try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//            //Connection conn =DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;");
//            Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
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
          //  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            //Connection conn =DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;");
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
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
             scon=SqlServerConnect.getSqlServerConnect();
            String sql="Insert into CoktanSecmeliSoru([SoruMetni],[ZorlukSeviyesiID],[DogruCevapID],[Puan],[DersID],[ASecenegi],[BSecenegi],[CSecenegi],[DSecenegi]) values(?,?,?,?,?,?,?,?,?)";
//            String sql="Insert into Soru([SoruMetni],[ZorlukSeviyesiID],[DogruCevap],[Puan],[DersID],[ASecenegi],[BSecenegi],[CSecenegi],[DSecenegi]) values('"dersAdi"','"soruZorlugu"','"dogruCevap"','"Puan"','"Ders"','"aSecenegi"','"bSecenegi"','"cSecenegi"','"dSecenegi"')";
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            //PreparedStatement prepared=conn.prepareStatement(sql);
            prepared.setString(1,soruMetni);
            prepared.setInt(2,soruZorlugu);
            prepared.setInt(3,dogruCevap);
            prepared.setInt(4, Puan);
            prepared.setInt(5, Ders);
            prepared.setString(6,aSecenegi);
            prepared.setString(7,bSecenegi);
            prepared.setString(8,cSecenegi);
            prepared.setString(9,dSecenegi);
            scon.ConnectionString(prepared);
            //prepared.executeUpdate();
//            Statement statement=conn.createStatement();
//            ResultSet resultSet=statement.executeQuery("Insert into Soru(SoruMetni,ZorlukSeviyesiID,DogruCevap,Puan,DersID,ASecenegi,BSecenegi,CSecenegi,DSecenegi) values('"dersAdi"','"soruZorlugu"','"dogruCevap"','"Puan"','"Ders"','"aSecenegi"','"bSecenegi"','"cSecenegi"','"dSecenegi"')");
//            while(resultSet.next()){
//                System.out.println(" "+resultSet.getString(1)+"    "+resultSet.getNString(2));
//           }
            
        } catch (Exception e) {
          //  e.printStackTrace();
        }
        
    }
    
    public void DogruYanlisInsert(String soruMetni,int soruZorlugu,int Puan,int dogruCevap,int Ders){
         try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Insert into DogruYanlisSoru([ZorlukSeviyesiID],[DogruCevapID],[Puan],[DersID],[SoruMetni]) values(?,?,?,?,?)";
           scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(5,soruMetni);
            prepared.setInt(1,soruZorlugu);
            prepared.setInt(2,dogruCevap);
            prepared.setInt(3, Puan);
            prepared.setInt(4, Ders);
           scon.ConnectionString(prepared);
            
            //prepared.executeUpdate();
            
            //String connectionString=prepared.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void KlasikInsert(String soruMetni,int soruZorlugu,int Puan,String dogruCevap,int Ders){
         try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Insert into KlasikSoru([ZorlukSeviyesiID],[DogruCevap],[Puan],[DersID],[SoruMetni]) values(?,?,?,?,?)";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(5,soruMetni);
            prepared.setInt(1,soruZorlugu);
            prepared.setString(2,dogruCevap);
            prepared.setInt(3, Puan);
            prepared.setInt(4, Ders);
            scon.ConnectionString(prepared);
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void DersInsert(String ders){
            try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Insert into Dersler(DersAdi) values(?)";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(1,ders);
            scon.ConnectionString(prepared);
           
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void DersDelete(String ders){
         try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Delete from Dersler Where DersAdi=?";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(1,ders);
            scon.ConnectionString(prepared);
           
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void DersGuncelle(String eskiDersAdi,String guncelDersAdi){
          try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");          
             String sql="Update Dersler set DersAdi=? Where DersAdi=?";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(2,eskiDersAdi);
            prepared.setString(1, guncelDersAdi);
            scon.ConnectionString(prepared);
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void ZorlukEkle(String zorlukAdi){
         try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Insert into ZorlukSeviyesi(ZorlukSeviyesi) values(?)";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(1,zorlukAdi);
            scon.ConnectionString(prepared);
           
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
     
     public void ZorlukSil(String zorluk){
          try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
            
            String sql="Delete from ZorlukSeviyesi Where ZorlukSeviyesi=?";
            scon=SqlServerConnect.getSqlServerConnect();
            PreparedStatement prepared=scon.conn.prepareStatement(sql);
            prepared.setString(1,zorluk);
            scon.ConnectionString(prepared);
           
            
            //prepared.executeUpdate();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
