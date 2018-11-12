/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seres_vivo;

/**
 *
 * @author Usuario
 */
public class nino extends Seres_Vivo {//clase niño que llama al metodo de la clase principal
    private String nombre, tipo;//atributos privados de tipo String
    private int anos;//atributo privado de tipo entero
    /**
     * 
     *  nombre//atributo tipo String para el nombre del niño
     *  tipo//atributo tipo String para el tipo de persona de acuerdo a la edad
     *  anos //atributo de tipo entero para los años 
     */
    public nino (String nombre, String tipo, int anos){//constructor de la clase niño
        this.nombre = nombre;
        this.tipo = tipo;
        this.anos = anos;
    }
    @Override
    public String hablar(){//metodo tipo String de la clase principal
        return ("Hola, me llamo "+nombre+" y se hablar.\n"
                + "Soy racional.\n"
                + "Tengo "+anos+" años.\n"
                + "Soy "+tipo);
    }

    @Override
    public int edad() {
        throw new UnsupportedOperationException(); 
    }
}

