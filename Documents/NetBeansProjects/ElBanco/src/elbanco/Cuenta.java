/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbanco;

/**
 *
 * @author Usuario
 */
public abstract class Cuenta {
    //clase abstracta principal

    int numCuenta;
    //atributos para indicar el numero de cuenta
    double balanceAct, cantidad;
    //atributos tipo double para indicar el balance actual y el monto que el usuario desea retirar
    String nombre;

    //atributo para el ingreso de nombre
    /**
     *
     * @param numCuenta para el numero de cuenta
     * @param nombre para el nombre del usuario
     * @param cantidad para la cantidad que desea depositar o retirar el usuario
     */

    public Cuenta(int numCuenta, String nombre, double cantidad) {
        //constructor principal
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public abstract double Depositar();
    //metodo abstracto para el deposito de dinero

    public abstract double Retirar();
    //metodo abstracto para el retiro de dinero
}
