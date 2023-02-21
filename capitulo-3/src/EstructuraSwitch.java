import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el dia de la semana en que quiere su cita");
        String dia = scanner.nextLine();
        switch (dia){
            case "lunes":
            case "miercoles":
                System.out.println("El dia " + dia + " puede venir de 11:00 a 12:30");
                break;
            case "martes":
            case "jueves":
                System.out.println("El dia " + dia +" puede venir de 12:00 a 15:00");
                break;
            case "viernes":
                System.out.println("El dia " + dia + " puede venir de 08:00 a 13:00");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El dia " + dia + " nuestra clinica permanecerá cerrada");
                break;
            default:
                System.out.println("Por favor introduzca un dia valido");
        }
    }
}
