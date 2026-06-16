package modelo;

/**
 * Clase "DirectorTecnico", representa al entrenador principal
 * de una selección nacional en el torneo mundialista.
 * Extiende de la clase Persona, heredando atributos como
 * nombre y fecha de nacimiento, y añade la fecha en que
 * fue nombrado como director técnico.
 *
 * Relaciones principales:
 * - Selección: cada director técnico está asociado a una selección.
 *
 * Atributos:
 * - fechaNombramiento: año en que fue designado como director técnico.
 *
 * Métodos de utilidad:
 * - setFechaNombramiento(int fechaNombramiento): establece la fecha de nombramiento.
 * - getFechaNombramiento(): devuelve la fecha de nombramiento.
 *
 * Esta clase permite modelar la identidad y trayectoria
 * de los entrenadores que dirigen las selecciones en el torneo,
 * vinculándolos con su rol estratégico y su designación oficial.
 *
 * @author Ramírez Maricela
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
