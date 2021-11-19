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
public class Bachillerato extends Escuela{
    
    String especialidad;
    String dependencia;

    public Bachillerato() {
    }

    public Bachillerato(String especialidad, String dependencia) {
        this.especialidad = especialidad;
        this.dependencia = dependencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

  
    

    @Override
    public String toString() {
        return "Bachillerato{" + "nombre= " + nombre + ", clave= " + clave + ", turno= " + turno 
                + ", especialidad= " + especialidad + ", dependencia= " + dependencia + '}';
    }
    
    
}
