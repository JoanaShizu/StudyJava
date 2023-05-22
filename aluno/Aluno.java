package aluno;
/*Crie uma classe chamada Aluno, com matricula e nome. Crie uma classe chamada
Dupla, com dois campos do tipo Aluno. A classe deve ter o método mostrarAlunos( )
que exibe na tela os nomes dos dois alunos da Dupla.
Mostre como instanciar um objeto da classe Dupla e atribuir valores aos campos dos
objetos dentro dela. Mostre como chamar o método mostrarAlunos( ). */

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
