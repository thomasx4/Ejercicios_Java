// Ejercicio 13: para calcular el promedio de notas y determinar si aprueba o reprueba

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.print("Ingresa la nota " + i + " (0-5): ");
            double nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 5) {
                System.out.println("Nota inválida. Debe estar entre 0 y 5.");
                i = i - 1;
                continue;
            }
            
            suma = suma + nota;
        }
        
        double promedio = suma / 5;
        System.out.println("Promedio: " + promedio);
        
        if (promedio >= 3.0) {
            System.out.println("¡Aprueba!");
        } else {
            System.out.println("Reprueba");
        }
        
        scanner.close();
    }
}