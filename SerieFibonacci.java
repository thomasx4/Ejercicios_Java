// Ejercicio 8: Serie de Fibonacci

import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de términos de la serie de Fibonacci que desea ver: ");

        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: " + a + ", " + b);
        for (int i = 3; i <= n; i = i + 1) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
        scanner.close();
    }
    
}
