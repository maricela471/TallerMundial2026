package modelo;

/*
 *
 * @author USUARIO
 */

public class DirectorTecnico extends Persona {

    private int fechaNombramiento;

    
    public DirectorTecnico(String nombre, int fechaNacimiento, int fechaNombramiento) {
        super(nombre, fechaNacimiento);
        this.fechaNombramiento = fechaNombramiento;
    }

    //setters

    public void setFechaNombramiento(int fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    //getters

    public int getFechaNombramiento() {
        return fechaNombramiento;
    }

    

    
}
