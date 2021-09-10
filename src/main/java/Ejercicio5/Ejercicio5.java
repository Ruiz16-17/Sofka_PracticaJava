package Ejercicio5;

public class Ejercicio5 {

    public void ejecutarEjercicio5(){

        int numero = 1;

        System.out.println("¡Bienvenido al ejercicio 5!");

        System.out.println("Pares:");

        while (numero <= 100){

            if(numero % 2 == 0){

                System.out.println(numero);
            }
            numero++;
        }

        numero = 1;

        System.out.println("\n");
        System.out.println("Impares:");
        while (numero <= 100){

            if(numero % 2 != 0){

                System.out.println(numero);
            }
            numero++;
        }

    }
}
