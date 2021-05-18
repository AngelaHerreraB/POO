
public class Promedio {
    public float calcularProm(int cal[]) {
        float prom = 0;
        for (int i = 0; i <= 7; i = i + 1) {
            prom = prom + cal[i];
        }
        prom = prom / 7;
        return prom;
    }
}
