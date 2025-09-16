// Ejercicio 31: Pirámide de asteriscos
import java.util.Scanner;   

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();
        for (int i = 1; i <= altura; i = i + 1) {
            for (int j = 1; j <= altura - i; j = j + 1) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}