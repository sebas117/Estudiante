/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Juansebastian
 */
public class Curso {
    
    private String nombre;
    private int codigo;
    private int creditos;
    private double nota;
    

    public Curso (String nombre, int codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }
    
    
    public void ponerNota(double nota)
    {
        
        this.nota = nota;
        
    }
    
    
    
    
    
}
