/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase abstracta "Persona", sirve como clase base para modelar
 * individuos dentro del torneo mundialista. Esta clase abstracta permite definir una estructura común
 * para todas las personas involucradas en el torneo, facilitando
 * la reutilización y la extensión en clases derivadas.
 *
 * Atributos:
 * - nombre: nombre completo de la persona.
 * - fechaNacimiento: año de nacimiento de la persona.
 *
 * Métodos de utilidad:
 * - setNombre(String nombre): establece el nombre de la persona.
 * - getNombre(): devuelve el nombre de la persona.
 * - setFechaNacimiento(Integer fechaNacimiento): establece la fecha de nacimiento.
 * - getFechaNacimiento(): devuelve la fecha de nacimiento.
 *
 *
 * @author Ramírez Maricela
 */

public abstract class  Persona {
    private String nombre;
    private Integer fechaNacimiento;
   
    //constructor
    public Persona(String nombre,Integer fechaNacimiento){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
    }
    
    //métodos getters
    public String getNombre() {
        return nombre;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }
    //métodos setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
