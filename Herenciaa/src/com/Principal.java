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
public class Principal {
     public static void main(String [] args){
         
         SerVivo s=new SerVivo();
         Persona p=new Persona();
         
         p.setNombre("josias");
         p.setFechaNacimiento("18 agosto de 1996");
         p.setPeso("60");
         
         
         System.out.println(p);
     
     }
    
}
