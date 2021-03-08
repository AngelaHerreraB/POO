import java.util.Scanner;

public class DatosAlumno {
    public static String capturarDatos(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        return (sc.nextLine());
    }

    public static int capturarEntero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        return (sc.nextInt());
    }

    public static Alumno[] capturarGrupo(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        int num = sc.nextInt();

        Alumno[] datos = new Alumno[num];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Alumno(capturarDatos("\nNombre alumno"), capturarDatos("Matricula"), capturarDatos("Correo"),
                    capturarDatos("Telefono"), capturarCalificaciones("Numero de cals"));
        }
        return datos;
    }

    public static Calificaciones[] capturarCalificaciones(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        int cals = sc.nextInt();

        Calificaciones[] califs = new Calificaciones[cals];

        for (int i = 0; i < califs.length; i++) {
            califs[i] = new Calificaciones(capturarDatos("Nombre de materia"), capturarEntero("Calificacion"));
        }

        return califs;
    }
}
