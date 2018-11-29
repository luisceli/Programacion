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
public abstract class Concesionario {

    public int codigo = 0;
    public String nomcliente;
    public String apellido;
    public int cedulacliente;
    public String direccion;
    public String numTelef;
    public String marca = "";
    public double precio = 0.0;
    public String modelo = "";
    public double total = 0;
    public double tipoauto;
    public double tiposeguro;
    public double seguro = 0.0;
    public double iva = 0.12;
    
    /**Nombre, apellido,cedula,direccion,telefono,tipodeauto,tiposeguro
    @param nombrecliente atributo tipo String para el nombre del cliente
     * @param apellido atributo tipo String para el apellido del clientes
     * @param  cedulacleinte atributo de tipo entero para  la cedula del cliente
     * @param  direccion atributo de tipo string para la direccion del cliente
     * @param tipodeauto atributo de tipo double que sirve para seleccionar tipo de auto que desea : deportivo, camioneta,familiar
     * @param tiposeguro atributo de tipo double que sirve para seleccionar el tipo que dea comprar para su auto :amplio,limitado,Responsabilidad civil y Atlas VIP
     */

    public Concesionario(String nomcliente, String apellido, int cedulacliente, String direccion, String numTelef, double tipoauto, double tiposeguro) {
       //Constructor con parametros de tipo double e String 
        this.nomcliente = nomcliente;//guarda el nombre del cliente
        this.apellido = apellido;//guarda el apellido del cliente
        this.cedulacliente = cedulacliente;//guarda el numero de cedula del cliente
        this.direccion = direccion;//guarda la direccion del cliente
        this.numTelef = numTelef;//guarda el numero de telefono
        this.tipoauto = tipoauto;//guarda el tipo de auto que desea el cliente
        this.tiposeguro = tiposeguro;//guarda el tipo de  seguro que desea el cliente
    }

    //metodos abstractos para determinar el tipodeauto, precio,tipodeseguro y el total;
    public abstract double precio();

    public abstract double tipoauto();

    public abstract double seguro();

    public abstract double tiposeguro();

    public abstract double total();

}
