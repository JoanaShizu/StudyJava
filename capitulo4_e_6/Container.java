package capitulo4_e_6;

/*Crie uma classe chamada Container, com os atributos:
a. capacidade (double): capacidade do container em metros quadrados
b. ocupado (boolean): se está ocupado ou não
Os atributos devem ser privados, com métodos get( ) e set( ) para cada um.
Crie dois construtores:
a. um que não recebe argumentos: inicia capacidade com 0.0 e ocupado
com false
b. um que recebe os valores para os atributos.
Crie o método ocupar( ), que recebe a medida (em m2
) do conteúdo. O
método deve:
a. mudar o valor de ocupado para true e retornar true, caso a medida
seja menor ou igual a capacidade e o container não esteja ocupado;
b. retornar false, caso a medida seja superior à capacidade ou o
container já esteja ocupado.
 */
public class Container {
    private double capacidade;
    private boolean ocupado;

    public Container() {
        capacidade = 0.0;
        ocupado = false;
    }

    public Container(double capacidade, boolean ocupado) {
        this.capacidade = capacidade;
        this.ocupado = ocupado;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    /*
     * Crie o método ocupar( ), que recebe a medida (em m2
     * ) do conteúdo. O
     * método deve:
     * a. mudar o valor de ocupado para true e retornar true, caso a medida
     * seja menor ou igual a capacidade e o container não esteja ocupado;
     * b. retornar false, caso a medida seja superior à capacidade ou o
     * container já esteja ocupado.
     */
    public boolean ocupar(double medida) {
        if (medida > capacidade || ocupado == true) {
            return false;
        } else {
            return true;
        }
    }
}
