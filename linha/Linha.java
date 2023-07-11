package linha;

public class Linha {
    int comprimento;

    public Linha() {
        comprimento = 0;
    }

    public Linha(int comprimento) {
        this.comprimento = comprimento;
    }

    public void desenhar() {
        for (int i = 0; i < comprimento; i++) {
            System.out.print("-");
        }
    }
}
