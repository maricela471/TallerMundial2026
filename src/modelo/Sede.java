/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 * Clase "Sede", representa una ciudad anfitriona dentro del torneo mundialista.
 * Una sede corresponde al lugar donde se alojan las selecciones y se organizan
 * los partidos, aportando información geográfica y contextual.
 *
 * Relaciones principales:
 * - Pais: cada sede pertenece a un único país.
 * - Mundial: cada sede está asociada a un mundial específico.
 * - Estadio: una sede puede contener uno o varios estadios mundialistas.
 *
 * Atributos:
 * - ciudad: nombre de la ciudad anfitriona.
 * - alturaNivelMar: altura de la ciudad sobre el nivel del mar.
 * - clima: condiciones climáticas predominantes en la sede.
 * - zonaHoraria: zona horaria de la ciudad.
 * - pertenece: país al que pertenece la sede.
 * - mundial: mundial en el que participa la sede.
 * - listaTieneEstadio: lista de estadios ubicados en la sede.
 *
 * Métodos de utilidad:
 * - setCiudad(String ciudad): establece el nombre de la ciudad.
 * - setAlturaNivelMar(float alturaNivelMar): define la altura sobre el nivel del mar.
 * - setClima(String clima): establece el clima de la sede.
 * - setZonaHoraria(String zonaHoraria): define la zona horaria.
 * - setPertenece(Pais pertenece): asigna el país al que pertenece la sede.
 * - setMundial(Mundial mundial): vincula la sede con un mundial.
 * - getCiudad(), getAlturaNivelMar(), getClima(), getZonaHoraria(),
 *   getPertenece(), getMundial(), getListaTieneEstadio(): devuelven los valores de los atributos.
 * - agregarEstadio(Estadio s): añade un estadio a la lista de estadios de la sede.
 *
 * @author Ramírez Maricela
 */


public class Sede {
    private String ciudad;
    private float alturaNivelMar;
    private String clima;
    private String zonaHoraria;
    private Pais pertenece;
    private Mundial mundial;
    private ArrayList <Estadio> listaTieneEstadio;
    
   //constructor

    public Sede(String ciudad, float alturaNivelMar, String clima, String zonaHoraria,Pais pertenece,Mundial mundial) {
        this.ciudad = ciudad;
        this.alturaNivelMar = alturaNivelMar;
        this.clima = clima;
        this.zonaHoraria = zonaHoraria;
        this.pertenece=pertenece;
        this.mundial=mundial;
        this.listaTieneEstadio=new ArrayList<>();
    }
    
    //setters

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setAlturaNivelMar(float alturaNivelMar) {
        this.alturaNivelMar = alturaNivelMar;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public void setPertenece(Pais pertenece) {
        this.pertenece = pertenece;
    }

    public void setMundial(Mundial mundial) {
        this.mundial = mundial;
    }
    
    
    
    //getters

    public String getCiudad() {
        return ciudad;
    }

    public float getAlturaNivelMar() {
        return alturaNivelMar;
    }

    public String getClima() {
        return clima;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public Pais getPertenece() {
        return pertenece;
    }

    public Mundial getMundial() {
        return mundial;
    }

    public ArrayList<Estadio> getListaTieneEstadio() {
        return listaTieneEstadio;
    }
    
    //Métodos
    /**
     * Agregar estadio añade un estadio a la lista de estadios que tiene la sede
     * @param s es el estadio a agregar
     */
    
    public void agregarEstadio(Estadio s){
        listaTieneEstadio.add(s);
    }
    
    
    
    
}
