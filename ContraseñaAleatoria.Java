// Ejercicio 39: Contraseña aleatoria

import java.util.Random;
import java.util.Scanner;

public class ContraseñaAleatoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i = i + 1) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }
        System.out.println("Contraseña generada: " + contrasena.toString());
        scanner.close();
    }
}