import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num = sc.nextDouble();

        double cuadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Cubo: " + cubo);

        sc.close();
    }
}
