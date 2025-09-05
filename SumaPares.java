// Ejercicio 6: Suma de Numeros Pares del 1 a n

public class SumaPares {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                suma = suma + i;
                System.out.println("Suma actual: " + suma);
            }
        }
    }
}
