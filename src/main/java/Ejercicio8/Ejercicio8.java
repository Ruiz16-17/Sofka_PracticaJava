package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

    public void ejecutarEjercicio8(){

        Scanner recibirDatos = new Scanner(System.in);
        String numero = "";

        System.out.println("¡Bienvenido al ejercicio 8!");

        System.out.println("Por favor digite un día de la semana:");
        numero = recibirDatos.next().toLowerCase(Locale.ROOT);

        switch (numero){

            case "lunes":

                System.out.println("Día laboral");
                break;

            case "martes":

                System.out.println("Día laboral");
                break;

            case "miercoles":

                System.out.println("Día laboral");
                break;

            case "jueves":

                System.out.println("Día laboral");
                break;

            case "viernes":

                System.out.println("Día laboral");
                break;

            case "sábado":

                System.out.println("Día no laboral");
                break;

            case "domingo":

                System.out.println("Día no laboral");
                break;

            default:
                System.out.println("Dato no válido");
        }
    }
}
