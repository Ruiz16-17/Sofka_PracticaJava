package Ejercicio18.Modelo;

import Ejercicio18.Interfaces.Entregable;

public class Videojuego implements Entregable {

    //region ValoresPorDefecto

    private final int HORAS_ESTIMADAS = 10;
    private final boolean isENTREGADO = false;

    //endregion

    private String titulo;
    private int horasEstimadas;
    private boolean isEntregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = this.HORAS_ESTIMADAS;
        this.isEntregado = this.isENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.isEntregado = this.isENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.isEntregado = this.isENTREGADO;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", isEntregado=" + isEntregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
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

        return 0;
    }
}
