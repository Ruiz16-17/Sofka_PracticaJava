package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public void ejecutarEjercicio9(){

        String fraseBase = "“La sonrisa sera la mejor arma contra la tristeza”";
        String fraseUsuario = "";
        Scanner recibirDatos = new Scanner(System.in);

        System.out.println("¡Bienvenido al ejercicio 9!");

        System.out.println("Digite una frase:");
        fraseUsuario = recibirDatos.nextLine();

        fraseBase = fraseBase.replace("a","e");
        fraseBase = fraseBase.replace("“","");
        fraseBase = fraseBase.replace("”","");

        System.out.println("“" + fraseBase + " " + fraseUsuario + "”");

    }
}
