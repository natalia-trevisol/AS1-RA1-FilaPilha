// LIFO (last in, last out)
public class Pilha {
    private Node topo; // Ponteiro para nó do topo da pilha (último inserido)

    // Construtor inicia a pilha vazia
    public Pilha() {
        topo = null;
    }

    // Verifica se a pilha está vazia
    public boolean vazia() {
        return topo == null;
    }

    // Insere um novo elemento no topo da pilha
    public void inserir(Elemento elemento) {
        Node novo = new Node(elemento); // Cria um novo nó
        novo.proximo = topo;            // Faz o novo nó apontar para o antigo topo
        topo = novo;                    // Atualiza o topo para o novo nó
    }

    // Remove o elemento do topo da pilha
    public Elemento remover() {
        if (vazia()) {
            System.out.println("Histórico vazio!");
            return null;
        }
        Elemento removido = topo.dado; // Guarda o elemento que está no topo
        topo = topo.proximo;           // Move o topo para o próximo nó
        return removido;               // Retorna o elemento removido
    }

    // Exibe todos os elementos da pilha
    public void exibirHistorico() {
        if (vazia()) {
            System.out.println("Nenhuma solicitação registrada.");
            return;
        }
        Node aux = topo; // Começa do topo
        System.out.println("=== HISTÓRICO DE SOLICITAÇÕES ===");
        while (aux != null) {          // Percorre até o final
            System.out.println(aux.dado);
            aux = aux.proximo;
        }
    }
}
