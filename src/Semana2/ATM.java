/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;
import java.util.Scanner;
/**
 *
 * @author Juan Zepeda
 */
public class ATM {
    
    public static void main(String args[])
    {
        System.out.println("*** A T M ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor a retirar: ");
        int cantidad = leer.nextInt();
        
        int billetes500, billetes100;
        billetes500 = billetes100 = 0;
        
        int billetesRestantes = cantidad;
        
        if( cantidad >= 500 )
        {
            billetes500 = cantidad / 500;
            billetesRestantes = cantidad % 500;
        }
        
        if( billetesRestantes >= 100 )
            billetes100 = billetesRestantes / 100;
        
        System.out.printf("%d Billetes de 500 %n", billetes500);
        System.out.printf("%d Billetes de 100 %n", billetes100);
        
    }
    
}
