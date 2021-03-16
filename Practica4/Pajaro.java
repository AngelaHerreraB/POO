
public class Pajaro {
    String nombre;
    String color;
    String tamanio;

    public Pajaro(String nombre, String color, String tamanio) {
        setNombre(nombre);
        setColor(color);
        setTamanio(tamanio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public static void ImprimirPajaro() {
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Tamaño: " + getTamanio());
    }
}