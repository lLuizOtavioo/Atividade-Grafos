
public class Aresta {

    private final int origem;
    private final int destino;

    public Aresta(int origem, int destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public int getOrigem() {
        return origem;
    }

    public int getDestino() {
        return destino;
    }

    public boolean liga(int a, int b) {
        return (origem == a && destino == b) || (origem == b && destino == a);
    }

    @Override
    public String toString() {
        return "(" + origem + ", " + destino + ")";
    }
}