/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *clase "Pais", contiene la descripción de cada pais participante del mundial,cuales son sus sedes, y los arbitros pertenecientes a este pais
 * @author Maricela Ramirez
 */
public class Pais {
    private String nombre;
    private String bandera;
    private final ArrayList<Arbitro>listaArbitro;
    private final  ArrayList <Sede>listaSedes;
    
    
    //constructor

    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
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
