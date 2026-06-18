/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 * Representa un estadio dentro de una sede mundialista.
 * Un estadio es el recinto deportivo donde se desarrollan los partidos
 * del mundial, identificado por su nombre y capacidad de espectadores.
 *
 * Atributos principales:
 * - nombre: nombre oficial del estadio.
 * - capacidad: cantidad máxima de espectadores que puede albergar.
 *
 * El estadio está asociado a una sede, pero esta relación se gestiona
 * fuera de la clase, manteniendo aquí únicamente la información propia
 * del estadio.
 * Partido: los partidos se desarrollan en este estadio.
 *
 * @author Ramírez Maricela
 */

public class Estadio {
    private String nombre;
    private Integer capacidad;//relaciones y sede
    private Sede sede;
    private ArrayList<Partido>listaPartidos;
    //constructor

    public Estadio(String nombre, Integer capacidad,Sede sede) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.sede=sede;
        this.listaPartidos=new ArrayList<Partido>();
    }
    //setters

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
    

   
    
    
    //getters

    public String getNombre() {
        return nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Sede getSede() {
        return sede;
    }
    //Métodos
    /**
    * Agrega un partido a la lista de partidos disputados en este estadio.
    * @param p el partido a agregar de tipo Partido
    */
      public void agregarPartido(Partido p){
       listaPartidos.add(p);
      }
    
    
}
