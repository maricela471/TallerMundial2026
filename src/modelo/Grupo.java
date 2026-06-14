/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *Clase "Grupo" representa como se dividen las selecciones para enfrentarse
 * @author Ramirez Maricela
 */
public class Grupo {
    private String identificacion;
    private String descripcion;
    private ArrayList<Seleccion> listaSelecciones;
     //constructor
    public Grupo (String identificacion, String descripcion){
        this.identificacion=identificacion;
        this.descripcion=descripcion;
        this.listaSelecciones=new ArrayList<>();
           
    }
    //setters
    public void setIdentificacion(String identificacion){
        this.identificacion=identificacion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    //getters
    public String getIdentificacion(){
        return identificacion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public ArrayList<Seleccion> getListaSelecciones() {
        return listaSelecciones;
    }
    
    //Métodos
    /**
     * agregarSelecciones ingresa una seleccion a la lista del grupo
     * @param s la seleccion que se va a agregar
     */
    public void agregarSeleccion(Seleccion s){
        if(!s.getNombreFederacion().isEmpty()){
            listaSelecciones.add(s);
        }
    }
    /**
     * eliminar seleccion saca de lista de selecciones pertenecientes al grupo la seleccion ingresada
     * @param s 
     */
    public void eliminarSeleccion(Seleccion s){
        listaSelecciones.remove(s);
    }
}
