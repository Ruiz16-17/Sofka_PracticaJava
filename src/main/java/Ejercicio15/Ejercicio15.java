package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public void ejecutarEjercicio15(){

        Scanner recibirDatos = new Scanner(System.in);
        String opcion = "";

        System.out.println("¡Bienvenido al ejercicio 15!");

        do {

            System.out.println("Digite una opción:");
            System.out.println("" +
                    "1-NUEVO ACTOR\n" +
                    "2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n" +
                    "4-MODIFICAR ACTOR\n" +
                    "5-VER TODOS LOS ACTORES\n" +
                    "6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "8-SALIR");
            opcion = recibirDatos.nextLine();

            switch (opcion) {

                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "7":
                    break;

                case "8":
                    break;

                default:

                    System.out.println("OPCIÓN INCORRECTA");

            }

        }while (!opcion.equals("8"));

    }
}
