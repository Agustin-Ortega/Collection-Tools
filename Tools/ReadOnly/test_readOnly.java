package ReadOnly;

import java.util.ArrayList;
import java.util.List;

public class test_readOnly {

	public static void main(String[] args)throws CloneNotSupportedException {

		Corredores lista = new Corredores();
		
		
		lista.agregarNombre("Agustin");
		lista.agregarNombre("Hamilton");
		lista.agregarNombre("Vettel");
		lista.agregarNombre("Vertappen");
			
		System.out.println("Metodo de lectura de lista:");
		// le pedimos a la clase Corredores la lista pero solo para lectura 
		List<String> otraLista =  lista.getReadOnlyItem();
		
		try {
			otraLista.add("sarasa");
		} catch (Exception e) {
			//System.out.println(e.getLocalizedMessage());  // muestra null
			System.out.println("Error en el agregar elemento");
		}
		
		otraLista.forEach((e) -> System.out.println("\n "+e));
		
		
		System.out.println("\n Metodo de clonacion de lista:");
		
		ArrayList<String> nombres= new ArrayList<>();
		nombres.add("juan");
		
		
		
		@SuppressWarnings("unchecked")
		ArrayList<String> copia = (ArrayList<String>) nombres.clone();
		copia.forEach((e) -> System.out.println("\n "+e));
		
		
		
		
	}
	

}
