import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        
        System.out.print("Ingresa la letra a buscar: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);
        
        int contador = 0;
        
        for (int i = 0; i < frase.length(); i = i + 1) {
            if (frase.charAt(i) == letra) {
                contador = contador + 1;
            }
        }
        
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces");
        
        scanner.close();
    }
}