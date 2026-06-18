package modelo;

import enumeracion.Rol;
/**
 * Clase "CuerpoTecnico", representa al conjunto de profesionales
 * que acompañan y asisten al Director Técnico en la conducción
 * de una selección nacional durante el torneo mundialista.
 *
 * Relaciones principales:
 * - Selección: cada cuerpo técnico está asociado a una selección.
 * - DirectorTecnico: trabaja en conjunto con el entrenador principal.
 *
 * Atributos típicos:
 * - nombre: nombre del integrante del cuerpo técnico.
 * - rol: función específica dentro del cuerpo técnico
 *   (ej. preparador físico, asistente técnico, médico).
 * - fechaIncorporacion: año en que se incorporó al cuerpo técnico.
 *
 * Métodos de utilidad:
 * - setRol(String rol): establece la función del integrante.
 * - getRol(): devuelve la función asignada.
 * - setFechaIncorporacion(int fecha): define la fecha de incorporación.
 * - getFechaIncorporacion(): devuelve la fecha de incorporación.
 *
 * @author Ramírez Maricela
 */


public class CuerpoTecnico extends Persona {

    private Rol rol;
    private Seleccion seleccion;

    public CuerpoTecnico(String nombre, int fechaNacimiento, Rol rol,Seleccion seleccion) {
        super(nombre, fechaNacimiento);
        this.rol = rol;
        this.seleccion=seleccion;
    }

    //setters

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }
    

    //getters
    
    public Rol getRol() {
        return rol;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }
    


}