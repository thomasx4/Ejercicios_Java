// Ejercicio 47: Contar los dígitos de un número positivos, negativos y ceros
import java.util.Scanner;

public class ContadorDigitos_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        while (numero != 0) {
            int digito = numero % 10;
            if (digito == 0) {
                ceros = ceros + 1;
            } else if (digito > 0) {
                positivos = positivos + 1;
            } else {
                negativos = negativos + 1;
            }
            numero /= 10;
        }

        System.out.println("Dígitos positivos: " + positivos);
        System.out.println("Dígitos negativos: " + negativos);
        System.out.println("Dígitos ceros: " + ceros);
    }
}


