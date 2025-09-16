// Ejercicio 33: Conversor de enteros a binario

import java.util.Scanner;

public class ConversorBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        String binario = "";
        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                int residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }
        }
        System.out.println("El número en binario es: " + binario);
        scanner.close();
    }
}