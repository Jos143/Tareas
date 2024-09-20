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

        double operacion1 = Math.pow(XDos-XUno,2) + Math.pow(YDos-YUno,2);
        double distancia = Math.sqrt(operacion1);


        double anguloRadianes = Math.atan2(YDos-YUno,XDos-XUno);

        double Grados = anguloRadianes*(180/3.1415);
        double grado1 =Math.toDegrees(anguloRadianes);

        System.out.println("La distancia es: " + distancia);
        System.out.println("Radianes: " + anguloRadianes);
        System.out.println("Grados: (formula)" + Grados + "   Metodo Math"+ grado1);

    }
}