package implementacion_Herencia_Tda;

import Interfaces_Auxiliares.Tda;

public class Tda_Nodos<T> implements Tda {

	private int limite;
	private int currentSize;
	protected Nodo<T> first;
	
	protected Tda_Nodos() 
	{
		this.limite = SIN_LIMITE;
	}

	// Constructor con limite 
	protected Tda_Nodos(int limite) throws IllegalAccessException {

		if (limite != SIN_LIMITE && limite < LIMITE_MINIMO_POSIBLE) {
			throw new IllegalAccessException(ERR_TAM_ILEGAL);
		}

		this.limite = limite;
		this.currentSize = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return this.currentSize==0;
	}

	@Override
	public boolean isFull() {
	
		return currentSize == limite;
	}

	@Override
	public void checkEmptiness() throws RuntimeException {

		if (isEmpty()) 
		{
		throw new RuntimeException(String.format(ERR_ESTRUCTURA_VACIA, this.getClass().getInterfaces()[0].getSimpleName()));
		}

	}

	@Override
	public void checkFullness() throws RuntimeException {
		 if (isFull()) 
		 {
	     throw new RuntimeException(String.format(ERR_ESTRUCTURA_LLENA, this.getClass().getInterfaces()[0].getSimpleName()));
		 }
	}

	 protected void incrementSize() {
	        currentSize++;
	    }

	    protected void decrementSize() {
	        currentSize--;
	    }
	
	
	
	
	
	
	
	
}
