package Declaracion_;

import java.util.LinkedList;
import java.util.Queue;


// QUEUE / COLAS / FIFO (first in , first out)

//-se recorren completas para dejarlas ordenadas
//-no conviene hacer cola con tope ya que si esta llena no podremos insertar el centinela
//-no tienen funcion de corte
//-en caso de querer extraer el elemento encontrado usamos un if


public class Operaciones_Colas {

	public static void main(String[] args) {

		
		System.out.println("Apilamos elementos a la Cola");
		System.out.println("");
		Queue<String> cola = new LinkedList<>();
		
		// metodo agregar / add - offer
		cola.add("Vertappen");
		cola.add("Hamilton");
		cola.add("Perez");
		cola.offer("Leclerc");
		
		// Devuelve el primer elemento pero no lo retira
		System.out.println("Elemento primero en la cola : " + cola.element());
		// Devuelve el primer elemento pero si algo falla retorna un null en vez de una excepcion
		System.out.println("Elemento primero en la cola : " + cola.peek());
		System.out.println("\n____________________");
		// Devuelve la cantidad de elementos cargados en la cola
		System.out.println("Tamaño de la cola : " + cola.size());
		// Metodo remover y mostrar - remove / poll hace lo mismo pero si no quedan elementos devuelve un null
		System.out.println("Desencolamos elementos");
		System.out.println(cola.remove());
		System.out.println(cola.remove());
		System.out.println(cola.remove());
		System.out.println(cola.poll());
		System.out.println("\n____________________");
		
		System.out.println("Tamaño de la cola : " + cola.size());
		if (cola.isEmpty())
		{
			System.out.println("La cola esta vacia");
			System.out.println("Elemento primero en la cola : " + cola.peek());
		}
		System.out.println("\n____________________");

		System.out.println("COLAS");
		System.out.println("Vertappen");
		System.out.println("Hamilton");
		System.out.println("Perez");
		System.out.println("\n____________________");

		cola.add("Vertappen");
		cola.add("Hamilton");
		cola.add("Perez");
		System.out.println("Primero : " + cola.element());
		System.out.println("Tamaño : " + cola.size());
		System.out.println("Retiro : " + cola.poll());
		System.out.println("Tamaño : " + cola.size());
		System.out.println("Primero : " + cola.peek());
		
		System.out.println("\nContamos los elementos de la cola con centinela");
		System.out.println(contarElementos(cola));
		
	}

	// Recorrer colas con centinela
	// Las colas son estructuras que tenemos que recorrerlas completas ya que cortarlas en medio de un ciclo generaria
	// dejar la cola desordenada 
	// no conviene usar una cola con tope ya que si estuviese completa no podriamos agregar un centinela de control
	
	
	private static int contarElementos(Queue<String> cola) {
		int contador = 0;
		String centinela = null;
		cola.add(centinela);
		String auxiliar = cola.remove();
		while (auxiliar != centinela) {
			contador++;
			cola.add(auxiliar);
			auxiliar = cola.remove();
		}

		return contador;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
