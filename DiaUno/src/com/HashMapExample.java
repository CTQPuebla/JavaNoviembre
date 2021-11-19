package com;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap<String, Persona> personas = new HashMap<String, Persona>();
		Persona p1 = new Persona("Nicolas Omar", 25, "Calle Aldama");
		
		personas.put("Nicolas", p1 );
		
		System.out.println(personas.get("Nicolas").toString());
	}
}
