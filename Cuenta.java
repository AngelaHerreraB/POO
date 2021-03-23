import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private long saldo;
    private int pin;

    public Cuenta(String nombre, long saldo, int pin) {
        setNombre(nombre);
        setSaldo(saldo);
        setPIN(pin);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setPIN(int pin) {
        this.pin = pin;
    }

    public int getPIN() {
        return pin;
    }

    public void Retirar(int canti) {
        if (canti > saldo) {
            System.out.println("Sin fondos suficientes");
        } else {
            saldo = saldo - canti;
            System.out.println("Retiro completado");
        }
    }

    public void Depositar(int canti) {
        saldo = saldo + canti;
        System.out.println("Deposito completado");
    }

}
