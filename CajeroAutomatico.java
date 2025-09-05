// Ejercicio 10: Cajero Automático

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la opción deseada: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo es: $1000");
                break;
            case 2:
                System.out.println("Retiro exitoso. Nuevo saldo: $900");
                break;
            case 3:
                System.out.println("Depósito exitoso. Nuevo saldo: $1100");
                break;
            case 4:
                System.out.println("Gracias por usar el Cajero Automático. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                break;
        }
        scanner.close();
    }
}
