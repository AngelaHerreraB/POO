import java.lang.reflect.Array;
import java.util.Scanner;

public class Banco {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cuenta[] cl = null;
        int o;
        int aux = 0;

        String nombre;
        long saldo;
        int pin;

        do {
            System.out.println("1-Crear cuenta");
            System.out.println("2-Acceder a una cuenta");
            System.out.println("3-Salir");
            System.out.println("Opcion:");
            o = sc.nextInt();
            switch (o) {
            case 1:
                nombre = CapturaCuenta.capturarDatos("Nombre");
                saldo = CapturaCuenta.capturarSaldo("Saldo a depositar");
                pin = CapturaCuenta.capturarEntero("PIN de cuenta");
                cl = anadirCuenta(cl, nombre, saldo, pin);

                System.out.println("Registro exitoso\nNumero de cuenta: " + (cl.length - 1));
                break;
            case 2:
                System.out.println("Numero de cuenta: ");
                aux = sc.nextInt();
                System.out.println("PIN: ");
                if (cl[aux].getPIN() == sc.nextInt()) {
                    System.out.println("1-Depositar");
                    System.out.println("2-Retirar");
                    System.out.println("Opcion:");
                    switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Cantidad a depositar");
                        cl[aux].Depositar(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Cantidad a retirar");
                        cl[aux].Retirar(sc.nextInt());
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                    }
                } else
                    System.out.println("Acceso no permitido, datos incorrectos");
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        } while (o != 3);

    }

    public static Cuenta[] anadirCuenta(Cuenta[] cl, String nombre, long saldo, int pin) {

        if (cl == null) {
            cl = new Cuenta[1];
        }

        Cuenta[] nuevoArreglo = new Cuenta[cl.length + 1];

        for (int i = 0; i < cl.length; i++) {
            nuevoArreglo[i] = cl[i];
        }

        nuevoArreglo[cl.length] = new Cuenta(nombre, saldo, pin);

        return nuevoArreglo;
    }
}
