import java.util.Scanner;

public class IntroduccionCaracteresTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " ¡Bienvenido/a!");
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("Tienes " + edad + " años");
    }
}
