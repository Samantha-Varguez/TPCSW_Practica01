
package org.uv.tpcsw.practica01;

import DAO.ConexionDB;
import DAO.EmpleadoPojo;
import DAO.TransactionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TPCSW_Practica01 {

    public static ConexionDB main(String[] args) {
       
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        // ^^ son la misma instancia 
        
//////////////////////        Singleton s1=new Singleton();
//////////////////////        Singleton s2=new Singleton();
//////////////////////        System.out.println(s1);
//////////////////////        System.out.println(s2);
        
//        IMensaje msgv=  new Saludo2();
//        msgv.imprimir();
//        
//        msgv=  new Despedida2();
//        msgv.imprimir();
//        
//        
//        
//       
////        msgv=new IMensaje() {
////            @Override
////            public void imprimir(){
////                System.out.println("Otro mensaje...");
////            }
////        };
//        msgv.imprimir();
//                
       
//        Mensaje msgV=null;
//      msgV = new Saludo();
//      msgV.imprimir();
//       
//       msgV = new Despedida();
//      msgV.imprimir();
//      
//    msgV=new Mensaje() {
//         @Override
//         public void msg(){
//             System.out.println("Otro mensaje");
//         }
//       };
               //implementacion sin clase concreta, implementacion de manera anonima
               // se usara en inyeccion de dependencias 
               
               
ConexionDB con = (ConexionDB) ConexionDB.getInstance();
        TransactionDB<Empleado> transactionDB = new TransactionDB<Empleado>(pojo) {
            @Override
            public boolean execute(Connection con) {
                String sql="insert into empleado (clave, nombre, direccion,telefono) values"+"(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, pojo.getClave());
                pst.setString(2, pojo.getDireccion());
                pst.setString(3, pojo.getTelefono());
                pst.setString(4, pojo.getNombre());
                try {
                    return pst.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
                return false;
            }
        };
        return con.execute(transactionDB);
    }
}
