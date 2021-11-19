
public class Prenda {
	String Nombre;
	String Color;
	String Estilo;
	String Material;
	public Prenda(){
		
	}
	public Prenda(String nombre, String color, String estilo, String material) {
		
		Nombre = nombre;
		Color = color;
		Estilo = estilo;
		Material = material;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getEstilo() {
		return Estilo;
	}
	public void setEstilo(String estilo) {
		Estilo = estilo;
	}
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		Material = material;
	}
	@Override
	public String toString() {
		return "Prenda [Nombre=" + Nombre + ", Color=" + Color + ", Estilo=" + Estilo + ", Material=" + Material + "]";
	}
    
}
