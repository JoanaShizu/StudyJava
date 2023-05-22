package lampada;

public class Lampada {
    boolean acesa;

    Lampada() {
        acesa = false;
    }

    void ligar() {
        acesa = true;
    }

    void desligar() {
        acesa = false;
    }

    String mostrarEstado() {
        if (acesa == true) {
            return "acesa";
        } else {
            return "apagada";
        }
    }
}
