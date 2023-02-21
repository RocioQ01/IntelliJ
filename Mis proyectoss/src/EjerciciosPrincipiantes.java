import java.util.Scanner;

public class EjerciciosPrincipiantes {
    public static void main(String[] args) {
        /*Declara dos variables numéricas (con el valor que desees), muestra por consola la
         suma, resta, multiplicación, división y módulo (resto de la división

        int numero1 = 10;
        int numero2 = 5;

        int resultadoSuma = numero1 + numero2;
        int resultadoResta = numero1 - numero2;
        int resultadoMultiplicacion = numero1 * numero2;
        int resultadoDivision = numero1 / numero2;

        System.out.println("La suma es: " +resultadoSuma);
        System.out.println("La resta es: " + resultadoResta);
        System.out.println("La multiplicacion es: " + resultadoMultiplicacion);
        System.out.println("La division es: " + resultadoDivision);

        System.out.println("El resultado de la suma es: " + (numero1 + numero2)); Menos código*/

/*************************************************************************************************************/

        //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
        // Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

        /*int variable1 = 25;
        int variable2 = 10;

        if(variable1>=variable2){
            if(variable1==variable2){
                //Si los numeros son iguales imprime esto...
                System.out.println("Los numeros "+ variable1 +" y "+ variable2 +" son iguales");
            }else{ //Si variable1 es mayor que variable2 imprime esto...
                System.out.println("El número "+ variable1 +" es mayor que el número "+ variable2);
            }
        }else{ //Si variable2 es mayor que variable1 imprime esto...
            System.out.println("El número "+ variable2 +" es mayor que el número "+ variable1);
        }*/

/*************************************************************************************************************/

        //Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        // Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

        /*String nombre = "Rocio";
        System.out.println("¡Bienvenido/a " + nombre + "!");*/

/*************************************************************************************************************/

        //Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane)

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor...");
        String nombre = scanner.nextLine();
        System.out.println("¡Bienvenido/a " + nombre + "!");*/

/*************************************************************************************************************/

        //Haz una aplicación que calcule el área de un círculo(pi*R2).
        // El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
        // Usa la constante PI y el método pow de Math.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        sc.useLocale(Locale.US);
        double radio=sc.nextDouble();

        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);

        System.out.println("El area del circulo es "+area);*/

/*************************************************************************************************************/

    }
    }

