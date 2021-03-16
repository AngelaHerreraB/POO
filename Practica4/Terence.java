public class Terence extends Pajaro {

    public Terence(String nombre, String color, String tamanio) {
        super(nombre, color, tamanio);
    }

    public void volumen() {
        system.out.println("El ataque de " + getNombre() + " es su volumen");
    }
}