// Ejercicio 5: Mayor o Menor

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int n3 = scanner.nextInt();
        System.out.println("Ingrese el cuarto numero:");
        int n4 = scanner.nextInt();
        System.out.println("Ingrese el quinto numero: ");
        int n5 = scanner.nextInt();

        System.out.println("El número mayor es: " + Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5));
        System.out.println("El número menor es: " + Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5));
        scanner.close();
    }
}
