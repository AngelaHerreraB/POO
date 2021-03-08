import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Alumno[] al = null;
        int o;

        do {
            System.out.println("\nOperaciones a realizar:");
            System.out.println("1-Capturar datos del alumno");
            System.out.println("2-Calificaciones de alumnos");
            System.out.println("3-Calificacion mas baja de cada alumno");
            System.out.println("4-Calificacion mas alta de cada alumno");
            System.out.println("5-Promedio de cada alumno");
            System.out.println("6-Salir");
            System.out.println("Opcion:");
            o = sc.nextInt();
            switch (o) {
            case 1:
                al = DatosAlumno.capturarGrupo("Numero de alumnos");
                break;
            case 2:
                Alumno.mostrarAlumnos(al);
                break;
            case 3:
                Alumno.AlumnoCalBaja(al);
                break;
            case 4:
                Alumno.AlumnoCalAlta(al);
                break;
            case 5:
                Alumno.AlumnoProm(al);
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        } while (o != 6);

    }

}
