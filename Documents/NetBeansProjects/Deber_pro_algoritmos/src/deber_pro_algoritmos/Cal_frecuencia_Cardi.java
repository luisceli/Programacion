/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_pro_algoritmos;

/**
 *
 * @author Usuario
 */
public class Cal_frecuencia_Cardi {

    String Nombre;
    String Apellido;
    int dia;
    String mes;
    int anio;
    public Cal_frecuencia_Cardi(String Nombre, String Apellido, int dia,String mes, int anio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

  
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
     public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        int edad;
        edad = 2018 - this.anio;
        return edad;
    }

    public int getFrecuenciaCardiMaxima() {
        int edad;
        int frecuencia;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        return frecuencia;
    }

    public double getFrecuenciaCardiEsperada() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.5;
        return frecuenciaEsper;
    }

    public double getFrecuenciaCardiEsperada2() {
        int edad;
        int frecuencia;
        double frecuenciaEsper;
        edad = 2018 - this.anio;
        frecuencia = 220 - edad;
        frecuenciaEsper = frecuencia * 0.85;
        return frecuenciaEsper;
    }

    public String toString() {
        return (getNombre() + " " + getApellido() + " " + getDia() + " " + getMes() + " " + getAnio() + " " 
                + getEdad()+" "+getFrecuenciaCardiMaxima()+" "+getFrecuenciaCardiEsperada()+
                getFrecuenciaCardiEsperada2() );
    }

    public void mostrarMensaje(){
        System.out.println("Calculadora de la Frecuenci cardiaca esperada\n");
        System.out.println("Nombre del paciente :  "+getNombre());
        System.out.println("Apellido del paciente: "+getApellido());
        System.out.println(""+getDia()+getMes()+getAnio());
        System.out.println("La frecuencia Cardiaca maxima es: "+getFrecuenciaCardiMaxima());
        System.out.println("La frecuencia esperada del 50% es: "+getFrecuenciaCardiEsperada());
        System.out.println("La frecuencia esperada del 80% es: "+getFrecuenciaCardiEsperada2());
    }
}
