// Ejercicio 51: Numeros Primos.

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("El numero debe ser un entero positivo.");
        } else {
            if (esPrimo(numero)) {
                System.out.println(numero + " es un numero primo.");
            } else {
                System.out.println(numero + " no es un numero primo.");
            }
        }
        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}