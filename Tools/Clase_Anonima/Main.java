package Clase_Anonima;

public class Main {

	public static void main(String[] args) {

		// CLASE ANONIMA
		// Como no podemos instanciar una interfaz necesitamos instanciar una clase que
		// implemente esa interfaz
		// por ende generamos una clase anonima que no esta definida en ningun otra
		// clase si no en la misma declaracion
		// No estariamos instanciando una interfaz si no una clase ANONIMA que
		// implemente esa interfaz
		Auditable auditable = new Auditable() {

			@Override
			public int getNivel() {
				return 4;
			}
		};

		System.out.println(auditable.getNivel());

	}

}
