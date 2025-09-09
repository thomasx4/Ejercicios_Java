import java.util.Scanner;

public class palabraSecreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "java";
        String intento;
        int intentos = 0;
        
        System.out.println("¡Adivina la palabra secreta!");
        
        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextLine().toLowerCase();
            intentos++;
            
            if (intento.equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Adivinaste la palabra en " + intentos + " intentos");
            } else {
                System.out.println("Intenta de nuevo...");
            }
            
        } while (!intento.equals(palabraSecreta));
        
        scanner.close();
    }
}