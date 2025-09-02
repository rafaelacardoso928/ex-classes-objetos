
package testaestudante;
public class TestaEstudante {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Rafa", 16);
        e1.adicionarDisciplina("Matemática");
        e1.adicionarDisciplina("Portugues");
        e1.exibirDisciplinas();
    }
}

