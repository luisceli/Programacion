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

public class Atacantes  extends jugadores{
    
     int [] gol = new int [6];
     int [] pase = new int [6];
     int [] recuperar = new int [6];
     
    public Atacantes(int goles, int pases, int balonesRecuperados, int aux) {
        super(goles, pases, balonesRecuperados, aux);
        this.setGol(goles,aux);
        this.setPase(pases, aux);
        this.setRecuperar(aux, aux);   
    }

     @Override
    public int valoracion() {
        int sumagol=0;
        int sumapase=0;
        int sumarecuperar=0;
        
        for(int i=0 ;i < 4;i++){
            sumagol= sumagol+ gol[i];
            sumapase=sumapase+pase[i];
            sumarecuperar=sumarecuperar+recuperar[i];
        }
        int valoracionTotal = sumagol + sumapase*2 +sumarecuperar*3;       
      return valoracionTotal; 
    }
    
    public void setGol(int gol,int aux) {
        int valorgol=0;
        valorgol=valorgol*30;
        this.gol[aux-6] = valorgol;
    }
    public void setPase(int pase,int aux) {
        this.pase[aux-6] = pase;
    }
    public void setRecuperar(int recuperar,int aux) {
        this.recuperar[aux-6] = recuperar;
    }     
}
