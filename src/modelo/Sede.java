/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 * Representa una sede dentro del torneo.
 * Una sede corresponde a una ciudad anfitriona donde se alojan las selecciones
 * y se organizan los partidos. 
 * Contiene información geográfica y contextual como ciudad, clima, altura sobre el nivel del mar
 * y zona horaria.
 * 
 * Relacionada con:
 * - Pais: cada sede pertenece a un único país.
 * - Estadio: una sede puede contener uno o varios estadios mundialistas.
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
