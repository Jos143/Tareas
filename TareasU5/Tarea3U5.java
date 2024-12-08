package DeClase;

import java.util.Scanner;

public class Tarea3U5 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		//EJERCICIO 3
		
		int arreglo [] = {-3,-2,-1,0,1,2,3};
		imprimirPositivos(arreglo);
	
	}
	
	public static void imprimirPositivos(int arreglo []) {
		
		for (int i = 0; i<arreglo.length; i++) {
			if (arreglo[i]>0) {
				System.out.println("números mayores de 0 en el arreglo " + arreglo[i]);
			}
			
			
		}
		
	}
	
	
}
