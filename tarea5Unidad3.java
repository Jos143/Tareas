//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //PRIMER EJERCICIO

        String nacionalidad = "Usa";
        boolean esResidente = true;
        boolean tipoVisa = true;
        int tiempoExperiencia = 5;

        if (nacionalidad.equals("Mexicana") || esResidente) {
            System.out.println("Eres legible para un empleo");

        } else if (tipoVisa) {
            if (tiempoExperiencia >= 5) {
                System.out.println("Eres elegible para un empleo calificado");
            } else {
                System.out.println("Eres elegible solo para empleos no calificados");
            }

        } else {
            System.out.println("Solicitud rechazada");

        }


        //SEGUNDO EJERCICIO

        String paisRecidensia = "Usa";
        int codpostal = 95258;
        boolean actividadCoprasP = true;

        String cambio = Integer.toString(codpostal);
        String primerCaracter = cambio.substring(0,1);
        int caracterCambio =Integer.parseInt(primerCaracter);

        if (paisRecidensia.equals("Usa")) {

            if ( caracterCambio == 9) {

                if (actividadCoprasP) {
                    System.out.println("Puedes pagar con paypal");
                } else {
                    System.out.println("Necesitas una verificación de tu dirección");
                }
            } else {
                System.out.println("Se te permite pagar con tarjeta de crédito");
            }

        } else if (paisRecidensia.equals("Europa")) {

            if (cambio.length() == 5) {

                if (actividadCoprasP) {
                    System.out.println("Puedes pagar con transferencia bancaria");
                } else {
                    System.out.println("Necesitas una verificación bancaria");
                }


            }

        } else {
            System.out.println("Necesitas una verificación manual de identidad");
        }

        //TERCER EJERCICIO

        int cantidadDEpersonas = 2;
        boolean esSuite = true;
        int tiempoDia = 4;
        boolean SuiteDisponibles = false;


        if (cantidadDEpersonas == 1) {
            if (esSuite && SuiteDisponibles) {
                if (tiempoDia>3){
                    System.out.println("Tienes una Suite y descuento de 10%");
                }else {
                    System.out.println("Tienes una Suite");
                }

            } else {
                System.out.println("Solo te podemos dar una habitacion estandar");

            }


        } else {
            if (esSuite && SuiteDisponibles) {
                  if (tiempoDia>5){
                      System.out.println("Tienes una Suite y desayuno gratis");
                  }else {
                      System.out.println("Tienes una suite");
                  }

            }else {
                System.out.println("Solo te podemos dar habitacion doble estandar");
            }


        }
    }}