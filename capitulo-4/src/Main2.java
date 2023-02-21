public class Main2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        double area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El area de un circulo es radio 4 es " + area);

        System.out.println("El volumen de un prisma de 5 por 4 por 8 es " + calculadora.calcularVolumenPrismaRectangular(5,4,8));
    }
}
