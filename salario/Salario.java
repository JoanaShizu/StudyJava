package salario;

/*Escreva uma classe para representar um programador horista (que trabalha por horas).
A classe deve ter os campos valorHora e horasTrabalhadas. Deve, também, ter o
método calcularSalario( ) que retorna o valor a receber pelo programador (horas
trabalhadas multiplicadas pelo valor da hora). Crie um método main( ) para instanciar
objeto(s) e testar. */
public class Salario {
    Double valorHora;
    Double horasTrabalhadas;

    Salario() {
        valorHora = 0.0;
        horasTrabalhadas = 0.0;
    }

    Salario(Double valorHora, Double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    Double calcularSalario() {
        Double salarioFinal = valorHora * horasTrabalhadas;
        return salarioFinal;
    }
}
