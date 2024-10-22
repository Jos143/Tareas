import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  PRIMER EJERCICIO
/*
        System.out.println("Ingresa tu nombre completo");
        String nombreEstudiante = input.nextLine();

        System.out.println("Ingresa tu número de identificación");
        int noIdentificacion = input.nextInt();

        System.out.println("Ingresa el número de materias a inscribir ");
        int noMaterias = input.nextInt();

        System.out.println("Ingresa tu promedio general");
        double promedioGeneral = input.nextDouble();

        // Materias aprobadas el semestre anterior
        System.out.println("Ingresa el número de materias aprobadas el semestre pasado");
        int  materiasA = input.nextInt();

        String deEnteroACadena = Integer.toBinaryString(noIdentificacion);



        if (promedioGeneral<7){
            System.out.println("No puedes tomar ninguna materia por tu promedio");
        }else if (promedioGeneral>=7&&promedioGeneral<8.5){
            if (noMaterias<3){
                System.out.println("Se te permite la inscripción a las materias");
            }else {
                System.out.println("solicitud denegada por sobrecarga académica");
            }
        }else {
            if (nombreEstudiante.length()>25){
                System.out.println("Error tu nombre es demaciado largo corregirlo");
            }else{
                if (deEnteroACadena.length()<8){
                    System.out.println("Formato de matricula incorrecto ");
                }else {
                    if (noMaterias<=5){
                        System.out.println("Listo puedes inscribirte a las materias");
                    } else if (materiasA>=3&&noMaterias==6){
                        System.out.println("Felicidades puedes inscribirte a las materias solicitadas");
                    } else {
                        System.out.println("Solo tienes un limite de 5 materias como maximo ");
                    }
                }
                }

            }*/

/*
        //EJERCICIO 2

        System.out.println("Ingresa tu tipo de membresía");
        String membresia = input.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = input.nextInt();


        System.out.println("Tipo de evento (nacional o internacional)");
        String tipoEvento = input.nextLine();
        input.next();

       if (membresia.equals("Premium")) {
           if(edad<18){
               if(tipoEvento.equals("Nacional")){
                   System.out.println("Listo si puedes comprar boletos nacionales");
               }else {
                   System.out.println("No puedes comprar boletos internacionales");
               }
           } else if (edad>=18&&edad<25){
               if (tipoEvento.equals("Internacional")){
                   System.out.println("Listo puedes comprar boletos internacionales, tienes un descuento del 20%");
               }else {
                   System.out.println("Listo puedes comprar boletos nacionales, tienes un descuento del 10%");
               }

           }else {
               if (tipoEvento.equals("Internacional")){
                   System.out.println("Listo puedes comprar boletos internacionales, tienes un descuento del 25%");
               }else {
                   System.out.println("Listo puedes comprar boletos nacionales, tienes un descuento del 15%");
               }

           }
       } else if (membresia.equals("Estándar")){
           if(edad<18){
               if(tipoEvento.equals("Nacional")){
                   System.out.println("Listo si puedes comprar boletos nacionales");
               }else {
                   System.out.println("No puedes comprar boletos internacionales");
               }
           }else {

               if (tipoEvento.equals("Internacional")){
                   System.out.println("Listo puedes comprar boletos internacionales");
               }else {
                   System.out.println("Listo puedes comprar boletos nacionales, tienes un descuento del 5%");
               }

           }

       } else if(membresia.equals("Básica")){
           if (tipoEvento.equals("Nacional")){
               System.out.println("Tu membresia no te permite comprar boletos internacionales");
           }else {

               System.out.println("Listo puedes comprar boletos nacionales");
           }
       } else {
           System.out.println("Error de sintaxis intentalo de nuevo");
       }*/

        //EJERCICIO 3

        System.out.println("Ingresa tu nombre ");
        String nombreEjercicio3 = input.nextLine();

        System.out.println("Ingrase su edad ");
        int edadejercicio3 = input.nextInt();

        System.out.println("Pais de residencia");
        String paisResidencia = input.nextLine();
        input.nextLine();

        System.out.println("Estado civil (Soltero o casado, false o true)");
        boolean estadoCivil = input.nextBoolean();

        System.out.println("Ingresos anuales");
        double ingresoAnual = input.nextDouble();

        System.out.println("Tienes hijos (false o true)");
        boolean tienehijos = input.nextBoolean();

        if (nombreEjercicio3.matches(".*\\d.*")){
            System.out.println("Error: El nombre no puede tener números");

        }else if(edadejercicio3<25){
            System.out.println("No eres elegible para beneficios");
        }else if (edadejercicio3>=25){
            if (paisResidencia.equals("México")&&estadoCivil){
                if (ingresoAnual<300000){
                    if (tienehijos){
                        System.out.println("Descuento del 10% en se seguro");
                    }else {
                        System.out.println("Descuento del 5% del seguro");
                    }

                } else {
                    System.out.println("Sin beneficios");
                }
            }else if (paisResidencia.equals("México")&&estadoCivil==false){
                if (ingresoAnual<400000){
                    System.out.println("Descuento del 8% en su seguro");
                }else {
                    System.out.println("No tienes beneficios");
                }

            } else if (paisResidencia.equals("USA")){
                if (ingresoAnual<500000&&estadoCivil==true){
                    System.out.println("Recibes un descuento del 12% en tu seguro");
                    if (tienehijos==true){
                        System.out.println("Recibes un 3% + de descuento de seguro por tener hijos");
                    }
                }else if (estadoCivil==false&&ingresoAnual<200000){
                    System.out.println(" Recibes un descuento del 7% en tu seguro");
                    if (tienehijos==true){
                        System.out.println("Recibes un 3%  + de descuento de seguro por tener hijos");
                    }
                }

            } else if (paisResidencia.equalsIgnoreCase("Canadá")|| paisResidencia.equalsIgnoreCase("Otro")){
                if (estadoCivil==true ){
                    System.out.println("Descuento del 5% de seguro");
                    if (ingresoAnual<200000){
                        System.out.println("Tienes un descuento adicional del 2%");
                    }
                }else{
                    System.out.println("Descuento del 3%");
                    if (ingresoAnual<200000){
                        System.out.println("Tienes un descuento adicional del 2%");
                    }
                }

            }

        }

       }
    }

