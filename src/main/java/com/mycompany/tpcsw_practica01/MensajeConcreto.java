
package com.mycompany.tpcsw_practica01;


public class MensajeConcreto {
    
    private String name = "Nombre";
    
    public MensajeConcreto(String name){
        this.name=name;
    }
    
    public MensajeConcreto(){
        this.name="Nombre";
        System.out.println("Se ejecuta constructor");
    }
    
    public void imprimir(){
        System.out.println(name + ":" + "Mensaje...");
    }
}
