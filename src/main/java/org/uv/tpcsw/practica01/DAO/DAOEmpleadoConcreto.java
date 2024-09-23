
package DAO;

// no usar sout sino logger 
// sonar lint, docker, y limpiar 
import java.sql.ResultSet;
import java.sql.SQLException;
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
     ConexionDB con = ConexionDB.getInstance();
    String sql = "DELETE FROM empleados WHERE clave = '" + id + "'";
    return con.execute(sql);
    }

    @Override
    public boolean update(EmpleadoPojo pojo, String id) {
      ConexionDB con = ConexionDB.getInstance();
    String sql = "UPDATE empleados SET nombre = '" + pojo.getNombre() + 
                 "', direccion = '" + pojo.getDireccion() + 
                 "', telefono = '" + pojo.getTelefono() + 
                 "' WHERE clave = '" + pojo.getClave() + "'";
    return con.execute(sql);
    }

    @Override
    public List<EmpleadoPojo> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadoPojo findByID(String id) {
     ConexionDB con = ConexionDB.getInstance();
    String sql = "SELECT * FROM empleados WHERE clave = '" + id + "'";
    ResultSet rs = con.executeQuery(sql);
    EmpleadoPojo pojo = null;
    
    try {
        if (rs.next()) {
            pojo = new EmpleadoPojo();
            pojo.setClave(rs.getString("clave"));
            pojo.setNombre(rs.getString("nombre"));
            pojo.setDireccion(rs.getString("direccion"));
            pojo.setTelefono(rs.getString("telefono"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return pojo;}
    
}
