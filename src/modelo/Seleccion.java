/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Seleccion {
    private  String nombreFederacion;
    private String camisetaPrincipal;
    private String camisetaSecundaria;
    private boolean cabezaGrupo;
    private Integer rankingFIFA;
    
    //constructor

    public Seleccion(String nombreFederacion, String camisetaPrincipal, String camisetaSecundaria, boolean cabezaGrupo, Integer rankingFIFA) {
        this.nombreFederacion = nombreFederacion;
        this.camisetaPrincipal = camisetaPrincipal;
        this.camisetaSecundaria = camisetaSecundaria;
        this.cabezaGrupo = cabezaGrupo;
        this.rankingFIFA = rankingFIFA;
    }
    //setters

    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public void setCamisetaPrincipal(String camisetaPrincipal) {
        this.camisetaPrincipal = camisetaPrincipal;
    }

    public void setCamisetaSecundaria(String camisetaSecundaria) {
        this.camisetaSecundaria = camisetaSecundaria;
    }

    public void setCabezaGrupo(boolean cabezaGrupo) {
        this.cabezaGrupo = cabezaGrupo;
    }

    public void setRankingFIFA(Integer rankingFIFA) {
        this.rankingFIFA = rankingFIFA;
    }
    //getters

    public String getNombreFederacion() {
        return nombreFederacion;
    }

    public String getCamisetaPrincipal() {
        return camisetaPrincipal;
    }

    public String getCamisetaSecundaria() {
        return camisetaSecundaria;
    }

    public boolean isCabezaGrupo() {
        return cabezaGrupo;
    }

    public Integer getRankingFIFA() {
        return rankingFIFA;
    }
    
    
}
