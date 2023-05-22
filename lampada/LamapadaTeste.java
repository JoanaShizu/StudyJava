package lampada;

public class LamapadaTeste {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        System.out.println(lampada.mostrarEstado());

        lampada.ligar();
        System.out.println(lampada.mostrarEstado());

        lampada.desligar();
        System.out.println(lampada.mostrarEstado());
    }
}
