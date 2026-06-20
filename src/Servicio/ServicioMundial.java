/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import java.util.*;
import modelo.*;

/**
 * Genera y muestra en consola la tabla de posiciones de un grupo.
 *
 * El método realiza los siguientes pasos:
 * - Obtiene la lista de selecciones pertenecientes al grupo.
 * - Ordena las selecciones según los puntos acumulados, utilizando
 *   el comparador {@link ComparadorSeleccionPorPuntos}.
 * - Imprime en consola el encabezado de la tabla con la identificación
 *   del grupo.
 * - Recorre la lista ordenada e imprime el nombre del país de cada
 *   selección junto con la cantidad de puntos obtenidos en el grupo.
 *
 * @param g el grupo del cual se desea mostrar la tabla de posiciones.
 */

public class ServicioMundial {
    public void tablaPosicionesPorGrupos(Grupo g){
      ArrayList<Seleccion> listaOrdenada = new ArrayList<>(g.getListaSelecciones());
      Collections.sort(listaOrdenada, new ComparadorSeleccionPorPuntos(g));
      System.out.println("TABLA DE POSICIONES DEL GRUPO "+g.getIdentificacion());
      for(Seleccion s:listaOrdenada){
         System.out.println(s.getPais().getNombre() + ": " + g.obtenerPuntos(s) + " puntos");
      }
       
    }
    
}
