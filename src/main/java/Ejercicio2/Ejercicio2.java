package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    private String comparar(int numero1, int numero2){

        String resultado;

        if(numero1 > numero2){

            resultado = "El mayor es el primer número: " + numero1 + " ("+numero1+" > " + numero2 + ")";
        }else if(numero1 < numero2){

            resultado = "El mayor es el segundo número: " + numero2 + " ("+numero1+" < " + numero2 + ")";
        }else {

            resultado = "El primer número y el segundo número son iguales (" + numero1 + " = " + numero2 + ")";
        }

        return resultado;
    }

    public String solicitarDatos(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 2!");

            System.out.println("Primer número: ");
            int numero1 = entrada.nextInt();

            System.out.println("Segundo número: ");
            int numero2 = entrada.nextInt();

            return comparar(numero1,numero2);

    }
}
