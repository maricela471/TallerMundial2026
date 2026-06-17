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
      Mundial mundial1=new Mundial(2026,"tigre",11062026,18072026);
      Pais Argentina =new Pais("Argentina","celeste y blanca");
      Pais Uruguay=new Pais("Uruguay","celeste y blanca");
      Pais Francia=new Pais("francia","Azul, blanca y roja");
      
      Seleccion seleccion1=new Seleccion("Asociacion Argentina de Futbol","celeste y blanca","azul y blanca",true,1,null,null,Argentina);
      Seleccion seleccion2=new Seleccion("Asociación Uruguaya de Fútbol","celeste ","blanca",true,16,null,null,Uruguay);
      Seleccion seleccion3=new Seleccion("Fédération Française de Football","Azul oscuro ","blanco dominante",true,3,null,null,Francia);
      
      Arbitro arbitro1=new Arbitro("Antonio López",12382,15);
      Arbitro arbitro2=new Arbitro("Carlos Mendez",25785,12);
      Arbitro arbitro3=new Arbitro("Julian Herrera",11381,18);
      
      Grupo grupoA = new Grupo("A", "Grupo A");
grupoA.agregarSeleccion(seleccion1);
grupoA.agregarSeleccion(seleccion2);
grupoA.agregarSeleccion(seleccion3);

Participacion p1 = new Participacion(true, seleccion1);
Participacion p2 = new Participacion(false, seleccion2);
p1.agregarGol();
p1.agregarGol();
p2.agregarGol();

Fase faseGrupos = new Fase(NombreFase .GRUPOS);
Estadio estadio1 = new Estadio("Estadio Monumental", 84000);
Partido partido1 = new Partido(null, null, 90, 0, faseGrupos, estadio1, p1, p2);
faseGrupos.agregarPartidos(partido1);

grupoA.agregarFase(faseGrupos);
System.out.println("Puntos Argentina: " + grupoA.obtenerPuntos(seleccion1));
System.out.println("Puntos Uruguay: " + grupoA.obtenerPuntos(seleccion2));
      
      
    }
    
    
    
}
