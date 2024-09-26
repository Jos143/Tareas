import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // System.out.println("Introduce tu dirección completa: ");
        // String direccion = input.nextLine();


        String direccion = "Av. Libertador, 1234, Ciudad de México, C.P. 06000";

        int longitud = direccion.length();
        char primerCaracter = direccion.charAt(0);
        char ultimoCaracter = direccion.charAt(direccion.length()-1);
        String mayusculas = direccion.toUpperCase();
        String minusculas = direccion.toLowerCase();
        String calle = direccion.substring(0,14);
        String numero = direccion.substring(16,21);
        String ciudad = direccion.substring(22,38);
        String nopostal  = direccion.substring(45);
        String sinEspacios = direccion.trim();
       // char posnumero = direccion.charAt(1);
        String corregir = direccion.replace(",","").replace(".","");

        String abreviacion = direccion.substring(4,14) + " " + numero + ciudad + " " + nopostal;

        System.out.println("Longitud de la direccion " + longitud);
        System.out.println("Primer caracter: " + primerCaracter );
        System.out.println("Ultimo caracter: " + ultimoCaracter);
        System.out.println("En mayusculas: " + mayusculas);
        System.out.println("Minusculas " + minusculas);
        System.out.println("Calle: " + calle );
        System.out.println("Número: " + numero);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Codigo postal: " + nopostal);
        //System.out.println("Primer aparición de un  número: "  + posnumero);
        System.out.println("Dirección corregida: " + corregir );
        System.out.println("Direccion sin espacios extras: " + sinEspacios);
        System.out.println("Version abreviada: " + abreviacion );









    }
}