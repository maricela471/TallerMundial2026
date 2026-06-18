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
 * - Participaciones: dos objetos identificados contipo participacion.
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
    private ArrayList<Participacion>listaParticipaciones;
    private ArrayList<Evento> listaEventos;
    private ArrayList<Arbitraje> arbitraje;
    
    //constructor

   

    public Partido(Date fecha, Time horario, Integer duracion, Integer tiempoAdicional,Fase fase,Estadio seDesarrolla ) {
        this.fecha = fecha;
        this.horario = horario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
        this.fase=fase;
        this.seDesarrolla=seDesarrolla;
        this.arbitraje=new ArrayList<Arbitraje>();
        this.listaParticipaciones=new ArrayList<Participacion>();
        this.listaEventos=new ArrayList<Evento>();
        
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

    
    public void setSeDesarrolla(Estadio seDesarrolla) {
        this.seDesarrolla = seDesarrolla;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
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

    public ArrayList<Participacion> getListaParticipaciones() {
        return listaParticipaciones;
    }
    

  
        

    public ArrayList<Arbitraje> getListaArbitraje() {
        return arbitraje;
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
     * el metodo agrega el arbitarje del partido
     * @param a es el arbitraje a agregar
     */
 
    public void agregararbitraje(Arbitraje a){
        arbitraje.add(a);
    }
    public void agregarParticipacion(Participacion p){
    listaParticipaciones.add(p);
}
}
