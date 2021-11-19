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
public class Principal1 {
     public static void main(String[] args) {
         
         Libro l=new Libro();
         
         
         l.setTitulo(" pinocho");
         l.setAutor(" Carlo Lorenzini");
         l.setNumpagina(100);
         
         System.out.println(l.toString());
         
         Libro l2=new Libro(" paco el chato", " lectura 1", 10);
         System.out.println(l2);
     
     }
    
}
