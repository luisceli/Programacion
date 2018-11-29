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
public class MarcaChevrolet extends Concesionario {
//heredamos de la classe principal "Concesionario"

    public MarcaChevrolet(String nomcliente, String apellido, int cedulacliente, String direccion, String numTelef, double tipoauto, double tiposeguro) {
        //constructor con parametros del constructor de la clase principal
        super(nomcliente, apellido, cedulacliente, direccion, numTelef, tipoauto, tiposeguro);
        //llamamos al constructor de la clase principal
    }

    //metodo de la subclase para retornar el precio del auto 
    @Override
    public double precio() {
        if (tipoauto == 1) {//deportivo

            precio = 29940.00;

        } else if (tipoauto == 2) {//camioneta

            precio = 28450.00;

        } else if (tipoauto == 3) {//familiar

            precio = 32240.00;

        }
        return precio;
    }

    //metodo de la subclase en el cual nos va ha indicar que tipo de auto selecciono
    @Override
    public double tipoauto() {
        if (tipoauto == 1) {//deportivo
            tipoauto = 1;
            codigo = 12056;

            modelo = "pazm-2015";
        } else if (tipoauto == 2) {//camioneta
            tipoauto = 2;
            codigo = 19012;

            modelo = "turbog20-216";

        } else if (tipoauto == 3) {//familiar
            tipoauto = 3;
            codigo = 75012;

            modelo = "familyg2-2018";
        }
        return tipoauto;
    }
//metodo de la subclase en el cual nos va ha indicar que tipo de seguro selecciono

    @Override
    public double tiposeguro() {

        if (tiposeguro == 1) {
            tiposeguro = 1;
            seguro = 4000.00;

        } else if (tiposeguro == 2) {
            tiposeguro = 2;
            seguro = 2000.00;

        } else if (tiposeguro == 3) {
            tiposeguro = 3;
            seguro = 1000.00;

        } else if (tiposeguro == 4) {
            tiposeguro = 4;
            seguro = 8000.00;

        }
        return tiposeguro;
    }

    //llamamos a los metodos abstracto de la clase principal
    @Override
    public double seguro() {

        return seguro;
    }

    @Override
    public double total() {
        seguro();
        total = (total + precio + seguro) * iva + precio;
        return total;
    }

    @Override
    public String toString() {
        seguro();
        precio();
        total();
        return String.format("\n\t///////////////////////////////////////////////////////////\n"
                + "\n\tBIENVENIDO AL CONCESIONARIOS AUTOSSELECT\n"
                //mensaje de bienvenida
                + "INGRESE SU NOMBRE Y APELLIDO\n"
                + "NOMBRE: " + nomcliente + "\n" //ingresa su nombre
                + "APELLIDO: " + apellido + "\n" //ingresa su apellido
                + "INGRESE SU NUMERO DE CEDULA: " + cedulacliente + "\n" //ingresa numero de cedula
                + "DIRECCION: " + direccion + "\n" //ingresa la mesa en la cual se encuentra
                + "NUMERO DE TELEFONO: " + numTelef + "\n" //ingresa numero de cedula
                + "////////////////////////////////////////////////////////////\n"
                + "SELECIONE LA MARCA DEL AUTO PARA REALIZAR LA COMPRA \n"
                + "1. MAZDA\n"
                + "2. CHEVROLET\n"
                + "3. FORD\n"
                + "4. TOYOTA\n"
                + "OPCION: 1\n"
                + "///////////////////////////////////////////////////////\n"
                + "USTED HA ESCOGIDO LA MARCA MAZDA\n"
                + "QUE TIPO DE AUTO DESEA COMPRAR\n"
                + "1.Deportivo) A tan solo $29.940 sin incluir iva\n"
                + "2.Camioneta) A tan solo $28.450 sin incluir iva\n"
                + "3.Familiar) A tan solo $32.240 sin incluir iva\n"
                + "OPCION: " + tipoauto() + "\n"
                + "///////////////////////////////////////////////////////\n"
                + "ESCOJA EL TIPO DE SEGURO PARA SU AUTO\n"
                + "1.Seguro Amplio consta de:\n"
                + "Daños materiales: \n"
                + "Robo Total\n"
                + "Responsabilidad civil L.U.C\n"
                + "Responsabilidad civil catastrofica por fallecimiento\n"
                + "Gastos médicos ocupantes\n"
                + "Asistencia Legal\n"
                + "Asistencia de viaje )El precio es de $4000.00\n"
                + "2.Limitado consta de:\n"
                + "Robo Total\n"
                + "Responsabilidad civil L.U.C\n"
                + "Responsabilidad civil catastrofica por fallecimiento\n"
                + "Gastos médicos ocupantes) el precio es de $2000.00\n"
                + "3.Responsabilidad civil\n"
                + "Responsabilidad Civil L.U.C.\n"
                + "Responsabilidad civil catastrofica por fallecimiento\n"
                + "Gastos médicos ocupantes\n"
                + "Asistencia de viaje) El precio es de $1000.00\n"
                + "4.Atlas VIP\n"
                + "Daños materiales: \n"
                + "Robo Total\n"
                + "Responsabilidad civil L.U.C\n"
                + "Responsabilidad civil catastrofica por fallecimiento\n"
                + "Gastos médicos ocupantes\n"
                + "Asistencia Legal\n"
                + "Asistencia de viaje\n"
                + "Indemnizacion diaria por robo total o daños materiales\n"
                + "Accidentes automovilisticos al conductor\n"
                + "Atlas cero plus por pérdida total de daños materiales\n"
                + "Atlass cero plus por robo total)El precio es de $8000.00\n"
                + "OPCION: " + tiposeguro() + "\n"
                + "USTED HA ESCOGIDO EL AUTO " + tipoauto() + "\n"
                + "CON EL SEGURO TIPO" + tiposeguro() + "\n"
                + "EL VALOR TOTAL A PAGAR ES DE $" + total + "\n"
                //mensaje que indica el total a pagar
                + "//////////////////////////////////////////////\n"
                + "\tFACTURA ELECTRONICA\n"
                + "NOMBRE: " + nomcliente + "\n"
                + "APELLIDO: " + apellido + "\n"
                + "CEDULA: " + cedulacliente + "\n"
                + "Codigo del auto" + codigo + "\n"
                + "Modelo del auto" + modelo + "\n"
                + "TIPO DE AUTO: " + tipoauto() + "\n"
                + "Seguro: " + tiposeguro() + "\n"
                + "PRECIO Total de auto+ IVA: $" + total + "\n"
                + "/////////////////////////////////////////////////////////\n"
                + "\tGRACIAS POR  PREFERIRNOS\n");
    }

}
