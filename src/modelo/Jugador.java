package modelo;

import enumeracion.Posicion;

public class Jugador extends Persona {

    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;

    public Jugador(String nombre, int fechaNacimiento, int dorsal,
                   Posicion posicion, float peso, float altura) {
        super(nombre, fechaNacimiento);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.peso = peso;
        this.altura = altura;
    }

    //setters

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //getters

    public int getDorsal() {
        return dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }


    

}
