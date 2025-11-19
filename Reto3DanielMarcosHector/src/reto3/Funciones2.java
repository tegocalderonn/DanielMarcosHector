package reto3;

public class Funciones2 {
	public static int contarPalabras(String frase) {
		int contador = 0; // Inicializacion del contador.
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (Character.isWhitespace(c)) { // Cuando detecta un espacio en blanco recorriendo la palabra, suma al
												// contador.
				contador++; // Suma de valores.
			}
		}
		return contador + 1; // Añadimos un numero mas al final para que salga el numero correcto de
								// palabras.
	}

	public static String invertirFrase(String frase) {
		String palabra = "";
		String inversa = "";

		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (Character.isWhitespace(c)) {
				inversa = palabra + " " + inversa;
				palabra = "";
			} else {
				palabra += c;
			}
		}
		inversa = palabra + " " + inversa;

		return inversa;
	}

}
