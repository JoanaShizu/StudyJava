package horasExtra;

public class Trabalho {
    Double salarioMensal;
    Double horasExtras;

    Trabalho() {
        salarioMensal = 0.0;
        horasExtras = 0.0;
    }

    Trabalho(Double salarioMensal, Double horasExtras) {
        this.salarioMensal = salarioMensal;
        this.horasExtras = horasExtras;
    }

    Double calcularSalario() {
        return salarioMensal;
    }

    Double calcularSalario(Double valorHoraExtra) {
        Double valor = salarioMensal + (horasExtras * valorHoraExtra);
        return valor;
    }
}
