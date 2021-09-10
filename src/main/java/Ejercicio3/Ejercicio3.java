package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public String solicitarDatos(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 3!");

        System.out.println("Radio del círculo: ");

        double radio = entrada.nextDouble();
        Operacion operacion = ((double radio1) -> Math.PI*(Math.pow(radio,2)));
        return "El área del círculo es: " + operacion.areaCirculo(radio);
    }
}
