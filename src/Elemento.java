public class Elemento {
    String id;
    String descricao;  // usado para a pilha
    String dataHora;   // usado para a pilha
    String nome;       // usado para a fila
    String motivo;     // usado para a fila
    boolean isCliente; // para saber se é da fila (cliente) ou da pilha (solicitação)

    // Construtor para histórico (Pilha)
    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.isCliente = false;
    }

    // Construtor para fila (Cliente)
    public Elemento(String id, String nome, String motivo, boolean isCliente) {
        this.id = id;
        this.nome = nome;
        this.motivo = motivo;
        this.isCliente = isCliente;
    }

    @Override
    public String toString() {   //verifica se é cliente ou solicitação e monta string
        // como o objeto aparece como texto
        if (isCliente) {
            return "[" + id + " - " + nome + " - " + motivo + "]";
        } else {
            return "[" + id + " - " + descricao + " - " + dataHora + "]";
        }
    }
}
