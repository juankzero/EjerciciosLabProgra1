/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;
import java.util.ArrayList;
/**
 *
 * @author Docente
 */
public class Alumno {
    
    private String cuenta;
    private String nombre;
    private String carrera;
    private float promedioAcademico;
    private ArrayList<Clase> notas;
    
    public Alumno(String _cuenta, String _nombre, String _carrera)
    {
        this.cuenta = _cuenta;
        this.nombre = _nombre;
        this.carrera = _carrera;
        notas = new ArrayList<Clase>();
    }
    
    public void agregarNota(String _codigo, String _nombre,
            int _uv, float _nota)
    {
        this.notas.add(new Clase(_codigo, _nombre, _uv, _nota));
    }

    public String getCuenta() {
        return cuenta;
    }
    
    public float ObtenerPromedio()
    {
        float sumaNotas = 0;
        int sumaUV = 0;
        for(int i = 0; i < notas.size(); i++)
        {
            sumaNotas += notas.get(i).getUnidadesValorativas()
                    * notas.get(i).getNota();
            sumaUV +=  notas.get(i).getUnidadesValorativas();
        }
        
        return sumaNotas / sumaUV;
    }
    
}
