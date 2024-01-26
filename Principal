package Demo;
import java.util.Scanner;
public class Mein {
    static Scanner sc = new Scanner(System.in);
    static int vectorX = 2; // Posición inicial del jugador
    static int vectorY = 2;
    static char skin = 'C'; // Carácter que representa al jugador
    public static void main(String[] args) {
        char[][] rectangulo = Mapa(); // Obtener el mapa
        do {
            jugador(rectangulo, vectorX, vectorY, skin); // Añadir al jugador al mapa
            imprimirMapa(rectangulo); // Imprimir el mapa con el jugador
            moverjugador();
        } while (true);
    }
    public static char[][] Mapa() {
        char[][] rectangulo = crearRectangulo(10, 20);
        imprimirMapa(rectangulo);
        return rectangulo;
    }
    private static char[][] crearRectangulo(int filas, int columnas) {
        char[][] rectangulo = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rectangulo[i][j] = (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) ? '*' : ' ';
            }
        }
        return rectangulo;
    }
    private static void imprimirMapa(char[][] rectangulo) {
        for (int i = 0; i < rectangulo.length; i++) {
            for (int j = 0; j < rectangulo[i].length; j++) {
                System.out.print(rectangulo[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
    private static void jugador(char[][] rectangulo, int vectorX, int vectorY, char skin) {
        rectangulo[vectorX][vectorY] = skin;
    }
    private static void moverjugador() {
        System.out.println("Para moverse pulse w, a, s, d (arriba, izquierda, abajo, derecha)");
        String input = sc.nextLine().toLowerCase(); // Convertir la entrada a minúsculas para simplificar la comparación
        if (input.equals("w")) {
            // Mover hacia arriba
            vectorX--;
        } else if (input.equals("a")) {
            // Mover hacia la izquierda
            vectorY--;
        } else if (input.equals("s")) {
            // Mover hacia abajo
            vectorX++;
        } else if (input.equals("d")) {
            // Mover hacia la derecha
            vectorY++;
        } else {
            System.out.println("Orden no reconocida, solo se admite w, a, s, d");
        }
    }
}
