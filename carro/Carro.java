package carro;

public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    Carro() {
    }

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    void acelerar() {
        if (velocidade < 200) {
            velocidade++;
        }
    }

    void frear() {
        if (velocidade > 0) {
            velocidade--;
        }
    }
}
