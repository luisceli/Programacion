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
public class CuentaAhorro extends Cuenta {
     public CuentaAhorro(int numCuenta, String nombre, double cantidad) {
        //parametros del constructor de la clase principal
        super(numCuenta, nombre, cantidad);
    }
    
    @Override
    public double Depositar(){
        //metodo abstracto para el deposito de dinero
        double balance;      
        //calculamos el balance
        balance = 300 + cantidad;
        return (balance);
    }
    @Override
    public double Retirar(){
        //metodo abstracto para el retiro de dinero
        double balance=0;
        
        if (cantidad > 300){
            //condicional que indica que no puede retirar mas dinero  de lo que tiene
            try {
                throw new Excepcion_cuentas();
                //llamamos a la clase Excepcion_Cuenta
            } catch (Excepcion_cuentas excepcion_Cuenta) {
                System.err.println(excepcion_Cuenta.getMessage());
                //imprimimos el mensaje de error escrito en la clase de Excepcion_Cuenta
            }
        } else {
            //calculamos el balance total
            balance = 300 - cantidad;
        }       
        return (balance);
    }
    
    @Override
    public String toString(){
        Depositar();
        Retirar();
        return ("\nUSTED HA ELEGIDO EL TIPO DE CUENTA: AHORRO\n"
                + "N° CUENTA == "+numCuenta+"\n"
                + "NOMBRE DEL CLIENTE: "+nombre+"\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA DEPOSITAR: $"+cantidad+"\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $"+Depositar()+"\n"
                + "////////////////////////////////////////////////\n"
                + "INGRESE EL MONTO DE DINERO QUE DESEA RETIRAR: $"+cantidad+"\n"
                + "SU MONTO ORIGINAL ES DE $300\n"
                + "SU SUELDO ACTUAL ES DE: $"+Retirar());
    }
}
