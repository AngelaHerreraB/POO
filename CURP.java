import java.util.Scanner;
import java.util.Random;

public class CURP {
    String nombre;
    String apellidos;
    String curp;
    String estado;
    String S;
    Scanner sc = new Scanner(System.in);
    int cadena = length(apellidos);

    public CURP(String nombre, String apellidos, String curp, String estado, String S) {
        this.nombre = nombre;
        this.curp = curp;
        this.estado = estado;
        this.apellidos = apellidos;
        this.S = S;
    }

    public void ObtenerCURP() {
        String aux;
        int c = 0;
        int v = 0;
        for (int i; i < cadena; i++) {
            if (i == 0) {
                aux = charAt(i);
                c = c + 1;
            }
            if (apellidos.charAt(i) == 'a' || apellidos.charAt(i) == 'e' || apellidos.charAt(i) == 'i'
                    || apellidos.charAt(i) == 'o' || apellidos.charAt(i) == 'u' && c == 1) {
                aux = aux + apellidos.charAt(i);
                c = c + 1;
            }
            if (apellidos.charAt(i - 1) == ' ') {
                aux = aux + apellidos.charAt(i);
            }
            aux = aux + nombre.charAt(0);
        }
        curp = aux + curp;
        c = 0;
        for (int i; i < cadena; i++) {
            if (apellidos.charAt(i) != 'a' && apellidos.charAt(i) != 'e' && apellidos.charAt(i) != 'i'
                    && apellidos.charAt(i) != 'o' && apellidos.charAt(i) != 'u' && c == 0) {
                aux = apellidos.charAt(i);
                c = c + 1;
            }
            if (apellidos.charAt(i) == ' ') {
                c = c + 1;
            }
            if (apellidos.charAt(i) != 'a' && apellidos.charAt(i) != 'e' && apellidos.charAt(i) != 'i'
                    && apellidos.charAt(i) != 'o' && apellidos.charAt(i) != 'u' && c == 2) {
                aux = aux + apellidos.charAt(i);
            }
        }
        cadena = length(nombre);
        c = 0;
        for (int i; i < cadena; i++) {
            if (nombre.charAt(i) != 'a' && nombre.charAt(i) != 'e' && nombre.charAt(i) != 'i' && nombre.charAt(i) != 'o'
                    && nombre.charAt(i) != 'u' && c == 0) {
                aux = aux + nombre.charAt(i);
                c = c + 1;
            }
        }
        curp = curp + aux;
        Random gen = new Random();
        aux = (int) (gen.nextInt(99));
        curp = curp + aux;
        System.out.println("CURP: " + curp);
    }

    public void CapturarDatos() {
        curp = curp + S + estado;
    }

}