package Declaracion;

import java.util.Stack;

import interfaces.nodos.Pila;
import interfaces.nodos.PilaNodos;



// PILAS / LIFO (last in , first out)

//-se puede hacer pila con tope
//-usamos pila auxiliar
//-tienen funcion de corte


public class Operaciones_Pilas {

	private Pila<Auto> autos;
	
	
	public static void main(String[] args) {

		Stack<String> pila = new Stack<String>();
		//Stack<Auto> auto = new Stack<Auto>();

		System.out.println("Apilamos elementos a la pila");
		System.out.println("");
		
		// metodo push / agregar
		// primero chequea que la lista no este llena checkFullness(); y en caso de ser false agrega
		pila.push("Vertappen 1°"); // 1
		pila.push("Hamilton 2°"); // 2
		pila.push("Perez 3°"); // 3

		// metodo peek / Devuelve el ultimo elemento de la pila pero no lo retira
		// primero chequea que tenga elementos checkEmptiness(); y retorna una excepcion en caso de ser true
		System.out.println("Elemento de la cima : " + pila.peek());
		System.out.println("\n____________________");
		// metodo size / Devuelve la cantidad de elementos
		System.out.println("Tamaño de la pila : " + pila.size());
		System.out.println("\n____________________");
		System.out.println("Desapilando Pila...");
		System.out.println("\n____________________");

		// metodo pop / Remueve y Muestra el ultimo elemento del ultimo al primero
		// primero chequea que tenga elementos checkEmptiness(); y retorna una excepcion en caso de ser true

		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println("\n____________________");
		// System.out.println(pila.pop());
		// si lo hacemos mas veces de las que elementos hay dispara una excepcion
		System.out.println("Tamaño de la pila : " + pila.size());
		System.out.println("\n____________________");
		
		if(pila.isEmpty())
		{
			System.out.println("La Pila esta vacia");
		}
		System.out.println("\n____________________");
		
        System.out.println("PILAS");
        Stack<String> nombres = new Stack<>();
        
        System.out.println("Sergio");
        System.out.println("Daniel");
        System.out.println("Candela");
        System.out.println("\n____________________");
        nombres.push("Sergio");
        nombres.push("Daniel");
        nombres.push("Candela");
     

        System.out.println("Ultimo : " +nombres.peek());
        System.out.println("Tamaño : " +nombres.size());
        System.out.println("Retiro : " +nombres.pop());
        System.out.println("Tamaño : " +nombres.size());
        System.out.println("Ultimo : " +nombres.peek());
		  
        
	}

	 // METODO RETIRAR EN PILAS 
	// para retirar elementos de una pila tenemos que vaciar la pila, en caso de encontrarlo lo guardamos y todo elemento que no sea 
	// del mismo tipo lo vamos guardando en una pila auxiliar 
	// luego en otro while pasamos los elementos que fueron quitados de la pila auxiliar a la pila original
	
    
		public Auto retirarAuto(String patente) {
			
			Auto autoEncontrado = null;
			Auto autoConsultado = null;
			// declaro mi lista auxiliar

			Pila<Auto> pilaAuxiliar = new PilaNodos<>();

			// mientras que tenga elementos en la pila original y el encontrado sea nulo
			while (!this.autos.isEmpty() && autoEncontrado == null) {
				// metodo pop para remover el ultimo
				autoConsultado = this.autos.pop();
	
				if (autoConsultado.getPatente().equals(patente)) {
					autoEncontrado = autoConsultado;
	
				} else {
					// si no son iguales agrego el elemento quitado a una auxiliar para no perderlo
					pilaAuxiliar.push(autoConsultado);
				}
			}
			
			// finalizada toda la busqueda debemos de agregar nuevamente los elementos que almacenamos temporalmente en la pila auxiliar
			// en la pila original con la condicion de que mientras que la pila no este vacia
		
			while (!pilaAuxiliar.isEmpty()) {
				this.autos.push(pilaAuxiliar.pop());
			}

			return autoEncontrado;

		}
		
		

	
				
	
}



