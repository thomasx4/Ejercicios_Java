// Ejercicio 44: Eliminar Duplicados en un Arreglo

import java.util.Scanner;
import java.util.ArrayList;

public class EliminarDuplicadosArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        int[] sinDuplicados = eliminarDuplicados(arreglo);
        
        System.out.println("\nArreglo original:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n\nArreglo sin duplicados:");
        for (int num : sinDuplicados) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] eliminarDuplicados(int[] arreglo) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int num : arreglo) {
            if (!lista.contains(num)) {
                lista.add(num);
            }
        }
        
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i = i + 1) {
            resultado[i] = lista.get(i);
        }
        
        return resultado;
    }
}