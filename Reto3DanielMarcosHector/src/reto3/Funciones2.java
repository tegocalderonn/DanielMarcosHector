package reto3;

public class Funciones2 {
	public static int contarPalabras(String frase) {
		int contador = 0; // Inicializacion del contador.
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (Character.isWhitespace(c)) { // Cuando detecta un espacio en blanco
				contador++; // Suma los espacios en blanco (si hay dos palabras habria un espacio en blanco*.
			}
		}
		return contador + 1; // *entonces si dos palabras=espacio en blanco, sumo uno, habria 2 palabras
	}

	public static String invertirFrase(String frase) {
		String palabra = ""; // reseteamos la palabra para que no de error lenght
		String inversa = ""; // reseteamos la palabra para que no de error lenght

		for (int i = 0; i < frase.length(); i++) { // for que recorre toda la palabra
			char c = frase.charAt(i);
			if (Character.isWhitespace(c)) { // Si hay espacio en blanco
				inversa = palabra + " " + inversa; // la inversa sera la palabra con inversa
				palabra = ""; // reseteo palabra para que se ponga la siguiente despues del espacio
			} else {
				palabra += c; // las palabras de la palabrase suman
			}
		}
		inversa = palabra + " " + inversa; 

		return inversa; // fin
	}

}
