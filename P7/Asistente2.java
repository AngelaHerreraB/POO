
public interface Acciones {
    public boolean servir(boolean ingre, boolean cortar, boolean cocer);

    public boolean ingredientes();

    public boolean picar(boolean ingre);
}

public class Asistente2 extends RobotChef implements Acciones {
    public boolean servir(boolean ingre, boolean cortar, boolean cocer) {
        return false;
    }

    public boolean ingredientes() {
        return false;
    }

    public boolean picar(boolean ingre) {
        return false;
    }
}