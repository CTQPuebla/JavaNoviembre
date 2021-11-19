import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//
		Cliente c1 = new Cliente();
		c1.setNombre("Felipe");
		c1.setPeso("90");
		c1.setFechaNacimiento("12 enero 1998");
		c1.setRfc("FEMD120198GRE");
			
		Cliente c2 = new Cliente();
		c2.setNombre("Omar");
		c2.setPeso("80");
		c2.setFechaNacimiento("08 agosto 1996");
		c2.setRfc("DHNO080896CET");
			
		Cliente c3 = new Cliente();
		c3.setNombre("Laura");
		c3.setPeso("78");
		c3.setFechaNacimiento("14 FEBRERO 2001");
		c3.setRfc("AFGSHDTYJFYGS");
			
		Cliente c4 = new Cliente();
		c4.setNombre("Juan");
		c4.setPeso("86");
		c4.setFechaNacimiento("12 diciembre 1980");
		c4.setRfc("ASDKLFALADFSK");
			
		//
		Sucursal su1 = new Sucursal("Calle 1", 32);
		Sucursal su2 = new Sucursal("Calle 2", 21);
		Sucursal su3 = new Sucursal("Calle 3", 12);
		Sucursal su4 = new Sucursal("Calle 4", 45);
			
		//
		Cuenta cuenta1 = new Cuenta(30000, 100000, 5000, 10, "Debito", c1, su1);
		Cuenta cuenta2 = new Cuenta(200, 10000, 100, 12, "Debito", c2, su2);
		Cuenta cuenta3 = new Cuenta(4800, 8000, 2000, 14, "Debito", c3, su3);
		Cuenta cuenta4 = new Cuenta(25000, 70000, 3000, 16, "Debito" ,c4, su4);
		
		//
		List<Cuenta> list = new ArrayList<Cuenta>();
		list.add(cuenta1);
		list.add(cuenta2);
		list.add(cuenta3);
		list.add(cuenta4);
		Banco b1 = new Banco("Bancomer", "Española", "Calle 1 Valencia", list);
		
		//System.out.println(b1);
		
		
		System.out.println(cuenta3.depositar(cuenta3, 3000));
	}
}
