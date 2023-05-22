package aluno;

public class Aluno {
    int matricula;
    String nome;

    Aluno() {
        matricula = 0;
        nome = "";
    }

    Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}
