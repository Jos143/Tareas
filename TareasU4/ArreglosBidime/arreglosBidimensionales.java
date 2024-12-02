package Unidad;

import java.util.Scanner;

public class arreglosBidimensionales {
	
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 //Ejercicios arreglos bidimensionales
	 
	 //1- suma de filas y columnas
	 System.out.println("1.Suma de filas y columnas");
	
	   int matriz1 [][]= {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        for (int i = 0; i < matriz1.length; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < matriz1[i].length; j++) {
	                sumaFila += matriz1[i][j];
	            }
	            System.out.println("La suma de la fila :  "+ i + " es " + sumaFila);
	        }
	        System.out.println("");
	        
	        for (int j = 0; j < matriz1[0].length; j++) {
	            int sumaColumna = 0;
	            for (int i = 0; i < matriz1.length; i++) {
	                sumaColumna += matriz1[i][j];
	            }
	            System.out.println("La suma de la columna :  "+ j + " es " + sumaColumna);
	        }
	 
	 
	 System.out.println("");
	 
	 
	 
	 
	 
	 
	 
	 
	//2- Busca el elemento mayor
		 System.out.println("2-Busca el elemento mayor");
		 
		 System.out.println("Ingresa las filas del arreglo");
		 int filas = input.nextInt();
		 
		 System.out.println("Ingresa las columas del arreglo");
		 int columnas = input.nextInt();
		 
		 
		
		 
		 int arregMayorElemento [] [] = new int [filas] [columnas];
	 
	     int mayorelemento = 0;
	     int posX = 0, posY = 0;
		 for (int i = 0; i< arregMayorElemento.length; i++) {
			 for (int j = 0; j<arregMayorElemento[i].length; j++ ) {
				 System.out.println("ingresa el valor del arreglo en la fila " + i + " columna " + j);
				 arregMayorElemento [i][j] = input.nextInt();
				 if(mayorelemento<arregMayorElemento[i][j]) {
					 mayorelemento =arregMayorElemento[i][j];
					 posX = i +1 ;
					 posY = j +1 ;
				 }
			 }
		 }
		 System.out.println("El elemento mayor es "  + mayorelemento + " en la posición fila " + posX + " , columna " + posY + "\n" );
		 
		 System.out.println("El arreglo original es:");
		 
		 
		 for (int p = 0; p<arregMayorElemento.length; p++ ) {
			 for(int i=0; i<arregMayorElemento[p].length; i++) {
				 System.out.print(arregMayorElemento[p][i] + " ");
			 }
			 System.out.println(" ");
		 }
		 
		 System.out.println("");
		 
		//3-Intercambiar filas
		 System.out.println("3-Intercambiar filas");
		 
		  int matriz3 [][]= {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        System.out.println("Ingrese la primera fila para intercambiar: ");
		        int fila1 = input.nextInt();
		        System.out.println("Ingrese la segunda fila para intercambiar: ");
		        int fila2 = input.nextInt();

		        int temp []= matriz3[fila1];
		        matriz3[fila1] = matriz3[fila2];
		        matriz3[fila2] = temp;

		        System.out.println("Matriz con filas Tibtercambiadas");
		        for (int[] fila : matriz3) {
		            for (int ele: fila) {
		                System.out.print(ele + " ");
		            }
		            System.out.println();
		        }
		        System.out.println("");
		        
		 //4-Diagonal principal y secundaria
		        
		        System.out.println("4-Diagonal principal y secundaria ");
		        
		        int matriz4 [][]= {
		                {1, 2, 3},
		                {4, 5, 6},
		                {7, 8, 9}
		            };

		            int sumaPrincipal = 0;
		            int sumaSecundaria = 0;

		            for (int i = 0; i < matriz4.length; i++) {
		                sumaPrincipal += matriz4[i][i];
		                sumaSecundaria += matriz4[i][matriz4.length - 1 - i];
		            }

		            System.out.println("Suma diagonal principal: " + sumaPrincipal);
		            System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
		 
		            System.out.println("");
		 //5 Transpuesta de una matriz
		            System.out.println("5- Transpuesta de una matriz");
		 int matriz [][] = {
				 {1,2,3},
				 {4,5,7}
		 };
			 	 int filTranp = matriz.length;
			        int columTranp = matriz[0].length;
			        int transpuesta [][]= new int[columTranp][filTranp];

			        for (int i = 0; i < filTranp; i++) {
			            for (int j = 0; j < columTranp; j++) {
			                transpuesta[j][i] = matriz[i][j];
			            }
			        }

			        System.out.println("Matriz ranspuesta:");
			       for (int  k = 0; k<transpuesta.length; k++) {
			    	   for( int i = 0; i<transpuesta[k].length; i++) {
			    		   System.out.print(transpuesta[k][i]);
			    	   }
			    	   	System.out.println("");
			       }
	 }
		
	}

