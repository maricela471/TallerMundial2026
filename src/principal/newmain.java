/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;
import modelo.*;
import enumeracion.*;
import Servicio.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author USUARIO
 */
public class newmain {
    public static void main(String[] args) {
        // Mundial
Mundial mundial = new Mundial(2026, "Pibe", 11062026, 18072026);

// Paises
Pais argentina = new Pais("Argentina", "celeste y blanca", null);
Pais brasil = new Pais("Brasil", "verde y amarilla", null);

// Fase y Grupo
Fase faseGrupos = new Fase(NombreFase.GRUPOS);
Grupo grupoA = new Grupo("A", "Grupo A", faseGrupos);

// Selecciones
Seleccion selArg = new Seleccion("AFA", "celeste y blanca", "azul", true, 1, null, grupoA, argentina);
Seleccion selBra = new Seleccion("CBF", "verde", "blanca", false, 3, null, grupoA, brasil);
argentina.setSeleccion(selArg);
brasil.setSeleccion(selBra);

// Jugadores
Jugador messi = new Jugador("Messi", 19870624, 10, Posicion.DELANTERO, 72, 1.70f, selArg);
Jugador vinicius = new Jugador("Vinicius", 20000712, 7, Posicion.DELANTERO, 73, 1.76f, selBra);
selArg.agregarJugador(messi);
selBra.agregarJugador(vinicius);

// Sede y Estadio
Sede sede1 = new Sede("Buenos Aires", 25f, "templado", "GMT-3", argentina, mundial);
Estadio estadio1 = new Estadio("Monumental", 84000, sede1);
sede1.agregarEstadio(estadio1);
mundial.agregarSede(sede1);

// Partido
Partido partido1 = new Partido(new java.util.Date(), new java.sql.Time(200000), 90, 5, faseGrupos, estadio1);
faseGrupos.agregarPartidos(partido1);
estadio1.agregarPartido(partido1);

// Participaciones
Participacion p1 = new Participacion(true, selArg, partido1);
Participacion p2 = new Participacion(false, selBra, partido1);
partido1.agregarParticipacion(p1);
partido1.agregarParticipacion(p2);
selArg.agregarParticipacion(p1);
selBra.agregarParticipacion(p2);

// Eventos
Evento gol1 = new Evento(TipoEvento.GOL, 45, messi, partido1);
Evento gol2 = new Evento(TipoEvento.GOL, 78, messi, partido1);
Evento tarjeta1 = new Evento(TipoEvento.TARJETAAMARILLA, 60, vinicius, partido1);
partido1.agregarEventos(gol1);
partido1.agregarEventos(gol2);
partido1.agregarEventos(tarjeta1);
messi.agregarEventos(gol1);
messi.agregarEventos(gol2);
vinicius.agregarEventos(tarjeta1);

// Grupo
grupoA.agregarSeleccion(selArg);
grupoA.agregarSeleccion(selBra);

// Lista de fases para ranking
ArrayList<Fase> listaFases = new ArrayList<>();
listaFases.add(faseGrupos);

// Servicio
ServicioMundial servicio = new ServicioMundial();
    Scanner sc = new Scanner(System.in);
    ArrayList<Grupo> listaGrupos = new ArrayList<>();
listaGrupos.add(grupoA);
    int opcion = 0;
    do {
        System.out.println("=== SISTEMA DE GESTION MUNDIAL 2026 ===");
        System.out.println("1. Tabla de posiciones por grupo");
        System.out.println("2. Ranking de goleadores");
        System.out.println("3. Informe disciplinario por seleccion");
        System.out.println("4. Informe disciplinario por jugador");
        System.out.println("5. Ficha tecnica de partido");
        System.out.println("6. Estadisticas por estadio");
        System.out.println("7. Estadisticas por ciudad");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
        
                    System.out.println("Ingrese la identificacion del grupo: ");
                     String idGrupo = sc.next().toUpperCase().trim();
                    boolean encontrado = false;
                    for(Grupo g : listaGrupos){
                    if(g.getIdentificacion().equals(idGrupo)){
                    servicio.tablaPosicionesPorGrupos(g);
                    encontrado = true;
                   }
                   }
                    if(!encontrado){
                       System.out.println("Grupo no encontrado");
                   }

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    } while(opcion != 0);
}
    }    

    
