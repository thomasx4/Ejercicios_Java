// Ejercicio 34: Suma de las diagonales de una matriz

import java.util.Scanner;

public class SumaDiagonalesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (3 x 3): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i = i + 1) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
        scanner.close();
    }
}