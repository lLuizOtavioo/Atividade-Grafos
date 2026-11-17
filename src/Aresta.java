public class Aresta<T> {
    private Vertice<T> origem;
    private Vertice<T> destino;
    private int peso;

    public Aresta(Vertice<T> origem, Vertice<T> destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice<T> getOrigem() {
        return origem;
    }

    public Vertice<T> getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }
}
