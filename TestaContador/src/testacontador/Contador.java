
package testacontador;
public class Contador {
    int valor;

    public Contador() {
        this.valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public void exibirValor() {
        System.out.println("Valor atual: " + valor);
    }
}
