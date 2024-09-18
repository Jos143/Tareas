//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaracion de variables
        double numero1;
        double numero2;
        double numero3;
        double numero4;
        double numero5;
        double numero6;
        double numero7;
        double numero8;
        double numero9;
        double numero10;

        //Generar números aleatorios
        numero1 = Math.random()*100;
        numero2 = Math.random()*100;
        numero3 = Math.random()*100;
        numero4 = Math.random()*100;
        numero5 = Math.random()*100;
        numero6 = Math.random()*100;
        numero7 = Math.random()*100;
        numero8 = Math.random()*100;
        numero9 = Math.random()*100;
        numero10 = Math.random()*100;


        System.out.println("Numero 1 : " + numero1);
        System.out.println("Numero 2 : " + numero2);
        System.out.println("Numero 3 : " + numero3);
        System.out.println("Numero 4 : " + numero4);
        System.out.println("Numero 5 : " + numero5);
        System.out.println("Numero 6 : " + numero6);
        System.out.println("Numero 7 : " + numero7);
        System.out.println("Numero 8 : " + numero8);
        System.out.println("Numero 9 : " + numero9);
        System.out.println("Numero 10 : " + numero10 +"\n");




        //Calcular raiz cuadrada
        numero1 = Math.sqrt(numero1);
        numero2 = Math.sqrt(numero2);
        numero3 = Math.sqrt(numero3);
        numero4 = Math.sqrt(numero4);
        numero5 = Math.sqrt(numero5);
        numero6 = Math.sqrt(numero6);
        numero7 = Math.sqrt(numero7);
        numero8 = Math.sqrt(numero8);
        numero9 = Math.sqrt(numero9);
        numero10 = Math.sqrt(numero10);

        System.out.println("raiz cuadrada " + numero1);
        System.out.println("raiz cuadrada " + numero2);
        System.out.println("raiz cuadrada " + numero3);
        System.out.println("raiz cuadrada " + numero4);
        System.out.println("raiz cuadrada " + numero5);
        System.out.println("raiz cuadrada " + numero6);
        System.out.println("raiz cuadrada " + numero7);
        System.out.println("raiz cuadrada " + numero8);
        System.out.println("raiz cuadrada " + numero9);
        System.out.println("raiz cuadrada " + numero10 +"\n");


        //Elevar números al cuadrado
        numero1 = Math.pow(numero1,2);
        numero2 = Math.pow(numero2,2);
        numero3 = Math.pow(numero3,2);
        numero4 = Math.pow(numero4,2);
        numero5 = Math.pow(numero5,2);
        numero6 = Math.pow(numero6,2);
        numero7 = Math.pow(numero7,2);
        numero8 = Math.pow(numero8,2);
        numero9 = Math.pow(numero9,2);
        numero10 = Math.pow(numero10,2);




        System.out.println("Numero elevada a la 2 :" + numero1);
        System.out.println("Numero elevada a la 2 :" + numero2);
        System.out.println("Numero elevada a la 2 :" + numero3);
        System.out.println("Numero elevada a la 2 :" + numero4);
        System.out.println("Numero elevada a la 2 :" + numero5);
        System.out.println("Numero elevada a la 2 :" + numero6);
        System.out.println("Numero elevada a la 2 :" + numero7);
        System.out.println("Numero elevada a la 2 :" + numero8);
        System.out.println("Numero elevada a la 2 :" + numero9);
        System.out.println("Numero elevada a la 2 :" + numero10 + "\n");



        //suma de todos los numeros

        double suma = numero1+numero2+numero3+numero4+numero5+numero6+numero7+numero8+numero9+numero10;

        double media = suma/10;

       System.out.println("La mediana es: " + media);

   //  desviacion1 = Math.sqrt(suma(( numero1-media)**2)/10);

        //System.out.println("Desviacion estandar: " + desviacion1);









    }
}