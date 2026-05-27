/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *clase "Pais", contiene la descripción de cada pais participante del mundial
 * @author USUARIO
 */
public class Pais {
    private String nombre;
    private String bandera;
    
    //constructor

    public Pais(String nombre, String bandera) {
        this.nombre = nombre;
        this.bandera = bandera;
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
    
    
}
