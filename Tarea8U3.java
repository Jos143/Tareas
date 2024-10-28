import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //ejercicio uno
        int contador1 = 1;

        System.out.println("1.Números del 1 al 10");
        while (contador1 <= 10) {
            System.out.println(contador1);
            contador1++;
        }
        //ejercicio dos
        System.out.println("2.Suma de numeros naturales del 1 al 10");
        int contador2 = 1;
        int suma = 0;
        while (contador2 <= 10) {
            suma += contador2;
            contador2++;
        }
        System.out.println(suma);


        //ejercicio tres


        //ejercicio cuatro
        int contador4 = 1;
        System.out.println("4.Números pares del 1 al 20");
        while (contador4 <= 20) {
            if (contador4 % 2 == 0) {
                System.out.println(contador4);
            }
            contador4++;
        }
// ejercicio 5
// ejercicio 6
       /* System.out.println("Múltiplo de un número hasta cierto limite");
        System.out.println("Ingresa un número");
        int numeromul = input.nextInt();
        System.out.println("Ingresa un limite");
        int limitenu = input.nextInt();

        while (numeromul<=limitenu){
            if(numeromul){
                System.out.println(numeromul);
            }
            numeromul ++;
        }
*/
// ejercicio 7
// ejercicio 8

        System.out.println("Número de n a 1");

        System.out.println("Ingresa un numero");
        int numeroInversos = input.nextInt();

        while (numeroInversos >= 1) {
            System.out.println(numeroInversos);
            numeroInversos--;
        }

// ejercicio 9
// ejercicio 10
// ejerciico 11
        System.out.println("Determinar si un número es perfecto");
        System.out.println("Ingresa un número");
        int numeroPerfecto = input.nextInt();

        int contador11 = 1;
        int suma11 = 0;
        while (contador11 <= numeroPerfecto) {
            if (numeroPerfecto % contador11==0){
                suma11 +=contador11;
            }
contador11 ++;

        }
if (suma11 == numeroPerfecto ){
    System.out.println("Número perfecto");
} else {
    System.out.println("No es número perfecto");

}

    }





    }
