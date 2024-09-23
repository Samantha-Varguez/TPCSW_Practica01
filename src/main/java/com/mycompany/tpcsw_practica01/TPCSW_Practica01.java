
package com.mycompany.tpcsw_practica01;

import DAO.ConexionDB;
import DAO.EmpleadoPojo;
import DAO.TransactionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TPCSW_Practica01 {

    public static void main(String[] args) {
       
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
               
               
               ConexionDB conexion = ConexionDB.getInstance();
               EmpleadoPojo pojo = new EmpleadoPojo();
               pojo.setClave("01");
               pojo.setNombre("Gabriel");
               pojo.setDireccion("AV1");
               pojo.setTelefono("8888");
               TransactionDB<EmpleadoPojo> transaction=new TransactionDB<EmpleadoPojo>(pojo){
                   @Override
                   public boolean execute(Connection con) {
                       try{
                       String sql="insert into empleados (clave, nombre, direccion, telefono) values" + "(?,?,?,?,?)" ;
                       PreparedStatement pst =con.prepareStatement(sql);
                       pst.setString(1, pojo.getClave());
                       pst.setString(1, pojo.getNombre());
                       pst.setString(1, pojo.getDireccion());
                       pst.setString(1, pojo.getTelefono());
                       return pst.execute();
                   } catch (SQLException ex) {
                   Logger.getLogger(TPCSW_Practica01.class.getName()).log(Level.SEVERE, null, ex);
                   return false;
               }
                   }
               };
              return conexion.execute(transaction);
    }
}
