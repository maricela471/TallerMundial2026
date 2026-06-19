/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import modelo.Seleccion;
import modelo.Grupo;
import java.util.Comparator;

/**
 * Comparador de selecciones según los puntos obtenidos en el grupo.
 * Ordena de mayor a menor puntaje para generar la tabla de posiciones.
 * @author Ramírez Maricela
 */
public class ComparadorSeleccionPorPuntos implements Comparator<Seleccion> {
    private Grupo grupo;// grupo es atributo de la clase para poder acceder a los puntos
    
    public ComparadorSeleccionPorPuntos(Grupo grupo){
        this.grupo = grupo;
    }
    /**
 * Compara dos selecciones según sus puntos en el grupo.
 * El orden es descendente: mayor puntaje va primero.
 * @param s1 primera selección a comparar
 * @param s2 segunda selección a comparar
 * @return valor positivo si s2 tiene más puntos, negativo si s1 tiene más, cero si empatan
 */
    
    @Override
    public int compare(Seleccion s1, Seleccion s2){
        return grupo.obtenerPuntos(s2) - grupo.obtenerPuntos(s1);
    
}
    
}
