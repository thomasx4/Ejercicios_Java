// Ejercicios 43: Conversor de Segundos a Horas, Minutos y Segundos

import java.util.Scanner;

public class ConversorSegundosHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de segundos: ");
        int segundosTotales = scanner.nextInt();
        
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        
        String formato = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Tiempo: " + formato);
    }
}