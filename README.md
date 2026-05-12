# Sistema de Controle de Estoque Comercial

Este projeto tem como objetivo desenvolver um sistema para controle de estoque de uma empresa de comércio, permitindo a gestão de produtos, movimentações de entrada e saída, reajuste de preços e geração de relatórios financeiros e físicos.

## Contexto do Sistema

Toda empresa de comércio possui um estoque no qual armazena seus produtos. O controle eficiente do estoque permite que a empresa tenha um planejamento melhor de suas compras, gerenciando a quantidade de produtos de forma otimizada. Com um bom sistema de controle, a empresa pode garantir que sempre haverá produto suficiente para atender à demanda dos clientes.

## Funcionalidades

### 1. Cadastro de Produtos
Permite incluir, alterar, consultar e excluir produtos do estoque, com informações de nome, preço unitário, unidade de medida e quantidade em estoque.

### 2. Movimentação de Estoque
Registra entradas e saídas de produtos, atualizando automaticamente a quantidade em estoque.

### 3. Reajuste de Preços
Permite reajustar o preço de um produto específico ou de todos os produtos por um percentual informado.

### 4. Relatórios
- **Lista de Preços**: exibe todos os produtos em ordem alfabética com preço e unidade.
- **Balanço Físico/Financeiro**: exibe quantidade em estoque, valor unitário, valor total por produto e valor total geral do estoque.

## Estrutura do Projeto
src/com/mycompany/estoquecomercial/
├── Classes/
│   └── Produto.java
├── Visualizacao/
│   ├── CadastroProdutoVisual.java
│   ├── MovimentacaoVisual.java
│   ├── ReajusteVisual.java
│   └── RelatorioVisual.java
└── MenuPrincipal.java

Os dados são armazenados em memória durante a execução, utilizando `ArrayList<Produto>`.

## Tecnologias Utilizadas

- **Linguagem**: Java 21
- **Ferramentas de Desenvolvimento**: Apache NetBeans 2.4.66, GitHub
- **Controle de Versão**: Git

## Instalação

### 1. Clonar o repositório
```bash
git clone https://github.com/dev-kaio/EstoqueComercial.git
```

### 2. Abrir no NetBeans
Abra o NetBeans e selecione **File > Open Project**. Navegue até a pasta clonada e abra o projeto.

### 3. Compilar e executar
No NetBeans, clique com o botão direito no projeto e selecione **Run**. O sistema será iniciado e estará pronto para uso.

# Desenvolvedores:

Bernardo Melgarejo Gloria (1072615750) : [dev-gloria1](https://github.com/dev-gloria1)

Caio Goudinho (10726113643) : [eucaio0](https://github.com/eucaio0)

Jorge Gabriel Signorelli de Oliveira (10726115384) : [Jorge-gso](https://github.com/Jorge-gso)

Kaio Manfro da Silva (10726111508) : [dev-kaio](https://github.com/dev-kaio)

Tuany de Souza Vieira (10726114036) : [tuany-souza](https://github.com/tuany-souza)

Matheux Max de Souza (10726114641) : [MustHUE](https://github.com/MustHUE)
