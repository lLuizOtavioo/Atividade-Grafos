import java.util.Scanner;

public class Main {

    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Grafo grafo = new Grafo(lerInt("Quantidade de vértices: "));

        int opcao;
        do {
            mostrarMenu();
            opcao = lerInt("Opção: ");
            executar(opcao, grafo);
        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Adicionar aresta (Q1 / Q6)");
        System.out.println("2 - Exibir grafo (Q1)");
        System.out.println("3 - Quantidade de vértices e arestas (Q2)");
        System.out.println("4 - Vizinhos e grau de um vértice (Q3)");
        System.out.println("5 - Verificar se existe aresta (Q4)");
        System.out.println("6 - Vértices isolados (Q5)");
        System.out.println("0 - Sair");
    }

    private static void executar(int opcao, Grafo grafo) {
        switch (opcao) {
            case 1:
                int origem = lerInt("Origem: ");
                int destino = lerInt("Destino: ");
                int antes = grafo.quantidadeArestas();
                grafo.adicionarAresta(origem, destino);
                System.out.println(grafo.quantidadeArestas() > antes
                        ? "Aresta cadastrada."
                        : "Aresta ignorada (laço ou repetida).");
                break;
            case 2:
                grafo.exibirGrafo();
                break;
            case 3:
                System.out.println("Vértices: " + grafo.quantidadeVertices()
                        + " | Arestas: " + grafo.quantidadeArestas());
                break;
            case 4:
                int v = lerInt("Vértice: ");
                System.out.println("Vizinhos de " + v + ": " + grafo.listarVizinhos(v)
                        + "; grau: " + grafo.grau(v));
                break;
            case 5:
                int o = lerInt("Origem: ");
                int d = lerInt("Destino: ");
                System.out.println("existeAresta(" + o + ", " + d + "): "
                        + grafo.existeAresta(o, d));
                break;
            case 6:
                System.out.println("Isolados: " + grafo.verticesIsolados());
                break;
            case 0:
                System.out.println("Encerrando.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    private static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!entrada.hasNextInt()) {
            entrada.next();
            System.out.print("Digite um número inteiro: ");
        }
        return entrada.nextInt();
    }
}