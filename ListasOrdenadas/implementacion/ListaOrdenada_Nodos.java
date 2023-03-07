package implementacion;

import java.util.Iterator;

import Interfaces_Auxiliares.ListaOrdenada;
import implementacion_Herencia_Tda.Tda_Nodos;


// Similar a LinkedList
//
//-se extienden, No implementa
//-no recorremos usamos metodo search(K)
//-la unica excepcion es que la lista este ordenada por un tipo diferente al cual necesitamos averiguar
//(por ejemplo alumno ordenada por dni y necesitemos buscar al alumno de nombre "juan")




public abstract class ListaOrdenada_Nodos<K, T> extends Tda_Nodos<T> implements ListaOrdenada<K, T>  {

	private Nodo_Lista<T> ultimo;
	
	
	public ListaOrdenada_Nodos() {
		super();
	}

	public ListaOrdenada_Nodos(int limite) throws IllegalAccessException {
		super(limite);
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T elemento) {
	
		checkFullness();
		
		Nodo_Lista<T> nuevoNodo = new Nodo_Lista<>(elemento);
		
		if (isEmpty())
		{
			// Si no hay elementos en la lista agrego el nuevo como primero y ultimo
			first = nuevoNodo;
			ultimo = nuevoNodo;	
		} 
		// En este ejemplo agregamos el elemento en la primera posicion
		else if (compare(elemento, first.getElemento())<=0) 
		{
			// Al nuevo nodo le asignamos como siguiente a el, al elemento almacenado en primera pos
			// de esta forma el nuevo nodo pasaria a ser el first
			nuevoNodo.setNext(first);

			// en este caso el elemento que estaba primero le asignamos como previo el nuevo elemento,
			// es decir el primero deja su lugar al nuevo
			// pasamos el nuevo elemento a la posicion de first
			((Nodo_Lista<T>)first).setPrevio(nuevoNodo);
			// Y finalmente asignamos en el atributo primero al nuevo elemento
			first = nuevoNodo;
		}
		// En este caso ponemos al elemento en la ultima posicion
		else if (compare(elemento, ultimo.getElemento())> 0)
		{
			// al nuevo elemento le asignamos como anterior de el mismo el ultimo
			// de esta forma el nuevo se autoasignara como ultimo
			nuevoNodo.setPrevio(ultimo);
			// en este caso el elemento que estaba como ultimo asigna al nuevo como el siguiente a el 
			// es decir el que estaba ultimo le deja la posicion de ultimo al nuevo nodo
			ultimo.setNext(nuevoNodo);
			// y ubicamos como ultimo al nuevo elemento
			ultimo = nuevoNodo;
		}
		else {
			// Guardo el primer elemento de la lista en auxiliar
			Nodo_Lista<T> auxiliar = (Nodo_Lista<T>)first;
			
			// Comparo el nuevo elemento con el siguiente al primer elemento de la lista , es decir el de atras del first
			while (compare(elemento, auxiliar.getNext().getElemento()) >0) 
			{
				// en auxiliar guardo el elemento que va despues del nuevo
				// es decir la posicion entre el primero y el segundo 
			    auxiliar = (Nodo_Lista<T>) auxiliar.getNext();	
			}
			
			// le guardo la posicion 2 al next de nuevo nodo
			// Al nuevo nodo le asigno como siguiente de el la posicion 2 , ya que el next de auxiliar es el siguiente al first
			nuevoNodo.setNext(auxiliar.getNext());
			
			// A la variable auxiliar que tiene al first le asigno como siguiente al nuevo nodo
			auxiliar.setNext(nuevoNodo);
			// Y al nuevo nodo le asigno como posterior a este , al auxiliar que contiene al first
			nuevoNodo.setPrevio(auxiliar);
			
			if (nuevoNodo.hasNext()) {
				((Nodo_Lista<T>) nuevoNodo.getNext()).setPrevio(nuevoNodo);
			}
		}
		incrementSize();
	}

	@Override
	public boolean exists(K key) 
	{
		Nodo_Lista<T> nodo = buscarK(key);
		return nodo != null && compareByKey(key, nodo.getElemento())==0;
	}
	
	private Nodo_Lista<T> buscarK(K key) {
		if (key == null) {
			throw new IllegalArgumentException(MSG_INVALID_KEY);
		}

		Nodo_Lista<T> aux = (Nodo_Lista<T>) first;
		while (aux != null && compareByKey(key, aux.getElemento()) > 0) {
			aux = (Nodo_Lista<T>) aux.getNext();
		}

		return aux;
	}
	

	@Override
	public T get(int pos) {
		
		checkEmptiness();
		if(pos < 0 || pos >= size())
		{
			throw new IndexOutOfBoundsException(String.format(MSG_INDEX_OUT_OF_RANGE, size()));
		}
		
		Nodo_Lista<T> aux = (Nodo_Lista<T>)first;
		for (int i = 0; i < pos; i++) {
			aux = (Nodo_Lista<T>) aux.getNext();
		}
		return aux.getElemento();
	}

	@Override
	public boolean remove(T elem) {
		
		checkEmptiness();
		if(elem==null)
		{
			throw new IllegalArgumentException(MSG_ELEM_IS_NULL);
		}
		
		
		return false;
	}

	@Override
	public T removeAt(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeByKey(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T search(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
