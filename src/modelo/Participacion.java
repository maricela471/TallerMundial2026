/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *La clase "Participacion" representa la relación entre "Seleccion" y "Partido"
 * @author Ramirez maricela
 */
public class Participacion {
    private boolean esLocal;
    // Se agrega referencia al objeto Seleccion para acceder a todos sus datos,
    private Seleccion seleccion;
    // ya que el UML solo modela los métodos de conteo pero no la relación explícita.
    private Integer cantidadGoles;
    private Integer cantidadTarjetasAmarillas;
    private Integer cantidadTarjetasRojas;
    //constructor

    public Participacion(boolean esLocal,Seleccion seleccion) {
        this.esLocal = esLocal;
        this.cantidadGoles=0;
        this.cantidadTarjetasAmarillas=0;
        this.cantidadTarjetasRojas=0;
        this.seleccion=seleccion;
    }
    //setters

    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public void setCantidadGoles(Integer cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public void setCantidadTarjetasAmarillas(Integer cantidadTarjetasAmarillas) {
        this.cantidadTarjetasAmarillas = cantidadTarjetasAmarillas;
    }

    public void setCantidadTarjetasRojas(Integer cantidadTarjetasRojas) {
        this.cantidadTarjetasRojas = cantidadTarjetasRojas;
    }
    
    //getters

    public boolean isEsLocal() {
        return esLocal;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public Integer getCantidadGoles() {
        return cantidadGoles;
    }

    public Integer getCantidadTarjetasAmarillas() {
        return cantidadTarjetasAmarillas;
    }

    public Integer getCantidadTarjetasRojas() {
        return cantidadTarjetasRojas;
    }
    
    //Métodos para agregar tarjetas y goles
    /**
    * Agrega una tarjeta amarilla a la participacion
    */
     public void agregarTarjetaAmarilla() {
         cantidadTarjetasAmarillas+=1;
     }
     /**
    * Agrega una tarjeta roja a la participacion
    */
     public void agregarTarjetaRoja() {
         cantidadTarjetasRojas+=1;
     }
     /**
    * Agrega un gol a la participacion
    */
      public void agregarGol() {
         cantidadGoles+=1;
      }
}
