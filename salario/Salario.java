package salario;

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
