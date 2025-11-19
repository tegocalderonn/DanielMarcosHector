package reto3;

import java.util.Scanner;

public class Funciones1 {
	
	public static String capitalizar(String s) {
	String minusculas=s.toLowerCase();
	String mayusculas=s.substring(0,1).toUpperCase();
	String restominusculas=minusculas.substring(1);
	return mayusculas+restominusculas;
	}
	public static String generarApodo(String palabra) {
		String primerastres=palabra.substring(0,3);
		String ultimaletra=palabra.substring(palabra.length()-1);
		return primerastres+ultimaletra+palabra.length();
	}
	public static void cadenaVacia(Scanner sc) {
		String palabra = "";
		do {
			System.out.println("Dime un nombre");
			palabra = sc.nextLine();
			
		} while (palabra.length() != 0);

	}
}
