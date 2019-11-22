/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;
import java.util.ArrayList;
/**
 *
 * @author Docente
 */
public class Factura {
    
    private int codigoFactura;
    private String nombreCliente;
    private int edadCliente;
    private String metodoPago;
    private ArrayList<Producto> detalleProductos;
    
    public Factura(int _codigo, String _nombre, 
                   int _edad, String _metodo)
    {
        this.codigoFactura = _codigo;
        this.nombreCliente = _nombre;
        this.edadCliente = _edad;
        this.metodoPago = _metodo;
        this.detalleProductos = new ArrayList<Producto>();
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
    
    public void agregarProducto(int codigoP,
                                String nombreP,
                                float precioP,
                                int cantidadP)
    {
        
        this.detalleProductos.add(
                new Producto(codigoP, nombreP, precioP, cantidadP));
        
        System.out.println("¡Producto Agregado Correctamente!");
        
    }
    
    public float getSubtotalGeneral()
    {
        float subtotalGeneral = 0;
        for(int i = 0; i < detalleProductos.size(); i++)
            subtotalGeneral += detalleProductos.get(i).getSubtotal();
        
        return subtotalGeneral;
    }
    
    public float getImpuesto()
    {
        return getSubtotalGeneral() * 0.15f;
    }
    
    public float getDescuento()
    {
        float descuento = 0;
        
        if(this.edadCliente >= 60)
            descuento = getSubtotalGeneral() * 0.25f;
        
        return descuento;
    }
    
    public float getTotalNeto()
    {
        return getSubtotalGeneral() + getImpuesto() - getDescuento();
    }
    
}
