package DeClase;

import java.util.Scanner;

public class Tarea2U5 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		
		//EJERCICIO 2
		
		System.out.println("Ingrese el tamaño del arreglo");
		int tamaArreglo = input.nextInt();
		
		int arreglo [] = new int [tamaArreglo];
		
		for(int i = 0; i<arreglo.length; i++) {
		System.out.println("Ingresa el valor " + i +" del arreglo");
		arreglo [i] = input.nextInt();
		}
		
		float media = calcularMedia(arreglo);
		System.out.println("La media del los valores del arreglo es " + media);
	
	}
	
	public static float calcularMedia(int arreglo []) {
		
		int suma = 0;
		int a = arreglo.length;
		
		for (int i = 0; i<a; i++) {
			suma += arreglo[i]; 
			
		}
		
		float media = suma/a;
		
	return media; }
}
