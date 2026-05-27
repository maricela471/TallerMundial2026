package modelo;

import enumeracion.Rol;

/**
 *
 * @author USUARIO
 */

public class CuerpoTecnico extends Persona {

    private Rol rol;

    public CuerpoTecnico(String nombre, int fechaNacimiento, Rol rol) {
        super(nombre, fechaNacimiento);
        this.rol = rol;
    }

    //setters

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //getters
    
    public Rol getRol() {
        return rol;
    }


}