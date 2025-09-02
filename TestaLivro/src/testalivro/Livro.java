
package testalivro;

  public class Livro {
    String titulo;
    String autor;
    int paginas;
    int exemplaresDisponiveis;

    public Livro(String titulo, String autor, int paginas, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Nenhum exemplar disponível.");
        }
    }

    public void devolver() {
        exemplaresDisponiveis++;
        System.out.println("Livro devolvido!");
    }

    public void exibirInfo() {
        System.out.println(titulo + " - " + autor + " | Exemplares disponíveis: " + exemplaresDisponiveis);
    }
}
  

