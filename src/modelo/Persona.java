/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
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
