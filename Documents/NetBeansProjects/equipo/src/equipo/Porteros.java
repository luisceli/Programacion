/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

/**
 *
 * @author Usuario
 */
public class Porteros extends jugadores{
  
    int atajads;
    int valortotal;
   
    public Porteros( int atajadas) {
        super( atajadas);
        
    }

    @Override
    public int valoracion() {
        int valortotal= this.atajadas*5;
        return valortotal;
    }

    public int getAtajads() {
        return atajads;
    }

    public void setAtajads(int atajads) {
        this.atajads = atajads;
    }

     
}
