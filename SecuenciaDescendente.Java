import java.util.Scanner;

public class SecuenciaDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("El número debe ser positivo");
            return;
        }
        
        System.out.println("Secuencia descendente:");
        for (int i = numero; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}