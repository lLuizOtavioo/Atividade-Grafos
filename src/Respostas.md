# Respostas teóricas

**Questão 2** – Por que uma mesma ligação não deve ser contada duas vezes?
Em um grafo não direcionado, cada aresta é registrada nos dois sentidos: (0,1) aparece na lista de vizinhos do 0 e na do 1, se a contagem fosse feita somando as listas, cada ligação seria contada duas vezes (seria preciso dividir por 2), por isso o Grafo guarda cada Aresta uma única vez e quantidadeArestas() devolve o tamanho dessa lista, contar duas vezes seria contar a mesma relação duas vezes.

**Questão 3** – Qual a relação entre o grau de um vértice e sua quantidade de vizinhos?
Como não há laços nem arestas repetidas, o grau é exatamente igual à quantidade de vizinhos (tamanho da lista de adjacência). Ex.: o vértice 1 tem vizinhos [0, 3, 4] e grau 3

**Questão 4** – Por que existeAresta(0, 3) retorna false, se é possível chegar a 3 passando pelo vértice 1?
Porque existeAresta verifica apenas ligação direta (aresta), existir um caminho 0 → 1 → 3 significa que 0 e 3 estão conectados, mas não adjacentes: não há aresta (0, 3) cadastrada

**Questão 5** – Um vértice isolado deve ser incluído na contagem total de vértices?
Sim, ele é um vértice do grafo mesmo sem arestas; o grafo foi criado com 6 vértices, e o 5 é um deles, excluí-lo daria 5 vértices, contradizendo o resultado esperado de 6, a ausência de arestas afeta o grau (0), não a existência do vértice