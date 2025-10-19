import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Dados simulados
        Elemento[] filaAtendimento = new Elemento[] {
                new Elemento("CLI001", "Mariana Silva", "Dúvida sobre produto", true),
                new Elemento("CLI002", "João Pedro Souza", "Reclamação de serviço", true),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso", true),
                new Elemento("CLI004", "Pedro Henrique Alves", "Informações de entrega", true),
                new Elemento("CLI005", "Natalia Calegari", "Agendamento de visita", true)
        };

        Elemento[] historico = new Elemento[] {
                new Elemento("REQ001", "Instalação de software", "2025-08-20 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2025-09-20 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2025-10-20 11:30")
        };

        // Preenche estruturas com for
        for (Elemento e : filaAtendimento) {
            fila.enfileirar(e);
        }
        for (Elemento e : historico) {
            pilha.inserir(e);
        }

        do {
            System.out.println("\n=== SISTEMA DE ATENDIMENTO ===");
            System.out.println("(1) - Exibir fila de clientes");
            System.out.println("(2) - Atender próximo cliente");
            System.out.println("(3) - Adicionar cliente à fila");
            System.out.println("(4) - Exibir histórico de solicitações");
            System.out.println("(5) - Adicionar nova solicitação ao histórico");
            System.out.println("(6) - Remover solicitação do histórico");
            System.out.println("(0) - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); //limpa buffer

            switch (opcao) {
                case 1: // exibe fila
                    fila.exibirFila();
                    break;

                case 2: // atende cliente, remove da fila
                    Elemento atendido = fila.desenfileirar();
                    if (atendido != null) {
                        System.out.println("Atendendo cliente: " + atendido);
                    }
                    break;

                case 3: // adiciona cliente no final da fila
                    System.out.print("ID do cliente: ");
                    String idCliente = sc.nextLine();
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    System.out.print("Motivo do atendimento: ");
                    String motivo = sc.nextLine();
                    Elemento novoCliente = new Elemento(idCliente, nomeCliente, motivo, true);
                    fila.enfileirar(novoCliente);
                    System.out.println("Cliente adicionado à fila com sucesso!");
                    break;

                case 4: // mostra historico
                    pilha.exibirHistorico();
                    break;

                case 5: // adiciona ao topo historico
                    System.out.print("ID da solicitação: ");
                    String id = sc.nextLine();
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    System.out.print("Data e hora: ");
                    String data = sc.nextLine();
                    pilha.inserir(new Elemento(id, desc, data));
                    System.out.println("Solicitação adicionada ao histórico!");
                    break;

                case 6: // remove do topo do historico
                    Elemento removido = pilha.remover();
                    if (removido != null) {
                        System.out.println("Solicitação removida do histórico: " + removido);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
