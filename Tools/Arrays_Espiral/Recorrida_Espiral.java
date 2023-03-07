package Arrays_Espiral;

public class Recorrida_Espiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("😊");
		int n = 5;
		int a = 0;
		int b = n - 1;
		int valor = 1;
		String[][] matriz = new String[n][n];

		for (int j = 0; j < matriz.length; j++) {
			// llenamos fila superior
			for (int i = a; i <= b; i++) {
				matriz[a][i] = valor++ + "→ \t";
			}

			// llenamos la columna del extremo derecho
			for (int i = a + 1; i <= b; i++) {
				matriz[i][b] = valor++ + "\u2193 \t";
			}

			// llenamos la fila inferior de derecha a izquierda
			for (int i = b - 1; i >= a; i--) {
				matriz[b][i] = valor++ + "\u2190 \t";
			}

			// llenamos la columna del extremo izquierdo de abajo hacia arriba
			for (int i = b - 1; i >= a + 1; i--) {
				matriz[i][a] = valor++ + "\u2191 \t";

			}

			a++;
			b--;

		}

		for (int f = 0; f < matriz.length; f++) {
			for (int i = 0; i < matriz[f].length; i++) {
				System.out.print(matriz[f][i]);
			}
			System.out.println();
			// cambiamos de fila, salto de linea
		}
	}

}
