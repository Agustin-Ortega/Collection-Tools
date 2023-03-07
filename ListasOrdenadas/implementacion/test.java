package implementacion;

import interfaces.nodos.ListaOrdenada;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ListaOrdenadaPorMarcaModelo lista = new ListaOrdenadaPorMarcaModelo();
		
		ListaOrdenada<String, Auto> lista2;
		lista2 = new ListaOrdenadaPorMarcaModelo();

		
		lista2.add(new Auto("Renault", "Captur"));
		lista2.add(new Auto("Audi", "A1"));
		lista2.add(new Auto("Volkswagen", "Sirocco"));
		lista2.add(new Auto("Toyota", "Etios"));
		
		for (Auto auto : lista2) {
			System.out.println(auto);
		}
		
	}

}
