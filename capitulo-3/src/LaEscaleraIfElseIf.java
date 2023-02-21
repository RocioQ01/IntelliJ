import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero y te dare informacion sobre él");
        int numeroIntroducido = scanner.nextInt();
        if (numeroIntroducido < 3) {
            System.out.println("El numero introducido es menos que 3");
        } else if (numeroIntroducido < 5){
            System.out.println("El numero que has introdicido esta entre 3 y 5");
        }else if (numeroIntroducido < 8){
            System.out.println("El numero intriducido esta entre 5 y 8");
        }else{
            System.out.println("El numero introducido es mayor o igual que 8");
        }
        //En else-if nunca se van a ejecutar mas de uno de sus bloques, en cuanto una de las condiciones se cumple se ejecuta su bloque
        //correspondiente. Las condiciones deben relacionarse entre si.
    }
}
