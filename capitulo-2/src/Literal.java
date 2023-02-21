public class Literal {
    public static void main(String[] args) {
        int enteroDecimal = 100;
        int enteroOctal = 0100;
        int enteroHexadecimal = 0x100;

        System.out.println("EnteroHexadecimal es: " + enteroHexadecimal);

        long numeroLong = 100L;

        double numeroDouble = 2.5;

        float numeroFloat = 2.5f;

        int numeroConGuiones = 25_542_454;
        System.out.println("El numero numeroConGuiones es: " + numeroConGuiones);

        char miChar = 'b';

        char miOtroChar = '\u0062';
        System.out.println("El caracter miOtroChar es: " + miOtroChar);

        char comillaSimple = '\'';

        String stringLiteral = "Esto es un literal";

        boolean booleanoVerdadero = true;

        String stringNulo = null;
    }
}
