// Ejercicio N-Reinas: Colocar N reinas en un tablero NxN sin que se ataquen

import java.util.Scanner;

public class NxN_Reina {

    static int N;
    static int[][] tablero;
    // Para acelerar las comprobaciones:
    static boolean[] columnas;     // columnas ocupadas
    static boolean[] diag1;        // diagonales (row + col)
    static boolean[] diag2;        // diagonales (row - col + N - 1)
    static boolean solucionEncontrada = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N (número de reinas): ");
        N = scanner.nextInt();
        scanner.close();

        tablero = new int[N][N];
        columnas = new boolean[N];
        diag1 = new boolean[2 * N];            // índices 0..2N-1 suficientes
        diag2 = new boolean[2 * N];

        // Buscar una solución (puedes cambiar a buscarTodas las soluciones)
        placeQueen(0);

        if (!solucionEncontrada) {
            System.out.println("No existe solución para N = " + N);
        }
    }

    // Intenta colocar una reina en la fila 'row'
    static void placeQueen(int row) {
        if (row == N) {
            // Todas las reinas colocadas: imprimir solución
            imprimirTablero();
            solucionEncontrada = true;
            return;
        }

        for (int col = 0; col < N && !solucionEncontrada; col++) { // detenemos al encontrar la 1ra solución
            if (esSeguro(row, col)) {
                // Colocar reina
                tablero[row][col] = 1;
                columnas[col] = true;
                diag1[row + col] = true;
                diag2[row - col + (N - 1)] = true;

                // Llamada recursiva a la siguiente fila
                placeQueen(row + 1);

                // Backtrack (si no se encontró solución en niveles siguientes)
                if (!solucionEncontrada) {
                    tablero[row][col] = 0;
                    columnas[col] = false;
                    diag1[row + col] = false;
                    diag2[row - col + (N - 1)] = false;
                }
            }
        }
    }

    static boolean esSeguro(int row, int col) {
        if (columnas[col]) return false;
        if (diag1[row + col]) return false;
        if (diag2[row - col + (N - 1)]) return false;
        return true;
    }

    static void imprimirTablero() {
        System.out.println("Solución para N = " + N + ":");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}