/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Empleado extends Persona{
    
   
    String  departamento;
     String puesto;
    
    public Empleado(){
        
    }

    public Empleado(String departamento, String puesto) {
        this.departamento = departamento;
        this.puesto = puesto;
    }


   

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +"Nombre "+nombre+" Edad "+edad+" Sexo "+sexo+ " departamento " + departamento + " puesto " + puesto +'}';
    }
    
    
    
    
    

   

    
  
    
    
    
    
}
