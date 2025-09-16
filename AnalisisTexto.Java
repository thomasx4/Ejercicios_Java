// Ejercicio 38: Análisis de texto

import java.util.Scanner;   

public class AnalisisTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        int longitud = texto.length();
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        int contadorEspacios = 0;
        for (int i = 0; i < longitud; i = i + 1
) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                char caracterMinuscula = Character.toLowerCase(caracter);
                if (caracterMinuscula == 'a' || caracterMinuscula == 'e' || caracterMinuscula == 'i' || caracterMinuscula == 'o' || caracterMinuscula == 'u') {
                    contadorVocales = contadorVocales + 1;
                } else {
                    contadorConsonantes = contadorConsonantes + 1;
                }
            } else if (Character.isWhitespace(caracter)) {
                contadorEspacios = contadorEspacios + 1;
            }
        }
        System.out.println("Longitud del texto: " + longitud);
        System.out.println("Número de vocales: " + contadorVocales);
        System.out.println("Número de consonantes: " + contadorConsonantes);
        System.out.println("Número de espacios: " + contadorEspacios);
        scanner.close();
    }
}