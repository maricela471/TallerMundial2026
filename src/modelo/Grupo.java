/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *Clase "Grupo" representa como se dividen las selecciones para enfrentarse
 * @authors Ramirez Maricela, Irigoyen Santiago, Cisnero Ismael
 */
public class Grupo {
    private String identificacion;
    private String descripcion;
     //constructor
    public Grupo (String identificacion, String descripcion){
        this.identificacion=identificacion;
        this.descripcion=descripcion;
           
    }
    //setters
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    //getters
    public String getidentificacion(){
        return identificacion;
    }
    public String getdescripcion(){
        return descripcion;
    }
}
