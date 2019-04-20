
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SqlServerConnect {
    
    private static SqlServerConnect sqlServerConnect;
    Connection conn;
    PreparedStatement stat;
    private SqlServerConnect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
        }catch(Exception e){
        
        }
    }
    
    public static SqlServerConnect getSqlServerConnect(){
        if(sqlServerConnect==null)
            return new SqlServerConnect();
        return sqlServerConnect;
    }
    
    public void ConnectionString(PreparedStatement statement){
          //try{
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
           
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://;databaseName=QuizMaker;integratedSecurity=true");
           
            //PreparedStatement stat=statement;
            
            //stat.executeQuery();
          //}  
          //  catch(Exception e){
            
        //
        try{
             stat=statement;
       stat.executeQuery();
        }catch(Exception e){
    
        }
      
    }
}
