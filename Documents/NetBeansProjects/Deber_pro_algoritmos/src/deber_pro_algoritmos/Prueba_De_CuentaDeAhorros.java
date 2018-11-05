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
public class Prueba_De_CuentaDeAhorros {

    public static void main(String[] args) {
        CuentaDeAhorro caso1 = new CuentaDeAhorro(2000.00, 4);
        CuentaDeAhorro caso2 = new CuentaDeAhorro(3000.00, 5);
        caso1.mostrarMensaje();
        caso2.mostrarMensaje();
    }

}
