/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author Docente
 */
public class Clase {
    
    private String codigo;
    private String nombre;
    private int unidadesValorativas;
    private float nota;
    
    public Clase(String _codigo, String _nombre, int _uv, float _nota)
    {
        this.codigo = _codigo;
        this.nombre = _nombre;
        this.unidadesValorativas = _uv;
        this.nota = _nota;
    }

    public int getUnidadesValorativas() {
        return unidadesValorativas;
    }

    public float getNota() {
        return nota;
    }
    
    
    
}
