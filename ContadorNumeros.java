// Ejercicio 3: Contador Positivo, Negativo y Cero 

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print("Ingrese número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                positivos = positivos + 1;
            } else if (numero < 0) {
                negativos = negativos + 1;
            } else {
                ceros = ceros + 1;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        scanner.close();
    }
}