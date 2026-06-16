/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 * Clase "Mundial", representa un torneo mundialista de fútbol.
 * Contiene información sobre el año en que se disputa,
 * las fechas de inicio y fin, la mascota oficial y las sedes
 * donde se desarrollan los partidos.
 *
 * Relaciones principales:
 * - Sede: lista de sedes que forman parte del mundial.
 *
 * Atributos:
 * - anio: año en que se juega el mundial.
 * - mascota: mascota oficial del torneo.
 * - fechaDesde: fecha de inicio del mundial.
 * - fechaHasta: fecha de finalización del mundial.
 * - listaSedes: sedes anfitrionas donde se disputan los partidos.
 *
 * Métodos de utilidad:
 * - agregarSede(Sede s): añade una sede a la lista de sedes del mundial.
 * - eliminarSede(Sede s): elimina una sede de la lista del mundial.
 *
 * Esta clase permite modelar la identidad general del torneo,
 * incluyendo su cronología, símbolos oficiales y las ciudades
 * anfitrionas que lo organizan.
 *
 * @author Ramírez Maricela
 */

public class Mundial {
    private Integer anio;
    private String mascota;
    private Integer fechaDesde;
    private Integer fechaHasta;
    private ArrayList<Sede>listaSedes;
    
    //constructor
    public Mundial(Integer anio, String mascota, Integer fechaDesde, Integer fechaHasta){
        this.anio=anio;
        this.fechaDesde=fechaDesde;
        this.fechaHasta=fechaHasta;
        this.mascota=mascota;
        this.listaSedes=new ArrayList <>();
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

    public ArrayList<Sede> getListaSedes() {
        return listaSedes;
    }
    
    //Métodos para agregar o quitar en la lista de sedes
    /**
     * Agregar sede ingresa una sede a la lista
     * @param s es la sede a agregar
     */
     public void agregarSede(Sede s){
         listaSedes.add(s);
     }
     /**
     * Eliminar sede quita una sede a la lista
     * @param s es la sede a eliminat
     */
     public void eliminarSede(Sede s){
         listaSedes.remove(s);
     }
     
    
    
    
    
}
