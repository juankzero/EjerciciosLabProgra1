/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

/**
 *
 * @author Docente
 */
public class Empresa {
    
    public static void main(String args[])
    {
        
        Factura nuevaFactura = new Factura(1001, "Eustaquio Ramiro", 45, "Contado");
        nuevaFactura.agregarProducto(100, "Camisa", 425, 2);
        nuevaFactura.agregarProducto(101, "Balon", 600, 1);
        nuevaFactura.agregarProducto(103, "Santa", 35.9f, 6);
        
        System.out.printf("Subtotal: %f %n", nuevaFactura.getSubtotalGeneral());
        System.out.printf("Impuesto: %f %n", nuevaFactura.getImpuesto());
        System.out.printf("Descuento: %f %n", nuevaFactura.getDescuento());
        System.out.printf("Total Neto: %f %n", nuevaFactura.getTotalNeto());
        
        
    }
    
    
}
