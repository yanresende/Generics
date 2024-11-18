public class CarroEsportivo extends Carro {
    private int velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int velocidadeMaxima) {
        super(marca, modelo);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + ", Velocidade Máxima=" + velocidadeMaxima + " km/h";
    }
}
