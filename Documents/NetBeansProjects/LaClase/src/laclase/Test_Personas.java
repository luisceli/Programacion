/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclase;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Test_Personas {
     public static ArrayList<Personas> Reg1 = new ArrayList<Personas>();
    public static void main(String[] args) {
        Personas Caso_Est = new Estudiante("Fernando", "Masculino", 23, 3, 11, 50, 50, "Matemáticas");
        Personas Caso_Docen = new Profesor("María", "Femenino", 32, 4, "Matemáticas", 2);
        
        Reg1.add(Caso_Est);
        Reg1.add(Caso_Docen);
        
        for (Personas Aula : Reg1){
            System.out.println(Aula);
        }
        
    }
}
