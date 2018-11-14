package clinicaveterinaria;


import java.time.LocalDate;

public class VisitaDeAtencion {
    private int idVisita = -1;
    private Tratamiento tratamiento;
    private Mascota mascota;
    private LocalDate fechaDeVisita;
    private double pesoMascota;
    private double importeTotal;
    

    public VisitaDeAtencion(Tratamiento tratamiento, Mascota mascota, LocalDate fechaDeVisita, double pesoMascota, double importeTotal) {
        this.tratamiento = tratamiento;
        this.mascota = mascota;
        this.fechaDeVisita = fechaDeVisita;
        this.pesoMascota = pesoMascota;
        this.importeTotal = importeTotal;
    }
    
    public VisitaDeAtencion(){
    
    }
    
    public Tratamiento getTratamiento(){
        return tratamiento;
    }
    
    public void setTratamiento(Tratamiento tratamiento){
        this.tratamiento = tratamiento;
    }
    
    public Mascota getMascota(){
        return mascota;
    }
    
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public LocalDate getFechaDeVisita() {
        return fechaDeVisita;
    }

    public void setFechaDeVisita(LocalDate fechaDeVisita) {
        this.fechaDeVisita = fechaDeVisita;
    }

    public double getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(double pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    
}
