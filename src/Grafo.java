import java.util.ArrayList;
import java.util.List;

/**
 * Grafo não direcionado, sem pesos, com listas de adjacência.
 * Não permite laços nem arestas repetidas.
 */
public class Grafo {

    private final List<Vertice> vertices;
    private final List<Aresta> arestas;

    public Grafo(int quantidadeVertices) {
        vertices = new ArrayList<>();
        arestas = new ArrayList<>();
        for (int i = 0; i < quantidadeVertices; i++) {
            vertices.add(new Vertice(i));
        }
    }

    public void adicionarAresta(int origem, int destino) {
        if (origem == destino) {
            return; // laço não permitido
        }
        if (existeAresta(origem, destino)) {
            return; // aresta repetida não permitida
        }
        vertices.get(origem).adicionarVizinho(destino);
        vertices.get(destino).adicionarVizinho(origem);
        arestas.add(new Aresta(origem, destino)); // guardada uma única vez
    }

    public void exibirGrafo() {
        for (Vertice v : vertices) {
            System.out.println(v);
        }
    }

    public int quantidadeVertices() {
        return vertices.size();
    }

    public int quantidadeArestas() {
        return arestas.size();
    }

    public List<Integer> listarVizinhos(int vertice) {
        return vertices.get(vertice).getVizinhos();
    }

    public int grau(int vertice) {
        return vertices.get(vertice).getGrau();
    }

    public boolean existeAresta(int origem, int destino) {
        return vertices.get(origem).temVizinho(destino);
    }

    public List<Integer> verticesIsolados() {
        List<Integer> isolados = new ArrayList<>();
        for (Vertice v : vertices) {
            if (v.isIsolado()) {
                isolados.add(v.getId());
            }
        }
        return isolados;
    }
}