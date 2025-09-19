// Ejercicio 46: Leer una palabra y mostrarla al revés.
import java.util.Scanner;

public class PalabrasInversass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        String palabraInversa = new StringBuilder(palabra).reverse().toString();
        System.out.println("La palabra al revés es: " + palabraInversa);
    }
}
