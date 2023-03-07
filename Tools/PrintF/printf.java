package PrintF;

public class printf {

	public static void main(String[] args) {

		String[][] autos = { { "A1", "A6", "A5" }, { "F40", "F50", "488" }, { "P1", "720s", "Senna" } };

		for (int i = 0; i < autos.length; i++) {
			for (int j = 0; j < autos[0].length; j++) {
				// agrega 10 espacios entre elementos
				System.out.printf("%10s", autos[i][j]);
				// System.out.printf("%10s", autos[i][j]); Pone los espacios a la derecha
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		// SALIDA
//		
//        A1        A6        A5
//       F40       F50       488
//        P1      720s     Senna

		int[][] colores = new int[Colores.values().length][Estacion.values().length];

		// llenamos la matriz
		for (int i = 0; i < colores.length; i++) {
			for (int j = 0; j < colores[i].length; j++) {
				colores[i][j] = (int) (Math.random() * 100);
			}
		}

		// recorremos la matriz
		System.out.printf("%8s", "");
		for (int i = 0; i < Estacion.values().length; i++) {
			System.out.printf("%10s", Estacion.values()[i]);
		}
		System.out.println();

		for (int i = 0; i < colores.length; i++) {
			System.out.printf("%8s", Colores.values()[i]);

			for (int j = 0; j < colores[i].length; j++) {

				System.out.printf("%10d", colores[i][j]);
			}

			System.out.println("");
		}

		// SALIDA

//        VERANO  INVIERNO     OTOÑO PRIMAVERA
//BLANCO        7        79        36        3
//ROJO         10        82        56        28S
//VIOLETA      68        34        76        82
//NEGRO        64        34        87        17
//VERDE        17        15        30        87
//
//		
//		

		// recorremos transpuesta, columnas en vez de filas

		System.out.println();
		System.out.println();
		System.out.println("Invertida");
		for (int j = 0; j < colores[0].length; j++) {
			System.out.printf("%8s", Colores.values()[j]);

			for (int i = 0; i < colores.length; i++) {

				System.out.printf("%10d", colores[i][j]);
			}

			System.out.println("");
		}

		int[][] valores = new int[2][4];

		for (int i = 0; i < valores.length; i++) {

			int n = valores[i][0];
			int n2 = valores[i][5];
		}

	}
}

enum Colores {
	BLANCO, ROJO, VIOLETA, NEGRO, VERDE;
}

enum Estacion {
	VERANO, INVIERNO, OTOÑO, PRIMAVERA;

}
