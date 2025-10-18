// FIFO (first in, first out)
public class Fila {
    private Node frente; // Ponteiro para primeiro nó (início da fila)
    private Node tras;   // Ponteiro para último nó (fim da fila)

    // Construtor inicializa a fila vazia
    public Fila() {
        frente = null;
        tras = null;
    }

    // Verifica se a fila está vazia (sem elementos)
    public boolean vazia() {
        return frente == null;
    }

    // Adiciona um novo elemento no fim da fila
    public void enfileirar(Elemento elemento) {
        Node novo = new Node(elemento); // Cria um novo nó com o dado
        if (vazia()) {                  // Se a fila estiver vazia
            frente = novo;              // O novo nó será o primeiro
            tras = novo;                // e também o último
        } else {                        // Caso contrário
            tras.proximo = novo;        // liga o último nó atual ao novo nó
            tras = novo;                // atualiza o 'tras' para o novo nó
        }
    }

    // Remove (desenfileira) o elemento do início da fila
    public Elemento desenfileirar() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return null;
        }
        Elemento atendido = frente.dado; // Pega o elemento do primeiro nó
        frente = frente.proximo;         // Move o ponteiro 'frente' para o próximo nó
        if (frente == null) {            // Se a fila ficou vazia
            tras = null;                 // zera também o 'tras'
        }
        return atendido;                 // Retorna o elemento removido
    }

    // Exibe todos os elementos da fila
    public void exibirFila() {
        if (vazia()) {
            System.out.println("Nenhum cliente na fila.");
            return;
        }
        Node aux = frente; // Começa pelo primeiro nó
        System.out.println("=== FILA DE ATENDIMENTO ===");
        while (aux != null) {           // Percorre até o final da fila
            System.out.println(aux.dado); // Exibe o conteúdo do nó
            aux = aux.proximo;           // Vai para o próximo
        }
    }
}
