package implementacion;

import java.util.Iterator;

import interfaces.nodos.ListaOrdenada;

public class ListaDeClientes_porID extends ListaOrdenada_Nodos<Integer, Cliente>{

	@Override
	public int compare(Cliente dato1, Cliente dato2) {
		
		return (dato1.getId()-dato2.getId());
	}

	@Override
	public int compareByKey(Integer clave, Cliente elemento) {
	
		return (clave - elemento.getId());
	}

	
	
	class lista implements ListaOrdenada<Integer, String>{

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isFull() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void checkEmptiness() throws RuntimeException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void checkFullness() throws RuntimeException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Iterator<String> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void add(String newElement) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int compare(String dato1, String dato2) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int compareByKey(Integer clave, String elemento) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean exists(Integer key) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String get(int pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean remove(String elem) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String removeAt(int pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String removeByKey(Integer key) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String search(Integer key) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
