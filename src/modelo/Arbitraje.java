package modelo;

import enumeracion.CategoriaArbitro;

/**
 *
 * @author USUARIO
 */

public class Arbitraje {
    private Arbitro arbitro;
    private CategoriaArbitro rol;

    //constructor 

    public Arbitraje(Arbitro arbitro, CategoriaArbitro rol) {
        this.arbitro = arbitro;
        this.rol = rol;
    }

    //setters

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
    
    public void setRol(CategoriaArbitro rol) {
        this.rol = rol;
    }

    //getters

    public Arbitro getArbitro() {
        return arbitro;
    }

    public CategoriaArbitro getRol() {
        return rol;
    }

}
