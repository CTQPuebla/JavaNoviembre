/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraPractica;

/**
 *
 * @author JOSIAS
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int numpagina;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numpagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpagina = numpagina;
    }

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

    public int getNumpagina() {
        return numpagina;
    }

    public void setNumpagina(int numpagina) {
        this.numpagina = numpagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numpagina= " + numpagina + '}';
    }
    
    public void comprar(){
    
    }
    
}
