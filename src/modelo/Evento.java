package modelo;

import enumeracion.TipoEvento;

/**
 * Representa un evento ocurrido durante un partido, como un gol, tarjeta amarilla o roja.
 *
 * @author USUARIO
 */
public class Evento {

    private TipoEvento tipo;
    private int minuto;
    private Jugador jugador;

    
    public Evento(TipoEvento tipo, int minuto, Jugador jugador) {
        this.tipo = tipo;
        this.minuto = minuto;
        this.jugador = jugador;
    }

    //setters

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    //getters

    public TipoEvento getTipo() {
        return tipo;
    }

    public int getMinuto() {
        return minuto;
    }

    public Jugador getJugador() {
        return jugador;
    }

}

