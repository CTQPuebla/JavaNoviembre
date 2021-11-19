/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccio_poo;

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Computadora {
    String procesador;
    int ram;
    int discoDuro;
    int pantalla;
    int entradasUsb;
    
    public Computadora(){
        
    }

    public Computadora(String procesador, int ram, int discoDuro, int pantalla, int EntradasUsb) {
        this.procesador = procesador;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.pantalla = pantalla;
        this.entradasUsb = EntradasUsb;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public int getEntradasUsb() {
        return entradasUsb;
    }

    public void setEntradasUsb(int EntradasUsb) {
        this.entradasUsb = EntradasUsb;
    }

    @Override
    public String toString() {
        return "Computadora{" + "procesador=" + procesador + ", ram=" + ram + ", discoDuro=" + discoDuro + ", pantalla=" + pantalla + ", EntradasUsb=" + entradasUsb + '}';
    }
    
   public void Cargar(){
       
   }
   public void Encender(){
       
   }
   public void Procesar(){
       
   }
    
    
}
