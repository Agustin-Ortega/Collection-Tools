package Generics;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		// definimos aca el tipo de dato como integer aunque si no lo ponemos funciona igual
		Printer<Integer> printer = new Printer<>(22);
		printer.print();
		
		Printer<Double> doublePrinter = new Printer<>(14.8);
		doublePrinter.print();
		
		
		PrinterAnimal<Gato> printerGato = new PrinterAnimal<>(new Gato("gato"));
		printerGato.print();
		
		PrinterAnimal<Perro> printerPerro = new PrinterAnimal<>(new Perro("perro"));
		printerPerro.print();
		
		shout("Agus");
		shout(44);
		shout(new Gato("Melba"));
		System.out.println();
		
		shout2("Hamilton", 44);
		shout2(new Perro("La Negra"), 8.14);
		shout2(true, 56);
		
		System.out.println();
		List<Integer> intLista = new ArrayList<>();
		intLista.add(1);
		intLista.add(2);
		intLista.add(3);
		List<Boolean> booleanLista = new ArrayList<>();
		booleanLista.add(true);
		booleanLista.add(true);
		booleanLista.add(false);
		printList(intLista);
		printList(booleanLista);
		
		List<Gato> listaGato = new ArrayList<>();
		listaGato.add(new Gato("gato3"));
		printListExtends(listaGato);
		
		
		List<Perro> listaPerro = new ArrayList<>();
		listaPerro.add(new Perro("perro3"));
		printListExtends(listaPerro);
		
	}
	
	// Metodo generico 
	private static<T> void shout (T algo) {
		System.out.println(algo);
	}
	
	// Metodo con varios genericos
	private static <T, V> void shout2(T algo, V otro) {
		System.out.println(algo + " " + otro + "!!!");
	}
	
	// Metodo con parametro desconocido del tipo lista
	private static void printList(List<?> lista) {
		System.out.println(lista.get(0));
	}

	// Metodo con parametro desconocido del tipo lista
	private static void printListExtends(List<? extends Animal> lista) {
		System.out.println(lista.get(0));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
