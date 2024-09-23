// evitar que se cree mas de una instancia con el constructor
package org.uv.tpcsw.practica01;

public class Singleton {
    
    // seccion estatica: puede ser metodo atributo y se va a heap, pierde la posibilidad de ser objeto
    // pertenece a una referencia de heap a diferencia de las no estaticas donde si se crea espacio por cada instancia
    //toda instancia es objeto
    // memory heap 
    
    // se manda al heap de Singleton
    private static Singleton sin=null;
    
    public static Singleton getInstance(){
        if (sin ==null)
            sin = new Singleton();
        return sin;
    }
    // hace que sea singleton
    
    // autoreferencia vv
    
    
    private Singleton (){
       // privatizando constructor evito que clases externas lo instancien
    }
    
    public void imprimir(){
        System.out.println("Mensaje...");
}
}
