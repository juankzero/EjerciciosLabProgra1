/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Docente
 */
public class Universidad {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        
        int opcion = 0;
        
        do
        {
            System.out.println("***MENU PRINCIPAL***");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Ingresar Nota");
            System.out.println("3. Reporte");
            System.out.println("4. Salir del Sistema");
            System.out.print("Ingrese opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.print("Ingrese cuenta de Alumno: ");
                    String cuenta = leer.next();
                    
                    System.out.print("Ingrese nombre de Alumno: ");
                    String nombre = leer.nextLine();
                    
                    System.out.print("Ingrese carrera de Alumno: ");
                    String carrera = leer.next();
                    
                    alumnos.add(new Alumno(cuenta, nombre, carrera));
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Ingrese codigo de alumno: ");
                    String codBusqueda = leer.next();
                    
                    Alumno busqueda = null;
                    for(int i = 0; i < alumnos.size(); i++)
                        if(alumnos.get(i).getCuenta().equals(codBusqueda))
                            busqueda = alumnos.get(i);
                    
                    if(busqueda == null)
                    {
                        System.out.println("¡Alumno no Existe!");
                        break;
                    }
                    
                    System.out.print("Indica cantidad de Clases a Ingresar: ");
                    int cantidadClases = leer.nextInt();
                    
                    for(int i = 0; i < cantidadClases; i++)
                    {
                        System.out.print("Ingrese codigo de Clase: ");
                        String codClase = leer.next();
                        
                        System.out.print("Ingrese nombre de Clase: ");
                        String nomClase = leer.next();
                        
                        System.out.print("Ingrese Unidades Valorativas: ");
                        int uvClase = leer.nextInt();
                        
                        System.out.print("Ingrese Nota de Clase: ");
                        float notaClase = leer.nextFloat();
                        
                        busqueda.agregarNota(codClase, nomClase, uvClase, notaClase);
                        
                        System.out.println("¡Nota Ingresada Correctamente!");
                    }
                    break;
                    
                case 3:
                   
                    System.out.print("Ingrese codigo de alumno: ");
                    String codBus = leer.next();
                    
                    Alumno busq = null;
                    for(int i = 0; i < alumnos.size(); i++)
                        if(alumnos.get(i).getCuenta().equals(codBus))
                            busqueda = alumnos.get(i);
                    
                    if(busq == null)
                    {
                        System.out.println("¡Alumno no Existe!");
                        break;
                    }
                    
                    //imprimir toda la informacion de Alumno
                    
                    busq.ObtenerPromedio();
                    
                   break;
            }
            
        }while(opcion != 4);
        
        
    }
    
}
