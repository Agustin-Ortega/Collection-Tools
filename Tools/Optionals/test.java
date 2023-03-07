package Optionals;

import java.util.Optional;

public class test {

	public static void main(String[] args) {
		// En caso de recibir un dato null nos arrojaria un null pointer exception
		Perro miPerro = buscarPerro("La negra");
		try {
			miPerro.mostrarNombre();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// si es null devuevle null pointer
		Optional<Perro> optionalPerro = buscar("La Negra");
		// optionalPerro.get().mostrarNombre();

		// or else crea un objeto en caso de no existir
		Perro perro = optionalPerro.orElse(new Perro("vacio", 0));
		perro.mostrarNombre();

	}

	private static Perro buscarPerro(String nombre) {
		// Perro perro = new Perro(nombre, 12);
		Perro perro = null;
		return perro;
	}

	private static Optional<Perro> buscar(String nombre) {
		Perro perro = new Perro(nombre, 12);
		return Optional.ofNullable(null); // puede ser o no null
	}
}
