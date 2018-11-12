/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

  
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        Equipo equipo = new Equipo();
        
        equipo.listaJugadores();
        
        int  goles;
        int pases;
        int balonesRecuperados;  
        int atajadas;
        int valo1,valo2=0,valo3=0;
        

                System.out.println("escribir el numero de atajadas del portero");
                atajadas = sc.nextInt();

                jugadores per2 =new Porteros(atajadas);
                valo1=per2.valoracion();
                
             System.out.println("llenar los resultados del equipo");
                
                int cont=0;
                do{
                    
                        System.out.println("numero de dorsal de jugador");
                         int aux = sc.nextInt();   

                       if (aux>=2 &&aux <=11){
                                System.out.println("escribir el numero de goles");
                             goles= sc.nextInt();
                             System.out.println("numero de pases");
                             pases=sc.nextInt();
                             System.out.println("numero de recuperacion");
                             balonesRecuperados = sc.nextInt();

                            if(aux >=6 &&aux<=11){
                              jugadores per = new Atacantes(goles ,pases,balonesRecuperados,aux);                            
                              valo2 =per.valoracion();
                            }else if (aux>=2&&aux <=5){
                                jugadores per1=new Defensores(goles, pases, balonesRecuperados, aux);
                                valo3=per1.valoracion();
                            } 
                             

                       } else{
                           System.out.println("numero incorrecto");
                       }  
                System.out.println("opcion 0 para terminar");
                            System.out.println("opcion 1 para continuar"); 
                            cont=sc.nextInt();
                }while(cont == 1); 
                
             
         equipo.presentarEquipo();
        
        System.out.println("valor porteros"+valo1);
        System.out.println("valor defensa"+valo2);
        System.out.println("valor atacantes"+valo3);
       
    }
    
     
}
