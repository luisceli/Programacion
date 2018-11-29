/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class TestConcesionario {

    public static ArrayList<Concesionario> obj1 = new ArrayList<Concesionario>();
    //creamos un arreglo de objetos con nombre de "obj1"

    public static void main(String[] args) {

        Concesionario auto_Mazda = new MarcaMazda("Luis", "Celi", 1104844616, "Riobmba", "2200-548", 1, 1);//Nombre, apellido,cedula,direccion,telefono,tipodeauto,tiposeguro
        //primer objeto para Mazda
        Concesionario auto_Chevrolet = new MarcaChevrolet("Javier", "Montaño", 1104844616, "Cuenca", "2200-548", 3, 2);
        //segundo objeto para Chevrolet
        Concesionario auto_Ford = new MarcaFord("Fernando", "Campoverde", 1104844616, "Guayaquil", "2200-548", 2, 4);
        //tercer objeto para Ford
        Concesionario auto_Toyota = new MarcaToyota("Ricardo", "Ochoa", 1104844616, "Quito", "2200-548", 4, 3);
        //cuarto objeto para Toyota
        //se crea los objetos que se desea de acuerdo con el nombre de la subclase a la cual vaya dirigida o haya referencia

        obj1.add(auto_Mazda); //añadimos el objeto con referencia a la subclase auto_Mazda
        obj1.add(auto_Chevrolet); //añadimos el objeto con referencia a la subclase auto_Chevrolet
        obj1.add(auto_Ford); // añadimos el objeto con referencia a la subclase auto_Ford
        obj1.add(auto_Toyota); //añadimos el objeto con referencia a la subclase auto_Toyota

        for (Concesionario ventadeauto : obj1) {
            //for mejorado para mostar cada uno de los toString añadidos en todas las subclases
            System.out.println(ventadeauto);
            //imprimimos todos los toString
        }
    }
}
