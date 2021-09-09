package Ejercicio17.Modelo;

public class Televisor extends Electrodomestico{

    //region valorePorDefecto

    private final float RESOLUCION = 20;
    private final boolean isTDT = false;

    //endregion

    private float resolucion;
    private boolean isTdt;

    public Televisor() {
        super();
        this.resolucion = RESOLUCION;
        this.isTdt = isTDT;
    }

    public Televisor(double precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION;
        this.isTdt = isTDT;
    }

    public Televisor(double precioBase, String color, char consumoElectrico, float peso, float resolucion, boolean isTdt) {
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.isTdt = isTdt;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return isTdt;
    }

    private double precioResolucionMas(){

        if (this.resolucion > 40){

            return 1.3;
        }else{

            return 1;
        }
    }

    private double precioIsTdt(){

        if (this.isTDT){

            return 50;
        }else{

            return 0;
        }
    }

    public double precioFinal(){

        return (super.precioFinal() * precioResolucionMas()) + precioIsTdt();
    }
}
