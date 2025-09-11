// Ejercicio 16: para contar la cantidad de dígitos en un número entero

import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        int contador = 0;
        int temp = Math.abs(numero);
        
        if (temp == 0) {
            contador = 1;
        } else {
            while (temp > 0) {
                contador = contador + 1;
                temp = temp / 10;
            }
        }
        
        System.out.println("El número " + numero + " tiene " + contador + " dígitos");
        
        scanner.close();
    }
}