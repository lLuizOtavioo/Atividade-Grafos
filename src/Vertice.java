import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private final int id;
    private final List<Integer> vizinhos;

    public Vertice(int id) {
        this.id = id;
        this.vizinhos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Integer> getVizinhos() {
        return new ArrayList<>(vizinhos);
    }

    public void adicionarVizinho(int outro) {
        vizinhos.add(outro);
    }

    public boolean temVizinho(int outro) {
        return vizinhos.contains(outro);
    }

    public int getGrau() {
        return vizinhos.size();
    }

    public boolean isIsolado() {
        return vizinhos.isEmpty();
    }

    @Override
    public String toString() {
        return id + " -> " + vizinhos;
    }
}