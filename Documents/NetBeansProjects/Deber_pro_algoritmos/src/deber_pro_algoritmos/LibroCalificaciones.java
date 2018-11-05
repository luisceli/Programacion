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
public class LibroCalificaciones {
    private String nombreDelCurso;
    private String nombreInstruc;


    public LibroCalificaciones() {
    }
    public LibroCalificaciones(String nombre,String instructor) {
         this.nombreDelCurso= nombre;
         this.nombreInstruc= instructor;
         
    }

    public String getNombreInstruc() {
        return nombreInstruc;
    }

    public void setNombreInstruc(String nombreInstruc) {
        this.nombreInstruc = nombreInstruc;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }
    
    
    public String toString(){
        return (getNombreInstruc()+""+getNombreDelCurso());
    }
    
    
//muestra un mensaje de bienvenida al usuario  de LibroCalificaciones
    public void mostrarMensaje(){
        System.out.println("<<Bienvenido al libro de Calificaciones!<<<\n"+getNombreDelCurso());
        System.out.println("<<Este curso es presentado por: "+getNombreInstruc());
        System.out.println(" ");
    }//Fin del metodo mostrar mensaje
    
    
}
  
