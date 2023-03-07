package implementacion_Herencia_Tda;

public class Nodo<T> {

	private T elemento;
	private Nodo<T> next;

	public Nodo(T elemento) {

		setElemento(elemento);
		this.next = null;
	}

	public Nodo<T> getNext() {
		return next;
	}

	public void setNext(Nodo<T> next) {
		this.next = next;
	}

	public T getElemento() {
		return elemento;
	}

	private void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public boolean hasNext() {
		return next != null;
	}

}
