/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases_examen;

/**
 *
 * @author Omar Carrillo
 */
public class empliado {
        // Atributos
    private String nombre;
    private String apellido;
    private String direccion;
    private int anioIngreso;
    private double salario;
    
    // Constructor
    public empliado(String nombre, String apellido, String direccion, int anioIngreso, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.anioIngreso = anioIngreso;
        this.salario = salario;
    }
    
    // Métodos de acceso (getters) y modificación (setters) para los atributos
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getAnioIngreso() {
        return anioIngreso;
    }
    
    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para calcular las prestaciones del empleado
    public double calcularPrestaciones() {
        // Obtener el número de años de servicio
        int aniosServicio = 2023 - anioIngreso;
        
        // Calcular las prestaciones según la fórmula establecida (30 días de salario por cada año de servicio)
        double prestaciones = (aniosServicio * salario) / 12;
        
        // Retornar las prestaciones calculadas
        return prestaciones;
    }
}
