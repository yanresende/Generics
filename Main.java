public class Main {
    public static void main(String[] args) {

        VeiculoGenerico<CarroEsportivo> listaEsportivos = new VeiculoGenerico<>();
        listaEsportivos.adicionarVeiculo(new CarroEsportivo("Ferrari", "488 Spider", 340));
        listaEsportivos.adicionarVeiculo(new CarroEsportivo("Lamborghini", "Huracan", 325));

        VeiculoGenerico<CarroSUV> listaSUVs = new VeiculoGenerico<>();
        listaSUVs.adicionarVeiculo(new CarroSUV("Jeep", "Compass", true));
        listaSUVs.adicionarVeiculo(new CarroSUV("Toyota", "Fortuner", true));

        System.out.println("=== Carros Esportivos ===");
        System.out.println(listaEsportivos);

        System.out.println("=== SUVs ===");
        System.out.println(listaSUVs);
    }
}
