package Ejercicio18.Controlador;

import Ejercicio18.Modelo.Serie;
import Ejercicio18.Modelo.Videojuego;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio18 {

    public void ejecutarEjercicio18(){

        Serie []series = new Serie[5];
        Videojuego []videojuegos = new Videojuego[5];

        int cantidadEntregadosVideojuegos = 0;
        int cantidadEntregadosSeries = 0;

        series[0] = (new Serie("Vikingos",3,"Drama histórico","Michael Hirst"));

        series[1] = (new Serie("Stranger Things","Matt Duffer y Ross Duffer"));
        series[1].setGenero("Drama");

        series[2] = (new Serie("The witcher",1,"Drama oscuro","Lauren Schmidt Hissrich"));

        series[3] = (new Serie("Grey's Anatomy",17,"Drama médico","Shonda Rhimes"));

        series[4] = (new Serie());
        series[4].setTitulo("The Walking Dead");
        series[4].setNumeroTemporadas(6);
        series[4].setGenero("Apocalipsis Zombi");
        series[4].setCreador("Frank Darabont");

        videojuegos[0] = (new Videojuego("Persona 5: Royal",120,"RPG","Atlus"));

        videojuegos[1] =(new Videojuego("Red Dead Redemption 2",200,"Acción-Aventura","Rockstar Games"));

        videojuegos[2] = (new Videojuego("Half-Life: Alyx",50,"Disparos en primera persona","Valve Corporation"));

        videojuegos[3] = (new Videojuego("The Legend of Zelda: Breath of the Wild",100));
        videojuegos[3].setGenero("Acción-aventura");
        videojuegos[3].setCompania("Nintendo EPD");

        videojuegos[4] = (new Videojuego());
        videojuegos[4].setTitulo("Super Mario Odyssey");
        videojuegos[4].setGenero("Plataformas");
        videojuegos[4].setCompania("Nintendo EPD Tokyo");

        videojuegos[0].entregar();
        videojuegos[2].entregar();

        series[3].entregar();
        series[4].entregar();

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

        System.out.println("Cantidad de videojuegos prestados: " + cantidadEntregadosVideojuegos);
        System.out.println("Cantidad de series prestadas: " + cantidadEntregadosSeries);
        System.out.println("El videojuego con más horas estimadas es:" + videojuegoMasHorasEstimadas(videojuegos));
        System.out.println("La serie con más temporadas es: " + serieMasTemporadas(series));

    }

    public Serie serieMasTemporadas(Serie arraySerie[]){
        Serie serieMasTemporadas = arraySerie[0];

        for(int i = 0; i < arraySerie.length - 1; i++){
            if(serieMasTemporadas.compareTo(arraySerie[i+1]) == 1)
                serieMasTemporadas = serieMasTemporadas;
            else
                serieMasTemporadas = arraySerie[i+1];
        }

        return serieMasTemporadas;
    }

    public Videojuego videojuegoMasHorasEstimadas(Videojuego arrayVideojuego[]){
        Videojuego videojuegoMasHorasEstimadas = arrayVideojuego[0];

        for(int i = 0; i < arrayVideojuego.length - 1; i++){
            if(videojuegoMasHorasEstimadas.compareTo(arrayVideojuego[i+1]) == 1)
                videojuegoMasHorasEstimadas = videojuegoMasHorasEstimadas;
            else
                videojuegoMasHorasEstimadas = arrayVideojuego[i+1];

        }
        return videojuegoMasHorasEstimadas;

    }

}
