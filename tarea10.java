//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 String palabra = "supercalifragilisticoespialidoso";

 int longitud = palabra.length();
 char posDiez = palabra.charAt(10);
 String mayusculas = palabra.toUpperCase();
 String palabraCortada = palabra.substring(5,15);
 int primerOcurrencia = palabra.indexOf("i");
 int ultimaOcurrencia = palabra.lastIndexOf('o');
 String minusculas = palabra.toLowerCase();
 String subCadena  = palabra.substring(7);
 int ultimaOcurrencia2 = palabra.lastIndexOf( "li");


        System.out.println("Longitud: " + longitud);
        System.out.println("Carácter en posición 10:"+ posDiez);
        System.out.println("En mayusculas: " + mayusculas);
        System.out.println("Subcadena (5-15: " + palabraCortada);
        System.out.println("Primer ocurrencia de 'i': " + primerOcurrencia);
        System.out.println("Ultima ocurrencia de 'o': " + ultimaOcurrencia);
        System.out.println("En minúsculas: " + minusculas);
        System.out.printf("Subcadena desde la posición 7: " + subCadena + "\n");
        System.out.println("Ultima ocurrencia de 'li': " + ultimaOcurrencia2);

    }
}