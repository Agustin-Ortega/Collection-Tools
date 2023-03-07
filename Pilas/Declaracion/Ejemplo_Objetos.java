package Declaracion;

import java.util.Stack;

public class Ejemplo_Objetos {

	public static void main(String[] args) {
		
		Stack<Auto> Consecionaria = new Stack<Auto>();
		System.out.println("Apilamos elementos de tipo Auto");
		
		
		Auto auto1 = new Auto("ABC122", "Spider", "Ferrari"); // 1

		Auto auto2 = new Auto("HST", "918", "Porsche"); // 2

		Auto auto3 = new Auto("KYP", "Aventador", "Lamborghini"); // 3
		
		
		System.out.println("\nIngresa 1° " + auto1.getMarca());
		System.out.println("Ingresa 2° " + auto2.getMarca());
		System.out.println("Ingresa 3° " + auto3.getMarca());
		
		
		Consecionaria.push(auto1);
		Consecionaria.push(auto2);
		Consecionaria.push(auto3);
		
		// metodo peek / Devuelve el ultimo elemento de la pila pero no lo retira
		System.out.println("\nElemento de la cima : " + Consecionaria.peek());
		System.out.println("\n____________________");
		// metodo size / Devuelve la cantidad de elementos
		System.out.println("Tamaño de la pila : " + Consecionaria.size());
		System.out.println("\n____________________");
		System.out.println("Desapilando Pila ...");
		System.out.println("\n____________________");
		System.out.println(Consecionaria.pop());
		System.out.println(Consecionaria.pop());
		System.out.println(Consecionaria.pop());
		System.out.println("\n____________________");
		System.out.println("Tamaño de la pila : " + Consecionaria.size());
		System.out.println("\n____________________");
		
		if(Consecionaria.isEmpty())
		{
			System.out.println("La Pila esta vacia");
		}
	}

}
