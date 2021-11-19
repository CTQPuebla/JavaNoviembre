package com.Banco.src.com.copy;

public class Perro {

		String color_piel = "";
		String raza = "";
		String nombre = "";
		Boolean moverCola = false;
		Boolean ladrar = false;
		Boolean correr = false;
		Boolean comer = false;
		Boolean dormir = false;
		Boolean morder = false;
		Boolean caminar = false;

		public Perro(String color_piel, String raza, String nombre) {
			
			this.color_piel = color_piel;
			this.raza = raza;
			this.nombre = nombre;
			
		}

		public String getColor_piel() {
			return color_piel;
		}

		public void setColor_piel(String color_piel) {
			this.color_piel = color_piel;
		}

		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setMoverCola(Boolean moverCola) {
			
			this.moverCola = moverCola;
			
		}
		
		public Boolean getMover_cola() {
			
			
			if(moverCola == true) {
				
				System.out.println("El perro esta moviendo la cola");
			}
			
			else {
				
				System.out.println("El perro ya no esta moviendo la cola");
			}
			
			return  moverCola;
			
		}
		
		public void setLadrar(Boolean ladrar) {
			
			this.ladrar = ladrar;
			
		}
		
		public Boolean getLadrar() {
			
			if(ladrar == true) {
				
				System.out.println("El perro esta ladrando");
			}
			
			else {
				
				System.out.println("El perro ya no esta ladrando");
			}
			
			return  ladrar;
			
		}

		public Boolean getCorrer() {
			
			if(correr == true) {
				
				System.out.println("El perro esta corriendo");
			}
			
			else {
				
				System.out.println("El perro ya no esta corriendo");
			}
			
			return correr;
		}

		public void setCorrer(Boolean correr) {
			this.correr = correr;
		}

		public Boolean getComer() {
			
			if(comer == true) {
				
				System.out.println("El perro esta comiendo");
			}
			
			else {
				
				System.out.println("El perro ya no esta comiendo");
			}
			
			return comer;
		}

		public void setComer(Boolean comer) {
			this.comer = comer;
		}

		public Boolean getDormir() {
			
			if(dormir == true) {
			
				System.out.println("El perro se esta durmiendo");
			}
			
			else {
				
				System.out.println("El perro esta despierto");
			}
			
			return dormir;
		}

		public void setDormir(Boolean dormir) {

			this.dormir = dormir;
		}
		

		public Boolean getMorder() {
			
			if(morder == true) {
				
				System.out.println("El perro esta mordiendo algo o a alguien");
			}
			
			else {
				
				System.out.println("El perro ya no esta mordiendo algo o a alguien");
			}
			
			return morder;
		}
		

		public void setMorder(Boolean morder) {
			this.morder = morder;
		}
		

		public Boolean getCaminar() {
			
			if(caminar == true) {
				
				System.out.println("El perro esta caminando");
			}
			
			else {
				
				System.out.println("El perro ya no esta caminado");
			}
			
			
			return caminar;
		}
		

		public void setCaminar(Boolean caminar) {
			this.caminar = caminar;
		}
		
		
		
	}


