// Ejercicio 12: para contar vocales y consonantes en una palabra

import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        
        int vocales = 0;
        int consonantes = 0;
        
        for (int i = 0; i < palabra.length(); i = i + 1) {
            char letra = palabra.charAt(i);
            if (Character.isLetter(letra)) {
                if (letra == 'a' || letra == 'e' || letra == 'i' || 
                    letra == 'o' || letra == 'u') {
                    vocales = vocales + 1;
                } else {
                    consonantes = consonantes + 1;
                }
            }
        }
        
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        
        scanner.close();
    }
}