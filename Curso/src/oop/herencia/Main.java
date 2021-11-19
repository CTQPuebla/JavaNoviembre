package oop.herencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass subclass = new Subclass();

		int a = 16, b = 8;

		subclass.multi(a, b);
		subclass.resta(a, b);
		subclass.suma(a, b);
		
		System.out.print(subclass);

	}

}
