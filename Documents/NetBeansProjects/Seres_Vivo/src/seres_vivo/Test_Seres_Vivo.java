/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Test_Seres_Vivo {
    
    public static ArrayList<Seres_Vivo> Caso1 = new ArrayList<Seres_Vivo>();//utilizamos ArrayList para recorrer cada una de las clases

    public static void main(String[] args) {
        Seres_Vivo Caso_Loro = new loro("Jose", "Adulto");//datos para la clase Loro
        Seres_Vivo Caso_Nino = new nino("Luis", "Nino",10);
        Seres_Vivo Caso_Adulto = new adulto("Fernando", "Adulto", 1992,4,"diciembre");//datos para la clase adulto
        
        Caso1.add(Caso_Loro);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_loro que hace referencia a la clase Loro
        Caso1.add(Caso_Nino);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_Niño que hace referencia a la clase niño
        Caso1.add(Caso_Adulto);//utilizamos .add para especificar los nuevos objetos, en este caso Caso_Adulto que hace referencia a la clase adulto
        System.out.println("DATOS: ");
        for (Seres_Vivo seres : Caso1) {//utilizamos un for avanzado en donde especificamos la clase principal, un nuevo objeto y el nombre ya especificado
                                         //en el ArrayList
            System.out.println(seres.hablar());//imprimimos al metodo tipo String llamado hablar el cual esta presente en cada clase 
        }
    }

}
