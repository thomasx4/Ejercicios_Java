// Ejercicio 53: Factorial.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero no negativo: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("El numero debe ser un entero no negativo.");
        } else {
            long resultado = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
        scanner.close();
    }

    public static long factorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}