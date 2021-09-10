package Ejercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

    public void ejecutarEjercicio11(){

        String fraseUsuario = "";
        int []cantidadCaracteresRepetidos = new int[5];
        Scanner recibirDatos = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 11!");

        System.out.println("Digite una frase:");
        fraseUsuario = recibirDatos.nextLine();

        cantidadCaracteresRepetidos[0] = contarLetrasRepetidas((separarFrasePorCaracteres(fraseUsuario)),'a');
        cantidadCaracteresRepetidos[1] = contarLetrasRepetidas((separarFrasePorCaracteres(fraseUsuario)),'e');
        cantidadCaracteresRepetidos[2] = contarLetrasRepetidas((separarFrasePorCaracteres(fraseUsuario)),'i');
        cantidadCaracteresRepetidos[3] = contarLetrasRepetidas((separarFrasePorCaracteres(fraseUsuario)),'o');
        cantidadCaracteresRepetidos[4] = contarLetrasRepetidas((separarFrasePorCaracteres(fraseUsuario)),'u');

        System.out.println("La longitud de la frase es" + fraseUsuario.length());
        System.out.println("Cantidad de veces que se repiten las letras:");
        System.out.println("a: " + cantidadCaracteresRepetidos[0] + "\n" +
                "e: " + cantidadCaracteresRepetidos[1] + "\n" +
                "i: " + cantidadCaracteresRepetidos[2] + "\n" +
                "o: " + cantidadCaracteresRepetidos[3] + "\n" +
                "u: " + cantidadCaracteresRepetidos[4] + "\n");

    }

    private char[] separarFrasePorCaracteres(String frase){

        char []letrasFrase = new char[frase.length()];

        letrasFrase = frase.toCharArray();

        return letrasFrase;
    }

    private int contarLetrasRepetidas(char frase[], char letra){

        int caracterRepetido = 0;
        for (int i = 0; i < frase.length; i++) {

            if (frase[i] == letra){
                caracterRepetido++;
            }
        }

        return caracterRepetido;
    }
}
