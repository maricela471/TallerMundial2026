package modelo;

/**
 * Clase "Arbitro", representa a un juez deportivo encargado
 * de dirigir los partidos del torneo mundialista.
 * Extiende de la clase Persona, heredando atributos como
 * nombre y fecha de nacimiento, y añade la experiencia
 * profesional en años.
 *
 * Relaciones principales:
 * - Partido: cada árbitro puede formar parte del arbitraje
 *   asignado a un partido.
 * - Arbitraje: los árbitros se agrupan dentro de un objeto
 *   Arbitraje que gestiona la lista de jueces de un encuentro.
 *
 * Atributos:
 * - aniosExperiencia: cantidad de años de experiencia del árbitro.
 *
 * Métodos de utilidad:
 * - setAniosExperiencia(int aniosExperiencia): establece la experiencia del árbitro.
 * - getAniosExperiencia(): devuelve la cantidad de años de experiencia.
 *
 
 * @author Ramírez Maricela
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