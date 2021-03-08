
public class Calificaciones {
    String nombreMat;
    int cal;

    public Calificaciones(String materia, int calificacion) {
        setMateria(materia);
        setCalificacion(calificacion);
    }

    public void setMateria(String materia) {
        this.nombreMat = materia;
    }

    public String getMateria() {
        return nombreMat;
    }

    public void setCalificacion(int cal) {
        this.cal = cal;
    }

    public int getCalificacion() {
        return cal;
    }

    public static void mostrarCalificaciones(Calificaciones[] califs) {
        for (int i = 0; i < califs.length; i++) {
            System.out.println(
                    "Materia: " + califs[i].getMateria() + "\nCalificacion" + califs[i].getCalificacion() + "\n");
        }
    }

    public static void MostrarBaja(Calificaciones[] califs) {
        int aux = 0;
        for (int i = 1; i < califs.length; i = i + 1) {
            if (califs[i].getCalificacion() < califs[aux].getCalificacion()) {
                aux = i;
            }
        }
        System.out.println("Calificacion mas baja: " + califs[aux].getCalificacion() + "\nMateria" + califs[aux].getMateria());
    }

    public static void MostrarAlta(Calificaciones[] califs) {
        int aux = 0;
        for (int i = 1; i < califs.length; i = i + 1) {
            if (califs[i].getCalificacion() > califs[aux].getCalificacion()) {
                aux = i;
            }
        }
        System.out.println("Calificacion mas alta: " + califs[aux].getCalificacion() + "\nMateria: " + califs[aux].getMateria());
    }

    public static void MostrarProm(Calificaciones[] califs) {
        float promedio = 0;
        for (int i = 0; i < califs.length; i = i + 1) {
            promedio = promedio + califs[i].getCalificacion();
        }
        promedio = promedio / califs.length;
        System.out.println("Promedio: " + promedio);
    }

}
