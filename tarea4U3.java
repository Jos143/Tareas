import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner input =new Scanner(System.in);

       //NUMERO DIVISIBLE 3 O 5, AMBOS
        System.out.println("Ingresa un numero");
        int numerodi = input.nextInt();

        if (numerodi%3==0 && numerodi % 5==0){
            System.out.println("El número es divisible entre ambos");

        }else if (numerodi%3==0){
            System.out.println("El numero es divisible entre 3");

        }else if (numerodi%5==0){
            System.out.println("El numero es divisible entre 5");
        }else {
            System.out.println("El numero no es divisible entre el 3 ni el 5");
        }

        //TIPO DE TRAIANGULO
        System.out.println("Ingresa tres lados de un triangulo");
        int lado1 = input.nextInt();
        int lado2 = input.nextInt();
        int lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Es un triangulo equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Es un triangulo isóceles");
        }else {
            System.out.println("Es un triangulo escaleno");
        }


        //IMPUESTO
        System.out.println("Ingresa tu salario");
        double salario = input.nextDouble();

        if (salario<=10000){
            System.out.println("No pagas impuestos");
        }
        else if (salario>10000&&salario<20000) {
            double impuesto = (.10*salario);
            System.out.println("Se te aplicara un impuesto del 10 igual a " + impuesto);
        }
      else  {
            double impuesto =.20*salario;
            System.out.println("Se te aplicara un impuesto del 20 igual a " + impuesto);
        }

      //NUMERO PAR O IMPAR
      System.out.println("Ingresa un para saber si es par o impar");
      int parOimpar = input.nextInt();

      if (parOimpar % 2 == 0){
          System.out.println("El numero es par");

      }else {

          System.out.println("el numero es impar");
      }


    }
}