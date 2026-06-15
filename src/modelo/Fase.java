/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 * Clase "Fase", representa una etapa del torneo mundialista.
 * Cada fase puede incluir varios grupos y partidos,
 * dependiendo de la instancia del campeonato.
 *
 * Relaciones principales:
 * - Grupo: lista de grupos que forman parte de esta fase.
 * - Partido: lista de partidos que se disputan en esta fase.
 *
 * Atributos:
 * - nombre: nombre de la fase (ej. GRUPOS, OCTAVOS, CUARTOS, SEMIFINAL, FINAL).
 * - listaGruposQueIncluye: grupos que integran la fase.
 * - listaPartidosFase: partidos que se juegan en la fase.
 *
 * Métodos de utilidad:
 * - agregarGrupos(Grupo s): añade un grupo a la fase.
 * - agregarPartidos(Partido s): añade un partido a la fase.
 *
 * @authors Ramírez Maricela
 */

import enumeracion.NombreFase;// se importa NombreFase, que son las opciones disponibles de nombres que puede tomar la fase
import java.util.ArrayList;

public class Fase {
    private NombreFase nombre;
    private ArrayList<Grupo> listaGruposQueIncluye;
    private ArrayList<Partido> listaPartidosFase;
    
    //constructor

    public Fase(NombreFase nombre) {
        this.nombre = nombre;
        this.listaGruposQueIncluye=new ArrayList <>();
        this.listaPartidosFase=new ArrayList <>();
    }
    
    //setters

    public void setNombre(NombreFase nombre) {
        this.nombre = nombre;
    }
    
    //getters

    public NombreFase getNombre() {
        return nombre;
    }

    public ArrayList<Grupo> getListaGruposQueIncluye() {
        return listaGruposQueIncluye;
    }

    public ArrayList<Partido> getListaPartidosFase() {
        return listaPartidosFase;
    }
    //Métodos
    /**
     * Agregar grupos añade un grupo a lista de grupos que estan en esta fase
     * @param s es el grupo a añadir
     */
    public void agregarGrupos(Grupo s){
        listaGruposQueIncluye.add(s);
    }
    /**
     * Agregar partidos añade un partido jugado en esta fase
     * @param s es el partido a agregar de tipo Partido
     */
    public void agregarPartidos(Partido s){
        listaPartidosFase.add(s);
    }
    
    
}
