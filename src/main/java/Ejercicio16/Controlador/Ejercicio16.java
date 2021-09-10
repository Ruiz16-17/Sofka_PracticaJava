package Ejercicio16.Controlador;

import Ejercicio16.Modelo.Persona;

import java.util.Scanner;

public class Ejercicio16 {

    public void ejecutarEjercicio16(){

        Scanner recibirDatos = new Scanner(System.in);

        String nombre1 = "";
        int edad1 = 0;
        char sexo1 = ' ';
        float peso1 = 0;
        float altura1 = 0;

        String nombre2 = "";
        int edad2 = 0;
        char sexo2 = ' ';

        String nombre3 = "";
        int edad3 = 0;
        char sexo3 = ' ';
        float peso3 = 0;
        float altura3 = 0;

        System.out.println("¡Bienvenido al ejercicio 16!");
        System.out.println("Para continuar digita lo siguiente");

        System.out.println("Persona 1:");
        System.out.println("Nombre:");
        nombre1 = recibirDatos.next();

        System.out.println("Edad:");
        edad1 = recibirDatos.nextInt();

        System.out.println("Sexo (H para hombre y M para mujer):");
        sexo1 = recibirDatos.next().charAt(0);

        System.out.println("Peso:");
        peso1 = recibirDatos.nextFloat();

        System.out.println("Altura:");
        altura1 = recibirDatos.nextFloat();

        Persona persona1 = new Persona(nombre1,edad1,sexo1,peso1, altura1);

        System.out.println("Persona 2:");
        System.out.println("Nombre:");
        nombre2 = recibirDatos.next();

        System.out.println("Edad:");
        edad2 = recibirDatos.nextInt();

        System.out.println("Sexo (H para hombre y M para mujer):");
        sexo2 = recibirDatos.next().charAt(0);


        Persona persona2 = new Persona(nombre2,edad2,sexo2);

        System.out.println("Persona 3:");
        System.out.println("Nombre:");
        nombre3 = recibirDatos.next();

        System.out.println("Edad:");
        edad3 = recibirDatos.nextInt();

        System.out.println("Sexo (H para hombre y M para mujer):");
        sexo3 = recibirDatos.next().charAt(0);

        System.out.println("Peso:");
        peso3 = recibirDatos.nextFloat();

        System.out.println("Altura:");
        altura3 = recibirDatos.nextFloat();
        Persona persona3 = new Persona();

        persona3.setNombre(nombre3);
        persona3.setEdad(edad3);
        persona3.setSexo(sexo3);
        persona3.setPeso(peso3);
        persona3.setAltura(altura3);

        System.out.println("Persona 1:");
        System.out.println(persona1.mensajesEstadoIMC());
        System.out.println(persona1.mensajeEsMayorDeEdad());
        System.out.println(persona1.toString());

        System.out.println("-----------------------------------------------------------");

        System.out.println("Persona 2:");
        System.out.println(persona2.mensajesEstadoIMC());
        System.out.println(persona2.mensajeEsMayorDeEdad());
        System.out.println(persona2.toString());

        System.out.println("-----------------------------------------------------------");

        System.out.println("Persona 3:");
        System.out.println(persona3.mensajesEstadoIMC());
        System.out.println(persona3.mensajeEsMayorDeEdad());
        System.out.println(persona3.toString());
    }
}
