package Menu;

import Ejercicio1.Ejercicio1;
import Ejercicio10.Ejercicio10;
import Ejercicio11.Ejercicio11;
import Ejercicio12.Ejercicio12;
import Ejercicio13.Ejercicio13;
import Ejercicio14.Ejercicio14;
import Ejercicio15.Ejercicio15;
import Ejercicio16.Controlador.Ejercicio16;
import Ejercicio17.Controlador.Ejercicio17;
import Ejercicio18.Controlador.Ejercicio18;
import Ejercicio2.Ejercicio2;
import Ejercicio3.Ejercicio3;
import Ejercicio4.Ejercicio4;
import Ejercicio5.Ejercicio5;
import Ejercicio6.Ejercicio6;
import Ejercicio7.Ejercicio7;
import Ejercicio8.Ejercicio8;
import Ejercicio9.Ejercicio9;

import java.util.Scanner;

public class Menu {

    public void ejecutarMenu(){

        Scanner recibirDatos = new Scanner(System.in);
        String opcion = "";

        do {

            mostrarMenu();
            opcion = recibirDatos.nextLine();

            switch (opcion) {

                case "0":
                    break;

                case "1":

                    Ejercicio1 ejercicio1 = new Ejercicio1();

                    System.out.println(ejercicio1.comparar(5, 2));
                    System.out.println(ejercicio1.comparar(1, 3));
                    System.out.println(ejercicio1.comparar(4, 4));
                    System.out.println("\n");

                    break;

                case "2":

                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    System.out.println(ejercicio2.solicitarDatos());

                    break;

                case "3":

                    Ejercicio3 ejercicio3 = new Ejercicio3();

                    System.out.println(ejercicio3.solicitarDatos());
                    System.out.println("\n");

                    break;

                case "4":

                    Ejercicio4 ejercicio4 = new Ejercicio4();

                    ejercicio4.ejecutarEjercicio4();

                    break;

                case "5":

                    Ejercicio5 ejercicio5 = new Ejercicio5();

                    ejercicio5.ejecutarEjercicio5();

                    break;

                case "6":

                    Ejercicio6 ejercicio6 = new Ejercicio6();

                    ejercicio6.ejecutarEjercicio6();

                    break;

                case "7":

                    Ejercicio7 Ejercicio7 = new Ejercicio7();

                    Ejercicio7.ejecutarEjercicio7();

                    break;

                case "8":

                    Ejercicio8 Ejercicio8 = new Ejercicio8();
                    Ejercicio8.ejecutarEjercicio8();

                    break;

                case "9":

                    Ejercicio9 Ejercicio9 = new Ejercicio9();
                    Ejercicio9.ejecutarEjercicio9();

                    break;

                case "10":

                    Ejercicio10 Ejercicio10 = new Ejercicio10();
                    Ejercicio10.ejecutarEjercicio10();

                    break;

                case "11":

                    Ejercicio11 Ejercicio11 = new Ejercicio11();
                    Ejercicio11.ejecutarEjercicio11();

                    break;

                case "12":

                    Ejercicio12 Ejercicio12 = new Ejercicio12();
                    Ejercicio12.ejecutarEjercicio12();

                    break;

                case "13":

                    Ejercicio13 Ejercicio13 = new Ejercicio13();
                    Ejercicio13.ejecutarEjercicio13();

                    break;

                case "14":

                    Ejercicio14 Ejercicio14 = new Ejercicio14();
                    Ejercicio14.ejecutarEjercicio14();

                    break;

                case "15":

                    Ejercicio15 Ejercicio15 = new Ejercicio15();
                    Ejercicio15.ejecutarEjercicio15();

                    break;

                case "16":

                    Ejercicio16 ejercicio16 = new Ejercicio16();

                    ejercicio16.ejecutarEjercicio16();

                    break;

                case "17":

                    Ejercicio17 ejericio17 = new Ejercicio17();

                    ejericio17.ejecutarEjercicio17();

                    break;

                case "18":

                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.ejecutarEjercicio18();

                    break;

                default:

                    System.out.println("OPCIÓN INCORRECTA");

            }

        }while (!opcion.equals("0"));
    }

    private void mostrarMenu(){

        System.out.println("Taller de java, elija una opción: \n" +
                "0. Para salir.\n" +
                "1. Ejercicio 1.\n" +
                "2. Ejercicio 2.\n" +
                "3. Ejercicio 3.\n" +
                "4. Ejercicio 4.\n" +
                "5. Ejercicio 5.\n" +
                "6. Ejercicio 6.\n" +
                "7. Ejercicio 7.\n" +
                "8. Ejercicio 8.\n" +
                "9. Ejercicio 9.\n" +
                "10. Ejercicio 10.\n" +
                "11. Ejercicio 11.\n" +
                "12. Ejercicio 12.\n" +
                "13. Ejercicio 13.\n" +
                "14. Ejercicio 14.\n" +
                "15. Ejercicio 15.\n" +
                "16. Ejercicio 16.\n" +
                "17. Ejercicio 17.\n" +
                "18. Ejercicio 18.\n");
    }
}
