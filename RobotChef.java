import java.util.Scanner;

public class RobotChef implements Acciones {
    Scanner sc = new Scanner(System.in);

    public void equivocacion() {
        System.out.println("\nMi asistente no puede realizar esa accion!\n");
    }

    public boolean ingredientes() {
        int num;
        boolean ingre = false;

        System.out.println("\nNumero de ingredientes: ");
        num = sc.nextInt();
        String[] ingredientes = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("\nIngrediente: ");
            ingredientes[i] = sc.next();
            if (i == num - 1) {
                ingre = true;
            }
        }
        return ingre;
    }

    public boolean picar(boolean ingre) {
        boolean picar = false;
        if (ingre == true) {
            picar = true;
            System.out.println("\nSe han cortado los ingredientes");
        } else {
            picar = false;
            System.out.println("\nHay un problema con los ingredientes!");
        }
        return picar;
    }

    public boolean cocinar(boolean ingre, boolean cortar) {
        boolean cocinar = false;
        if (ingre == true && cortar == true) {
            cocinar = true;
            System.out.println("\nSe cocino el guisado");
        } else {
            cocinar = false;
            System.out.println("\nHay un problema con los ingredientes!");
        }
        return cocinar;
    }

    public boolean servir(boolean ingre, boolean cortar, boolean cocer) {
        boolean servir = false;
        if (ingre == true && cortar == true && cocer == true) {
            System.out.println("\n¡Hurra! El plato estaba delicioso\n");
        } else {
            if (ingre == false) {
                System.out.println("\nNo se obtuvieron los ingredientes\n");
            }
            if (cortar == false) {
                System.out.println("\nNo se cortaron los ingredientes\n");
            }
            if (cocer == false) {
                System.out.println("\nNo se cocino el guisado\n");
            }
        }
        return true;
    }

    public int identificacion(int bat, String msg, String id) {

        System.out.println("\nRobot: " + msg);
        System.out.println("\nIdentificador: " + id);
        bat = bat - 5;
        System.out.println("\nBateria restante: " + bat);
        return bat;
    }

}
