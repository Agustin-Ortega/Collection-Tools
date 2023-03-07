package implementacion_Herencia_Tda;

import Interfaces_Auxiliares.Pila;

// Heredo los comportamientos basicos de una TDA y ademas resuelvo los metodos declarados en la propia interfaz de la clase

public class Pila_Nodos<T> extends Tda_Nodos<T>  implements Pila<T>{

	public Pila_Nodos() {
		super();
		
	}

	public Pila_Nodos(int limite) throws IllegalAccessException {
		super(limite);
		
	}

	@Override
	public void push(T element) {

		// Controlamos que la lista tenga lugar para agregar
		checkFullness();
		// Creamos un Nodo pasando por parametro el tipo de dato a guardar
		Nodo<T> NuevoNodo = new Nodo<>(element);
		
		//al nuevo nodo le asignamos como siguiente al primero que teniamos
		// y a la posicion de primero ponemos el nuevo nodo
		NuevoNodo.setNext(first);
		first = NuevoNodo;
		// Cada vez que agregamos un elemento aumentamos el size
		incrementSize();

	}

	@Override
	public T pop() {

		
		checkEmptiness();
		// Guardamos en una variable aux el ultimo elemento que tengo para devovler
		// El primero seria el ultimo de la pila para retornar
		// nosotros ponemos como el ultimo en first para reutilizar la variable
		Nodo<T> auxiliar = first;
		
		
		first = first.getNext();

		// controlamos el size 
		decrementSize();
		
		// La variable auxiliar de tipo nodo tiene un atributo del tipo de elemento
		// que va a almacenar un valor por eso podemos acceder al getElemento que lo almacena
		return auxiliar.getElemento();
	}

	@Override
	public T peek() {

		checkEmptiness();

		return first.getElemento();
	}
	

}
