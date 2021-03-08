import java.util.Scanner;

public class Persona {
    public static void main(String args[]) {
        String nombre;
        String apellidos;
        String curp;
        String estado;
        String RFC;

        int o;
        Scanner sc = new Scanner(System.in);
        String S;

        System.out.println("\nNombre: ");
        nombre = sc.nextLine();
        System.out.println("\nApellidos: ");
        apellidos = sc.nextLine();
        System.out.println("Fecha de nacimiento (AAMMDD): ");
        curp = sc.nextLine();
        System.out.println("Estado donde nacio (Ejem. BC, CD...): ");
        estado = sc.nextLine();
        System.out.println("Sexo (M/F): ");
        S = sc.nextLine();
        CURP p1 = new CURP(nombre, apellidos, curp, estado, S);

        do {
            System.out.println("Operaciones a realizar:");
            System.out.println("1-CURP");
            System.out.println("2-RFC");
            System.out.println("3-Ambas");
            System.out.println("4-Salir");
            System.out.println("Opcion:");
            o = sc.nextInt();
            switch (o) {
                case 1:
                    p1.CapturarDatos();
                    p1.ObtenerCURP();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (o != 4);

    }
}
