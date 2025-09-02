
package testacarro;
public class TestaCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        c1.acelerar(50);
        c1.desacelerar(20);
        c1.exibirVelocidade();
    }
}
