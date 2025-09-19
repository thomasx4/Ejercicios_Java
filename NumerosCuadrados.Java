// Ejercicio 48: Serie de números cuadrados
// Mostrar la serie de los números cuadrados (1, 4, 9, 16, ...) hasta un número n.
import java.util.Scanner;

public class NumerosCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();

        System.out.println("Serie de números cuadrados:");
        for (int i = 1; i <= n; i = i + 1) {
            System.out.println(i * i);
        }
    }
}
