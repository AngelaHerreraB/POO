
public class Alumno {
    String nombre, matricula, correo, telefono;
    Calificaciones [] cals;

    public Alumno(String nombre, String matricula, String correo, String telefono, Calificaciones[] calificaciones){
        setNombre(nombre);
        setMatricula(matricula);
        setCorreo(correo);
        setTelefono(telefono);
        setCalificaciones(calificaciones);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre =  nombre;
    }

    public void setMatricula(String tel){
        telefono = tel;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setTelefono(String nombre){
        this.nombre =  nombre;
    }

    public void setCalificaciones(Calificaciones[] cals){
        this.cals = cals;
    }

}