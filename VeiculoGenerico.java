import java.util.ArrayList;
import java.util.List;

public class VeiculoGenerico<T extends Carro> {
    private List<T> veiculos = new ArrayList<>();

    public void adicionarVeiculo(T veiculo) {
        veiculos.add(veiculo);
    }

    public List<T> getVeiculos() {
        return veiculos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Veículos:\n");
        for (T veiculo : veiculos) {
            sb.append(veiculo).append("\n");
        }
        return sb.toString();
    }
}
