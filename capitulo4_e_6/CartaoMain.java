package capitulo4_e_6;

public class CartaoMain {
    public static void main(String[] args) {
        Cartao c = new Cartao();
        System.out.println(c.getSaldo());
        c.utilizar();
        System.out.println(c.getSaldo());
        c.carregar(5);
        System.out.println(c.getSaldo());
    }
}
