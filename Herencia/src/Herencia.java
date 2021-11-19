
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Herencia {

    public static void main(String[] args) {
      
        Empleado E=new Empleado();
        
        E.setNombre("Juan ");
        E.setEdad(24);
        E.setSexo("M");
        
        E.setPuesto("Administrador");
        E.setDepartamento("Sistemas");
        
        System.out.println(E);
        
        
        Persona p=new Persona();
        p.setNombre("Juan");
        p.setEdad(24);
        p.setSexo("M");
        
      
        
        
        
        
    }
    
}
