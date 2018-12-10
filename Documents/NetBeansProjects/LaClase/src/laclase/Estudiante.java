/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclase;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Personas {

    double notafinal;
    int maxEst, id;
    String materia;

    public Estudiante(String nombre, String sexo, int edad, int falta, double notaFinal, int maxEst, int id, String materia) {
        super(nombre, sexo, edad, falta);
        this.notafinal = notafinal;
        this.maxEst = maxEst;
        this.id = id;
        this.materia = materia;
    }

    @Override
    public int novillos() {
        return (falta);
    }

    public int edad() {
        if (edad > 25) {
            try {
                throw new Excepcion_Personas();
            } catch (Excepcion_Personas excepcion_Personas) {
                System.err.println(excepcion_Personas.getMessage());
            }
        }
        return (edad);
    }

    public double nota() {
        if (notafinal > 10) {
            try {
                throw new Excepcion_Personas2();
            } catch (Excepcion_Personas2 excepcion_Personas2) {
                System.err.println(excepcion_Personas2.getMessage());
            }
        }
        return (notafinal);
    }

    public double aprobacion() {
        if (notafinal < 6) {
            System.err.println("ESTUDIANTE NO APROBADO");
        }
        if (falta > 5) {
            System.err.println("FALTAS MAYORES AL NUMERO ESTABLECIDO");
        }
        return (notafinal);
    }

    @Override
    public String toString() {
        novillos();
        return ("\tAULA N° " + id + "\n"
                + "N°EL MAXIMO DE ESTUDIANTES PERMITIDOS == " + maxEst + "\n"
                + "MATERIA == " + materia + "\n"
                + "NOMBRE DEL ESTUDIANTE: " + nombre + "\n"
                + "SEXO: " + sexo + "\n"
                + "EDAD: " + edad() + "\n"
                + "NOTA: " + nota() + "\n"
                + "APROBACION: " + aprobacion());
    }

}
