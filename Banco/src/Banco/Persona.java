package Banco;

public class Persona  extends SerVivo{
	
	
	

    String fechaNacimiento;
    
    public Persona(){
        
    }
    public Persona(String fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
        
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
        return "Persona{" + "fechaNacimiento=" + fechaNacimiento + "Nombre "+nombre+"peso"+peso+'}';
    }


}
