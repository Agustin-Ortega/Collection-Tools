package Optionals;

public class Perro {
	
	private String nombre;
	private int edad;

	public Perro(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public void mostrarNombre() {
		System.out.println(this.nombre);
	}
}
