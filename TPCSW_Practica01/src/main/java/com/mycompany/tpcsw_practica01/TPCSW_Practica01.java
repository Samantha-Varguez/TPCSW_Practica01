
package com.mycompany.tpcsw_practica01;

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
               
    }
}
