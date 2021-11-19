package Banco;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Cuenta {
	int folio;
	double saldo;
	int nimimo;
	int maximo;
	String tipoC;
	Cliente c;
	Sucursal s;
	
	public Cuenta() {
		
	}
	
	


	public Cuenta(int folio, double saldo, int nimimo, int maximo, String tipoC, Cliente c, Sucursal s) {
		super();
		this.folio = folio;
		this.saldo = saldo;
		this.nimimo = nimimo;
		this.maximo = maximo;
		this.tipoC = tipoC;
		this.c = c;
		this.s = s;
	}




	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getNimimo() {
		return nimimo;
	}


	public void setNimimo(int nimimo) {
		this.nimimo = nimimo;
	}


	public int getMaximo() {
		return maximo;
	}


	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}


	public String getTipoC() {
		return tipoC;
	}


	public void setTipoC(String tipoC) {
		this.tipoC = tipoC;
	}
	
	


	public Cliente getC() {
		return c;
	}


	public void setC(Cliente c) {
		this.c = c;
	}
	


	public Sucursal getS() {
		return s;
	}


	public void setS(Sucursal s) {
		this.s = s;
	}


	@Override
	public String toString() {
		return "Cuenta [folio=" + folio + ", saldo=" + saldo + ", nimimo=" + nimimo + ", maximo=" + maximo + ", tipoC="
				+ tipoC + ", c=" + c + ", s=" + s + "]";
	}


	

	public Object depositar(Cuenta c,int  monto) {
		
		String direccion="";
		
		if (c.getMaximo()<monto) {
			return "Sobre pasa el maximo";
		}else if((c.getSaldo()+monto)>c.getMaximo()) {
			return "Sobre pasa el maximo";
		}else {
			c.setSaldo(c.getSaldo()+monto);
			direccion =c.getS().getDireccion();
			System.out.println("Tranferencia exitosa");
			return new Comprobante("17 de Noviembre de 2021",direccion,c.getFolio(),monto);
			
		}

		
	}
	
	public Object retirar(Cuenta c, int monto) {
		String direccion="";
		
		if (c.getSaldo()<monto) {
			return "Sin fondos suficientes para el retiro";
			
		}else if((c.getSaldo()-monto)>c.getNimimo()){
			return "El retiro dejaria sin fondos suficentes a la cuenta ";
			
			
		}else {
			direccion =c.getS().getDireccion();
			c.setSaldo(c.getSaldo()-monto);
			return new Comprobante("17 de Noviembre del 2021",direccion,c.getFolio(),monto);
		}
		
	
	}
	
	public Object tranferir(Cuenta origen , Cuenta destino, int monto) {
		//Cuenta Origen
		//Cantidad
		//Validacion
		
		if(origen.getSaldo()<monto) {
			return "No hay saldo suficiente en la cuenta";
		}else if ((origen.getSaldo()-monto)<origen.getNimimo()) {
			return "El retiro excederia el minimo requerido en la cuenta ";
			
		}else if (destino.getMaximo()<monto) {
			return "La cantidad excede al maximo permitido en la cuenta ";
			
		}else if ((destino.getSaldo()+monto)>destino.getMaximo()) {
			return " La cantidad restante excede al macimo permitido en la cuenta";
		}else {
			//Se realiza la transferencia 
			
			origen.setSaldo(destino.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			
			System.out.print("El saldo actual es de "+ destino.getSaldo());
			
			return new Comprobante("17 de Noviembre de 2021",origen.getS().getDireccion(),origen.getFolio(),monto);
			
		}
		
		
		
		
	}
	
	
	
	
	

}
