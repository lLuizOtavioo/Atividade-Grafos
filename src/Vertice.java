import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {
    private T dado;
    private List<Aresta<T>> arestasSaida;

    public Vertice(T dado) {
        this.dado = dado;
        this.arestasSaida = new ArrayList<>();
    }

    public T getDado() {
        return dado;
    }

    public List<Aresta<T>> getArestasSaida() {
        return arestasSaida;
    }

    public void adicionarAresta(Aresta<T> aresta) {
        this.arestasSaida.add(aresta);
    }
}
