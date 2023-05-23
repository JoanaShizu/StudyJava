package plano_cartesiano;

public class Robo {
    private String nome;
    private Ponto ponto;

    public Robo() {
        nome = "";
        ponto = new Ponto();
    }

    public Robo(String nome, Ponto ponto) {
        this.nome = nome;
        this.ponto = ponto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void direita() {
        ponto.setX(ponto.getX() + 1);
    }

    public void esquerda() {
        ponto.setX(ponto.getX() - 1);
    }

    public void sobe() {
        ponto.setY(ponto.getY() + 1);
    }

    public void desce() {
        ponto.setY(ponto.getY() - 1);
    }

    public void teletransporte(int x, int y) {
        ponto.setX(x);
        ponto.setY(y);
    }

    public void posicao() {
        System.out.println(ponto.getX() + "," + ponto.getY());
    }

    public boolean colide(Robo a, Robo b) {
        if (a.getPonto().getX() == b.getPonto().getX()) {
            if (a.getPonto().getY() == b.getPonto().getY()) {
                return true;
            }
        }
        return false;
    }
}
