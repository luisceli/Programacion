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
public abstract class jugadores extends Equipo{
    
    protected int  goles;
    protected int pases;
    protected int balonesRecuperados;
    protected int atajadas;
    protected int aux;
    public abstract int valoracion();

    public jugadores() {
    }
    

    public jugadores(int atajadas) {
        this.atajadas = atajadas;
    }


    public jugadores(int goles, int pases, int balonesRecuperados, int aux) {
        this.goles = goles;
        this.pases = pases;
        this.balonesRecuperados = balonesRecuperados;
        this.aux = aux;
    }
}