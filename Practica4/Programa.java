
public class Programa {
    public static void main(String args[]) {
        Bubbles p1 = new Bubbles();
        Theblues p2 = new Theblues();
        Terence p3 = new Terence();
        Pajaro[] pajaros = new Pajaro[] { p1, p2, p3 };

        p1.setNombre("Bubbles");
        p1.setColor("Naranja");
        p1.setTamanio("Normal");
        p2.setNombre("The blues");
        p2.setColor("Azul");
        p2.setTamanio("Pequeño");
        p3.setNombre("Terence");
        p3.setColor("Rojo");
        p3.setTamanio("Grande");
        p1.ImprimirPajaro();
        p2.ImprimirPajaro();
        p3.ImprimirPajaro();
    }

}
