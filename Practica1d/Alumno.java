
public class Alumno {
    String nombre;
    String matricula;
    String correo;
    String telefono;
    Calificaciones[] cals;

    public Alumno(String nombre, String matricula, String correo, String telefono, Calificaciones[] calificaciones) {
        setNombre(nombre);
        setMatricula(matricula);
        setCorreo(correo);
        setTelefono(telefono);
        setCalificaciones(calificaciones);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCalificaciones(Calificaciones[] cals) {
        this.cals = cals;
    }

    public Calificaciones[] getCalificaciones() {
        return cals;
    }

    public static void mostrarAlumnos(Alumno[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nNombre: " + datos[i].getNombre() + "\nMatricula: " + datos[i].getMatricula()
                    + "\nCorreo: " + datos[i].getCorreo() + "\nTelefono: " + datos[i].getTelefono() + "\n");
            Calificaciones.mostrarCalificaciones(datos[i].getCalificaciones());
        }
    }

    public static void AlumnoCalBaja(Alumno[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nNombre: " + datos[i].getNombre());
            Calificaciones.MostrarBaja(datos[i].getCalificaciones());
        }
    }

    public static void AlumnoCalAlta(Alumno[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nNombre: " + datos[i].getNombre());
            Calificaciones.MostrarAlta(datos[i].getCalificaciones());
        }
    }

    public static void AlumnoProm(Alumno[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nNombre: " + datos[i].getNombre());
            Calificaciones.MostrarProm(datos[i].getCalificaciones());
        }
    }
}
