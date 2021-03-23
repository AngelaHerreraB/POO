import java.util.Scanner;

public class CapturaCuenta {
    
    public static String capturarDatos(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        return (sc.nextLine());
    }

    public static long capturarSaldo(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        return (sc.nextLong());
    }

    public static int capturarEntero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": ");
        return (sc.nextInt());
    }

}
