
package DAO;

//Operaciones CRUD, DAO no debe tener mas que esas

import java.util.List;

// se debe pasar a bajo acoplamiento
public class DAOEmpleado {
    public boolean guardar (EmpleadoPojo pojo){
        return true;
    }
    public boolean eliminar(EmpleadoPojo pojo){
        return true;
    }
    public boolean modificar(EmpleadoPojo pojo){
        return true;
    }
    public List<EmpleadoPojo> buscarAll(){
        return null;
    }
    
    public EmpleadoPojo buscarByID(EmpleadoPojo pojo){
        return null;
    }
}
