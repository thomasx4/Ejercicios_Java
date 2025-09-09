import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 1) {
            System.out.println("No es un número primo");
            return;
        }
        
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i = i + 1) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
        
        scanner.close();
    }
}