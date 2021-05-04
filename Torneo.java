import java.util.Scanner;

public class Torneo {
    Scanner sc = new Scanner(System.in);
    String nombre;
    String region;
    int numEquipos;
    int pJugados;
    int pPendientes;
    Equipo[] equipo=new Equipo[numEquipos];;

    public Torneo() {
        registrarTorneo();
    }

    public void registrarTorneo() {
        System.out.println("\nNombre: ");
        this.nombre = sc.next();
        System.out.println("Region: ");
        this.region = sc.next();
        System.out.println("numEquipos: ");
        this.numEquipos = sc.nextInt();
        System.out.println("pJugados: ");
        this.pJugados = sc.nextInt();
        System.out.println("pPendientes: ");
        this.pPendientes = sc.nextInt();
        registr a rEquipos(equipos);
    }

    public void datosTorneo() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Region: " + region);
        System.out.println("numEquipos: " + numEquipos);
        System.out.println("pJugados: " + pJugados);
        System.out.println("pPendientes: " + pPendientes);
        System.out.println("\nEQUIPOS: \n");
        mostrarEquipos(equipos);

    }

    public void registrarEquipos(Equipo[] equipos) {
        for (Equipo a : equipos) {
            a.registrarEquipo();
        }
    }

    public void mostrarEquipos(Equipo[] equipos) {
        for (Equipo a : equipos) {
            System.out.println("\nNombre equipo: " + a.nombre);
            System.out.println("Division: " + a.division + "\n");
        }
    }
}
