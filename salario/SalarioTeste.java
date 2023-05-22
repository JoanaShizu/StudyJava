package salario;

public class SalarioTeste {
    public static void main(String[] args) {
        Salario trabalhador = new Salario();
        trabalhador.valorHora = 30.00;
        trabalhador.horasTrabalhadas = 40.00;

        System.out.println(trabalhador.calcularSalario());
    }
}
