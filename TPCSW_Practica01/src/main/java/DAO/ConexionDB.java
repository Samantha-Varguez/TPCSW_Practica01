//statements

package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
   private static ConexionDB cx = null; 
   private Connection con = null; 
   
   public static ConexionDB getInstance(){
       if(cx==null){
           cx=new ConexionDB();
       }
       return cx;
   }
   
    public ConexionDB(){
        try {
               String url="jdbc:postgresql://localhost:5432/ejemplo";
               con=DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean execute(String sql){
        try {
            Statement stm=con.createStatement();
            return stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
