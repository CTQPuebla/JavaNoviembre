package herencia;

public class PrincipalHerencia {
	public static void main(String[] args) {
		/*SerVivo s = new SerVivo();
		s.setNombre("Nicolas");
		s.setPeso("70");
		System.out.println(s);
		
		//Estos setters son mostrados por la herencia
		Persona p = new Persona();
		p.setNombre("Omar");
		p.setPeso("60");
		
		//Este setter es propio de la case persona
		p.setFechaNacimiento("08 08 1996");
		
		System.out.println(p);*/
		
		Animal es = new Animal();
		es.setGrupo("Mamifero");
		es.setReino("Animal");
		es.setNombre("Leon");
		es.setHabitad("Sabana");
		
		System.out.println(es);
	}
}
