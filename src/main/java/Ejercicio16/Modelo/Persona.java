package Ejercicio16.Modelo;

public class Persona {

    private final char SEXO = 'H';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = calcularDni();
        this.sexo = this.SEXO;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = calcularDni();
        comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.dni = calcularDni();
        this.peso = peso;
        this.altura = altura;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        comprobarSexo(sexo);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;

    }

    //region CalcularImc

    private int calcularImc(){

        final int bajoPeso = -1;
        final int idealPeso = 0;
        final int sobrePeso = 1;
        float imc = (float) (this.peso / (Math.pow(this.altura,2)));

        if(this.peso < 1 || this.peso < 1){

            return 2;
        }
        if(imc < 20){

            return bajoPeso;
        }else if(imc > 20 && imc < 25){

            return idealPeso;
        }else{

            return sobrePeso;
        }

    }

    public String mensajesEstadoIMC(){

        int imc = calcularImc();

        final String mensajeBajoPeso = "Se encuentra bajo de peso";
        final String mensajeIdealPeso = "Se encuentra con el peso ideal";
        final String mensajeSobrePeso = "Se encuentra en sobrepeso";
        final String mensajeDatosInvalidos = "EL peso o la altura no fueron digitados";

        if(imc == -1){
            return mensajeBajoPeso;
        }else if(imc == 0){
            return mensajeIdealPeso;
        }else if (imc == 1){
            return mensajeSobrePeso;
        }else {

            return mensajeDatosInvalidos;
        }
    }

    //endregion

    //region esMayorEdad

    private boolean esMayorDeEdad(){
         if (this.edad > 18){

             return true;
         }else {
             return false;
         }
    }

    public String mensajeEsMayorDeEdad(){

        final String mensajeEsMayor = "es mayor de edad";
        final String mensajeNoEsMayor = "no es mayor de edad";

        boolean esMayor = esMayorDeEdad();

        if (this.edad > 18){

            return mensajeEsMayor;
        }else {
            return mensajeNoEsMayor;
        }
    }

    //endregion

    public void comprobarSexo(char sexo){

        if (sexo != 'M' || sexo != 'H'){

            this.sexo = this.SEXO;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + '\n' +
                "Edad: " + this.edad + '\n' +
                "DNI: " + this.dni + '\n' +
                "Sexo: " + this.sexo + '\n' +
                "Peso: " + this.peso + '\n' +
                "Altura: " + this.altura;
    }

    //region CALCULAR_DNI

    private int generarNumeroAleatorio(){

        return  ((int)(Math.random()*(99999999-10000000+1)+10000000));
    }

    private String calcularDni(){

        int numero = generarNumeroAleatorio();
        int indiceLetra = numero%23;

        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','P','N','J','S','Q','V','H','L','C','K','E'};


        return numero + "-" + letras[indiceLetra];
    }

    //endregion
}
