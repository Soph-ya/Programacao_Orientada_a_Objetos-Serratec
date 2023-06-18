O trabalho consiste em criar um programa que permita gerar pedidos para clientes com um ou mais produtos.

Objetivo do sistema:

1. O cadastro de clientes pode vir pronto na tabela, sem necessidade de criar mais um cadastro (CRUD).
2. Deve possuir um cadastro de pedidos.
3. O cadastro de pedidos deve permitir:
    . incluir todos os dados.
    . alterar os dados, inclusive o cliente e os produtos.
    . excluir o pedido.
    . imprimir um pedido com seus dados com cliente e sem os produtos.
    . imprimir um pedido com seus dados com cliente e com os produtos.    
    . localizar um ou mais pedidos por código ou por cliente ou por data.
4- O pedido deve permitir incluir o cliente:
    . selecionando através de uma pesquisa por código, nome ou cpf.
    . deve permitir alterar o cliente do pedido por outro.
    . deve permitir excluir o cliente.
    . não deixar gravar o pedido sem cliente.
5. O pedido deve permitir incluir um ou mais produtos.
    . na inclusão, permitir localizar o produto por código, mostrar o produto e confirmar ou não.
    . na alteração, permitir localizar o produto por código, mostrar o produto, confirmar a troca por outro produto.
    . na alteração, permitir alterar os dados no pedido do produto selecionado.
    . permitir excluir o produto.
    . permitir excluir todos os produtos.
    . não deixar gravar o pedido sem pelo menos um produto.
6. O cadastro de produtos pode vir pronto na tabela, sem necessidade de criar mais um cadastro (CRUD).

Construção do sistema:

- Ter uma classe Pessoa abstrata.
- Ter uma classe Cliente.
- Ter uma classe Pedido.
- Ter uma classe Produto.
- Ter uma classe PedidoItens.
- Ter uma interface CRUD.
- Ter classes DAO.
- Ter um arquivo ini para conexão com a base de dados.
- Conectar o sistema com o Postgres e fazer a persistência dos dados.

Tabelas:

Cliente
. idcliente
. nome
. cpf
. dtnascimento
. endereco
. telefone

Produto
. idproduto
. descricao
. vlcusto
. vlvenda
. categoria

Pedido
. idpedido
. dtemissao
. dtentrega
. valortotal
. observacao

PedidoItens
. idpedidoitem
. vlunitario
. qtproduto
. vldesconto

Entregas:

1. Java Project
2. DDL: pode ser dentro do projeto ou script
3. DER
4. UML: Diagrama de Classes