// Ejercicio 11: para convertir temperatura de Celsius a Fahrenheit y Kelvin

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura en Kelvin: " + kelvin);
        
        scanner.close();
    }
}