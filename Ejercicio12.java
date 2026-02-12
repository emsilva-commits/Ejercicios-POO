import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = 48;
        double valorHora = 5000;
        double porcentajeRetencion = 0.125;

        double salarioBruto = horas * valorHora;
        double retencion = salarioBruto * porcentajeRetencion;
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        sc.close();
    }
}
