package Unidad;

import java.util.Scanner;
public class TaraesU4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("EJERCICIOS DE ARREGLOS UNIDIMENSIONALES 1 al 4\n");
		
		
		//e
	//1-Promedio y Calificaciones
 
	 double calificaciones [] = new double [10];
	 double sumaPromedio =0;
	 double promedio = 0;
	 int mayorAlPromedio = 0;
	 int menorAlPromedio = 0;
	 
	 System.out.println("1- Promedio y Calificaciones");
	 for(int i = 0; i <calificaciones.length; i ++) {
		 System.out.println("Ingresa la calificación del alumno, en la pocisión " + i + " del arreglo");
		 calificaciones[i] = input.nextInt();
		 sumaPromedio += calificaciones[i];		 
		 
	 }
	promedio =sumaPromedio/10 ;
	System.out.println("El promedio de las calificaciones es: " + promedio); 
	
	 for(int i = 0; i <calificaciones.length; i ++) {
		// System.out.println(calificaciones[i]);
		 
		 
		 if(calificaciones[i]<promedio) {
			 menorAlPromedio ++;
			 System.out.println("la calificación " + calificaciones[i] + " de la pocisión " + i + " del arreglo, es menor al promedio");
		 }else {
			 mayorAlPromedio ++;
			 System.out.println("la calificación " + calificaciones[i] + " de la pocisión " + i + " del arreglo, es mayor al promedio");
		 }

	 }
	 
	 System.out.println("Cantidad de alumnos menor al promedio son " + menorAlPromedio + "\n" + "Cantidad de alumnos mayor al promedio son "+ mayorAlPromedio + "\n" );
	 
	 
	 
	 //2- Número Mayor y Menor
	 
	 int arreglo2 [] = new int [15];
		
	 System.out.println("2- Número Mayor y Menor");
		for (int i= 0; i<arreglo2.length; i++) {
			arreglo2 [i] =(int) (Math.random()*100)+1;
			System.out.println("Pocisión " + i + " del arreglo = " + arreglo2[i]);
		}
		int mayor = 0, menor = arreglo2 [0];
		
		int posicionMayor = 0, posicionMenor = 0;
		for (int j = 0; j<arreglo2.length; j++) {
			if(mayor<arreglo2[j]) {
				mayor = arreglo2[j];
				posicionMayor =j;
				
				
			
		}}
		
		
		for (int u = 0; u<arreglo2.length; u++) {

			if (arreglo2[u]<menor){
				menor = arreglo2[u];
				posicionMenor = u;
			}
		}
		System.out.println("El número mayor es = " + mayor + " en la posición "  + posicionMayor + " del arreglo");
		System.out.println("El número menor es = " + menor + " en la posición "  + posicionMenor + " del arreglo\n");
		
	//3-Frecuencia de elementos
		
		System.out.println("3- Frecuencia de elementos");
	
		System.out.println("Ingresa el tamaño del arreglo");
		int tamArreglo = input.nextInt();
	
		int arreglo3 [] = new int [tamArreglo];
		boolean contado [] =new boolean  [tamArreglo];
		
		
		for (int p = 0; p < arreglo3.length; p++ ) {
			System.out.println("Ingresa el valor del arreglo en la posición  " + p);
			arreglo3[p] = input.nextInt();
		}
		
	
	    /*for (int i = 0; i < arreglo3.length; i++) {
	    	
	      
	    	//if(arreglo3[i]==arreglo3[i]) {
	    		//frecuencia ++;
	    		
	    	}
		    }*/
		
		for (int y = 0; y<arreglo3.length; y++) {
			if (!contado[y]) {
				int frecuencia = 1;
				for(int i = y+1; i< tamArreglo; i++ ) {
					if(arreglo3[y]==arreglo3[i]) {
						frecuencia++;
						contado[i]= true;
					}}
				System.out.println("Número " + arreglo3[y] + " la frecuencia es " + frecuencia);
			}}
					
	    
	    
	    
	   //4- Reverso de arreglo
		
		System.out.println("4-Reverso de arreglo");
		
		int arregloOriginal [] = new int [10];
		
		
		for (int f = 0; f < arregloOriginal.length; f++) {
		System.out.println("Ingresa el valor en la pocisión  " + f + " del arreglo" );
		arregloOriginal [f] =input.nextInt();
		}
		
		System.out.println("Arreglo inverso");
		
		for (int i = arregloOriginal.length-1; i>=0; i--) {
			System.out.println(arregloOriginal[i]);
			
		
			
		}
		
		System.out.println("Arreglo original");
		for (int c = 0; c < arregloOriginal.length; c++) {
			System.out.println("Posición "+ c + " del arreglo: " + arregloOriginal[c]);
		}
		}
	}
	