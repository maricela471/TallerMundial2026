/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 * Clase "Pais", representa a cada nación participante del mundial.
 * Contiene información básica como el nombre y la bandera, además
 * de las sedes y árbitros asociados a dicho país.
 *
 * Relaciones principales:
 * - Sede: lista de sedes que pertenecen al país.
 * - Arbitro: lista de árbitros originarios del país.
 * - Selección: cada país está representado por una selección nacional.
 *
 * Atributos:
 * - nombre: nombre del país.
 * - bandera: símbolo gráfico que identifica al país.
 * - listaSedes: sedes anfitrionas que se encuentran en el país.
 * - listaArbitro: árbitros que pertenecen al país.
 *
 * Métodos de utilidad:
 * - agregarSedes(Sede s): añade una sede a la lista de sedes del país.
 * - agregarArbitros(Arbitro s): añade un árbitro a la lista de árbitros del país.
 * @author Ramírez Maricela
 */

public class Pais {
    private String nombre;
    private String bandera;
    private  ArrayList<Arbitro>listaArbitro;
    private  ArrayList <Sede>listaSedes;
    private Seleccion seleccion;
    
    
    //constructor

    public Pais(String nombre, String bandera,Seleccion seleccion) {
        this.nombre = nombre;
        this.bandera = bandera;
        this.seleccion=seleccion;
        this.listaSedes= new ArrayList<>();
        this.listaArbitro=new ArrayList<>();
    }
    
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
    
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public String getBandera() {
        return bandera;
    }

    public ArrayList<Sede> getListaSedes() {
        return listaSedes;
    }

    public ArrayList<Arbitro> getListaArbitro() {
        return listaArbitro;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }
    
    
    //Metodos
    /**
     * Agregar sedes añade una sede a la lista de sede que tiene el pais
     * @param s es la sede a agregar de tipo Sede
     */
     public void agregarSedes(Sede s){
         listaSedes.add(s);
     }
     /**
     * Agregar arbitros añade un arbitro a la lista de arbitros que tiene el pais
     * @param s es el arbitro a agregar de tipo Arbitro
     */
     public void agregarArbitros(Arbitro s){
         listaArbitro.add(s);
     }
    
    
}
