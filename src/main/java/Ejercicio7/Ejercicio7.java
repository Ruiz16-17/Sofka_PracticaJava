package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public void ejecutarEjercicio7(){

        Scanner recibirDatos = new Scanner(System.in);
        float numero = 0;

        System.out.println("¡Bienvenido al ejercicio 7!");

        do {

            System.out.println("Digite un número:");
            numero = recibirDatos.nextFloat();

        }while (numero < 0);

        System.out.println("Último número digitado: " + numero);
    }
}
