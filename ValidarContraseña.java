// Ejercicio 9: Validar Contraseña

import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        String contraseñaCorrecta = "Ejemplo123";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String contraseñaIngresada = scanner.nextLine();

        if (contraseñaIngresada.equals(contraseñaCorrecta)) {
            System.out.println("Contraseña correcta. Acceso concedido.");
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }
        scanner.close();
    }
}
