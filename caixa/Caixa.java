package caixa;

public class Caixa {
    Double largura;
    Double altura;
    Double profundidade;

    Caixa() {
        largura = 0.0;
        altura = 0.0;
        profundidade = 0.0;
    }

    Caixa(Double largura, Double altura, Double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    Double calcularVolume() {
        Double volume = largura * altura * profundidade;
        return volume;
    }
}
