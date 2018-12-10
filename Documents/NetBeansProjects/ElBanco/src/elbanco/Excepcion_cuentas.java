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
public class Excepcion_cuentas extends Exception {
    //Clase para implementar los mensajes de error
    public Excepcion_cuentas(){
        //constructor de la clase Excepcion_Cuenta
        super ("NO CUENTA CON SALDO SUFICIENTE PARA LA TRANSACCION");
        //envio mensaje
    }
    public Excepcion_cuentas(String msg){
        super (msg);
        //recibo mensaje
    }
}
