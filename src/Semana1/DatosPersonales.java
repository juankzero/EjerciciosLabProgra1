/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;
/**
 *
 * @author Docente
 */
public class DatosPersonales {
    
    public static void main(String args[])
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("*** P R O G R A M A  D A T O S  P E R S O N A L E S ***");
        
        System.out.print("Ingrese su nombre: ");
        //String nombreCompleto = "Juan Carlos Zepeda";
        String nombreCompleto = leer.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.print("Ingrese su carrera: ");
        String carrera = leer.next();
        
        System.out.print("Ingrese su estatura: ");
        float estatura = leer.nextFloat();
        
        System.out.println("Alumno: " + nombreCompleto);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " metros");
        
        
        
        
        
    }
    
}
