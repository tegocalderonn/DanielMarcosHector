package reto3;




public class Funciones3 {

	public static String numerosEnFase(String frase) {
		int longitud = frase.length();
		String nueva = "";
		boolean primera = true;
		for (int i = 1; i < longitud; i++) {
			char c = frase.charAt(i);
			if (Character.isDigit(c)) {
				if (primera) {
					nueva = nueva + c;
					primera = false;
				} else {
					nueva = nueva + "," + c;

				}

			}

		}
		return nueva;
	}
	
	public static String cifradoSimple(String frase) {
	    String resultado = "";
	    for (int i = 0; i < frase.length(); i++) {
	        char caracterOriginal = frase.charAt(i);
	        char caracterReemplazo = caracterOriginal;

	        char minuscula = Character.toLowerCase(caracterOriginal);

	        switch (minuscula) {
	            case 'a':
	                caracterReemplazo = '4';
	                break;
	            case 'e':
	                caracterReemplazo = '3';
	                break;
	            case 'i':
	                caracterReemplazo = '1';
	                break;
	            case 'o':
	                caracterReemplazo = '0';
	                break;
	            case 'u':
	                caracterReemplazo = '_';
	                break;
	        }

	        resultado = resultado + caracterReemplazo;
	    }

	    return resultado;
	}
	public static String contarVocales(String texto) {
		    String mejorPalabra = "";
		    int maxVocales = -1;
		    String palabraActual = "";
		    int vocalesActuales = 0;
		    String t = texto + " "; 
		    for (int i = 0; i < t.length(); i++) {
		        char c = t.charAt(i);

		        if (Character.isWhitespace(c)) {
		            if (vocalesActuales > maxVocales) {
		                maxVocales = vocalesActuales;
		                mejorPalabra = palabraActual;
		            }
		            palabraActual = "";
		            vocalesActuales = 0;
		        } else {
		            palabraActual = palabraActual + c;
		            char l = Character.toLowerCase(c);
		            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') vocalesActuales++;
		        }
		    }
		    return mejorPalabra;
		}
	}
