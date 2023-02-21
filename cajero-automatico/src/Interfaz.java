/*
    Programa que emule la interfaz de un cajero automatico. El programa presentará las siguientes opciones de usuario:

    Elija una de las siguientes opciones:
        Escriba 1 para consultar su saldo
        Escriba 2 para ingresar dinero
        Escriba 3 para sacar dinero
        Escriba 4 para consultar sus ultimos moviemientos
    Una vez escrita la opción, pulse la tecla "Enter"

    Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla el número correspondiente a la opción elegida
*/

/*
Programa que emule la interfaz de un cajero automatico. El programa presentará las siguientes cosas

Elija una de las siguientes opciones:
    Escriba 1 para consultar su saldo.
    Escriba 2 para ingresar dinero
    Escriba 3 para sacar dinero
    Escriba 4 para consultar sus últimos movimientos
Para salir escriba cualquier otro número
Una vez escrita la opcion, pulse la tecla Enter

Una vez el usuario ha elegido la opción, el programa le mostrará por pantalla una frase explicativo
*/

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        int opcionSeleccionada;

        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("    Escriba 1 para consultar su saldo");
            System.out.println("    Escriba 2 para ingresar dinero");
            System.out.println("    Escriba 3 para sacar dinero");
            System.out.println("    Escriba 4 para consultar sus ultimos moviemientos");
            System.out.println("    Para salir escriba cualquier otro número");

            Scanner scanner = new Scanner(System.in);

            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    System.out.println("La opcion que usted a elegido es consultar su saldo");
                    break;
                case 2:
                    System.out.println("La opcion que usted a elegido es ingresar diner");
                    break;
                case 3:
                    System.out.println("La opcion que usted a elegido es sacar dinero");
                    break;
                case 4:
                    System.out.println("La opcion que usted a elegido es consultar sus ultimos movimientos");
                    break;
                default:
                    System.out.println("¡Muchas gracias por usar nuestros servicios!");
            }

        }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);
    }
}
