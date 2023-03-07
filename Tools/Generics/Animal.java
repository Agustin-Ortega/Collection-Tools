package Generics;


public abstract class Animal implements Cloneable{

	private String nombre;
	
	public Animal(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void comer() {
		
	}

	@Override
	public String toString() {
		return "Animal [" + (nombre != null ? "nombre=" + nombre : "") + "]";
	}
	
	
}
