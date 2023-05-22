package livro;

public class Livro {
    String titulo;
    int paginas;
    String editora;
    Autor autor;

    Livro() {
        titulo = "";
        paginas = 0;
        editora = "";
        autor = new Autor();
    }

    Livro(String titulo, int paginas, String editora, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.editora = editora;
        this.autor = autor;
    }
}
