package Ejercicio13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio13 {

    public void ejecutarEjercicio13(){

        System.out.println("¡Bienvenido al ejercicio 13!");

        DateFormat formateador = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fechaActual = Calendar.getInstance().getTime();
        String fechaCadena = formateador.format(fechaActual);
        System.out.println(fechaCadena);
    }
}
