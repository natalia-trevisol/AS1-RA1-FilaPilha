# Sistema de Gerenciamento de Atendimento ao Cliente — Fila e Pilha em Java

## Identificação
- **Aluna:** Natália Moritani Trevisol  
- **Disciplina:** Resolução de Problemas Estruturados em Computação
- **Turma:** B - manhã 
- **Curso:** Ciência da Computação
- **Universidade:** Pontifícia Universidade Católica do Paraná (PUCPR)
- **Professor:** Andrey Cabral Meira

---

## Objetivo
O objetivo deste projeto é implementar, de forma prática, as estruturas de Fila e Pilha utilizando listas encadeadas em Java, simulando um sistema de atendimento ao cliente.  
A aplicação gerencia dois conjuntos de dados:
- Uma **fila de clientes** aguardando atendimento (ordem FIFO);
- Um **histórico de solicitações** (ordem LIFO).

---

## Introdução
As estruturas de dados **fila** e **pilha** são fundamentais na computação e aparecem em diversos cenários do mundo real.  
Neste sistema, a fila representa a **ordem de chegada dos clientes**, e a pilha armazena **as solicitações mais recentes no topo**, de modo que a última inserida é a primeira a ser removida.

O projeto reforça conceitos como:
- Encadeamento de nós (`Node`);
- Manipulação dinâmica de dados sem uso de arrays fixos;
- Princípios de abstração e encapsulamento;
- Controle de fluxo com menus interativos.

---

## Estruturas de Dados Utilizadas

### Fila (`Fila.java`)
Implementa uma **estrutura FIFO (First In, First Out)**, onde o primeiro elemento inserido é o primeiro a sair.  
Utilizada para representar os clientes aguardando atendimento.

**Principais métodos:**
- `enfileirar(Elemento e)` → adiciona um cliente ao final da fila.  
- `desenfileirar()` → remove o cliente da frente da fila.  
- `exibirFila()` → mostra todos os clientes atualmente na fila.  
- `vazia()` → verifica se a fila está vazia.

---

### Pilha (`Pilha.java`)
Implementa uma **estrutura LIFO (Last In, First Out)**, onde o último elemento inserido é o primeiro a sair.  
Usada para armazenar o histórico de solicitações realizadas.

**Principais métodos:**
- `inserir(Elemento e)` → adiciona uma nova solicitação no topo.  
- `remover()` → remove a solicitação mais recente.  
- `exibirHistorico()` → mostra todo o histórico.  
- `vazia()` → verifica se a pilha está vazia.

---

### Nó (`Node.java`)
Classe auxiliar que armazena:
- O **dado** (objeto `Elemento`);
- Um **ponteiro** para o próximo nó da lista.

Permite criar listas encadeadas para a fila e a pilha, de modo que não há limite fixo de tamanho.

---

### Elemento (`Elemento.java`)
Classe que representa tanto:
- Um **cliente na fila de atendimento**, quanto
- Uma **solicitação no histórico**.

Contém diferentes construtores e um método `toString()` sobrescrito para formatar automaticamente a saída no console conforme o tipo do elemento (cliente ou solicitação).

---

## Estrutura do Código
```bash
AS1-RA1-filapilha
src/
  │
  ├── Main.java # Contém o menu principal e as interações do usuário
  ├── Fila.java # Implementação da estrutura de fila (FIFO)
  ├── Pilha.java # Implementação da estrutura de pilha (LIFO)
  ├── Node.java # Classe de nó para encadeamento
  └── Elemento.java # Representa clientes e solicitações
```

---

## Funcionalidades do Sistema

Ao executar o programa, o usuário tem acesso ao seguinte menu:
```bash
=== SISTEMA DE ATENDIMENTO ===
(1) - Exibir fila de clientes
(2) - Atender próximo cliente
(3) - Adicionar cliente à fila
(4) - Exibir histórico de solicitações
(5) - Adicionar nova solicitação ao histórico
(6) - Remover solicitação do histórico
(0) - Sair
```

### Detalhes:
- **Opção 1:** Lista todos os clientes aguardando na fila.  
- **Opção 2:** Remove o primeiro cliente (FIFO).  
- **Opção 3:** Permite adicionar manualmente um novo cliente à fila.  
- **Opção 4:** Exibe todas as solicitações do histórico.  
- **Opção 5:** Permite registrar uma nova solicitação.  
- **Opção 6:** Remove a solicitação mais recente (LIFO).  
- **Opção 0:** Encerra o programa.

---

## Instruções para Executar o Projeto

### Pré-requisitos
- JDK 17 ou superior instalado  
- Um ambiente de desenvolvimento como:
  - IntelliJ IDEA, Eclipse ou NetBeans  
  - Ou apenas o terminal com `javac` e `java`

### Execução via terminal

1. **Compilar os arquivos:**
   ```bash
   javac *.java
   ```

2.Executar o programa:
  ```bash
  java Main
  ```

3. Interagir com o menu:
Escolha as opções digitando o número correspondente e pressione Enter.

--- 

## Explicação Geral do Código

- O programa inicia criando duas estruturas: uma fila de clientes e uma pilha de solicitações.
- Ambas são preenchidas inicialmente com dados simulados.
- O menu no Main.java controla a lógica do sistema, permitindo o usuário visualizar, adicionar e remover elementos dessas estruturas.
- O comportamento dinâmico é obtido via encadeamento de nós, sem necessidade de arrays ou listas pré-definidas.
- O método toString() da classe Elemento formata a saída no console, exibindo apenas as informações relevantes de cada tipo (cliente ou solicitação).

---

## Conclusão

Este projeto consolida os conceitos teóricos de estruturas de dados dinâmicas, demonstrando como filas e pilhas podem ser aplicadas em cenários reais de gerenciamento e atendimento.
A implementação com nós encadeados permite expansão ilimitada e flexibilidade, reforçando os fundamentos da programação orientada a objetos e do raciocínio lógico em Java.
