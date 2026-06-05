package org.kevintuy.view;
import java.util.Scanner;

public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner (System.in);
    
    public void mostrarMenu(){
        
        while (opcionMenu == 0){
            System.out.println("Bienvenido, seleccione una opción:");
            opcionMenu = Integer.parseInt(leer.nextLine ());
            
        }
    }
    
    public void mostarMenuMatematica (){
        System.out.println("Menu de operaciones matematicas");
    } 
}
 