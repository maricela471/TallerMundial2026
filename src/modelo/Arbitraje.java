package modelo;

import enumeracion.CategoriaArbitro;

/**
 * Clase "Arbitraje", representa la asignación de un árbitro
 * a un partido junto con el rol que desempeña.
 *
 * Relaciones principales:
 * - Arbitro: juez deportivo asignado al partido.
 * - CategoriaArbitro: enumeración que define el rol del árbitro
 *   (ej. principal, asistente, cuarto árbitro).
 *
 * Atributos:
 * - arbitro: árbitro asignado al partido.
 * - rol: rol específico del árbitro dentro del encuentro.
 *
 * Métodos de utilidad:
 * - setArbitro(Arbitro arbitro): establece el árbitro asignado.
 * - getArbitro(): devuelve el árbitro asignado.
 * - setRol(CategoriaArbitro rol): establece el rol del árbitro.
 * - getRol(): devuelve el rol del árbitro.
 *
 * @author Ramírez Maricela
 */

public class Arbitraje {
    private Arbitro arbitro;
    private CategoriaArbitro rol;
    private Partido partido;
    

    //constructor 

    public Arbitraje(Arbitro arbitro, CategoriaArbitro rol,Partido partido) {
        this.arbitro = arbitro;
        this.rol = rol;
        this.partido=partido;
    }

    //setters

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    
    public void setRol(CategoriaArbitro rol) {
        this.rol = rol;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    

    //getters

    public Arbitro getArbitro() {
        return arbitro;
    }

    public CategoriaArbitro getRol() {
        return rol;
    }

    public Partido getPartido() {
        return partido;
    }
    

}
