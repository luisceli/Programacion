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
public class CuentaDeAhorro {

    private double SaldoAhorros;
    double NuevoSaldo;
    double tasaInteresAnual;

    public CuentaDeAhorro(double SaldoAhorros, double tasaInteresAnual) {
        this.SaldoAhorros = SaldoAhorros;
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getCalcularInteresMensual() {
        double interesMensual;
        interesMensual = (SaldoAhorros *tasaInteresAnual) / 12;
        NuevoSaldo = interesMensual + SaldoAhorros;
        return NuevoSaldo;
    }

    public double getNuevoSaldo() {
        return NuevoSaldo;
    }

    public void setNuevoSaldo(double NuevoSaldo) {
        this.NuevoSaldo = NuevoSaldo;
    }

    public double getTasaInteresAnual() {
        
        return tasaInteresAnual;
    }

    public double getModificador(){
        double Modificador;
        Modificador=NuevoSaldo*12;
        return Modificador;
    }
    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String toString() {
        return (getCalcularInteresMensual() + "" + getNuevoSaldo()+""+getModificador());
    }
    // static class  ModificadorTasaInteres{
    //double modificadorTasaInteres;

    public void mostrarMensaje() {
        System.out.println("El saldo de ahorros inicial es : " + SaldoAhorros);
        System.out.println("La tasa de interes Anual es de  " + "%" + tasaInteresAnual);
        System.out.println("La tasa de interes mensual es de :"+getCalcularInteresMensual());
        System.out.println("La tasa de interes de los 12 meses es: "+getModificador());
        System.out.println("El nuevo saldo de Ahorros es : " + getNuevoSaldo());
        System.out.println("");
    }
    //}

}
