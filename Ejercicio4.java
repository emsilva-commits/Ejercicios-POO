import java.util.Scanner;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEdad() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad de Juan: ");
        int edadJuan = sc.nextInt();

        Persona juan = new Persona("Juan", edadJuan);
        Persona alberto = new Persona("Alberto", (int)(edadJuan * 2.0 / 3));
        Persona ana = new Persona("Ana", (int)(edadJuan * 4.0 / 3));

        int edadMama = juan.edad + alberto.edad + ana.edad;
        Persona mama = new Persona("Mamá", edadMama);

        System.out.println("\nEdades:");
        juan.mostrarEdad();
        alberto.mostrarEdad();
        ana.mostrarEdad();
        mama.mostrarEdad();

        sc.close();
    }
}

