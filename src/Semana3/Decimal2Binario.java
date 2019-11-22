/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;
import java.util.Scanner;
/**
 *
 * @author Juan Zepeda
 */
public class Decimal2Binario {
    
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("*** C O N V E R S I O N  N U M E R O S ***");
        
        System.out.print("Ingrese un numero: ");
        int decimal = leer.nextInt();
        
        int cociente = decimal;
        int residuo = 0;
        String binario = "";
        
        do
        {
            residuo = cociente % 2;
            cociente = cociente / 2;
            binario = residuo + binario;
        }while(cociente >= 1);
        
        System.out.printf("El numero %d en notacion binaria es %s%n", decimal, binario);
        
    }
    
}
