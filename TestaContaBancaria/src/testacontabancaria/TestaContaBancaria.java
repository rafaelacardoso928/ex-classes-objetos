
package testacontabancaria;
public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Carlos", 12345);
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
    }
}
