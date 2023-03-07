package implementacion_Herencia_Tda;
// Heredo los comportamientos basicos de una TDA y ademas resuelvo los metodos declarados en la propia interfaz de la clase

import Interfaces_Auxiliares.Cola;

public class Cola_Nodos<T> extends Tda_Nodos<T> implements Cola<T> {

	private Nodo<T> last;
	

	public Cola_Nodos() {super();}

	public Cola_Nodos(int limite) throws IllegalAccessException {
		super(limite);
	}

	
	@Override
	public void add(T element) {

		checkFullness(); // Heredado
		// Controlo que tenga espacio
		Nodo<T> NuevoNodo = new Nodo<>(element);

		// Si esta vacia la cola , el primero va a ser el nuevo nodo
		if (isEmpty()) {
			first = NuevoNodo;
		} else {
			// Si ya tiene elementos , al siguiente del ultimo le agrego el nuevo
			last.setNext(NuevoNodo);
		}
		// Y el ultimo va a ser el nuevo
		last = NuevoNodo;
		incrementSize();
	}

	@Override
	public T remove() {

		// controlo que tenga elementos
		checkEmptiness();
		// el primero en la cola lo agrego a la variable
		// el primero que entre es el primero que se va
		Nodo<T> auxiliar = first;
		// el Nuevo primero de la lista va a ser el siguiente del
		// quien iba primero , es decir el segundo pasa a primero
		first = first.getNext();
		decrementSize();

		return auxiliar.getElemento();
	}

	@Override
	public T get() {

		checkEmptiness();
		return first.getElemento();
	}
	
	
	
	
	
	
	
	
	
}
