// Ejercicio 32: Contador de dígitos

import java.util.Scanner;

public class ContadorDigitos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador = contador + 1;
        }
        System.out.println("El número tiene " + contador + " dígitos.");
        scanner.close();
    } 
}   