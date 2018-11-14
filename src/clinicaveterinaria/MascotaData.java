
package clinicaveterinaria;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MascotaData {
    private Connection connection = null;
    private Conexion conexion;
    
    public MascotaData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error conexion");
        }
    }
    
    public void guardarMascota(Mascota mascota){
        try {
            
            String sql = "INSERT INTO mascota (idCliente, alias, especie, sexo, raza, colorPelo, fecNac) VALUES ( ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           
            statement.setInt(1, mascota.getCliente().getIdCliente());
            statement.setString(2, mascota.getAlias());
            statement.setString(3, mascota.getEspecie());
            statement.setString(4, mascota.getSexo());
            statement.setString(5, mascota.getRaza());
            statement.setString(6, mascota.getColorPelo());
            statement.setDate(7, Date.valueOf(mascota.getFecNac()));
            
            statement.executeUpdate();           
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la mascota");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar mascota: " + ex.getMessage());
        }
    }
    
    public void borrarMascota(int id){
    try {
            
            String sql = "DELETE FROM mascota WHERE idMascota = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar mascota: " + ex.getMessage());
        }
    }
    
    public void actualizarMascota (Mascota mascota){
    
        try {  
            String sql = "UPDATE mascota SET idCliente = ?, alias = ?, especie = ?, sexo = ?, raza = ?, colorPelo = ?, fecNac = ?, pesoMedio = ? WHERE idMascota = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            statement.setInt(1, mascota.getCliente().getIdCliente());
            statement.setString(2, mascota.getAlias());
            statement.setString(3, mascota.getEspecie());
            statement.setString(4, mascota.getSexo());
            statement.setString(5, mascota.getRaza());
            statement.setString(6, mascota.getColorPelo());
            statement.setDate(7, Date.valueOf(mascota.getFecNac()));
            statement.setDouble(8, mascota.getPesoMedio());
            statement.setInt(9, mascota.getIdMascota());
 
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de mascota: " + ex.getMessage());
        }
    }
    
     public void actualizarPeso (Mascota mascota){
    
        try {  
            String sql = "UPDATE mascota SET pesoMedio = ? WHERE idMascota = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

          
            statement.setDouble(1, mascota.getPesoMedio());
            statement.setInt(2, mascota.getIdMascota());
 
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar datos de mascota: " + ex.getMessage());
        }
    }
    
    /*public List<Mascota> obtenerMascotas(){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascota;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota();
                mascota.setIdMascota(resultSet.getInt("idMascota"));
                Cliente cliente=buscarCliente(resultSet.getInt("idCliente"));   
                mascota.setCliente(cliente); 
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));
                mascotas.add(mascota);  
                    
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        return mascotas;
    }*/

    public Mascota buscarMascota(int idMascota){
    Mascota mascota=null;
    try {  
            String sql = "SELECT * FROM mascota WHERE idMascota = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idMascota);
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                 mascota = new Mascota();
                mascota.setIdMascota(resultSet.getInt("idMascota"));
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());   
            }      
            statement.close();    
        } catch (SQLException ex) {
            System.out.println("Error al buscar la mascota: " + ex.getMessage());
        }
        return mascota;
    }
    
    public Cliente buscarCliente(int id){
    
        ClienteData cd=new ClienteData(conexion);
        
        return cd.buscarCliente(id);  
    }
    
    public List<Mascota> buscarMascotasPorCliente(int idCliente){
        List<Mascota> mascotas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM mascota WHERE idCliente= ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idCliente);
            
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota(); 
                mascota.setIdMascota(resultSet.getInt("idMascota"));
                Cliente cliente=buscarCliente(resultSet.getInt("idCliente"));   
                mascota.setCliente(cliente); 
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));          
                mascotas.add(mascota);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las mascotas: " + ex.getMessage());
        }
        return mascotas;
    }
    
     public List<Mascota> buscarMascotasPorTratamiento(String tipo){
        List<Mascota> mascotas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mascota INNER JOIN visitadeatencion ON visitadeatencion.idMascota = mascota.idMascota INNER JOIN tratamiento ON tratamiento.idTratamiento = visitadeatencion.idTratamiento WHERE tipo = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, tipo);
            
            ResultSet resultSet = statement.executeQuery();
            Mascota mascota;
            while(resultSet.next()){
                mascota = new Mascota(); 
                mascota.setIdMascota(resultSet.getInt("idMascota"));
                Cliente cliente=buscarCliente(resultSet.getInt("idCliente"));   
                mascota.setCliente(cliente);  
                mascota.setAlias(resultSet.getString("alias"));
                mascota.setEspecie(resultSet.getString("especie"));
                mascota.setSexo(resultSet.getString("sexo"));
                mascota.setRaza(resultSet.getString("raza"));
                mascota.setColorPelo(resultSet.getString("colorPelo"));
                mascota.setFecNac(resultSet.getDate("fecNac").toLocalDate());
                mascota.setPesoMedio(resultSet.getDouble("pesoMedio"));          
                mascotas.add(mascota);      
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tratamientos por mascotas: " + ex.getMessage());
        }  
        return mascotas;
    }
}