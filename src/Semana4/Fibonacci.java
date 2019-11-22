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
public class Fibonacci {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Indicque el numero de secuencia que desea terminar: ");
        int numero = leer.nextInt();
        
        int fibonacci = 0;
        int fibo_1 = 0;
        int fibo_2 = 1;
        
        for(int i = 1; i <= numero; i++)
        {    
            System.out.printf("%d ", fibo_1);
         
            fibonacci = fibo_1 + fibo_2;
            fibo_1 = fibo_2;
            fibo_2 = fibonacci;   
        }          
    }
}
