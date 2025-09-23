// Ejercicio 52: Lista Inversa.

import java.util.Scanner;

public class ListaInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea ingresar: ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Ingrese " + n + " numeros enteros:");
        for (int i = 0; i < n; i = i + 1) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Lista en orden inverso:");
        for (int i = n - 1; i >= 0; i = i - 1) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}