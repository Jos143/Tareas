//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nombreCliente = "Carlos Martinez";
        String direccionIP = "192.168.0.1";
        int numeroCliente =12345;

        String remplaso1 = nombreCliente.replace("a","1");
        String remplaso2 = remplaso1.replace("e","2");
        String remplaso3 = remplaso2.replace("i","3");
        String remplaso4 = remplaso3.replace("o","4");
        String remplaso5 = remplaso4.replace("u","5");


        String intercambioZ = remplaso5.replaceFirst("z","C");
        String intercambioC = intercambioZ.replaceFirst("C","z");

        //paso 2
        int primeraS =direccionIP.indexOf('.');
        int ultimaS =direccionIP.lastIndexOf('.');

        //Encontar el segundo punto
        String buscarsegundo  = direccionIP.substring(primeraS+1);
        int segundo = buscarsegundo.indexOf('.');

        //Encontrar tercer punto
        String buscatercer  = buscarsegundo.substring(segundo+1);
        int tercero = buscatercer.indexOf('.');




      String parte1N = direccionIP.substring(0,primeraS);
      String segundopunto =buscarsegundo.substring(0,segundo);
      String tercerpunto =buscatercer.substring(0,tercero);


      String ultima = direccionIP.substring(ultimaS+1);
      //esta clase funciona para pasar de String a Int
      int numEntero = Integer.parseInt(parte1N);
      int numEntero2 = Integer.parseInt(segundopunto);
      int numEntero3 = Integer.parseInt(tercerpunto);
      int numEntero4 = Integer.parseInt(ultima);




        String hexadecimal = Integer.toHexString(numEntero);
        String hexadecimal2 = Integer.toHexString(numEntero2);
        String hexadecimal3 = Integer.toHexString(numEntero3);
        String hexadecimal4 = Integer.toHexString(numEntero4);





        //paso 3
        double identificadorNoC = (((numeroCliente*3)+15)/2);

        System.out.println("Datos cifrados: "+  intercambioC + "|" + hexadecimal+ "." +hexadecimal2 +"." + hexadecimal3 + "." + hexadecimal4 + "|" + identificadorNoC );

    }
}