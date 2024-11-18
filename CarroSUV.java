public class CarroSUV extends Carro {
    private boolean tracao4x4;

    public CarroSUV(String marca, String modelo, boolean tracao4x4) {
        super(marca, modelo);
        this.tracao4x4 = tracao4x4;
    }

    public boolean isTracao4x4() {
        return tracao4x4;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tração 4x4=" + (tracao4x4 ? "Sim" : "Não");
    }
}
