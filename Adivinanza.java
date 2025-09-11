// Ejercicio 7: adivinanzas

import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        int numeroSecreto = 50;
        int intentos = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tienes " + intentos + " intentos para adivinar el número secreto (entre 1 y 50).");

        for (int i = 1; i <= intentos; i = i + 1) {
            System.out.print("Intento " + i + ": Ingrese su número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
                break;
            } else {
                System.out.println("Número incorrecto.");
                if (i == intentos) {
                    System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
                scanner.close();
                }
            }
        }
    }
}
