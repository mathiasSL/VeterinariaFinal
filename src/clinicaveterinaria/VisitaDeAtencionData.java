package clinicaveterinaria;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VisitaDeAtencionData {
    private Connection connection = null;
    private Conexion conexion;

    public VisitaDeAtencionData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error conexion");
        }
    }
    
    public void guardarVisita(VisitaDeAtencion visita){
        try {
            
            String sql = "INSERT INTO visitadeatencion (idTratamiento, idMascota, fechaDeVisita, pesoMascota, importeTotal) VALUES ( ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            statement.setInt(1, visita.getTratamiento().getIdTratamiento());
            statement.setInt(2, visita.getMascota().getIdMascota());
            statement.setDate(3, Date.valueOf(visita.getFechaDeVisita()));
            statement.setDouble(4, visita.getPesoMascota());
            statement.setDouble(5, visita.getImporteTotal());
            
            statement.executeUpdate();           
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la visita");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar el tratamiento: " + ex.getMessage());
        }
    }
    
    public void borrarVisita(int idVisita){
    try {
            
            String sql = "DELETE FROM visitadeatencion WHERE idVisita =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idVisita);
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar la visita: " + ex.getMessage());
        }
    }
    
    public List<VisitaDeAtencion> obtenerVisitas(){
        List<VisitaDeAtencion> visitas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM visitadeatencion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setIdVisita(resultSet.getInt("idVisita"));
                Tratamiento t1 = buscarTratamiento(resultSet.getInt("idTratamiento"));
                visita.setTratamiento(t1);
                Mascota m1 = buscarMascota(resultSet.getInt("idMascota"));
                visita.setMascota(m1);
                visita.setFechaDeVisita(resultSet.getDate("fechaDeVisita").toLocalDate());
                visita.setPesoMascota(resultSet.getDouble("pesoMascota"));
                visita.setImporteTotal(resultSet.getDouble("importeTotal"));
                visitas.add(visita);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tratamientos: " + ex.getMessage());
        }
        return visitas;
    }
    
    public void actualizarVisita (VisitaDeAtencion visita){
    
        try {
 
            String sql = "UPDATE visitadeatencion SET idTratamiento = ?, idMascota = ?, fechaDeVisita = ?, pesoMascota = ?, importeTotal = ? WHERE idVisita = ?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, visita.getTratamiento().getIdTratamiento());
            statement.setInt(2, visita.getMascota().getIdMascota());
            statement.setDate(3, Date.valueOf(visita.getFechaDeVisita()));
            statement.setDouble(4, visita.getPesoMascota());
            statement.setDouble(5, visita.getImporteTotal());
            statement.setInt(6, visita.getIdVisita());
   
            statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al modificar la visita: " + ex.getMessage());
        }
    }
    
    
    public VisitaDeAtencion buscarVisita(int id){
    VisitaDeAtencion visita=null;
    try {
            
            String sql = "SELECT * FROM visitadeatencion WHERE idVisita =?;";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);

            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                visita.setIdVisita(resultSet.getInt("idVisita"));
                Tratamiento t1 = buscarTratamiento(resultSet.getInt("idTratamiento"));
                visita.setTratamiento(t1);
                Mascota m1 = buscarMascota(resultSet.getInt("idMascota"));
                visita.setMascota(m1);
                visita.setFechaDeVisita(resultSet.getDate("fechaDeVisita").toLocalDate());
                visita.setPesoMascota(resultSet.getDouble("pesoMascota"));
                visita.setImporteTotal(resultSet.getDouble("importeTotal"));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar cliente: " + ex.getMessage());
        }
        return visita;
    }
    
    public List<VisitaDeAtencion> visitasTipoEnfermedadPorMascota(int id){
        List<VisitaDeAtencion> visitas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM visitadeatencion INNER JOIN tratamiento ON visitadeatencion.idTratamiento = tratamiento.idTratamiento WHERE idMascota = ? AND tipo = 'ENFERMEDAD';";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                 visita.setIdVisita(resultSet.getInt("idVisita"));
                Tratamiento t1 = buscarTratamiento(resultSet.getInt("idTratamiento"));
                visita.setTratamiento(t1);
                Mascota m1 = buscarMascota(resultSet.getInt("idMascota"));
                visita.setMascota(m1);
                visita.setFechaDeVisita(resultSet.getDate("fechaDeVisita").toLocalDate());
                visita.setPesoMascota(resultSet.getDouble("pesoMascota"));
                visita.setImporteTotal(resultSet.getDouble("importeTotal"));
                visitas.add(visita); 
            }    
             
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las visitas de atención: " + ex.getMessage());
        }  
        return visitas;
    }
    
    
    public List<VisitaDeAtencion> visitasPorMascota(int id){
        List<VisitaDeAtencion> visitas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM visitadeatencion INNER JOIN tratamiento ON visitadeatencion.idTratamiento = tratamiento.idTratamiento WHERE idMascota = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();
            VisitaDeAtencion visita;
            while(resultSet.next()){
                visita = new VisitaDeAtencion();
                 visita.setIdVisita(resultSet.getInt("idVisita"));
                Tratamiento t1 = buscarTratamiento(resultSet.getInt("idTratamiento"));
                visita.setTratamiento(t1);
                Mascota m1 = buscarMascota(resultSet.getInt("idMascota"));
                visita.setMascota(m1);
                visita.setFechaDeVisita(resultSet.getDate("fechaDeVisita").toLocalDate());
                visita.setPesoMascota(resultSet.getDouble("pesoMascota"));
                visita.setImporteTotal(resultSet.getDouble("importeTotal"));
                visitas.add(visita); 
            }    
             
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener todas las visitas de una mascota: " + ex.getMessage());
        }  
        return visitas;
    }
    
    public Tratamiento buscarTratamiento(int id){
    
        TratamientoData ad=new TratamientoData(conexion);
        
        return ad.buscarTratamiento(id);
        
    }
    
    public Mascota buscarMascota(int id){
    
        MascotaData md=new MascotaData(conexion);
        return md.buscarMascota(id);
    
    }
    
    public double obtenerPesoPromedio(int idMascota){
    double pesoPromedio = 0;
    
    try{
    String sql = "SELECT AVG(visitadeatencion.pesoMascota) AS promedio FROM visitadeatencion INNER JOIN mascota ON mascota.idMascota = visitadeatencion.idMascota WHERE mascota.idMascota = ? ORDER BY visitadeatencion.fechaDeVisita DESC LIMIT 10;";
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setInt(1, idMascota);
    ResultSet resultSet = statement.executeQuery();
    
    while(resultSet.next()){
       pesoPromedio = resultSet.getDouble("promedio"); 
    }
      
    statement.close();
    }
    catch(SQLException ex){
        System.out.println("Error al calcular peso promedio"+ ex.getMessage());
    }
    
    return pesoPromedio;
    }
    
}