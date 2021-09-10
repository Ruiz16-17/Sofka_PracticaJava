package Ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {

    public void ejecutarEjercicio12(){

        String palabra1 = "";
        String palabra2 = "";

        Scanner recibirDatos = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 12!");

        System.out.println("Digite una palabra:");
        palabra1 = recibirDatos.nextLine();

        System.out.println("Digite otra palabra:");
        palabra2 = recibirDatos.nextLine();

        if(sonIguales(palabra1,palabra2)){
            System.out.println("Las palabras son iguales");
        }else if (isReverse(palabra1,palabra2)){
            System.out.println("Las palabras estan invertidas");
        }else {

            System.out.println("Las diferencias son:");
            System.out.println("Palabra 1:");
            dicerencias(separarFrasePorCaracteres(palabra1),separarFrasePorCaracteres(palabra2)).stream().forEach(System.out::println);
            System.out.println("Palabra 2:");
            dicerencias(separarFrasePorCaracteres(palabra2),separarFrasePorCaracteres(palabra1)).stream().forEach(System.out::println);

        }

    }

    private boolean sonIguales(String palabra1, String palabra2){

        if(palabra1.equals(palabra2)){
            return true;
        }else {
            return false;
        }
    }

    private boolean isReverse(String palabra1, String palabra2){

        StringBuilder reverse = new StringBuilder(palabra1);
        palabra1 = reverse.reverse().toString();

        if(palabra1.equals(palabra2)){
            return true;
        }else {
            return false;
        }
    }

    private char[] separarFrasePorCaracteres(String frase){

        char []letrasFrase = new char[frase.length()];

        letrasFrase = frase.toCharArray();

        return letrasFrase;
    }

    private ArrayList dicerencias(char palabra1[], char palabra2[]){

        ArrayList diferencias = new ArrayList();
        boolean isCaracter = false;
        for (int i = 0; i < palabra2.length; i++) {
            isCaracter = false;
            for (int j = 0; j < palabra1.length; j++) {

                if(palabra1[j] == palabra2[i]){
                    isCaracter = true;
                }
            }
            if(!isCaracter){
                diferencias.add(palabra2[i]);
            }
        }

        return diferencias;
    }

}
