/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enumeracion.TipoEvento;
import java.util.ArrayList;


/**
 * Representa la participación de una selección en un partido.
 * Contiene información sobre si la selección juega como local o visitante,
 * la cantidad de goles convertidos y las tarjetas recibidas durante el encuentro.
 *
 * Relaciones principales:
 * - Partido: cada participación pertenece a un partido específico.
 * - Selección: referencia a la selección que participa en el partido.
 *
 * Atributos:
 * - esLocal: indica si la selección juega como local.
 * - cantidadGoles: número de goles anotados por la selección.
 * - cantidadTarjetasAmarillas: tarjetas amarillas recibidas.
 * - cantidadTarjetasRojas: tarjetas rojas recibidas.
 *
 * Métodos de utilidad:
 * - agregarGol(): incrementa la cantidad de goles.
 * - agregarTarjetaAmarilla(): incrementa la cantidad de tarjetas amarillas.
 * - agregarTarjetaRoja(): incrementa la cantidad de tarjetas rojas.
 *
 * Esta clase funciona como vínculo entre Partido y Selección,
 * permitiendo modelar el desempeño de cada equipo dentro de un encuentro.
 *
 * @author Ramírez Maricela
 */

public class Participacion {
    private boolean esLocal;
    // Se agrega referencia al objeto Seleccion para acceder a todos sus datos,
    private Seleccion seleccion;
    private Partido partido;
    //constructor

    public Participacion(boolean esLocal,Seleccion seleccion,Partido partido) {
        this.esLocal = esLocal;
        
        this.seleccion=seleccion;
        this.partido=partido;
    }
    //setters

    public void setEsLocal(boolean esLocal) {
        this.esLocal = esLocal;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    

    

   
    
    //getters

    public boolean isEsLocal() {
        return esLocal;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    
   
/**
 * Cuenta la cantidad de goles convertidos por la selección en el partido.
 * No pueden existir dos goles en el mismo minuto.
 * @return cantidad de goles de la selección
 */
public int cantidadGoles() {
    int count = 0;
    ArrayList<Integer> minutosRegistrados = new ArrayList<>();

    for (Evento e : partido.getListaEventos()) {
        if (e.getTipo() == TipoEvento.GOL &&
            e.getJugador().getSeleccion().equals(seleccion)) {
            
            // Control: verificar que el minuto no esté repetido
            if (!minutosRegistrados.contains(e.getMinuto())) {
                minutosRegistrados.add(e.getMinuto());
                count++;
            }
        }
    }
    return count;
}


/**
 * Cuenta las tarjetas amarillas recibidas por la selección en el partido.
 * @return cantidad de tarjetas amarillas
 */
public int cantidadTarjetasAmarillas() {
    int count = 0;
    for (Evento e : partido.getListaEventos()) {
        if (e.getTipo() == TipoEvento.TARJETAAMARILLA &&
            e.getJugador().getSeleccion().equals(seleccion)) {
            count++;
        }
    }
    return count;
}

/**
 * Cuenta las tarjetas rojas recibidas por la selección en el partido.
 * @return cantidad de tarjetas rojas
 */
public int cantidadTarjetasRojas() {
    int count = 0;
    for (Evento e : partido.getListaEventos()) {
        if (e.getTipo() == TipoEvento.TARJETAROJA &&
            e.getJugador().getSeleccion().equals(seleccion)) {
            count++;
        }
    }
    return count;
}

}
