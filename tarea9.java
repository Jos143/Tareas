import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        System.out.println("Ingra X1");
        int XUno = input.nextInt();

        System.out.println("Ingra Y1");
        int YUno = input.nextInt();

        System.out.println("Ingre X2");
        int XDos = input.nextInt();

        System.out.println("Ingra Y2");
        int YDos = input.nextInt();

        System.out.println("Ingrea X3");
        int XTRes = input.nextInt();

        System.out.println("Ingrea Y3");
        int YTres = input.nextInt();



        double a = Math.sqrt(Math.pow(XDos-XUno,2) + Math.pow(YDos-YUno,2));
        double c = Math.sqrt(Math.pow(XUno-XTRes,2) + Math.pow(YUno-YTres,2));
        double b = Math.sqrt(Math.pow(XTRes-XDos,2) + Math.pow(YTres-YDos,2));;

        double perimetro = (a+b+c);

        double semiperimetro = (a+b+c)/2;

        double operacionA1  =  semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c);
        double resultaodArea = Math.sqrt(operacionA1);

        double AlturaVertice = (2*resultaodArea)/a;

        double AnguloInterno = (Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2))/(2*a*c);

        double diferencia = (a-b)+(b-c)+(c-a);
        boolean esQuilatro = diferencia>0;

        double puntoMedio1 = ((XUno+XDos)/2)*((YUno+YDos)/2)/2;
        double puntoMedio2 = ((XDos+XTRes)/2)*((YDos+YTres)/2)/2;

        double anguloA =Math.toDegrees(Math.acos(a));



        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c + "\n");


        System.out.println("Perimetro: " + perimetro );
        System.out.println("Area " + resultaodArea);
        System.out.println("Altura del triangulo de un  vertice " + AlturaVertice);
       System.out.println("Angulo interno del triangulo: " + anguloA );
        System.out.println("El triangulo es equilatero: " + esQuilatro);
        System.out.println("Punto medio AB " + puntoMedio1);

    }
}