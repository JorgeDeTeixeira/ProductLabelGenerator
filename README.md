# ProductLabelGenerator

Este projeto é um programa Java que lê os dados de N produtos (N fornecido pelo usuário) e exibe a etiqueta de preço de cada produto na mesma ordem em que foram digitados. Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados específicos são acrescentados na etiqueta de preço conforme o tipo de produto.

## Funcionalidades

- Ler dados de produtos comuns, usados e importados.
- Exibir etiquetas de preço para cada produto, incluindo informações adicionais para produtos usados e importados.
- Calcular o preço final de produtos importados adicionando a taxa de alfândega.

## Estrutura do Projeto

O projeto contém as seguintes classes:

- `Product`: Classe base para todos os produtos.
- `ImportedProduct`: Subclasse de `Product` que representa produtos importados com uma taxa de alfândega.
- `UsedProduct`: Subclasse de `Product` que representa produtos usados com uma data de fabricação.

## Como Executar

1. Clone o repositório.
2. Compile as classes Java.
3. Execute a classe `Main` e siga as instruções no console para inserir os dados dos produtos.

## Exemplo de Uso

```bash
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? c
Name: Laptop
Price: 1100.00

Product #2 data:
Common, used or imported (c/u/i)? u
Name: iPhone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017

Product #3 data:
Common, used or imported (c/u/i)? i
Name: Tablet
Price: 700.00
Customs fee: 100.00

PRICE TAGS:
Laptop $ 1100.00
iPhone (used) $ 400.00 (Manufacture date: 15/03/2017)
Tablet $ 800.00 (Customs fee: $ 100.00)
