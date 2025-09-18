// Ejercicio 41: Numero Magico

import java.util.Scanner;

public class NumeroMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (esNumeroMagico(numero)) {
            System.out.println(numero + " es un número mágico");
        } else {
            System.out.println(numero + " NO es un número mágico");
        }
    }
    
    public static boolean esNumeroMagico(int numero) {
        int suma = numero;
        
        while (suma >= 10) {
            int temp = suma;
            suma = 0;
            
            while (temp > 0) {
                suma = suma + (temp % 10);
                temp = temp / 10;
            }
        }
        
        return suma == 1;
    }
}