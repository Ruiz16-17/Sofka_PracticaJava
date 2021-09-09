package Ejercicio17.Controlador;

import Ejercicio17.Modelo.Electrodomestico;
import Ejercicio17.Modelo.Lavadora;
import Ejercicio17.Modelo.Televisor;

public class Ejecutable {

    public void ejecutarEjercicio17(){

        Electrodomestico []carritoCompras = new Electrodomestico[10];
        double precioTotalElectrodomestico = 0;
        double precioTotalLavadora = 0;
        double precioTotalTelevisor = 0;

        Electrodomestico electrodomestico = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(5000,50);
        Electrodomestico electrodomestico3 = new Electrodomestico(7000,"Negro",'A',70);

        Lavadora lavadora = new Lavadora();
        Lavadora lavadora2 = new Lavadora(6000,200);
        Lavadora lavadora3 = new Lavadora(100000,"Azul",'B',300,100);

        Televisor televisor = new Televisor();
        Televisor televisor2 = new Televisor(1200,12);
        Televisor televisor3 = new Televisor(12310,"Rojo",'C',50,100,true);
        Televisor televisor4 = new Televisor(12,"color inexistente",'X',12,23,false);

        carritoCompras[0] = electrodomestico;
        carritoCompras[1] = electrodomestico2;
        carritoCompras[2] = electrodomestico3;
        carritoCompras[3] = lavadora;
        carritoCompras[4] = lavadora2;
        carritoCompras[5] = lavadora3;
        carritoCompras[6] = televisor;
        carritoCompras[7] = televisor2;
        carritoCompras[8] = televisor3;
        carritoCompras[9] = televisor4;

        for (Electrodomestico tipoElectrodomestico : carritoCompras) {

            if(tipoElectrodomestico instanceof Electrodomestico && !(tipoElectrodomestico instanceof Lavadora) && !(tipoElectrodomestico instanceof Televisor)){

                precioTotalElectrodomestico += tipoElectrodomestico.precioFinal();
                continue;
            }
            if(tipoElectrodomestico instanceof Lavadora){

                precioTotalLavadora += tipoElectrodomestico.precioFinal();
                continue;

            }
            if(tipoElectrodomestico instanceof Televisor){

                precioTotalTelevisor += tipoElectrodomestico.precioFinal();
                continue;
            }
        }

        for (Electrodomestico tipoElectrodomestico : carritoCompras){

            System.out.println(tipoElectrodomestico.toString());
        }

        System.out.println("--------------PRECIO TOTAL------------------");

        System.out.println("El preicio total es:\n" +
                "Electrodomésticos: " + precioTotalElectrodomestico + " \n" +
                "Lavadoras: " + precioTotalLavadora + " \n" +
                "Telvevisores: " + precioTotalTelevisor + " \n");

    }

}
