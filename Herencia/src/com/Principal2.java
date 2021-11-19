package com;

public class Principal2 {
	public static void main(String[] args) {
		
	TipoDeTransporte tp = new TipoDeTransporte();
	
	tp.setNombre("Barco");
	tp.setMedio("Mar");
	tp.setResponsable("Capitan");
	System.out.println(tp);
	
	MedioT mt = new MedioT();
	mt.setNombre("Avion");
	mt.setMedio("Aire");
	mt.setResponsable("Piloto");
	mt.setCombustible("gas");

	System.out.println(mt);

}
}
