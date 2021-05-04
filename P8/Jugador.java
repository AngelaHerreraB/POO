import java.util.Scanner;

public class Jugador {
    Scanner sc = new Scanner(System.in);
    String nombre;
    int numUniforme;
    String posicion;
    int puntos;
    float estatura;

    public Jugador(String nombre, int numUniforme, String posicion, int puntos, float estatura) {
        this.nombre = nombre;
        this.numUniforme = numUniforme;
        this.posicion = posicion;
        this.puntos = puntos;
        this.estatura = estatura;
    }

    public void registrarjugador() {
        System.out.println("\nNombre: ");
        nombre = sc.next();
        System.out.println("Numero de uniforme: ");
        numUniforme = sc.nextInt();
        System.out.println("Posicion: ");
        posicion = sc.next();
        System.out.println("Puntos anotados: ");
        puntos = sc.nextInt();
        System.out.println("Estatura: ");
        estatura = sc.nextFloat();
    }

}
