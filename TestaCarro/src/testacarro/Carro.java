
package testacarro;
public class Carro {
    String marca;
    String modelo;
    int ano;
    int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        velocidade += valor;
    }

    public void desacelerar(int valor) {
        velocidade = Math.max(0, velocidade - valor);
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
