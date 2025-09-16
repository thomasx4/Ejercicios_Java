// Ejercicio 40: Números capicúa

import java.util.Scanner;

public class NumerosCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }
        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
        scanner.close();
    }
}