// Ejercicio 3: Contador Positivo, Negativo y Cero 

import java.util.Scanner;   

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        int contadorCero = 0;

        for (int i = 1; i <= 5; i++) {
            
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivo++;
            } else if (numero < 0) {
                contadorNegativo++;
            } else {
                contadorCero++;
            }
        }

        System.out.println("Cantidad de números positivos: " + contadorPositivo);
        System.out.println("Cantidad de números negativos: " + contadorNegativo);
        System.out.println("Cantidad de ceros: " + contadorCero);

        scanner.close();
    }
}
