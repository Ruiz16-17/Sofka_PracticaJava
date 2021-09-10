package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public void ejecutarEjercicio14(){

        Scanner recibirDatos = new Scanner(System.in);
        float numero = 0;

        System.out.println("¡Bienvenido al ejercicio 14!");

        System.out.println("Digite un número:");
        numero = recibirDatos.nextFloat();

        while (numero < 999){

            numero+=2;
            System.out.println(numero);
        }

    }
}
