/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author JOSIAS
 */
public class Persona extends SerVivo{
    
    String fechaNacimiento;

    public Persona() {
    }

    public Persona(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String fechaNacimiento, String nombre, String peso) {
        super(nombre, peso);
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{ " +"nombre= "+nombre +" peso= "+peso  + " fechaNacimiento= " + fechaNacimiento + '}';
    }

   

   
    
    
}
