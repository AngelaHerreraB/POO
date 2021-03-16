public class Bubbles extends Pajaro {

    public Bubbles(String nombre, String color, String tamanio) {
        super(nombre, color, tamanio);
    }

    public void expandirse() {
        system.out.println("El ataque de " + getNombre() + " es expandirse");
    }
}