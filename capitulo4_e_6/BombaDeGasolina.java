package capitulo4_e_6;

/*Crie uma classe BombaDeGasolina, com os atributos reservatorio (inicia com
5000), precoLitro (inicia em 5.20), litrosVendidos (inicia em 0), valorVendas
(inicia em 0). Crie o método abatecerPorLitro( ), que recebe a quantidade de
litros que o cliente quer abastecer, retira esta quantidade do reservatório,
adiciona em litrosVendidos e calcula e incrementa o valorVendas. Crie o
método abatecerPorDinheiro( ), que recebe a quantidade em reais que o
cliente quer abastecer, incrementa o valorVendas, faz o cálculo de quantos
litros vão ser retirados, retira esta quantidade do reservatório e adiciona em
litrosVendidos. Crie o método status( ), que retorna quantos litros tem no
reservatório. Para testar, instancie uma bomba de gasolina, faça uma venda
por litros, uma venda por quantidade de reais e depois mostre o status da
bomba. (Atributos devem ser privados com get( ) e set( ) para cada um)
 */
public class BombaDeGasolina {
    private double reservatorio;
    private double precoLitro;
    private double litrosVendidos;
    private double valorVendas;

    public BombaDeGasolina() {
        reservatorio = 5000;
        precoLitro = 5.20;
        litrosVendidos = 0;
        valorVendas = 0;
    }

    public void setReservatorio(double reservatorio) {
        this.reservatorio = reservatorio;
    }

    public double getReservatorio() {
        return reservatorio;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setLitrosVendidos(double litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }

    public double getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void abastecerPorLitro(double quantidade) {
        reservatorio -= quantidade;
        litrosVendidos += quantidade;
        valorVendas += quantidade * precoLitro;
    }

    public void abastecerPorDinheiro(double dinheiro) {
        valorVendas += dinheiro;
        reservatorio -= dinheiro / precoLitro;
        litrosVendidos += dinheiro / precoLitro;
    }

    public double status() {
        return reservatorio;
    }

    public static void main(String[] args) {
        BombaDeGasolina b = new BombaDeGasolina();
        b.abastecerPorDinheiro(5.0);
        b.abastecerPorLitro(2);
        System.out.println(b.status());
    }

}
