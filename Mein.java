package Demo;
import java.util.Random;
import java.util.Scanner;
public class Mein {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static int vectorX = rand.nextInt(1,11); // Posición inicial del jugador
    static int vectorY = rand.nextInt(1,9);
    int upperbound = 25;
    static char skin = 'C'; // Carácter que representa al jugador
    public static void main(String[] args) {
        char[][] rectangulo = Mapa(); // Obtener el mapa
        jugadorPrimer(rectangulo, vectorX, vectorY, skin);
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
    private static void imprimirMapa(char[][] rectangulo){
        for (int i = 0; i < rectangulo.length; i++) {
            for (int j = 0; j < rectangulo[i].length; j++) {
                System.out.print(rectangulo[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
    private static void jugador(char[][] rectangulo, int vectorX, int vectorY, char skin) {
        // Restaurar la posición anterior del jugador a un espacio en blanco
        rectangulo[vectorX][vectorY] = ' ';

        // Asignar la nueva posición del jugador en el mapa
        rectangulo[vectorX][vectorY] = skin;
        System.out.println("X: "+vectorX+"Y: "+vectorY);
    }
    private static void jugadorPrimer(char[][] rectangulo, int vectorX, int vectorY, char skin) {
        // Restaurar la posición anterior del jugador a un espacio en blanco
        rectangulo[vectorX][vectorY] = ' ';

        // Asignar la nueva posición del jugador en el mapa
        rectangulo[vectorX][vectorY] = skin;
        System.out.println("X: "+vectorX+"Y: "+vectorY);
    }
    private static void moverjugador() {
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Para moverse pulse w, a, s, d (arriba, izquierda, abajo, derecha)");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("w") || input.equals("a") || input.equals("s") || input.equals("d")) {
                entradaValida = true; // La entrada es válida, salimos del bucle
                moverJugadorSegunEntrada(input);
            } else {
                System.out.println("Entrada no válida. Por favor, introduzca w, a, s o d.");
            }
        }
    }
    private static void moverJugadorSegunEntrada(String input) {
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
        }
    }
}