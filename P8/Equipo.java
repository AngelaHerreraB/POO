import java.util.Scanner;

public class Equipo {
    Scanner sc = new Scanner(System.in);
    String nombre;
    String division;
    String entrenador;
    int numTorneos;
    int victorias;
    int derrotas;
    Jugador[] jugador = new Jugador[10];

    public Equipo() {
        registrarEquipo();
    }

    public void registrarEquipo() {
        System.out.println("\nNombre: ");
        this.nombre = sc.next();
        System.out.println("Division: ");
        this.division = sc.next();
        System.out.println("Entrenador: ");
        this.entrenador = sc.next();
        System.out.println("No. Participacion en torneos: ");
        this.numTorneos = sc.nextInt();
        System.out.println("Partidos ganados: ");
        this.victorias = sc.nextInt();
        System.out.println("Partidos perdidos: ");
        this.derrotas = sc.nextInt();
        registrarJugadores(jugador);
    }

    public void registrarJugadores(Jugador jugador) {
        for (Jugador a : jugador) {
            a.registrarJugador();
        }
    }

    public int jugadores(Jugador jugador) {
        int aux = 0;
        for (Jugador a : jugador) {
            System.out.println("\nNombre jugador: " + a.nombre);
            System.out.println("Numero de uniforme: " + a.numUniforme + "\n");
            aux = aux + 1;
        }
        return aux;
    }

    public int puntosEquipo(Jugador jugador) {
        int aux = 0;
        for (Jugador a : jugador) {
            aux = aux + a.puntos;
        }
        return aux;
    }
}
