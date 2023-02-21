public class PasoPorReferencia {
    public static void main(String[] args) {
        int varibale1 = 23;
        int variable2 = varibale1;
        System.out.println("El valor de variable1 es " + varibale1);
        System.out.println("El valor de variable2 es " + variable2);

        variable2 = 78;
        System.out.println("El valor de variable1 es " + varibale1);
        System.out.println("El valor de variable2 es " + variable2);

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
        cuentaDeJuan.saldo = 23_500;

        CuentaBancaria cuentaDeAna = cuentaDeJuan;
        cuentaDeAna.saldo = 10_000;

        System.out.println("Saldo de Juan: " + cuentaDeJuan.saldo);
        System.out.println("Saldo de Ana: " + cuentaDeAna.saldo);
    }
}
