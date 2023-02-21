public class OperacionRelacionales {
    public static void main(String[] args) {
        boolean esUnoMayorQueDos = 1 > 2;
        System.out.println("Es cierto que uno es mayor que dos?" + esUnoMayorQueDos);

        boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2;

        boolean esOchoMayorOIgualQueOcho = 8 >= 8;
        System.out.println("Es ocho mayor o igual que ocho " + esOchoMayorOIgualQueOcho);

        boolean esTresComaUnoIgualQueTresComaDos = 3.1 == 3.2;

        boolean esCuatroDiferenteDeCuatro = 4 != 4;
        System.out.println("Es cuatro diferente de cuatro " + esCuatroDiferenteDeCuatro);

        String perro = "perro";
        String gato = "gato";
        System.out.println("El string perro es igual al string gato?" + perro == gato);
    }
}
