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
public class CuentaPlatino extends Cuenta {
    //subclase que hereda de la clase principal

    public CuentaPlatino(int numCuenta, String nombre, int cantidad) {
        //constructor de la clase princiapl
        super(numCuenta, nombre, cantidad);
    }

    @Override
    public double Depositar() {
        //metodo para el depostio de dinero
        double balance;
        //calculamos el balance
        balance = 300 + cantidad;
        return (balance);
    }

    @Override
    public double Retirar() {
        //metodo para el retiro de dinero
        double balance;
        //calculamos el balance teniendo en cuenta que se adiciona 10% mas de interes
        balance = (300 - cantidad) + 0.10;
        return (balance);
    }

    @Override
    public String toString() {
        Depositar();
        Retirar();
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: PLATINO\n"
                + "N° CUENTA == " + numCuenta + "\n"
                + "NOMBRE DEL CLIENTE: " + nombre + "\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA DEPOSITAR: $" + cantidad + "\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $" + Depositar() + "\n"
                + "////////////////////////////////////////////////\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $" + cantidad + "\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $" + Retirar());
    }
}
