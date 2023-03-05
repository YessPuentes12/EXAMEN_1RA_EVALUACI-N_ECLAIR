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
public class FICHA {
  private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numPaginas;
    
    // Constructor sin parámetros
    public FICHA() {
        this.titulo = "El Gran Gatsby";
        this.autor = "F. Scott Fitzgerald";
        this.editorial = "Scribner";
        this.añoPublicacion = 1925;
        this.numPaginas = 218;
    }
    
    // Constructor con parámetros
    public FICHA(String titulo, String autor, String editorial, int añoPublicacion, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numPaginas = numPaginas;
    }
    
    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    // Método para imprimir la ficha bibliográfica en formato APA
    public void imprimirFicha() {
        System.out.println(getAutor() + " (" + getAñoPublicacion() + "). " + getTitulo() + ". " + getEditorial() + ".");
    }
}

