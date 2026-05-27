/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Estadio {
    private String Nombre;
    private Integer capacidad;
    
    //constructor

    public Estadio(String Nombre, Integer capacidad) {
        this.Nombre = Nombre;
        this.capacidad = capacidad;
    }
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
    
    
}
