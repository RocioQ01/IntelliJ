import java.util.Scanner;

public class ElBucleFor {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número");
        int primerOperanado = scanner.nextInt();
        System.out.println("Por favor introduzca el segundo número");
        int segundoOperando = scanner.nextInt();
        int resultado = 0;
        for(int i = 0; i < segundoOperando; i++){
            System.out.println("Iteracion numero: " + i);
            resultado = resultado + primerOperanado;
        }
        System.out.println("El resultado de multiplicar " + primerOperanado + " por " + segundoOperando + " es " + resultado);*/

        int suma = 0;
        for(int i = 1, j = 100; i < j; i++, j--){//Hay dos variables de control, la i y la j
            //Se tiene que cumplir que i sea menor que j, para avanzar sumaremos uno a "i" y restaremos uno a "j"
            System.out.println("Iteracion numero " + i + " sumando " + i + " y " + j);
            suma = suma + i + j;
        }
        System.out.println("El resultado de sumar los numeros del 1 al 100 es " + suma);
    }
}
