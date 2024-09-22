//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombreC = "Garcia, Juan Carlos";

        int longitud = nombreC.length();
        String apellido = nombreC.substring(0,6);
        String nombreApellido = nombreC.substring(8);
        String nombre = nombreC.substring(8,12);
        String mayusculas = apellido.toUpperCase();
        String minusculas = nombreC.toLowerCase();
        char posicion = nombreC.charAt(5);
        int primerOcurrencia =nombreC.indexOf("a");
        int ultimaOcurrencia = nombreC.lastIndexOf("a");


        System.out.println("Longitud del nombre completo: " + longitud);
        System.out.println("Apellido: " + apellido);
        System.out.println("NOmbre sin apellido: " + nombreApellido);
        System.out.println("Primer nombre: " + nombre);
        System.out.println("Apellido en mayusculas: " + mayusculas );
        System.out.println("Nombre completo en minusculas: " + minusculas );
        System.out.println("Carácter en la posición 5:" + posicion);
        System.out.println("Primer ocurrencia de 'a': " + primerOcurrencia);
        System.out.println("Ultima ocurrencia de 'a': " + ultimaOcurrencia);







    }
}