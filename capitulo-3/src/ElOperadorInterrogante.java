import java.util.Scanner;

public class ElOperadorInterrogante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int dividendo = scanner.nextInt();
        System.out.println("Introduce un numero entero");
        int divisor = scanner.nextInt();
        int resultado;
        /*if(divisor == 0){
            resultado = 0;
        }else{
            resultado = dividendo / divisor;
        }*/
        resultado = divisor == 0?0:dividendo /divisor;
        //Resultado es igual a si divisor es igual a cero, resultado sera lo que hay a la izquierza de los dos puntos o sea "0".
        //Y si divisor no es igual a cero, resultado tendra el valor de la expresion a la derecha de los dos puntos.
        //Es util, si la expresion y la condicion son cortas, habria que sustituirlo por un "if-else" si esto no se cumple
        System.out.println("El resultado de dividir " + dividendo + " entre " + divisor + " es " + resultado);
    }
}
