import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//PARTE UNO
        System.out.println("Ingresa tu domicilio comenzando por tu colonia");
        String colonia = input.nextLine();

        System.out.println("Ingresa tu calle");
        String calle = input.nextLine();

        System.out.println("Ingresa tu número exterior o interior");
        String numero = input.nextLine();

//PARTE DOS

        System.out.println("Ingresa el nombre de tu primaria");
        String nombrePrimaria = input.nextLine();

        System.out.println("Ingresa el nombre de tu secundaria");
        String nombreSecundaria = input.nextLine();

        System.out.println("Ingresa el nombre de tu preparatoria");
        String nombrePreparatoria = input.nextLine();

//PARTE TRES
        System.out.println("Ingresa el nombre de tu deporte favorito");
        String deporte = input.nextLine();

        System.out.println("Cuantas horas dedicas a la semana");
        int horas = input.nextInt();;

        //mostar información

        System.out.println("Tu direccioón es " + colonia + ", " + calle + "," + numero  );
        System.out.println("Nombre de tu primario: " + nombrePrimaria + ".\n Nombre de tu secundaria: " + nombreSecundaria + ".\n Nombre de tu preparatoria: " + nombrePreparatoria);
        System.out.println("Tu deporte favoriot es :" + deporte + " le dedicas " + horas +" horas a la semana");


    }
}