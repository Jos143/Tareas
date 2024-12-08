package DeClase;

import java.util.Scanner;

public class TareasU5 {
	public  static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	
	//EJERCICIO 1
	
	
	 System.out.println("Ingresa un valor para  convetirlo en grados Fahrenheit");
	 int gradosCelsius = input.nextInt();
	 
	 double conversion = celsiusAFahrenheit(gradosCelsius);
	System.out.println("el valor " + gradosCelsius + " en grados Celsius,  convertido en grados Fahrenheit es " + conversion );
	

}

	
 public static double  celsiusAFahrenheit(int gradosCelsius){
	 
	 double gradosFahrenheit = (gradosCelsius * 9/5)+32;
	 
return gradosFahrenheit; }
 
}
