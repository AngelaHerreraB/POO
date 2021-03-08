import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Alumno al = null;
        String nombre;
        String matricula;
        String correo;
        String telefono;
        Calificaciones[] cals =  null;
        int o;

        do {
            System.out.println("Operaciones a realizar:");
            System.out.println("1-Capturar datos del alumno");
            System.out.println("2-Calificaciones");
            System.out.println("3-Calificacion mas baja");
            System.out.println("4-Calificacion mas alta");
            System.out.println("5-Promedio");
            System.out.println("6-Salir");
            System.out.println("Opcion:");
            o = sc.nextInt();
            switch (o) {
                case 1:
                    nombre = DatosAlumno.capturarDatos("Nombre");
                    matricula = DatosAlumno.capturarDatos("Matricula");
                    correo = DatosAlumno.capturarDatos("Correo");
                    telefono = DatosAlumno.capturarDatos("Telefono");
                    cals = DatosAlumno.capturarCalificaciones("Numero de cals");

                    al = new Alumno(nombre, matricula, correo, telefono, cals);
                    break;
                case 2:
                    System.out.println("Alumno: " + al.getNombre());
                    Calificaciones.mostrarCalificaciones(cals);
                    break;
                case 3:
                    Calificaciones.MostrarBaja(cals);
                    break;
                case 4:
                    Calificaciones.MostrarAlta(cals);
                    break;
                case 5:
                    Calificaciones.MostrarProm(cals);
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
