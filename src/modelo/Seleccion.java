/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Seleccion {
    private  String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private Integer rankingFIFA;
    private DirectorTecnico directorTecnico;
    private CuerpoTecnico cuerpoTecnico;
    private ArrayList <Jugador> listaJugadores;
    
    //constructor

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo, Integer rankingFIFA,DirectorTecnico directorTecnico, CuerpoTecnico cuerpoTecnico) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
        this.directorTecnico = directorTecnico;
        this.cuerpoTecnico = cuerpoTecnico;
        this.listaJugadores = listaJugadores;
        
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

