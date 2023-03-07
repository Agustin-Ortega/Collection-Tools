package implementacion;

import implementacion_Herencia_Tda.Nodo;

public class Nodo_Lista<T> extends Nodo<T> {

	private Nodo_Lista<T> previo;
	
	public Nodo_Lista(T elemento) {
		super(elemento);
		this.previo = null;
		
		
	}

	public Nodo_Lista<T> getPrevio() {
		return previo;
	}

	public void setPrevio(Nodo_Lista<T> previo) {
		this.previo = previo;
	}

	public boolean HayPrevio () {
		return this.previo != null;
	}
	
	
	
	
	
	
}
