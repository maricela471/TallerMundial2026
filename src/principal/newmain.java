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


// Servicio
ServicioMundial servicio = new ServicioMundial();
Scanner sc = new Scanner(System.in);
ArrayList<Grupo> listaGrupos = new ArrayList<>();
listaGrupos.add(grupoA);
ArrayList<Sede> listaSedes = new ArrayList<>();
ArrayList<Estadio> listaEstadios = new ArrayList<>();
ArrayList<Pais> listaPaises = new ArrayList<>();
ArrayList<Seleccion> listaSelecciones = new ArrayList<>();
ArrayList<Jugador> listaJugadores = new ArrayList<>();
ArrayList<Fase> listaFases = new ArrayList<>();
ArrayList<Partido> listaPartidos = new ArrayList<>();

    int opcion = 0;
    do {
        System.out.println("=== SISTEMA DE GESTION MUNDIAL 2026 ===");
        System.out.println("--- CARGA DE DATOS ---");
        System.out.println("1. Agregar sede");
        System.out.println("2. Agregar estadio");
        System.out.println("3. Agregar pais y seleccion");
        System.out.println("4. Agregar jugador");
        System.out.println("5. Agregar fase y grupo");
        System.out.println("6. Agregar partido");
        System.out.println("7. Registrar evento");
        System.out.println("--- INFORMES ---");
        System.out.println("8. Tabla de posiciones por grupo");
        System.out.println("9. Ranking de goleadores");
        System.out.println("10. Informe disciplinario por seleccion");
        System.out.println("11. Informe disciplinario por jugador");
        System.out.println("12. Ficha tecnica de partido");
        System.out.println("13. Estadisticas por estadio");
        System.out.println("14. Estadisticas por ciudad");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
    case 1:
        System.out.println("Ingrese la ciudad de la sede: ");
        String ciudad = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la altura nivel del mar(ej: 1200.5): ");
        float alturaNivel = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el clima: ");
        String clima = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la zona horaria (ej: GMT-3): ");
        String zonaHoraria = sc.nextLine().toLowerCase();
        Sede nuevaSede = new Sede(ciudad, alturaNivel, clima, zonaHoraria, null, mundial);
        listaSedes.add(nuevaSede);
        mundial.agregarSede(nuevaSede);
        System.out.println("Sede agregada correctamente");
        break;

    case 2:
        if(listaSedes.isEmpty()){
            System.out.println("Primero agregue una sede");
            break;
        }
        System.out.println("Sedes disponibles:");
        for(int i=0; i<listaSedes.size(); i++){
            System.out.println(i + ". " + listaSedes.get(i).getCiudad());
        }
        System.out.println("Seleccione el indice de la sede: ");
        int indiceSede = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del estadio: ");
        String nombreEstadio = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la capacidad: ");
        int capacidad = sc.nextInt();
        sc.nextLine();
        Estadio nuevoEstadio = new Estadio(nombreEstadio, capacidad, listaSedes.get(indiceSede));
        listaEstadios.add(nuevoEstadio);
        listaSedes.get(indiceSede).agregarEstadio(nuevoEstadio);
        System.out.println("Estadio agregado correctamente");
        break;

    case 3:
        System.out.println("Ingrese el nombre del pais: ");
        String nombrePais = sc.next();
        System.out.println("Ingrese la bandera: ");
        String bandera = sc.nextLine().toLowerCase();
        Pais nuevoPais = new Pais(nombrePais, bandera, null);
        System.out.println("Ingrese el nombre de la federacion: ");
        String nombreFed = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la camiseta principal: ");
        String camisetaPrincipal = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la camiseta secundaria: ");
        String camisetaSecundaria = sc.nextLine().toLowerCase();
        System.out.println("Ingrese el ranking FIFA: ");
        int rankingFIFA = sc.nextInt();
        sc.nextLine();
        Seleccion nuevaSeleccion = new Seleccion(nombreFed, camisetaPrincipal, camisetaSecundaria, true, rankingFIFA, null, null, nuevoPais);
        nuevoPais.setSeleccion(nuevaSeleccion);
        listaPaises.add(nuevoPais);
        listaSelecciones.add(nuevaSeleccion);
        System.out.println("Pais y seleccion agregados correctamente");
        break;

    case 4:
        if(listaSelecciones.isEmpty()){
            System.out.println("Primero agregue una seleccion");
            break;
        }
        System.out.println("Selecciones disponibles:");
        for(int i=0; i<listaSelecciones.size(); i++){
            System.out.println(i + ". " + listaSelecciones.get(i).getPais().getNombre());
        }
        System.out.println("Seleccione el indice de la seleccion: ");
        int indiceSeleccion = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del jugador: ");
        String nombreJugador = sc.nextLine().toLowerCase();
        System.out.println("Ingrese la fecha de nacimiento (ej: 19870624, sin espacios,ni comas): ");
        int fechaNac = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el dorsal: ");
        int dorsal = sc.nextInt();
        sc.nextLine();
        System.out.println("Posiciones: 1.ARQUERO 2.DEFENSOR 3.MEDIOCAMPISTA 4.DELANTERO");
        int posOpcion = sc.nextInt();
        Posicion pos;
        switch(posOpcion){
            case 1: pos = Posicion.ARQUERO; break;
            case 2: pos = Posicion.DEFENSOR; break;
            case 3: pos = Posicion.MEDIOCAMPISTA; break;
            default: pos = Posicion.DELANTERO;
        }
        System.out.println("Ingrese el peso: ");
        float peso = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese la altura: ");
        float alturaJugador = sc.nextFloat();
        sc.nextLine();
        Jugador nuevoJugador = new Jugador(nombreJugador, fechaNac, dorsal, pos, peso, alturaJugador, listaSelecciones.get(indiceSeleccion));
        listaJugadores.add(nuevoJugador);
        listaSelecciones.get(indiceSeleccion).agregarJugador(nuevoJugador);
        System.out.println("Jugador agregado correctamente");
        break;

    case 5:
        System.out.println("Ingrese el nombre de la fase:");
        System.out.println("1.GRUPOS 2.DIECISEISAVOS 3.OCTAVOS 4.CUARTOS 5.SEMIFINAL 6.FINAL");
        int faseOpcion = sc.nextInt();
        NombreFase nombreFase;
        switch(faseOpcion){
            case 1: nombreFase = NombreFase.GRUPOS; break;
            case 2: nombreFase = NombreFase.DIECISEISAVOS; break;
            case 3: nombreFase = NombreFase.OCTAVOS; break;
            case 4: nombreFase = NombreFase.CUARTOS; break;
            case 5: nombreFase = NombreFase.SEMIFINAL; break;
            default: nombreFase = NombreFase.FINALMUNDIAL;
        }
        Fase nuevaFase = new Fase(nombreFase);
        listaFases.add(nuevaFase);
        System.out.println("Ingrese la identificacion del grupo (ej: A): ");
        String idGrupo = sc.next().toUpperCase();
        System.out.println("Ingrese la descripcion del grupo: ");
        String descGrupo = sc.next();
        Grupo nuevoGrupo = new Grupo(idGrupo, descGrupo, nuevaFase);
        listaGrupos.add(nuevoGrupo);
        System.out.println("Fase y grupo agregados correctamente");
        break;

    case 6:
        if(listaEstadios.isEmpty() || listaFases.isEmpty()){
            System.out.println("Primero agregue estadios y fases");
            break;
        }
        System.out.println("Estadios disponibles:");
        for(int i=0; i<listaEstadios.size(); i++){
            System.out.println(i + ". " + listaEstadios.get(i).getNombre());
        }
        int indiceEstadio = sc.nextInt();
        System.out.println("Fases disponibles:");
        for(int i=0; i<listaFases.size(); i++){
            System.out.println(i + ". " + listaFases.get(i).getNombre());
        }
        int indiceFase = sc.nextInt();
        System.out.println("Ingrese la duracion en minutos: ");
        int duracion = sc.nextInt();
        System.out.println("Ingrese el tiempo adicional: ");
        int tiempoAdicional = sc.nextInt();
        Partido nuevoPartido = new Partido(null, null, duracion, tiempoAdicional, listaFases.get(indiceFase), listaEstadios.get(indiceEstadio));
        listaPartidos.add(nuevoPartido);
        listaFases.get(indiceFase).agregarPartidos(nuevoPartido);
        listaEstadios.get(indiceEstadio).agregarPartido(nuevoPartido);
        System.out.println("Selecciones que participan:");
        for(int i=0; i<listaSelecciones.size(); i++){
            System.out.println(i + ". " + listaSelecciones.get(i).getPais().getNombre());
        }
        System.out.println("Indice seleccion local: ");
        int indiceLocal = sc.nextInt();
        System.out.println("Indice seleccion visitante: ");
        int indiceVisitante = sc.nextInt();
        Participacion partLocal = new Participacion(true, listaSelecciones.get(indiceLocal), nuevoPartido);
        Participacion partVisitante = new Participacion(false, listaSelecciones.get(indiceVisitante), nuevoPartido);
        nuevoPartido.agregarParticipacion(partLocal);
        nuevoPartido.agregarParticipacion(partVisitante);
        listaSelecciones.get(indiceLocal).agregarParticipacion(partLocal);
        listaSelecciones.get(indiceVisitante).agregarParticipacion(partVisitante);
        System.out.println("Partido agregado correctamente");
        break;

    case 7:
        if(listaPartidos.isEmpty() || listaJugadores.isEmpty()){
            System.out.println("Primero agregue partidos y jugadores");
            break;
        }
        System.out.println("Partidos disponibles:");
        for(int i=0; i<listaPartidos.size(); i++){
            System.out.println(i + ". Partido " + i);
        }
        int indicePartido = sc.nextInt();
        System.out.println("Jugadores disponibles:");
        for(int i=0; i<listaJugadores.size(); i++){
            System.out.println(i + ". " + listaJugadores.get(i).getNombre());
        }
        int indiceJugador = sc.nextInt();
        System.out.println("Tipos de evento:");
        System.out.println("1.GOL 2.TARJETAAMARILLA 3.TARJETAROJA 4.DOBLEAMARILLA");
        int tipoEvento = sc.nextInt();
        TipoEvento tipo;
        switch(tipoEvento){
            case 1: tipo = TipoEvento.GOL; break;
            case 2: tipo = TipoEvento.TARJETAAMARILLA; break;
            case 3: tipo = TipoEvento.TARJETAROJA; break;
            default: tipo = TipoEvento.DOBLEAMARILLA;
        }
        System.out.println("Ingrese el minuto: ");
        int minuto = sc.nextInt();
        Evento nuevoEvento = new Evento(tipo, minuto, listaJugadores.get(indiceJugador), listaPartidos.get(indicePartido));
        listaPartidos.get(indicePartido).agregarEventos(nuevoEvento);
        listaJugadores.get(indiceJugador).agregarEventos(nuevoEvento);
        System.out.println("Evento registrado correctamente");
        break;

    case 8:
        if(listaGrupos.isEmpty()){
            System.out.println("No hay grupos cargados");
            break;
        }
        System.out.println("Ingrese la identificacion del grupo: ");
        String idGrupoBuscar = sc.next().toUpperCase().trim();
        boolean encontradoGrupo = false;
        for(Grupo g : listaGrupos){
            if(g.getIdentificacion().equals(idGrupoBuscar)){
                servicio.tablaPosicionesPorGrupos(g);
                encontradoGrupo = true;
            }
        }
        if(!encontradoGrupo) System.out.println("Grupo no encontrado");
        break;

    case 9:
        servicio.rankingGoleadoresMundial(listaFases);
        break;

    case 10:
        if(listaSelecciones.isEmpty()){
            System.out.println("No hay selecciones cargadas");
            break;
        }
        System.out.println("Ingrese el nombre del pais: ");
        String paisBuscar = sc.next().trim();
        boolean encontradoSel = false;
        for(Seleccion s : listaSelecciones){
            if(s.getPais().getNombre().equalsIgnoreCase(paisBuscar)){
                servicio.listadoTarjetasPorSeleccion(s);
                encontradoSel = true;
            }
        }
        if(!encontradoSel) System.out.println("Seleccion no encontrada");
        break;

    case 11:
        if(listaSelecciones.isEmpty()){
            System.out.println("No hay selecciones cargadas");
            break;
        }
        System.out.println("Ingrese el nombre del pais: ");
        String paisJugador = sc.next().trim();
        boolean encontradoSelJ = false;
        for(Seleccion s : listaSelecciones){
            if(s.getPais().getNombre().equalsIgnoreCase(paisJugador)){
                servicio.listadoTarjetaPorJugadores(s);
                encontradoSelJ = true;
            }
        }
        if(!encontradoSelJ) System.out.println("Seleccion no encontrada");
        break;

    case 12:
        if(listaPartidos.isEmpty()){
            System.out.println("No hay partidos cargados");
            break;
        }
        System.out.println("Partidos disponibles:");
        for(int i=0; i<listaPartidos.size(); i++){
            System.out.println(i + ". Partido " + i);
        }
        int indicePartidoFicha = sc.nextInt();
        servicio.fichaTecnicaDePartido(listaPartidos.get(indicePartidoFicha));
        break;

    case 13:
        if(listaEstadios.isEmpty()){
            System.out.println("No hay estadios cargados");
            break;
        }
        System.out.println("Estadios disponibles:");
        for(int i=0; i<listaEstadios.size(); i++){
            System.out.println(i + ". " + listaEstadios.get(i).getNombre());
        }
        int indiceEstadioInf = sc.nextInt();
        servicio.estadisticaEstadio(listaEstadios.get(indiceEstadioInf));
        break;

    case 14:
        System.out.println("Ingrese el nombre de la ciudad: ");
        String ciudadBuscar = sc.next().trim();
        servicio.estadisticaPorSede(mundial, ciudadBuscar);
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
        
    
    



    
