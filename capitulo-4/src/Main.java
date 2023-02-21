public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.titular = "Juan Martinez";
        cuentaDeJuan.tipoDeCuenta = "nomina";
        cuentaDeJuan.saldo = 23_500;

        //System.out.println("¿Cuál es el saldo de la cuenta de Juan? " + cuentaDeJuan.saldo);

        /*cuentaDeJuan.sacarDinero(500);
        System.out.println("Ahora cuenta de juan tiene " + cuentaDeJuan.saldo);

        cuentaDeJuan.ingresarDinero(1000);
        System.out.println("Despues de ingresar dinero cuentaDeJuan tiene " + cuentaDeJuan.saldo);

        cuentaDeJuan.cambiarTipoDeCuenta("ahorro");*/

        double saldo = cuentaDeJuan.obtenerSaldo();
        System.out.println("El saldo de juan es " + saldo);

        cuentaDeJuan.sacarDinero(-1000);
        System.out.println("El saldo de Juan tras sacar una cantidad negativa es " + cuentaDeJuan.obtenerSaldo());


    }
}
