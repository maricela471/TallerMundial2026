/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *clase "Mundial",en los atributos se detalla el año en que se juega, el comiezo del mundial y la fecha en que termina
 * @author Ramirez Maricela,Irigoyen Santiago,Cisnero Ismael
 */
public class Mundial {
    private Integer anio;
    private String mascota;
    private Integer fechaDesde;
    private Integer fechaHasta;
    
    //constructor
    public Mundial(Integer anio, String mascota, Integer fechaDesde, Integer fechaHasta){
        this.anio=anio;
        this.fechaDesde=fechaDesde;
        this.fechaHasta=fechaHasta;
        this.mascota=mascota;
    }
    
    //setters

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public void setFechaDesde(Integer fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setFechaHasta(Integer fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
    //getters

    public Integer getAnio() {
        return anio;
    }

    public String getMascota() {
        return mascota;
    }

    public Integer getFechaDesde() {
        return fechaDesde;
    }

    public Integer getFechaHasta() {
        return fechaHasta;
    }
    
    
    
    
}
