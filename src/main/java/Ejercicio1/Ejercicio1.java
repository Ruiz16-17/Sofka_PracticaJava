package Ejercicio1;

public class Ejercicio1 {

    public String comparar(int numero1, int numero2){

        String resultado;

        if(numero1 > numero2){

            resultado = "El mayor es el primer número: " + numero1 + " ("+numero1+" > " + numero2 + ")";
        }else if(numero1 < numero2){

            resultado = "El mayor es el segundo número: " + numero2 + " ("+numero1+" < " + numero2 + ")";
        }else {

            resultado = "El primer número y el segundo número son iguales (" + numero1 + " = " + numero2 + ")";
        }

        return resultado;
    }
}
