/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 * Representa una selección nacional participante en el torneo mundialista.
 * Contiene la información principal de la federación, indumentaria,
 * posición en el ranking FIFA y su cuerpo técnico.
 *
 * Relaciones principales:
 * - Jugador: lista de jugadores convocados que integran la selección.
 * - DirectorTecnico: entrenador principal responsable del equipo.
 * - CuerpoTecnico: staff de apoyo técnico de la selección.
 * - Grupo: la selección se integra en un grupo de la fase inicial del torneo.
 * - País: cada selección representa a un país específico.
 * - Participacion: lista de participaciones que vinculan la selección con partidos.
 *
 * A través de las participaciones se puede acceder a los partidos
 * y al desempeño de la selección en cada encuentro.
 *
 * @author Ramírez Maricela
 */

public class Seleccion {
    private  String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private Integer rankingFIFA;
    private DirectorTecnico directorTecnico;
    private CuerpoTecnico cuerpoTecnico;
    private Grupo grupo;
    private Pais pais;
    private ArrayList <Jugador> listaJugadores;
    private ArrayList<Participacion> listaPartidos;

    
    //constructor

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo, Integer rankingFIFA,DirectorTecnico directorTecnico, CuerpoTecnico cuerpoTecnico, Grupo grupo, Pais pais) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.directorTecnico = directorTecnico;
        this.cuerpoTecnico = cuerpoTecnico;
        this.grupo=grupo;
        this.pais=pais;
        this.listaJugadores = new ArrayList <>();
        this.listaPartidos = new ArrayList <>();
        
    }
    //setters

    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public void setCamisetaPrincipal(String camisetaPrincipal) {
        this.camisetaPrincipal = camisetaPrincipal;
    }

    public void setCamisetaSecundaria(String camisetaSecundaria) {
        this.camisetaSecundaria = camisetaSecundaria;
    }

    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }

    public void setRankingFIFA(Integer rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public void setCuerpoTecnico(CuerpoTecnico cuerpoTecnico) {
        this.cuerpoTecnico = cuerpoTecnico;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    


    
    
    //getters

    public String getNombreFederacion() {
        return nombreFederacion;
    }

    public String getCamisetaPrincipal() {
        return camisetaPrincipal;
    }

    public String getCamisetaSecundaria() {
        return camisetaSecundaria;
    }

    public boolean isCabezaGrupo() {
        return cabezaGrupo;
    }

    public Integer getRankingFIFA() {
        return rankingFIFA;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public CuerpoTecnico getCuerpoTecnico() {
        return cuerpoTecnico;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Pais getPais() {
        return pais;
    }

    public ArrayList<Participacion> getListaPartidos() {
        return listaPartidos;
    }
    
    //Métodos
    
    /**
     * Agrega un jugador a la lista de jugadores de la selección.
     * @param s el jugador a agregar
     */
    public void agregarJugador(Jugador s){
        if(s != null){
            if(!s.getNombre().isEmpty()){
            listaJugadores.add(s);
        }
            else{
                System.out.println("Los datos del jugador no estan completos ");
            }    
       
    }
    }
    
    /**
     * Elimina un jugador de la lista de jugadore de la seleccion.
     * @param s el jugador a eliminar
     */
    public void eliminarJugador(Jugador s){
        listaJugadores.remove(s);
    }
    
  
}

