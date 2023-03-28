/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicio.pkg2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nomre");
        nombre = leer.nextLine();
        
        System.out.println("Hola " + nombre);
        
                
    }
    
}
