package Ejercicio18.Controlador;

import Ejercicio18.Modelo.Serie;
import Ejercicio18.Modelo.Videojuego;

import java.util.ArrayList;
import java.util.Collections;

public class Ejecutable {

    public void ejecutarEjercicio18(){

        ArrayList<Serie> series = new ArrayList<>(5);
        ArrayList<Videojuego> videojuegos = new ArrayList<>(5);

        int cantidadEntregadosVideojuegos = 0;
        int cantidadEntregadosSeries = 0;

        series.add(new Serie("Vikingos",3,"Drama histórico","Michael Hirst"));

        series.add(new Serie("Stranger Things","Matt Duffer y Ross Duffer"));
        series.get(1).setGenero("Drama");

        series.add(new Serie("The witcher",1,"Drama oscuro","Lauren Schmidt Hissrich"));

        series.add(new Serie("Grey's Anatomy",17,"Drama médico","Shonda Rhimes"));

        series.add(new Serie());
        series.get(4).setTitulo("The Walking Dead");
        series.get(4).setNumeroTemporadas(6);
        series.get(4).setGenero("Apocalipsis Zombi");
        series.get(4).setCreador("Frank Darabont");

        videojuegos.add(new Videojuego("Persona 5: Royal",120,"RPG","Atlus"));

        videojuegos.add(new Videojuego("Red Dead Redemption 2 ",200,"Acción-Aventura","Rockstar Games"));

        videojuegos.add(new Videojuego("Half-Life: Alyx",50,"Disparos en primera persona","Valve Corporation"));

        videojuegos.add(new Videojuego("The Legend of Zelda: Breath of the Wild",100));
        videojuegos.get(3).setGenero("Acción-aventura");
        videojuegos.get(3).setCompania("Nintendo EPD");

        videojuegos.add(new Videojuego());
        videojuegos.get(4).setTitulo("Super Mario Odyssey");
        videojuegos.get(4).setGenero("Plataformas");
        videojuegos.get(4).setCompania("Nintendo EPD Tokyo");

        videojuegos.get(0).entregar();
        videojuegos.get(2).entregar();

        series.get(3).entregar();
        series.get(4).entregar();

        for (Serie serie : series){

            if(serie.isEntregado()){
                cantidadEntregadosSeries++;
                serie.devolver();
            }
        }

        for (Videojuego videojuego : videojuegos){

            if(videojuego.isEntregado()){
                cantidadEntregadosVideojuegos++;
                videojuego.devolver();
            }
        }

        for (Serie serie : series){

            System.out.println(serie.toString());
        }

        System.out.println("-------------------------------------------------------");

        //Collections.sort(series,Serie::compareTo);

        Collections.sort(series,Serie::compareTo);

        for (Serie serie : series){

            System.out.println(serie.toString());
        }

        System.out.println(series.get(0).toString());
        System.out.println(series.get(4).toString());

    }

}
