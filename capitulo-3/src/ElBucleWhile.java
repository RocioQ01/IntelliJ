import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        //Se usa un bucle While cuando queramos repetir una serie de instrucciones mientras se cumpla una condicion y se usara cuando no sepamos el numero de iteraciones necesarias
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el numero del que quiera realizar la raiz cuadrada");
        double numero = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;
        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numero){
            candidatoARaizCuadrada += 0.01;
            System.out.println("¿Será el numero " + candidatoARaizCuadrada + "? " + "Su cuadrado es " + candidatoARaizCuadrada * candidatoARaizCuadrada);
        }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raiz cuadrada que hemos calculado es " + candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada real es: " + Math.sqrt(numero));
    }
}
