package plano_cartesiano;

public class Teste {
    public static void main(String[] args) {
        Robo r = new Robo("Joana", new Ponto(1, 2));
        Robo r2 = new Robo("Felipe", new Ponto(1, 3));

        r.posicao();
        r.sobe();
        r.posicao();
        r2.posicao();

        System.out.println(r.colide(r, r2));
    }
}
