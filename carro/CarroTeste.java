package carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.marca = "FIAT";
        car.modelo = "Uno";
        car.ano = 2021;

        System.out.println(car.velocidade);

        car.acelerar();
        System.out.println(car.velocidade);

        car.frear();
        System.out.println(car.velocidade);
    }
}
