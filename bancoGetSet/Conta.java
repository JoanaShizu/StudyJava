package bancoGetSet;

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, int agencia, double saldo) {

        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
     * Observe que o método getSaldo não foi implementado, pois não podemos
     * deixar a alteração do valor do saldo seja feito de qualquer maneira.
     * Outro detalhe foi a remoção do método verificarSaldo, que foi substituído
     * pelo método getSaldo, já que os dois tinham o mesmo comportamento.
     */
}
