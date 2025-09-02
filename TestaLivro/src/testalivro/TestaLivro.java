
package testalivro;
public class TestaLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 300, 2);
        l1.exibirInfo();
        l1.emprestar();
        l1.exibirInfo();
        l1.devolver();
        l1.exibirInfo();
    }
}

