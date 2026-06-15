/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.sql.Time;
import java. util. ArrayList;
/**
 * Representa un partido dentro del torneo mundialista.
 * Contiene la información esencial de cada encuentro jugado,
 * incluyendo fecha, horario, duración y tiempo adicional.
 *
 * Relaciones principales:
 * - Fase: el partido corresponde a una fase del torneo.
 * - Estadio: el partido se desarrolla en un estadio específico.
 * - Arbitraje: cada partido cuenta con un arbitraje asignado.
 * - Participaciones: lista de selecciones que participan en el partido.
 * - Eventos: lista de sucesos ocurridos durante el partido (goles, faltas, etc.).
 *
 * Esta clase permite gestionar tanto los datos básicos del partido
 * como las colecciones dinámicas de participaciones y eventos.
 *
 * @author Ramírez Maricela
 */

public class Partido {
    private Date fecha;
    private Time horario;
    private Integer duracion;
    private Integer tiempoAdicional;
    private Fase fase;
    private Estadio seDesarrolla;
    private ArrayList <Participacion> listaParticipaciones;
    private ArrayList<Evento> listaEventos;
    private Arbitraje arbitraje;
    
    //constructor

    public Partido() {
    }

    public Partido(Date fecha, Time horario, Integer duracion, Integer tiempoAdicional,Fase fase,Estadio seDesarrolla,Arbitraje arbitraje) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.fase=fase;
        this.seDesarrolla=seDesarrolla;
        this.arbitraje=arbitraje;
        this.listaEventos=new ArrayList<>();
        this.listaParticipaciones=new ArrayList<>();
    }
    //setters

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setTiempoAdicional(Integer tiempoAdicional) {
        this.tiempoAdicional = tiempoAdicional;
    }

    public void setArbitraje(Arbitraje arbitraje) {
        this.arbitraje = arbitraje;
    }

    public void setSeDesarrolla(Estadio seDesarrolla) {
        this.seDesarrolla = seDesarrolla;
    }
    
    
     //getters

    public Date getFecha() {
        return fecha;
    }

    public Time getHorario() {
        return horario;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getTiempoAdicional() {
        return tiempoAdicional;
    }

    public Fase getFase() {
        return fase;
    }

    public Estadio getSeDesarrolla() {
        return seDesarrolla;
    }

    public Arbitraje getArbitraje() {
        return arbitraje;
    }
    

    public ArrayList<Participacion> getListaParticipaciones() {
        return listaParticipaciones;
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    
    //Métodos para los Arrays
    /**
     * el metodo agrega  eventos a la lista de eventos
     * @param e es el evento a agregar
     */
 
    public void agregarEventos(Evento e){
        listaEventos.add(e);
    }
    /**
     * El metodo elimina  eventos a la lista de eventos
     * @param e es el evento a eliminar
     */
    public void eliminarEvento(Evento e){
        listaEventos.remove(e);
    }
    /**
     * El metodo agrega  una participacion a la lista de participaciones
     * @param p es la participacion  a agregar
     */
    public void agregarParticipacion(Participacion p){
        listaParticipaciones.add(p);
    }
    
    /**
     * El metodo elimina  una participacion a la lista de participaciones
     * @param p es la participacion  a eliminar
     */
    public void eliminarParticipacion(Participacion p){
        listaParticipaciones.remove(p);
    }
}
