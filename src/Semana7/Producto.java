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
public class Producto {
    
    private int codigoProducto;
    private String nombreProducto;
    private float precioProducto;
    private int cantidadProducto;

    public Producto()
    {
        this.codigoProducto = -1;
        this.nombreProducto = "";
        this.precioProducto = -1;
        this.cantidadProducto = -1;
    }
    
    public Producto(int _codigo,
                    String _nombre,
                    float _precio,
                    int _cantidad)
    {
        this.codigoProducto = _codigo;
        this.nombreProducto = _nombre;
        this.precioProducto = _precio;
        this.cantidadProducto = _cantidad;
    }
    
    public void setCodigo(int _codigo)
    {
        this.codigoProducto = _codigo;
    }
    
    public void setNombre(String _nombre)
    {
        this.nombreProducto = _nombre;
    }
    
    public void setCantidad(int _cantidad)
    {
        this.cantidadProducto = _cantidad;
    }
    
    public void setPrecio(float _precio)
    {
        this.precioProducto = _precio;
    }
    
    public int getCodigo()
    {
        return this.codigoProducto;
    }
    
    public String getNombre()
    {
        return this.nombreProducto;
    }
    
    public float getPrecio()
    {
        return this.precioProducto;
    }
    
    public float getCantidad()
    {
        return this.cantidadProducto;
    }
    
    public float getSubtotal()
    {
        return this.precioProducto * this.cantidadProducto;
    }
}
