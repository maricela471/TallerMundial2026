/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enumeracion.NombreFase;// se importa NombreFase, que son las opciones disponibles de nombres que puede tomar la fase
/**
 *Clase "Fase", representa la  etapa del mundial esta cada seleccion
 * @authors Ramirez Maricela, Irigoyen Santiago,Cisnero Ismael
 */
public class Fase {
    private NombreFase nombre;
    
    //constructor

    public Fase(NombreFase nombre) {
        this.nombre = nombre;
    }
    
    //setters

    public void setNombre(NombreFase nombre) {
        this.nombre = nombre;
    }
    
    //getters

    public NombreFase getNombre() {
        return nombre;
    }
    
    
}
