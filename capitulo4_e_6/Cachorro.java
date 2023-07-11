package capitulo4_e_6;
/*Crie a classe Cachorro com os atributos raca e nome (Strings). Os atributos
devem ser privados, com métodos get( ) e set( ) para cada um. Crie três
construtores:
a. O primeiro sem parâmetros
b. O segundo deve receber apenas o nome. Neste caso, inicie a raca
como “indeterminada”.
c. O terceiro recebe raca e nome.
Crie um método latir( ), que não recebe parâmetros e imprime na tela a
mensagem “auau”. Crie o método latirRepetido( ) que recebe um inteiro como
parâmetro, correspondente ao número de vezes que será impresso na tela a
mensagem “auau”. Restrições: se o parâmetro for menor que zero, a
mensagem deve ser “bugou”; se for maior que 100, a mensagem deve ser
“parâmetro inválido”.
Crie o método main( ) em uma classe separada para testar */

public class Cachorro {
    private String raca;
    private String nome;

    public Cachorro() {
        raca = "";
        nome = "";
    }

    public Cachorro(String nome) {
        this.nome = nome;
        this.raca = "Indeterminado";
    }

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void Latir() {
        System.out.println("auau\n");
    }

    public void LatirRepetido(int n) {
        if (n < 0) {
            System.out.println("Bugou\n");
        } else if (n > 100) {
            System.out.println("Parametro invalido\n");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("auau\n");
            }
        }
    }
}
