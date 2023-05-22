package livro;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Java como programar";
        livro.paginas = 120;
        livro.editora = "London Press";
        livro.autor = new Autor("Schild", "Programação");
        System.out.println(livro.titulo);

        Livro livro2 = new Livro("C Como Programar", 200, "Elsevier", new Autor("Mordekay", "Programação"));
        System.out.println(livro2.titulo);

        Autor autor3 = new Autor("Rigby", "Ficção");
        Livro livro3 = new Livro("Aliens", 110, "Ovni", autor3);
        System.out.println(livro3.titulo);
    }

}
