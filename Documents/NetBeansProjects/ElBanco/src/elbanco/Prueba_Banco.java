/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elbanco;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Prueba_Banco {
  public static ArrayList<Cuenta> Caso1 = new ArrayList<Cuenta>();
    //creamos un arreglo de objetos

    public static void main(String[] args) {
        Cuenta Caso_Ahorros = new CuentaAhorro(203697452, "Fernando Campoverde", 200);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase CuentaAhorro
        Cuenta Caso_Cheques = new CuentaCheque(203425621, "Luis Celi", 400);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase CuentaCheque
       Cuenta Caso_Platino = new CuentaPlatino(203584363, "María Montaño", 100);
        //ingresamos los respecivos datos para cada uno de los objetos, en este caso para el objeto con referencia a la clase CuentaPlatino

        Caso1.add(Caso_Ahorros);
        Caso1.add(Caso_Cheques);
        Caso1.add(Caso_Platino);

        for (Cuenta cuentas : Caso1) {
            System.out.println(cuentas);
        }
    }   
}
