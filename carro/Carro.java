package carro;
/*Crie uma classe chamada Carro com os campos marca, modelo, ano de fabricação e
velocidade. Crie um construtor vazio e um construtor que receba argumentos, exceto
velocidade, que deve iniciar em 0. A classe deve ter os métodos:
- acelerar( ), que incrementa a velocidade em 1
- frear( ), que decrementa a velocidade em 1
Restrições: a velocidade não pode ficar negativa nem ultrapassar 200 km/h. */

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
