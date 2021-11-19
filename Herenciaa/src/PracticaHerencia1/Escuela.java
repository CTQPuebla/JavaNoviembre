/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaHerencia1;

/**
 *
 * @author JOSIAS
 */
public class Escuela {
    
    String nombre;
    String clave;
    String turno;

    public Escuela() {
    }

    public Escuela(String nombre, String clave, String turno) {
        this.nombre = nombre;
        this.clave = clave;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", clave=" + clave + ", turno=" + turno + '}';
    }
    
    
    
}
