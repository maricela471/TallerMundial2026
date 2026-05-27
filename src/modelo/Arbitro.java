package modelo;

/**
 *
 * @author USUARIO
 */

public class Arbitro extends Persona {
    private int aniosExperiencia;

    //constructor

    public Arbitro(String nombre, int fechaNacimiento, int aniosExperiencia) {
        super(nombre, fechaNacimiento);
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //setters

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //getters

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
}