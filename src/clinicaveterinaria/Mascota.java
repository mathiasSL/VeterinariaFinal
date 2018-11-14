
package clinicaveterinaria;

import java.time.LocalDate;

public class Mascota {
    
    private int idMascota = -1;
    private String alias;
    private String especie;
    private String sexo;
    private String raza;
    private String colorPelo;
    private LocalDate fecNac;
    private double pesoMedio;
    private Cliente cliente;

    public Mascota(Cliente cliente, String alias, String especie, String sexo, String raza, String colorPelo, LocalDate fecNac) {
        this.cliente = cliente;
        this.alias = alias;
        this.especie = especie;
        this.sexo = sexo;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fecNac = fecNac;
    }
    
    public Mascota(){
        
    }
   
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }
}
