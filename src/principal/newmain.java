/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import modelo.*;
import enumeracion.*;


/**
 *
 * @author USUARIO
 */
public class newmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Crear objetos base
Mundial mundial1 = new Mundial(2026, "tigre", 11062026, 18072026);
Pais Argentina = new Pais("Argentina", "celeste y blanca",null);
Pais Uruguay = new Pais("Uruguay", "celeste y blanca",null);

// Crear selecciones
Seleccion seleccion1 = new Seleccion("Asociacion Argentina de Futbol", "celeste y blanca", "azul y blanca", true, 1, null, null, Argentina);
Seleccion seleccion2 = new Seleccion("Asociación Uruguaya de Fútbol", "celeste", "blanca", true, 16, null, null, Uruguay);
Argentina.setSeleccion(seleccion1);
Uruguay.setSeleccion(seleccion2);
// Crear fase y estadio
Fase faseGrupos = new Fase(NombreFase.GRUPOS);
Estadio estadio1 = new Estadio("Estadio Monumental", 84000,null);

// Crear partido
Partido partido1 = new Partido(null, null, 90, 0, faseGrupos, estadio1);

// Crear participaciones
Participacion p1 = new Participacion(true, seleccion1, partido1);
Participacion p2 = new Participacion(false, seleccion2, partido1);

// Agregar participaciones al partido
partido1.agregarParticipacion(p1);
partido1.agregarParticipacion(p2);

// Agregar eventos (goles)
Jugador jugador1 = new Jugador("Messi", 19870624, 10, Posicion.DELANTERO, 72, 1.70f, seleccion1);
partido1.agregarEventos(new Evento(TipoEvento.GOL, 45, jugador1));
partido1.agregarEventos(new Evento(TipoEvento.GOL, 78, jugador1));

// Armar grupo
faseGrupos.agregarPartidos(partido1);
Grupo grupoA = new Grupo("A", "Grupo A", faseGrupos);
grupoA.agregarSeleccion(seleccion1);
grupoA.agregarSeleccion(seleccion2);

// Probar
System.out.println("Puntos Argentina: " + grupoA.obtenerPuntos(seleccion1));
System.out.println("Puntos Uruguay: " + grupoA.obtenerPuntos(seleccion2));
     
}
}
