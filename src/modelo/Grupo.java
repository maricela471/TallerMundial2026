/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 * Clase "Grupo", representa un conjunto de selecciones
 * que compiten entre sí en la fase de grupos del torneo.
 *
 * Relaciones principales:
 * - Selección: lista de selecciones que integran el grupo.
 * - Fase: lista de fases en las que participa el grupo.
 * - Partido: los partidos de las fases permiten calcular
 *   los puntos de cada selección dentro del grupo.
 *
 * Atributos:
 * - identificacion: nombre o clave del grupo (ej. Grupo A).
 * - descripcion: detalle adicional del grupo.
 * - listaSelecciones: selecciones que forman parte del grupo.
 * - listaFases: fases en las que está incluido el grupo.
 *
 * Métodos de utilidad:
 * - agregarSeleccion(Seleccion s): añade una selección al grupo.
 * - eliminarSeleccion(Seleccion s): elimina una selección del grupo.
 * - obtenerPuntos(Seleccion s): calcula los puntos obtenidos por una
 *   selección en todas las fases y partidos disputados:
 *   * Victoria: 3 puntos
 *   * Empate: 1 punto
 *   * Derrota: 0 puntos
 *
 * Esta clase permite organizar las selecciones en grupos,
 * gestionar su participación en las fases del torneo y
 * calcular su desempeño en función de los partidos jugados.
 *
 * @author Ramírez Maricela
 */

public class Grupo {
    private String identificacion;
    private String descripcion;
    private ArrayList<Seleccion> listaSelecciones;
    private Fase fase;
    private ArrayList<Participacion>listaparticipaciones;
     //constructor
    public Grupo (String identificacion, String descripcion,Fase fase){
        this.identificacion=identificacion;
        this.descripcion=descripcion;
        this.fase=fase;
        this.listaSelecciones=new ArrayList<Seleccion>();
        this.listaparticipaciones= new ArrayList<Participacion>();
           
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

    public Fase getFase() {
        return fase;
    }

    public ArrayList<Participacion> getListaparticipaciones() {
        return listaparticipaciones;
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

    public void setFase(Fase fase) {
        this.fase = fase;
    }
    
    /**
 * Calcula los puntos obtenidos por una selección en la fase de grupos.
 * Recorre los partidos de la fase y según el resultado asigna:
 * - Victoria: 3 puntos
 * - Empate: 1 punto
 * - Derrota: 0 puntos
 * @param s la selección de la cual se desea calcular los puntos
 * @return el total de puntos acumulados por la selección
 */
public int obtenerPuntos(Seleccion s) {
    int puntos = 0;
    for (Partido partido : fase.getListaPartidosFase()) {
        Participacion miParticipacion = null;
        Participacion rival = null;
        for (Participacion p : partido.getListaParticipaciones()) {
            if (p.getSeleccion().equals(s)) {
                miParticipacion = p;
            } else {
                rival = p;
            }
        }
        if (miParticipacion != null && rival != null) {
            if (miParticipacion.getCantidadGoles() > rival.getCantidadGoles()) puntos += 3;
            else if (miParticipacion.getCantidadGoles().equals(rival.getCantidadGoles())) puntos += 1;
        }
    }
    return puntos;
}
         
     }