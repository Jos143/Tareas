package t01;

import java.util.Scanner;

public class TareasUnidasd3 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//1.Calcular el promedio de una cantidad de numeros
System.out.println("Calcula el promedio de una serie de números");
System.out.println("Ingresa la cantidad de numeros a ingresar");
int cantidad = input.nextInt();
double sumaCantidad = 0;

for(int i = 1; i <= cantidad; i ++) {
	System.out.println("Ingresa el número " + i);
	double numeros = input.nextDouble();
	sumaCantidad += numeros;
	
}
double promedio = sumaCantidad/cantidad;
System.out.println(promedio);
 if (promedio>7 && promedio <=10 || promedio >70 && promedio<=10) {
	 System.out.println("APROBADO");
 }else {
	 System.out.println("REPROBADO " );
 }

System.out.println(" ");



//2.Contar pares y impares

System.out.println("Ingresa la cantidad de números a ingresa");
int cantidadNuParImpar = input.nextInt();
int par = 0;
int impar = 0;

for(int i = 1; i <= cantidadNuParImpar; i++) {
	System.out.println("Ingresa el número " + i + ":");
	int numeros = input.nextInt();
	
	if(numeros%2==0) {
		par ++ ;
	}else {
		impar ++;
	}
}

System.out.println("Números pares ingresados: " + par + "\n" + "Números impares ingresados: " + impar);

System.out.println(" ");




//3.Serie de Fibonacci
System.out.println("Serie de Fibonacci");
System.out.println("Ingresa un número como limite");
int limite = input.nextInt();
int a = 1;
int b = 1;

for(int i =1; i<=limite; i++) {
	System.out.println(a);
	int suma = a+b;
	a = b;
	b = suma;
}
System.out.println(" ");

//4.Números primos
System.out.println("Identificar si un número es primo");
int noPrimo = input.nextInt();
boolean esPrimo = true;

for(double i = 2 ; i <= Math.sqrt(noPrimo); i++) {
	if(noPrimo%i==0) {
		esPrimo = false;
	}
}
if (esPrimo && noPrimo >1) {
	System.out.println("Es un número primo");
}else {
	System.out.println("No es un número primo");
}


System.out.println(" ");

//5.Divisores de un número
System.out.println("Divisores de un número");
System.out.println("Ingresa un número");
int noDivisibles = input.nextInt();

for(int i = 1; i<= noDivisibles; i++) {
	if(noDivisibles % i == 0) {
		System.out.println(i);
}}




System.out.println(" ");
//6.No existe

//7.Verificar si un número es palindromo
System.out.println("Verificar si un número es palindromo");
System.out.println("Ingresa un número");
int noPalindromo =input.nextInt();

String deIntACadena = Integer.toString(noPalindromo);

int contadorUno =0;
int contadorInverso = deIntACadena.length()-1;
boolean esPalindromo = false;

while(contadorUno<contadorInverso) {
	if(deIntACadena.charAt(contadorUno) != deIntACadena.charAt(contadorInverso) ) {
		esPalindromo = true;
	}
	
	
	contadorUno ++;
	contadorInverso --;
}

if (esPalindromo==false) {
	System.out.println("El número es palindromo");
}else {
	System.out.println("No es palindromo");
}

System.out.println(" ");

//8.Adivina el numero
System.out.println("Adivina el número del 1 al 100");
int noAleatorio = (int)Math.round(Math.random()*100);
int nuAdivinar =1;

for(; nuAdivinar != noAleatorio ;) {
	System.out.println("Ingresa un el número");
	nuAdivinar = input.nextInt();
	
	if(nuAdivinar<noAleatorio) {
		System.out.println("El número es mayor");
	}else if(nuAdivinar==noAleatorio){
		System.out.println("Felicidades Adivinaste el número");
	}else {
		System.out.println("El número es menor");
	}
	
}


System.out.println(" ");


	//9.Tabla de multiplicar
System.out.println("Tabla de Multiplicar");
System.out.println("Ingrese un número para multiplicar");
int NoMultiplicar = input.nextInt();

System.out.println("Ingrese un rango");
int rangoNo = input.nextInt();

for(int contador = 1; contador<=rangoNo; contador++ ) {
	System.out.println(NoMultiplicar + "X" + contador + "=" + contador*NoMultiplicar + "");
}
System.out.println(" ");


	//10.Ordenar tres números
System.out.println("Ordena tres núeros de menor a mayor");
System.out.println("Ingresa tres numeros");
int noUno =input.nextInt();
int noDos =input.nextInt();
int noTres =input.nextInt();



if(noUno > noDos) {
	if (noDos > noTres ) {
		System.out.println(" " +  noTres +  " " + noDos + " " + noUno ); // 3 1 2   213
	}else if (noUno>noTres){
			System.out.println(" " + noDos + " " + noTres + " " + noUno);
			}else {
				System.out.println(" " + noDos + " " + noUno + " " + noTres);

			}
	
	}else if (noUno > noTres) {
	if(noTres> noDos) {
		System.out.println(" " + noDos + " " + noTres + " " + noUno);
		
	}else {
		System.out.println(" " + noTres + " " + noUno +" "+ noDos);
	}


}else if(noDos > noUno){
	if (noUno > noTres) {
		System.out.println(" "+ noTres + " " + noUno + " " + noDos);
	}else if (noDos>noTres) {
		System.out.println(" " + noUno + " " + noTres + " " + noDos);  
	}else  { 
		System.out.println(" " + noUno + " " + noDos + " " + noTres);
		
	}
	
	
}else if (noDos > noTres ) {
	if(noTres > noUno) {
		System.out.println(" " + noUno + " " + noTres + " " + noDos);
	}else {
		System.out.println(" " + noTres + " " + noUno + " " + noDos);
		
	}
	
}else if(noTres > noUno){
	if (noUno > noDos) {
		System.out.println(" "+ noDos + " " + noUno + " " + noTres);// 2 1 3 -->
	}else {
		System.out.println(" " + noUno + " " + noDos + " " + noTres);
	}
	
	
}else {
	if(noDos > noUno) {
		System.out.println(" " + noUno + " " + noDos + " " + noTres);
	}else {
		System.out.println(" " + noDos + " " + noUno + " " + noTres);//
		
	}}}
}


