import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<Vertice<T>> vertices;
    private List<Aresta<T>> arestas;
    private boolean direcionado;

    public Grafo(boolean direcionado) {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
        this.direcionado = direcionado;
    }

    public Vertice<T> adicionarVertice(T dado) {
        Vertice<T> novoVertice = new Vertice<>(dado);
        vertices.add(novoVertice);
        return novoVertice;
    }

    public void adicionarAresta(Vertice<T> origem, Vertice<T> destino, int peso) {
        Aresta<T> aresta = new Aresta<>(origem, destino, peso);
        origem.adicionarAresta(aresta);
        arestas.add(aresta);

        // Se o grafo não for direcionado, cria a aresta no sentido inverso também
        if (!direcionado) {
            Aresta<T> arestaInversa = new Aresta<>(destino, origem, peso);
            destino.adicionarAresta(arestaInversa);
            arestas.add(arestaInversa);
        }
    }

    public List<Vertice<T>> getVertices() {
        return vertices;
    }

    public List<Aresta<T>> getArestas() {
        return arestas;
    }
}
