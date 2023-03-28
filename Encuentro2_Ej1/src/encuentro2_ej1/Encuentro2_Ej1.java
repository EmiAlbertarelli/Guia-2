/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package encuentro2_ej1;

import java.util.Scanner;


public class Encuentro2_Ej1 {

    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado;
        System.out.println("Ingrese un numero");
        
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese un segundo numero");
        numero2 = leer.nextInt();
        
        resultado = (numero1 + numero2);
        
        System.out.println("La suma de los numero es: " + resultado);
    }
    
}
