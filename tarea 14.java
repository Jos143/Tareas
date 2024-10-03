//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      String correo = "juan.perez@empresa.com";
      int fechaascenso = 2023-04-15;
      int salario = 50000.75;

      int indnombre = correo.indexOf(".");
      int indapelldo= correo.indexOf("@");


      String nombre =correo.substring(0,indnombre);
      String apellido =correo.substring(indnombre + 1, indapelldo);
      String complemento =correo.substring(indnombre);

    int year = fechaascenso.substring(0.4);
    int mes = fechaascenso.substring(5,7);
    int dia = fechaascenso.substring(8);

    int sumafech = year + mes + dia;

    int indesalario = salario.indexOf(".");
    int salarioentero = salario.substring(0,indesalario);
    int salariodecimal = salario.substring(indesalario + 1);
    //valor absoluto
      //  int multi = valorabsoluto * 2;


        System.out.println(apellido+nombre+complemento+ "|" + sumafech+"|"/*+ multi*/);





        
    }
}