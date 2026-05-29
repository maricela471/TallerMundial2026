/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.sql.Time;
/**
 *la clase "partido" tiene la información de cada partido jugado
 * @author USUARIO
 */
public class Partido {
    private Date fecha;
    private Time gorario;
    private Integer duracion;
    private Integer tiempoAdicional;
    
    //constructor

    public Partido() {
    }

    public Partido(Date fecha, Time gorario, Integer duracion, Integer tiempoAdicional) {
        this.fecha = fecha;
        this.gorario = gorario;
        this.duracion = duracion;
        this.tiempoAdicional = tiempoAdicional;
    }
    //setters

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setGorario(Time gorario) {
        this.gorario = gorario;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setTiempoAdicional(Integer tiempoAdicional) {
        this.tiempoAdicional = tiempoAdicional;
    }
     //getters

    public Date getFecha() {
        return fecha;
    }

    public Time getGorario() {
        return gorario;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getTiempoAdicional() {
        return tiempoAdicional;
    }
    
    
    
    
    
}
