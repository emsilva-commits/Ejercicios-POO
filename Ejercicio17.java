import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double longitud = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Longitud de la circunferencia: " + longitud);

        sc.close();
    }
}
