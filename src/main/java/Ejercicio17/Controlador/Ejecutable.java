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

        carritoCompras[0] = new Electrodomestico();;
        carritoCompras[1] = new Electrodomestico(5000,50);;
        carritoCompras[2] = new Electrodomestico(7000,"Negro",'A',70);;
        carritoCompras[3] = new Lavadora();;
        carritoCompras[4] = new Lavadora(6000,200);;
        carritoCompras[5] = new Lavadora(100000,"Azul",'B',300,100);;
        carritoCompras[6] = new Televisor();;
        carritoCompras[7] = new Televisor(1200,12);;
        carritoCompras[8] = new Televisor(12310,"Rojo",'C',50,100,true);;
        carritoCompras[9] = new Televisor(12,"color inexistente",'X',12,23,false);;

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
                "Electrodomésticos: " + precioTotalElectrodomestico + " €\n" +
                "Lavadoras: " + precioTotalLavadora + " €\n" +
                "Telvevisores: " + precioTotalTelevisor + " €\n");

    }

}
