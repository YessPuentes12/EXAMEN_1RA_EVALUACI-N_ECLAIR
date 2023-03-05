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
public class Peliculas {

    private String titulo;
    private String estudio;
    private int rating;
    
    // Constructor
    public Peliculas(String titulo, String estudio, int rating) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.rating = rating;
    }
    
    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
