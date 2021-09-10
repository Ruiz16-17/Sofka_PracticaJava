package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {


    public void ejecutarEjercicio4(){

        final float IVA = (float) 1.21;

        Scanner recibirDatos = new Scanner(System.in);
        double precioFinal = 0;

        System.out.println("¡Bienvenido al ejercicio 4!");
        System.out.println("Ingrese el precio del producto:");
        precioFinal = recibirDatos.nextFloat() * IVA;

        System.out.println("El precio del producto con el IVA incluido es de: " +precioFinal);

    }

}
