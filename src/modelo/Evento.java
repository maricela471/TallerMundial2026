package modelo;

import enumeracion.TipoEvento;

/**
 * Clase "Evento", representa un suceso ocurrido durante un partido
 * del torneo mundialista. Los eventos pueden incluir goles, faltas,
 * tarjetas amarillas, tarjetas rojas u otras incidencias relevantes.
 *
 * Relaciones principales:
 * - TipoEvento: enumeración que define el tipo de evento (ej. GOL, TARJETA_AMARILLA, TARJETA_ROJA).
 * - Jugador: futbolista involucrado en el evento.
 * - Partido: cada evento está asociado a un partido específico.
 *
 * Atributos:
 * - tipo: tipo de evento ocurrido (gol, tarjeta, etc.).
 * - minuto: minuto del partido en que se produce el evento.
 * - jugador: jugador protagonista del evento.
 *
 * Esta clase permite registrar y gestionar las incidencias
 * que ocurren durante el desarrollo de los partidos,
 * manteniendo un historial detallado de lo sucedido.
 *
 * @author Ramírez Maricela
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

