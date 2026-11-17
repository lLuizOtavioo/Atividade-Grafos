import java.util.ArrayList;
import java.util.List;


public class Grafo {

    private final List<List<Integer>> adjacencia;


    public Grafo(int quantidadeVertices) {
        adjacencia = new ArrayList<>();
        for (int i = 0; i < quantidadeVertices; i++) {
            adjacencia.add(new ArrayList<>());
        }
    }


    public void adicionarAresta(int origem, int destino) {
        if (origem == destino) {
            return; // laço não permitido
        }
        if (adjacencia.get(origem).contains(destino)) {
            return; // aresta repetida não permitida
        }
        adjacencia.get(origem).add(destino);
        adjacencia.get(destino).add(origem);
    }

    public void exibirGrafo() {
        for (int v = 0; v < adjacencia.size(); v++) {
            System.out.println(v + " -> " + adjacencia.get(v));
        }
    }


    public int quantidadeVertices() {
        return adjacencia.size();
    }


    public int quantidadeArestas() {
        int soma = 0;
        for (List<Integer> vizinhos : adjacencia) {
            soma += vizinhos.size();
        }
        return soma / 2;
    }


    public List<Integer> listarVizinhos(int vertice) {
        return new ArrayList<>(adjacencia.get(vertice));
    }


    public int grau(int vertice) {
        return adjacencia.get(vertice).size();
    }


    public boolean existeAresta(int origem, int destino) {
        return adjacencia.get(origem).contains(destino);
    }


    public List<Integer> verticesIsolados() {
        List<Integer> isolados = new ArrayList<>();
        for (int v = 0; v < adjacencia.size(); v++) {
            if (adjacencia.get(v).isEmpty()) {
                isolados.add(v);
            }
        }
        return isolados;
    }
}