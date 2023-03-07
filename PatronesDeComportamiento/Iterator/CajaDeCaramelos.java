package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CajaDeCaramelos implements Iterable<Caramelo>{

	
	private static final int MIN = 1;
	private static final String MSG_ERROR = "Error, caja vacia";
	private List<Caramelo> caramelos;
	private int mm;
	private Random random;
	
	public CajaDeCaramelos()
	{
		this.caramelos = new ArrayList<Caramelo>();
		this.mm = this.caramelos.size();
		this.random = new Random();
	}
	
	public void add(Caramelo caramelo)
	{
		caramelos.add(caramelo);
	}
	
	
	public Caramelo remove() 
	{
		
		checkEmptyness();
		Caramelo c = this.caramelos.remove(this.randomBetween(0, this.caramelos.size()-1));
		return c;
	}
	
	public Caramelo getCaramelo()
	{
		checkEmptyness();
		Caramelo c = this.caramelos.remove(this.randomBetween(0, this.caramelos.size()-1));
		return c;
	}

	private int numeroRandom() {

		return (int)(Math.random()* mm +1);
	
	}
	
	
	  private int randomBetween(int min, int max) {
	        if (min > max) {
	            throw new IllegalArgumentException("El parametro 'min' (" + min + ") supera al parametro 'max' (" + max + ")");
	        }
	        return random.nextInt((max - min + 1)) + min;
	    }


	private void checkEmptyness() {
		if (caramelos.isEmpty()) {
			throw new IndexOutOfBoundsException(MSG_ERROR);
		}
		
	}

	 public boolean isEmpty() {
	        return this.caramelos.isEmpty();
	    }

	@Override
	public Iterator<Caramelo> iterator()
	{
		return new IteratorCaramelos();

	}
	
	public class IteratorCaramelos implements Iterator<Caramelo>
	{
		
		private int ultimo;
		private int cantTotal;
		
		private IteratorCaramelos()
		{
			this.ultimo = caramelos.size()-1;
			this.cantTotal = ultimo;
		}
		
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cantTotal >= MIN;
			}

			@Override
			public Caramelo next() {
				// TODO Auto-generated method stub
				
				if (cantTotal<MIN ) {
				throw new IndexOutOfBoundsException(MSG_ERROR);
					
				}
				Caramelo c = caramelos.remove(randomBetween(0, cantTotal));
				caramelos.add(c);
				this.cantTotal--;
				mm--;
				return c;
			}

	}
			
			
			
			
			
			
		


}
