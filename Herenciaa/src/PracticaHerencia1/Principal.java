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
public class Principal {
    
    public static void main (String [] args){
    
        Bachillerato b=new Bachillerato();
      
        b.setNombre("CBTis 25");
        b.setClave("20dpro478u");
        b.setTurno("matutino");
        b.setEspecialidad("programacion");
        b.setDependencia("publico");
        
        System.out.println(b);
    }
    
}
