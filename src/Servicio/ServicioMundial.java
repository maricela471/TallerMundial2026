/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import java.util.*;
import modelo.*;
import enumeracion.*;



public class ServicioMundial {
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
    public void tablaPosicionesPorGrupos(Grupo g){
      ArrayList<Seleccion> listaOrdenada = new ArrayList<>(g.getListaSelecciones());
      Collections.sort(listaOrdenada, new ComparadorSeleccionPorPuntos(g));
      System.out.println("TABLA DE POSICIONES DEL GRUPO "+g.getIdentificacion());
      for(Seleccion s:listaOrdenada){
         System.out.println(s.getPais().getNombre() + ": " + g.obtenerPuntos(s) + " puntos");
      }
       
    }
        /**
     * rankingGoleadoresMundial recorre todas las fases del mundial y sus partidos,
     * identificando los eventos de tipo GOL para construir una lista de jugadores goleadores.
     * 
     * El método:
     * - Recorre cada fase y partido.
     * - Verifica los eventos de tipo GOL.
     * - Agrega a la lista de goleadores los jugadores que anotaron, evitando duplicados.
     * - Ordena la lista de goleadores.
     * - Imprime en consola el ranking de goleadores del mundial.
     *
     * @param listaFase lista de fases del mundial que contienen partidos y eventos
     */

    public void rankingGoleadoresMundial(ArrayList<Fase>listaFase){
        ArrayList<Jugador> listaGoleadores = new ArrayList<>();
        for (Fase f:listaFase){
            for(Partido p:f.getListaPartidosFase()){
                for(Evento e:p.getListaEventos() ){
                    if(e.getTipo()==TipoEvento.GOL){
                        Jugador j=e.getJugador();
                        if(!listaGoleadores.contains(j)){
                        listaGoleadores.add(e.getJugador());
                        }
                    }
                        
                }
            }
        }
    Collections.sort(listaGoleadores);
    System.out.println("RANKING GOLEADORES DEL MUNDIAL");
    for(Jugador j:listaGoleadores){
        System.out.println(j.getNombre());
    }
    }
     /**
     * listadoTarjetasPorSeleccion calcula y muestra en consola la cantidad de tarjetas
     * recibidas por los jugadores de una selección determinada durante el mundial.
     * 
     * El método:
     * - Recorre todos los jugadores de la selección indicada.
     * - Analiza los eventos asociados a cada jugador.
     * - Cuenta las tarjetas de tipo DOBLEAMARILLA, TARJETAAMARILLA y TARJETAROJA.
     * - Imprime en consola el nombre de la federación y el detalle de tarjetas acumuladas.
     *
     * @param s selección de la cual se listarán las tarjetas recibidas por sus jugadores
     */

    
     public void listadoTarjetasPorSeleccion(Seleccion s){
         int cantTarjetasAmarillas=0;
         int cantTarjetasRojas=0;
         int cantDobleAmarilla=0;
         System.out.println("LISTADO DE TARJETAS DE SELECCION: "+s.getNombreFederacion());
         for(Jugador j:s.getListaJugadores()){
             for (Evento e:j.getListaEventos()){
                 if(e.getTipo()==TipoEvento.DOBLEAMARILLA){
                     cantDobleAmarilla+=1;
                 }
                 if(e.getTipo()==TipoEvento.TARJETAAMARILLA){
                     cantTarjetasAmarillas+=1;
               
                 }
                 if(e.getTipo()==TipoEvento.TARJETAROJA){
                     cantTarjetasRojas+=1;
                 }
             }
         }
         System.out.println("Tarjetas doble amarilla: "+cantDobleAmarilla);
         System.out.println("Tarjetas amarillas: "+cantTarjetasAmarillas);
         System.out.println("Tarjetas rojas: "+cantTarjetasRojas);
         
     }
         /**
     * listadoTarjetaPorJugadores muestra en consola la cantidad de tarjetas
     * recibidas por cada jugador de una selección determinada.
     * 
     * El método:
     * - Recorre todos los jugadores de la selección indicada.
     * - Analiza los eventos asociados a cada jugador.
     * - Cuenta las tarjetas de tipo DOBLEAMARILLA, TARJETAAMARILLA y TARJETAROJA.
     * - Imprime en consola el nombre del jugador junto con el detalle de tarjetas acumuladas.
     *
     * @param s selección cuyos jugadores serán evaluados para listar las tarjetas recibidas
     */

     public void listadoTarjetaPorJugadores(Seleccion s){
         System.out.println("LISTADO DE CANTIDAD DE TARJETAS POR JUGADOR");
         for(Jugador j:s.getListaJugadores()){
             int cantDobleAmarilla=0;
             int cantTarjetasAmarillas=0;
             int cantTarjetasRojas=0;
             
            for(Evento e:j.getListaEventos()){
                if(e.getTipo()==TipoEvento.DOBLEAMARILLA){
                     cantDobleAmarilla+=1;
                 }
                 if(e.getTipo()==TipoEvento.TARJETAAMARILLA){
                     cantTarjetasAmarillas+=1;
               
                 }
                 if(e.getTipo()==TipoEvento.TARJETAROJA){
                     cantTarjetasRojas+=1;
                 }
                 
            }
            System.out.println("Jugador: "+j.getNombre());
            System.out.println("Cantidad de doble amarilla: "+cantDobleAmarilla);
            System.out.println("Cantidad de tarjetas amarillas: "+cantTarjetasAmarillas);
            System.out.println("Cantidad de tarjetas rojas: "+cantTarjetasRojas);
                
         }
     }
     /**
 * Genera y muestra por consola la ficha técnica de un partido.
 * 
 * La ficha incluye:
 * - Encabezado con el título "FICHA TECNICA DEL PARTIDO".
 * - Alineación de cada selección participante en formato defensores-mediocampistas-delanteros,
 *   calculada a partir de la lista de jugadores y sus posiciones.
 * - Listado de eventos ocurridos en el partido (tipo de evento, minuto y jugador involucrado).
 * - Resultado final de cada selección, mostrando la cantidad de goles convertidos.
 *
 * Parámetros:
 * @param p Partido del cual se desea imprimir la ficha técnica.
 *
 * Detalles de implementación:
 * - Se recorre la lista de participaciones del partido para obtener cada selección.
 * - Se cuentan los jugadores según su posición (DELANTERO, MEDIOCAMPISTA, DEFENSOR).
 * - Se imprime la alineación de cada selección en formato clásico (ejemplo: 4-4-2).
 * - Se recorren los eventos registrados en el partido, mostrando tipo, minuto y jugador.
 * - Finalmente, se imprime el marcador con los goles de cada selección.
 *
 * Uso típico:
 * fichaTecnicaDePartido(partido);
 * 
 * @author Ramírez Maricela
 */

     public void fichaTecnicaDePartido(Partido p){
         System.out.println("FICHA TECNICA DEL PARTIDO");
          for(Participacion e:p.getListaParticipaciones()){
             Seleccion s=e.getSeleccion();
             int cantDelanteros=0;
             int cantMedioCampista=0;
             int cantDefensores=0;
               for(Jugador j:s.getListaJugadores()){
                 if(j.getPosicion()==Posicion.DELANTERO){
                     cantDelanteros+=1;
                 }
                 if(j.getPosicion()==Posicion.MEDIOCAMPISTA){
                     cantMedioCampista+=1;
                 }
                 if(j.getPosicion()==Posicion.DEFENSOR){
                     cantDefensores+=1;
                 }
                 
             }
               System.out.println("Alineacion de la seleccion "+s.getNombreFederacion()+": "+ cantDefensores+"-"+cantMedioCampista+"-"+cantDelanteros);
         }
          for(Evento e:p.getListaEventos()){
              System.out.println(e.getTipo()+":"+e.getMinuto()+"minutos. Jugador: "+e.getJugador().getNombre());
          }
          for(Participacion part : p.getListaParticipaciones()){
    System.out.println(part.getSeleccion().getNombreFederacion() + ": " + part.cantidadGoles() + " goles");
}
       
     
     } 
     public void estadisticaEstadio(Estadio e){
         int cantPartidos=0;
         for(Partido p:e.getListaPartidos()){
             cantPartidos+=1;
         }
         System.out.println("La cantidad de partidos jugados en el estadio "+e.getNombre()+":"+cantPartidos);
         
     }
     public void estadisticaPorSede(Mundial m,String ciudad){
         int cantPartidos=0;
         for (Sede s:m.getListaSedes()){
             if(s.getCiudad().equals(ciudad)){
                 for(Estadio t:s.getListaTieneEstadio()){
                  for (Partido p:t.getListaPartidos())
                      cantPartidos+=1;
             }
         }
         
     }
         
    System.out.println("En la ciudad " + ciudad + " se jugaron " + cantPartidos + " partidos");    
}
}
    
