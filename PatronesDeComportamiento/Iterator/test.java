package Iterator;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		
		CajaDeCaramelos cajaDeCaramelos = new CajaDeCaramelos();
		
		Caramelo c1 = new Caramelo("Frutilla");
		Caramelo c2 = new Caramelo("Limon");
		Caramelo c3 = new Caramelo("Naranja");
		Caramelo c4 = new Caramelo("Sandia");
		Caramelo c5 = new Caramelo("Banana");
		Caramelo c6 = new Caramelo("Anana");
		Caramelo c7 = new Caramelo("Pomelo");
		Caramelo c8 = new Caramelo("Pera");
		Caramelo c9 = new Caramelo("Uva");
		
	
		cajaDeCaramelos.add(c1);
		cajaDeCaramelos.add(c2);
		cajaDeCaramelos.add(c3);
		cajaDeCaramelos.add(c4);
		cajaDeCaramelos.add(c5);
		cajaDeCaramelos.add(c6);
		cajaDeCaramelos.add(c7);
		cajaDeCaramelos.add(c8);
		cajaDeCaramelos.add(c9);
		
		Iterator<Caramelo> iterador = cajaDeCaramelos.iterator();
		
		while (iterador.hasNext()) {
			Caramelo caramelo = (Caramelo) iterador.next();
			System.out.println("Caramelo de sabor " + caramelo.getSabor());
		}
		
	}

	
}
