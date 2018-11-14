package clinicaveterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TratamientoData {
    private Connection connection = null;

    public TratamientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error conexion");
        }
    }
    
    public void guardarTratamiento(Tratamiento tratamiento){
        try {
            
            String sql = "INSERT INTO tratamiento (tipo, descripcion, activo, importe) VALUES ( ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, tratamiento.getTipo());
            statement.setString(2, tratamiento.getDescripcion());
            statement.setBoolean(3, tratamiento.getActivo());
            statement.setDouble(4, tratamiento.getImporte());            
            statement.executeUpdate();           
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el tratamiento");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar el tratamiento: " + ex.getMessage());
        }
    }
    
    public void borrarTratamiento(int idTratamiento){
    try {
            
            String sql = "DELETE FROM tratamiento WHERE idTratamiento =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idTratamiento);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar el tratamiento: " + ex.getMessage());
        }
    }
    
    public void actualizarTratamiento (Tratamiento tratamiento){
    
        try {
            
            
            String sql = "UPDATE tratamiento SET tipo = ?, descripcion = ?, activo = ?, importe = ? WHERE idTratamiento = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, tratamiento.getTipo());
            statement.setString(2, tratamiento.getDescripcion());
            statement.setBoolean(3, tratamiento.getActivo());
            statement.setDouble(4, tratamiento.getImporte());
            statement.setInt(5, tratamiento.getIdTratamiento());
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el tratamiento: " + ex.getMessage());
        }
    }
   
    public List<Tratamiento> obtenerTratamientos(){
        List<Tratamiento> tratamientos = new ArrayList<Tratamiento>();
            

        try {
            String sql = "SELECT * FROM tratamiento;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Tratamiento tratamiento;
            while(resultSet.next()){
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(resultSet.getInt("idTratamiento"));
                tratamiento.setTipo(resultSet.getString("tipo"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                tratamientos.add(tratamiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tratamientos: " + ex.getMessage());
        }
        
        
        return tratamientos;
    }
  
    public Tratamiento buscarTratamiento(int idTratamiento){
    Tratamiento tratamiento=null;
    try {  
            String sql = "SELECT * FROM tratamiento WHERE idTratamiento =?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idTratamiento);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                   tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(resultSet.getInt("idTratamiento"));
                tratamiento.setTipo(resultSet.getString("tipo"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamiento.setImporte(resultSet.getDouble("importe"));
                
            }      
            statement.close();    
        } catch (SQLException ex) {
            System.out.println("Error al buscar tratamiento: " + ex.getMessage());
        }
        return tratamiento;
    }
    
    public List<Tratamiento> tratamientosActivos(){
        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tratamiento WHERE activo = 1;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.executeQuery();
            Tratamiento tratamiento;
            while(resultSet.next()){
                tratamiento = new Tratamiento();
                tratamiento.setIdTratamiento(resultSet.getInt("idTratamiento"));
                tratamiento.setTipo(resultSet.getString("tipo"));
                tratamiento.setDescripcion(resultSet.getString("descripcion"));
                tratamiento.setActivo(resultSet.getBoolean("activo"));
                tratamiento.setImporte(resultSet.getInt("importe"));
                tratamientos.add(tratamiento);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener tratamientos activos: " + ex.getMessage());
        }
        return tratamientos;
    } 
    
    public ArrayList<String> obtenerDescripciones(){

        ArrayList <String> tratamientos = new ArrayList<>();
        try {
            
            String sql = "SELECT descripcion FROM tratamiento;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            ResultSet resultSet=statement.executeQuery();
           
            
            while(resultSet.next()){
                String desc ;
                desc = resultSet.getString("descripcion");
                tratamientos.add(desc);
            }      
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar una lista de descripciones " + ex.getMessage());
        }  
        return tratamientos; 
    } 
}

