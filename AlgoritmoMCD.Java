// Ejercicio 49: Calcular el máximo común divisor (MCD) de dos números enteros positivos.
import java.util.Scanner;

public class AlgoritmoMCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número entero positivo: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el segundo número entero positivo: ");
        int b = scanner.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("El máximo común divisor (MCD) es: " + a);
    }
}