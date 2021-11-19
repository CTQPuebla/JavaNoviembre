package uno;

public class Principal {

	public static void main(String[] args) {
		Persona pInicializado = new Persona("Nicolas Omar", "Diego Hernandez", 25, "08081996", 1.80);
		
		Persona pNoInicializado = new Persona();
		
		pNoInicializado.setNombres("Nicolas Omar");
		pNoInicializado.setApellidos("Diego Hernandez");
		pNoInicializado.setEdad(25);
		pNoInicializado.setFechaNacimiento("08081996");
		pNoInicializado.setEstatura(1.80);
		
		System.out.println(pNoInicializado);
	}
}
