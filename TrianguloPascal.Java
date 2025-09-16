// Ejercicio 35: Triángulo de Pascal

import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas del triángulo de Pascal: ");
        int filas = scanner.nextInt();
        int[][] pascal = new int[filas][filas];
        for (int i = 0; i < filas; i = i + 1) {
            pascal[i][0] = 1;
            for (int p = 1; p <= i; p = p + 1) {
                pascal[i][p] = pascal[i - 1][p - 1] + pascal[i - 1][p];
            }
        }
        System.out.println("Triángulo de Pascal:");
        for (int i = 0; i < filas; i = i + 1) {
            for (int p = 0; p <= i; p = p + 1) {
                System.out.print(pascal[i][p] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}