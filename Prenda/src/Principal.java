
public class Principal {
	public static void main(String[] args) {

		Pantalon s = new Pantalon();
		s.setNombre("Marco");
		s.setColor("Azul");
		s.setEstilo("Verano");
		s.setMaterial("Mesclilla");
		
		s.setCinturon(true);

		System.out.println(s);

		Camisa n = new Camisa();
		n.setNombre("Marco");
		n.setColor("Verde");
		n.setEstilo("Verano");
		n.setMaterial("Fanela");
		
		n.setMangaLarga(true);

		System.out.println(n);

	}

}
