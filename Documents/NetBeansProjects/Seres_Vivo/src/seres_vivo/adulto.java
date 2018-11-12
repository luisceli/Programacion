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
public class adulto extends Seres_Vivo{
    private String nombre, tipo, fecha, mes;
    private int anos, ano_nac, dia;

    public adulto(String nombre, String tipo, int ano_nac, int dia, String mes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ano_nac = ano_nac;
        this.dia = dia;
        this.mes = mes;
    }

    @Override
    public int edad(){
        edad = 2018 - ano_nac;
        return edad;
    }
    
    @Override
    public String hablar(){
        edad();
        return ("Hola, me llamo "+nombre+" y se hablar.\n"
                + "Soy racional.\n"
                + "Tengo "+edad+" años.\n"
                + "Nací el "+dia+" de "+mes+" del "+ano_nac+".\n"
                + "Soy "+tipo);
    }

}

