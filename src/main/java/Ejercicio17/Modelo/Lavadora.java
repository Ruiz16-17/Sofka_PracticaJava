package Ejercicio17.Modelo;

public class Lavadora extends Electrodomestico{

    private final float CARGA = 5;

    private float carga;

    public Lavadora() {
        super();
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, float peso) {
        super(precioBase, peso);
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, String color, char consumoElectrico, float peso, float carga) {
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    private int precioCargaDeMas(){

        if (getPeso() > 30){
            return 50;
        }else {
            return 0;
        }
    }

    public double precioFinal(){

        return super.precioFinal() + precioCargaDeMas();
    }

    @Override
    public String toString() {
        return super.toString() + "Lavadora{" +
                "carga=" + carga +
                '}';
    }


}
