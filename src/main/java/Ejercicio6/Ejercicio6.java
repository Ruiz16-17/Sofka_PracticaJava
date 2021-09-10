package Ejercicio6;

public class Ejercicio6 {

    public void ejecutarEjercicio6(){

        System.out.println("¡Bienvenido al ejercicio 6!");

        System.out.println("Pares:");

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("\n");
        System.out.println("Impares:");

        for (int i = 0; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
