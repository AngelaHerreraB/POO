import java.util.Scanner;

public class Menu {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        RobotChef c = new RobotChef();
        Asistente1 a1 = new Asistente1();
        Asistente2 a2 = new Asistente2();
        int o;
        int op = 0;
        boolean auxIngre = false;
        boolean auxCortar = false;
        boolean auxCocinar = false;
        boolean auxServir = false;
        int batChef = 100;
        int batAs1 = 100;
        int batAs2 = 100;

        do {
            if (auxServir == true) {
                auxIngre = false;
                auxCortar = false;
                auxCocinar = false;
            }
            System.out.println("\nRobot a controlar:");
            System.out.println("1-Robot chef");
            System.out.println("2-Mini robot con cuchillos");
            System.out.println("3-Mini robot con manos para cocinar");
            System.out.println("4-Cerrar");
            System.out.println("Opcion:");
            o = sc.nextInt();
            if (o >= 1 && o <= 3) {
                do {
                    System.out.println("\nAcciones a realizar:");
                    System.out.println("1-Tomar ingredientes");
                    System.out.println("2-Picar ingredientes");
                    System.out.println("3-Cocinar el guisado");
                    System.out.println("4-Servir");
                    System.out.println("Opcion:");
                    op = sc.nextInt();
                } while (op < 1 && op > 4);
            }

            switch (o) {
            case 1:
                batChef = c.identificacion(batChef, "Robot Chef", "Encargado de cocina");
                switch (op) {
                case 1:
                    auxIngre = c.ingredientes();
                    break;
                case 2:
                    auxCortar = c.picar(auxIngre);
                    break;
                case 3:
                    auxCocinar = c.cocinar(auxIngre, auxCortar);
                    break;
                case 4:
                    auxServir = c.servir(auxIngre, auxCortar, auxCocinar);
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                }
                break;
            case 2:
                batAs1 = a1.identificacion(batAs1, "Asistente 1", "Encargado de cortar");
                if (op == 2) {
                    auxCortar = a1.picar(auxIngre);
                } else {
                    c.equivocacion();
                }
                break;
            case 3:
                batAs2 = a2.identificacion(batAs2, "Asistente 2", "Encargado de cocinar");
                if (op == 3) {
                    auxCocinar = a2.cocinar(auxIngre, auxCortar);
                } else {
                    c.equivocacion();
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opcion no valida\n");
                break;
            }
        } while (o != 4);

    }
}