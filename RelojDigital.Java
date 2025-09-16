// Ejercicio 37: Reloj digital

public class RelojDigital {
    public static void main(String[] args) {
        for (int hora = 0; hora < 24; hora = hora + 1) {
            for (int minuto = 0; minuto < 60; minuto = minuto + 1) {
                for (int segundo = 0; segundo < 60; segundo = segundo + 1) {
                    System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
                }
            }
        }
    }
}