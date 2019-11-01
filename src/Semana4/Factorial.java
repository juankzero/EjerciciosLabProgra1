/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;
import java.util.Scanner;
/**
 *
 * @author Juan Zepeda
 */
public class Factorial {
    
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("*** C A L C U L O  F A C T O R I A L ***\n");
        
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        int factorial = 1;
        
        for(int i = numero; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        
        System.out.printf("El factorial de %d es %d%n", numero, factorial);
        
        
    }
    
}
