// Ejercicio 54: Palindromo.

import java.util.Scanner;

public class Palindromo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        if (esPalindromo(texto)) {
            System.out.println("\"" + texto + "\" es un palindromo.");
        } else {
            System.out.println("\"" + texto + "\" no es un palindromo.");
        }
        scanner.close();
    }

    public static boolean esPalindromo(String str) {
        String limpio = str.replaceAll("[\\W]", "").toLowerCase();
        int izquierda = 0;
        int derecha = limpio.length() - 1;
        while (izquierda < derecha) {
            if (limpio.charAt(izquierda) != limpio.charAt(derecha)) {
                return false;
            }
            izquierda = izquierda + 1;
            derecha = derecha - 1;
        }
        return true;
    }
}