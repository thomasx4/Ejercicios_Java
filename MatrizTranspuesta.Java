// Ejercicio 42: Matriz Transpuesta

import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese número de columnas: ");
        int columnas = scanner.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i = i + 1) {
            for (int j = 0; j < columnas; j = j + 1) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);
        
        int[][] traspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i = i + 1) {
            for (int j = 0; j < columnas; j = j + 1) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        System.out.println("\nMatriz traspuesta:");
        imprimirMatriz(traspuesta);
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i = i + 1) {
            for (int j = 0; j < matriz[0].length; j = j + 1) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}