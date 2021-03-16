public class Theblues extends Pajaro {

    public Theblues(String nombre, String color, String tamanio) {
        super(nombre, color, tamanio);
    }

    public void multiplicarse() {
        system.out.println("El ataque de " + getNombre() + " es multiplicarse por 3");
    }
}
