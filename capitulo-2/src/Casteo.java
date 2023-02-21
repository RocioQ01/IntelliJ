public class Casteo {
    public static void main(String[] args) {
        int varibleDeTipoInt = 10;
        float variableDeTipoFloat = varibleDeTipoInt;
        //short variableDeTipoShort = varibleDeTipoInt; //Incompatibles
        double variableDeTipoDouble = variableDeTipoFloat;
        double otraVariableDeTipoDouble = 2.76;

        int otraVariableDeTipoInt = (int)otraVariableDeTipoDouble; //(int) se transforma en int

        System.out.println("El resultado del casteo es " + otraVariableDeTipoInt); //resultado es 2

        byte variable1 = 100;
        byte variable2 = 50;

        byte suma = (byte)(variable1 + variable2); //La suma se castea (transforma) a byte
        System.out.println("El resultado del casteo a byte es " + suma);

    }
}
