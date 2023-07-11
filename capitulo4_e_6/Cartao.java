package capitulo4_e_6;

/*Café é um produto muito apreciado por programadores. Sabendo disso, a empresa
ProgExpress lançou uma máquina de café que trabalha com cartões pré-pagos. O
sistema funciona da seguinte maneira: o cliente adquire um cartão, inicialmente com
10 unidades (10 cafés). A cada café retirado da máquina, o saldo do cartão é
decrementado. O cliente pode comprar mais cafés (carregar o cartão) com uma
quantidade qualquer de unidades.
a) Crie uma classe chamada Cartao, com o atributo saldo.
b) Crie um construtor vazio para a classe Cartao que inicialize o atributo saldo com
10.
c) Crie um método chamado carregar( ) que recebe como parâmetro um inteiro
correspondente à quantidade de créditos que estão sendo carregados. O método
soma estes créditos ao saldo anterior.

d) Crie um método chamado utilizar( ) que decrementa o saldo em uma unidade.
e) Crie um programa com casos de teste */
public class Cartao {
    private int saldo;

    public Cartao() {
        saldo = 10;
    }

    public int carregar(int credito) {
        saldo += credito;
        return saldo;
    }

    public int utilizar() {
        saldo--;
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
}
