package Busquedas;

import java.util.ArrayList;

public class BusquedaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cada vez que partimos el array solo 1 limite se mueve 
		
		int [] numeros = {1,4,12,33,38,45,66,73,84,99};
		
		ArrayList<Integer> masnumeros = new ArrayList<>();
		
		masnumeros.add(1);
		masnumeros.add(4);
		masnumeros.add(12);
		masnumeros.add(33);

		int numero_buscado = 12;
		int base = 0;
		int centro = 0;
		int tope = masnumeros.size()-1;
		boolean fin = false;

		

		while (base <= tope && !fin) {
			centro = (tope + base) / 2; // toma la parte entera
			if (masnumeros.get(centro) == numero_buscado) {
				System.out.println("El numero buscado esta en la pos " + centro);
				fin = true;
			} else if (numero_buscado < masnumeros.get(centro)) {
				// hacia la izquierda
				tope = centro - 1;
			} else {
				// hacia la derecha
				base = centro + 1;
			}

		}
		
		// importante definir inicio centro y fin
		int numero_buscado2 = 73;
		int base2 = 0;
		int centro2 = 0;
		int tope2 = numeros.length - 1;
		boolean fin2 = false;
	


		while (base2 <= tope2 && !fin2) {
			centro2 = (tope2 + base2) / 2; // toma la parte entera
			if (numeros[centro] == numero_buscado2) {
				System.out.println("El numero buscado esta en la pos " + centro);
				fin = true;
			} else if (numero_buscado2 < numeros[centro2]) {
				// hacia la izquierda
				tope2 = centro2 - 1;
			} else {
				// hacia la derecha
				base2 = centro2 + 1;
			}

		}

		
	}

}
