package Ejercicio17.Modelo;

import java.util.Locale;

public class Electrodomestico {

    //region valoresPorDefecto

    private final int PRECIO_BASE = 100;
    private final String COLOR = "Blanco";
    private final char CONSUMO_ELECTRICO = 'F';
    private final float PESO = 5;

    //endregion

    private double precioBase;
    private String color;
    private char consumoElectrico;
    private float peso;

    public Electrodomestico() {

        this.precioBase = this.PRECIO_BASE;
        this.color = this.COLOR;
        this.consumoElectrico = this.CONSUMO_ELECTRICO;
        this.peso = this.PESO;

        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoElectrico);
    }

    public Electrodomestico(double precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = this.COLOR;
        this.consumoElectrico = this.CONSUMO_ELECTRICO;
    }

    public Electrodomestico(double precioBase, String color, char consumoElectrico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;

        comprobarColor(this.color);
        comprobarConsumoEnergetico(this.consumoElectrico);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public float getPeso() {
        return peso;
    }

    public void comprobarColor(String color){

        final String []colores = {"blanco", "negro", "rojo", "azul", "gris"};

        for (int i = 0; i < 5; i++) {

            if(colores[i].equalsIgnoreCase(color)){
                this.color = color;
                break;
            }else {
                this.color = COLOR;
            }
        }
    }

    //region consumoEnergetico

    private void comprobarConsumoEnergetico(char letra){

        final char []letrasConsumoEnergia = {'A','B','C','D','E','F'};

        for (int i = 0; i < 6; i++) {

            if(letrasConsumoEnergia[i] == letra){
                break;
            }else {
                this.consumoElectrico = CONSUMO_ELECTRICO;
            }
        }

    }

    private int calcularPrecioConsumoEnergetico(char letra){

        int precio = 0;

        switch (letra){

            case 'A':

                precio = 100;

                break;
            case 'B':

                precio = 80;

                break;
            case 'C':

                precio = 60;

                break;
            case 'D':

                precio = 50;

                break;
            case 'E':

                precio = 30;

                break;
            case 'F':

                precio = 10;

                break;
        }

        return precio;
    }
    //endregion

    private int calcularPrecioTamanio(float peso){

        int precio = 0;

        if(peso > 0 && peso <= 19){

            precio = 10;
        }else if(peso > 20 && peso <= 49){

            precio = 50;
        }else if(peso > 50 && peso <= 79){

            precio = 80;
        }else{
            precio = 100;
        }

        return precio;
    }

    public double precioFinal(){

        return this.precioBase + calcularPrecioTamanio(this.peso) + calcularPrecioConsumoEnergetico(this.consumoElectrico);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoElectrico=" + consumoElectrico +
                ", peso=" + peso +
                '}';
    }
}
