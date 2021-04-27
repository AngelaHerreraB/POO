
public interface Acciones {
    public boolean servir(boolean ingre, boolean cortar, boolean cocer);

    public boolean ingredientes();

    public boolean cocinar(boolean ingre, boolean cortar);
}

public class Asistente1 extends RobotChef implements Acciones {
    public boolean servir(boolean ingre, boolean cortar, boolean cocer) {
        return false;
    }

    public boolean ingredientes() {
        return false;
    }

    public boolean cocinar(boolean ingre, boolean cortar) {
        return false;
    }
}
