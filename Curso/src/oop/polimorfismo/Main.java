package oop.polimorfismo;

public class Main {
	
	public static void main(String[] agr) {
		Veiculo veiculo[]=new Veiculo[4];
		
		veiculo[0]=new Veiculo("Ford","ford2019","2012");
		veiculo[1]=new Veiculoburbuneta("Suburban", "Chevrolet", "2012", 500);
		veiculo[2]=new Veiculodeportivo("corverd", "cord", "2015",225);
		veiculo[3]=new Veiculonormal("Camioneta", "Nissan", "2015", 4);
		
		for (Veiculo veiculos:veiculo) {
			System.out.print(veiculos.mostrad());
			System.out.println("\n");
		}
		
		
	}

}
