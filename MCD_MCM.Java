// Ejercicio 29: para calcular el MCD y MCM de dos números

import java.util.Scanner;

public class MCD_MCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primer número: ");
        int a = scanner.nextInt();
        System.out.print("Segundo número: ");
        int b = scanner.nextInt();
        
        int num1 = a;
        int num2 = b;
        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        int mcd = num1;
        int mcm = (a * b) / mcd;
        
        System.out.println("MCD: " + mcd);
        System.out.println("MCM: " + mcm);
        scanner.close();
    }
}