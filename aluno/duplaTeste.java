package aluno;

public class duplaTeste {
    public static void main(String[] args) {
        Dupla dupla = new Dupla(new Aluno(1, "Maria"), new Aluno(2, "Jose"));

        dupla.mostrarAlunos();
    }
}
