import java.util.Scanner;

public class ReversaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        int reverso = 0;
        int original = numero;
        
        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero = numero / 10;
        }
        
        System.out.println("Número original: " + original);
        System.out.println("Número invertido: " + reverso);
        
        scanner.close();
    }
}