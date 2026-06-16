package modelo;
import java.util.ArrayList;
import enumeracion.Posicion;
/**
 * Clase "Jugador", representa a un futbolista convocado por una selección
 * para participar en el torneo mundialista.
 *
 * Relaciones principales:
 * - Selección: cada jugador pertenece a una selección nacional.
 * - Evento: los jugadores pueden estar involucrados en eventos
 *   registrados durante los partidos (goles, faltas, tarjetas).
 *
 * Atributos típicos:
 * - nombre: nombre completo del jugador.
 * - posicion: posición en el campo (ej. arquero, defensor, mediocampista, delantero).
 * - numeroCamiseta: número de camiseta asignado al jugador.
 * - edad: edad del jugador durante el torneo.
 *
 * Esta clase permite modelar la identidad y características
 * de cada futbolista, vinculándolos con su selección y con
 * los eventos que ocurren en los partidos.
 *
 * @author Ramírez Maricela
 */


public class Jugador extends Persona {

    private int dorsal;
    private Posicion posicion;
    private float peso;
    private float altura;
    private Seleccion seleccion;
    private ArrayList<Evento>listaEventos;
    

    public Jugador(String nombre, int fechaNacimiento, int dorsal,
                   Posicion posicion, float peso, float altura,Seleccion seleccion) {
        super(nombre, fechaNacimiento);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.peso = peso;
        this.altura = altura;
        this.seleccion=seleccion;
        this.listaEventos= new ArrayList <>();
        
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

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
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

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }
    
    //Métodos
    /**
 * Agrega un evento a la lista de eventos ocurridos en el partido.
 *
 * Este método permite registrar un nuevo suceso dentro del encuentro,
 * como goles, faltas o tarjetas. El evento se añade a la colección
 * de eventos del partido, manteniendo un historial completo de lo
 * sucedido durante el juego.
 *
 * @param e el evento a agregar, de tipo Evento.
 */

    public void agregarEventos(Evento e){
        listaEventos.add(e);
    }


    

}
