
package testaestudante;
import java.util.ArrayList;

public class Estudante {
    String nome;
    int idade;
    ArrayList<String> disciplinas;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibirDisciplinas() {
        System.out.println("Disciplinas de " + nome + ": " + disciplinas);
    }
}

