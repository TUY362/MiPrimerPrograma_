package org.kevintuy.main;
import org.kevintuy.view.ViewMenuPrincipal;
        
/**
 *
 * @author informatica
 */
public class Main {
    public static void main(String[] args) {
        //tipo dato,nombre,valores
        //intanciar <- new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        
        System.out.println("Mi primer programa");
        menu.mostrarMenu();
    }
    
}
