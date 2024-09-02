
package DAO;

// no usar sout sino logger 
// sonar lint, docker, y limpiar 
import java.util.List;

public class DAOEmpleadoConcreto implements IDAOGeneral<EmpleadoPojo, String>{

    @Override
    public boolean save(EmpleadoPojo pojo) {
      ConexionDB con= ConexionDB.getInstance();
      String sql= "insert into empleados (clave, nombre, direccion, telefono) values " 
              + " ('" + pojo.getClave() + "','" + pojo.getNombre() + "','" + pojo.getDireccion() + "','" + pojo.getTelefono() + "')";
    return con.execute(sql);
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(EmpleadoPojo pojo, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<EmpleadoPojo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoPojo findByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
