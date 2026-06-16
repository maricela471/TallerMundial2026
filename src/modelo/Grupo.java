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
    private ArrayList<Fase>listaFases;
     //constructor
    public Grupo (String identificacion, String descripcion){
        this.identificacion=identificacion;
        this.descripcion=descripcion;
        this.listaSelecciones=new ArrayList<>();
        this.listaFases=new ArrayList<>();
           
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

    public ArrayList<Fase> getListaFases() {
        return listaFases;
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
    /**
 * Calcula la cantidad de puntos obtenidos por una selección
 * a lo largo de todas las fases y partidos disputados.
 *
 * Recorre cada fase del torneo y sus partidos, identificando
 * la participación de la selección indicada. Según el resultado
 * del partido, asigna los puntos correspondientes:
 * - Victoria: 3 puntos
 * - Empate: 1 punto
 * - Derrota: 0 puntos
 *
 * @param s la selección de la cual se desea calcular los puntos.
 * @return el total de puntos acumulados por la selección en el torneo.
 */

     public int obtenerPuntos(Seleccion s) {
    int puntos = 0;
    for (Fase fase : listaFases) {//primer for recorre las fases
        for (Partido partido : fase.getListaPartidosFase()) {// recorre cada partido de esa fase
            Participacion p1 = partido.getParticipacion1();//asigna a cada equipo que participo una identificacion
            Participacion p2 = partido.getParticipacion2();
            
            if (p1.getSeleccion().equals(s)) {//compara, si el contenido de los objeto es el mismo
                if (p1.getCantidadGoles() > p2.getCantidadGoles()) puntos += 3;
                else if (p1.getCantidadGoles().equals(p2.getCantidadGoles())) puntos += 1;
            } else if (p2.getSeleccion().equals(s)) {
                if (p2.getCantidadGoles() > p1.getCantidadGoles()) puntos += 3;
                else if (p2.getCantidadGoles().equals(p1.getCantidadGoles())) puntos += 1;
            }
        }
    }
    return puntos;
}
         
     }

