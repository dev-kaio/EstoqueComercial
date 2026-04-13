# Sistema de Controle de Estoque Comercial

Este projeto tem como objetivo desenvolver um sistema para controle de estoque de uma empresa de comércio, permitindo a gestão de produtos, categorias, movimentações de entrada e saída, e geração de relatórios financeiros e físicos.

## Contexto do Sistema

Toda empresa de comércio possui um estoque no qual armazena seus produtos. O controle eficiente do estoque permite que a empresa tenha um planejamento melhor de suas compras, gerenciando a quantidade de produtos de forma otimizada. Com um bom sistema de controle, a empresa pode garantir que sempre haverá produto suficiente para atender à demanda dos clientes sem que haja excessos de estoque.

O sistema que será desenvolvido tem como funcionalidades principais:
- Cadastro de produtos e categorias.
- Registro de movimentações de entrada e saída de produtos.
- Geração de relatórios de estoque e financeiros.
- Alertas de quando o estoque está abaixo do mínimo ou acima do máximo.

## Funcionalidades

O sistema contará com as seguintes funcionalidades:

### 1. Cadastro de Produtos
- O sistema permitirá o cadastro de novos produtos, com a inclusão de informações como nome, preço, quantidade em estoque, unidades, categoria, entre outros.

### 2. Cadastro de Categorias
- Será possível cadastrar categorias para os produtos, classificando-os por tipo (ex: limpeza, alimentos, bebidas), e associando atributos como embalagem (lata, vidro, plástico) e tamanho (pequeno, médio, grande).

### 3. Movimentação de Estoque
- O sistema permitirá registrar as movimentações de entrada e saída de produtos, atualizando automaticamente a quantidade em estoque.

### 4. Relatórios
- O sistema gerará relatórios para ajudar na gestão do estoque e nas decisões de compra:
  - **Lista de Preços**: Exibe todos os produtos com preços e unidades.
  - **Balanço Físico/Financeiro**: Mostra a quantidade em estoque e o valor total de cada produto.
  - **Produtos Abaixo do Mínimo**: Relaciona produtos cujo estoque está abaixo do valor mínimo.
  - **Produtos por Categoria**: Relaciona a quantidade de produtos por categoria.
  - **Produtos Mais Movimentados**: Exibe o produto com maior número de entradas e saídas.

## Estrutura do Projeto

O projeto será dividido em várias camadas para garantir boa organização e separação de responsabilidades. A estrutura do código será baseada nos seguintes módulos:

### 1. **Classes**
- **Produto**: Representa um produto no estoque, com atributos como nome, preço, unidade, quantidade, categoria e quantidade mínima/máxima.
- **Categoria**: Representa uma categoria de produtos, contendo nome, tamanho e embalagem.
- **Movimentação**: Representa as entradas e saídas de produtos no estoque, com atributos como nome do produto, data da movimentação, quantidade e tipo de movimentação (entrada/saída).

### 2. **DAO (Data Access Object)**
- Implementação de métodos para persistir e recuperar informações do banco de dados, garantindo a manipulação adequada dos dados de produtos, categorias e movimentações.

### 3. **Relatórios**
- Gerenciamento das consultas SQL para geração de relatórios sobre o estoque e o movimento de produtos.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **Banco de Dados**: A decidir
- **Ferramentas de Desenvolvimento**: Apache NetBeans, GitHub
- **Controle de Versão**: Git

## Instalação

Siga os passos abaixo para rodar o sistema localmente:

### 1. Clonar o repositório
```bash
git clone https://github.com/dev-kaio/EstoqueComercial.git
```

2. Abrir no NetBeans
Abra o NetBeans e selecione File > Open Project.
Navegue até a pasta clonada e abra o projeto.
3. Configurar o banco de dados
Crie o banco de dados desejado (ex: MySQL, PostgreSQL).
Configure o arquivo de conexão do projeto (Conexao.java) com as credenciais do seu banco.
4. Compilar e executar
No NetBeans, clique com o botão direito no projeto e selecione Run.
O sistema será iniciado e estará pronto para uso.
2. Abrir no NetBeans
Abra o NetBeans e selecione File > Open Project.
Navegue até a pasta clonada e abra o projeto.
3. Configurar o banco de dados
Crie o banco de dados desejado (ex: MySQL, PostgreSQL).
Configure o arquivo de conexão do projeto (Conexao.java) com as credenciais do seu banco.
4. Compilar e executar
No NetBeans, clique com o botão direito no projeto e selecione Run.
O sistema será iniciado e estará pronto para uso.

# Desenvolvedores:

Bernardo Melgarejo Gloria (1072615750) : [dev-gloria1](https://github.com/dev-gloria1)

Caio Goudinho (10726113643) : [eucaio0](https://github.com/eucaio0)

Jorge Gabriel Signorelli de Oliveira (10726115384) : [Jorge-gso](https://github.com/Jorge-gso)

Kaio Manfro da Silva (10726111508) : [dev-kaio](https://github.com/dev-kaio)

Tuany de Souza Vieira (10726114036) : [tuany-souza](https://github.com/tuany-souza)

Matheux Max de Souza (10726114641) : [MustHUE](https://github.com/MustHUE)
