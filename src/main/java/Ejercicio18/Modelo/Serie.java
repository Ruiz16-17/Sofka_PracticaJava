package Ejercicio18.Modelo;

import Ejercicio18.Interfaces.Entregable;

public class Serie implements Entregable {

    //region ValoresPorDefecto

    private final boolean isENTREGADO = false;
    private final int TEMPORADAS = 3;

    //endregion

    private String titulo;
    private int numeroTemporadas;
    private boolean isEntregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = this.TEMPORADAS;
        this.isEntregado = this.isENTREGADO;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = this.TEMPORADAS;
        this.isEntregado = this.isENTREGADO;
        this.genero = "";
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.isEntregado = this.isENTREGADO;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", isEntregado=" + isEntregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        this.isEntregado = true;
    }

    @Override
    public void devolver() {
        this.isEntregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.isEntregado;
    }

    @Override
    public int compareTo(Object objeto) {

        Serie serie = (Serie) objeto;

        if(serie.getNumeroTemporadas() < serie.getNumeroTemporadas()){

            return -1;
        }else if (serie.getNumeroTemporadas() > serie.getNumeroTemporadas()){

            return 1;
        }else {

            return 0;
        }
    }
}
