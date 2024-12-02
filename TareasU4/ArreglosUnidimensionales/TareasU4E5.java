package Unidad;

import java.util.Scanner;

public class TareasU4E5 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		//5- Arreglo Palindromo
		
				System.out.println("5-Arreglo palindromo");
		        System.out.println("Introduce una palabra:");
		        String palabra = input.nextLine().toLowerCase();

		        char caracter [] = palabra.toCharArray(); // Metodo de internet separa los caracteres de una palabra
		        boolean esPalindromo = true;

		        for (int i = 0; i < caracter.length / 2; i++) {
		            if (caracter[i] != caracter[caracter.length - 1 - i]) {
		                esPalindromo = false;
		            }
		        }

		        System.out.println(" la palabra es palindroma es true caso contario false:   " + esPalindromo);
				
				
		
	}

}
