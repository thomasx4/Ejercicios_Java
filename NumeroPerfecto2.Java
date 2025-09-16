// Ejercicio 36: Número perfecto

import java.util.Scanner;

public class NumeroPerfecto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i = i + 1) {
            if (numero % i == 0) {
                sumaDivisores = sumaDivisores + i;
            }
        }
        if (sumaDivisores == numero && numero != 0) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
        scanner.close();
    }
}