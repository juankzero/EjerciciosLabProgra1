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
public class NumeroPrimo {
    
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("*** N U M E R O  P R I M O ***\n");
        
        int numero = 0;
        
        do
        {
        
            System.out.print("Escriba un numero: ");
            numero = leer.nextInt();
            
            if(numero == -1)
                break;

            int cantidadFactores = 0;

            for(int i = 1; i <= numero; i++)
            {
                if( numero % i == 0 )
                    cantidadFactores++;
            }

            if(cantidadFactores == 2)
                System.out.println("¡El numero es primo!");
            else
                System.out.println("¡El numero no es primo!");
            
        }while(numero != -1);
        
    }
    
}
