/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *La clase "Participacion" representa la relación entre "Seleccion" y "Partido"
 * @authors Ramirez maricela, Irigoyen Santiago, Cisnero Ismael
 */
public class Participacion {
    private boolean esLocal;
    
    //constructor

    public Participacion(boolean esLocal) {
        this.esLocal = esLocal;
    }
    //setters

    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }
    //getters

    public boolean isEsLocal() {
        return esLocal;
    }
    //métodos
    public int cantidadGoles() {
    return 0; // TODO: implementar
}

public int cantidadTarjAmarillas() {
    return 0; // TODO: implementar
}

public int cantidadTarjRojas() {
    return 0; // TODO: implementar
}
    
    
    
}
