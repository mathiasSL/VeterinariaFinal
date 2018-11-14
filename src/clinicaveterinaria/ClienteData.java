package clinicaveterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteData {
    private Connection connection = null;

    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error conexion");
        }
    }
    
    public void guardarCliente(Cliente cliente){
        try {
            
            String sql = "INSERT INTO cliente (nombre, apellido, dni, direccion, telefono, personaAlternativa) VALUES ( ? , ? , ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getDni());
            statement.setString(4, cliente.getDireccion());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getPersonaAlternativa());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar cliente");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar cliente: " + ex.getMessage());
        }
    }
    
    public void borrarCliente(int idCliente){
    try {
            
            String sql = "DELETE FROM cliente WHERE idCliente =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idCliente);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar cliente: " + ex.getMessage());
        }
    }
    
    public void actualizarCliente (Cliente cliente){
    
        try { 
            String sql = "UPDATE cliente SET nombre = ?, apellido = ?, dni = ?, direccion = ?, telefono = ?, personaAlternativa = ? WHERE idCliente =?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             statement.setInt(7, cliente.getIdCliente());
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getDni());
            statement.setString(4, cliente.getDireccion());
            statement.setString(5, cliente.getTelefono());
            statement.setString(6, cliente.getPersonaAlternativa());
            
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar cliente: " + ex.getMessage());
        }
    }
    
    
    /*public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
            

        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cliente cliente;
            while(resultSet.next()){
                
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getString("dni"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setPersonaAlternativa(resultSet.getString("personaAlternativa"));
                clientes.add(cliente);
            }
                  
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener clientes: " + ex.getMessage());
        }
        
        
        return clientes;
    }
    */
    public Cliente buscarCliente(int idCliente){
    Cliente cliente=null;
    try {
            
            String sql = "SELECT * FROM cliente WHERE idCliente =?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idCliente);

            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getString("dni"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setPersonaAlternativa(resultSet.getString("personaAlternativa"));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar cliente: " + ex.getMessage());
        }
        
        return cliente;
    }
    
    public ArrayList <Cliente> buscarClientePorDni(String dni){
        
        Cliente cliente = null;
        ArrayList <Cliente> clientes = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM cliente WHERE dni = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, dni);
            
            ResultSet resultSet=statement.executeQuery();
           
            
            while(resultSet.next()){
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setDni(resultSet.getString("dni"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getString("telefono"));
                cliente.setPersonaAlternativa(resultSet.getString("personaAlternativa"));
                clientes.add(cliente);
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar un cliente: " + ex.getMessage());
        }
        
        return clientes;
    }
    
    public ArrayList<String> obtenerListaDeDnis (){

        ArrayList <String> dnis = new ArrayList<>();
        try {
            
            String sql = "SELECT dni FROM cliente;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            ResultSet resultSet=statement.executeQuery();
           
            
            while(resultSet.next()){
                String dni ;
                dni = resultSet.getString("dni");
                dnis.add(dni);
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar una lista de dnis " + ex.getMessage());
        }  
 
        return dnis;
        
    } 
}
