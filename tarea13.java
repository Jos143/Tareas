//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

String palabra = "12345;Laptop HP Pavilion;1500.99;Electrónica";

int longitud = palabra.length();
String Idproducto =palabra.substring(0,5);
String nombrePro = palabra.substring(6,24);
String mayusculas = palabra.toUpperCase();
String precio = palabra.substring(25,32);
char posCaracter = palabra.charAt(10);
int primerOcurrencia = palabra.indexOf("a");
int ultimaOcurrencia = palabra.lastIndexOf("o");

String categoria = palabra.substring(33,44);

String subCadena = palabra.substring(7);







System.out.println("La longitud es: " + longitud);
System.out.println("ID del producto: " + Idproducto);
System.out.println("Nombre del producto: " + nombrePro);
System.out.println("Nombre en mayusculas: " + mayusculas);
System.out.println("Precio del producto " + precio);
System.out.println("Carácter en la posición 10 del nombre: " + posCaracter);
System.out.println("Primer ocurrencia de 'a': " + primerOcurrencia);
System.out.println("Ultima ocurrencia de 'o': " + ultimaOcurrencia);
System.out.println("Precio y categoria: " + precio +  " - " + categoria);
System.out.println("Subcadena desde la posición 7 del nombre: " + subCadena);

    }
}