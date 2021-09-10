package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public void ejecutarEjercicio10(){

        String fraseUsuario = "";
        Scanner recibirDatos = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 10!");

        System.out.println("Digite una frase:");
        fraseUsuario = recibirDatos.nextLine();

        fraseUsuario = fraseUsuario.replace(" ","");

        System.out.println("El resultado de la frase es: " + fraseUsuario);

    }
}
