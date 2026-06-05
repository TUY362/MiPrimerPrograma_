/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kevintuy.controller.controller;

/**
 *
 * @author informatica
 */
public class ControllerLogica 

{public boolean verificarEdad(int edad) {
    if (edad >= 18) {
        return true;
    } else {
        return false;
    }
}public boolean esPar(int numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
    
}
public String semaforo(String color) {
    if (color.equals("verde")) {
        return "Avanzar";
    } else if (color.equals("amarillo")) {
        return "Precaución";
    } else {
        return "Detenerse";
    }
}
  public boolean estaEnRango(int num, int min, int max) {
    if (num >= min && num <= max) {
        return true;
    } else {
        return false;
    }
}
  
}
