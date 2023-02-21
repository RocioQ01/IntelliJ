import java.math.BigDecimal;
import java.util.Scanner;

/*
Programa que pide por pantalla introducir una cantidad en euros y devuelva la conversion en US
El mensaje con el resultado será: *** euros equivalen a *** US dolares
 */
public class Conversor {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido al conversor de moneda");
        System.out.println("Por favor ingresa una cantidad en euros");

        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();

        double dolares = 1.09 * euros;
        System.out.println(euros + " euros equivales a " + dolares + "US dolares");

        //BigDecimal: se usa para la presicion de los numero deciamles
        String eurosString = Double.toString(euros);
        BigDecimal euroBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = euroBigDecimal.multiply(tasaDeCambioBigDecimal);
        System.out.println(euros + " euros equivalen a " +  dolaresBigDecimal.toString()+ "US dolares");
    }
}
