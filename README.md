# DesafioDesenvolvedor
Desafio Desenvolvedor - Desafio Target


Respostas -- 

1 - Valor da variável SOMA:
O código incrementa SOMA enquanto K vai de 1 a 12. A cada iteração, K é incrementado e o valor de K é adicionado a SOMA.

Aqui está a execução detalhada do loop:

Inicialmente, K = 1, SOMA = 0.
Para K = 2, SOMA = 0 + 2 = 2.
Para K = 3, SOMA = 2 + 3 = 5.
Para K = 4, SOMA = 5 + 4 = 9.
Isso continua até K = 12.
Ao final, a soma será a soma dos números de 1 a 12: 
SOMA
=2+3+4+⋯+12=78
SOMA=2+3+4+⋯+12=78

Portanto, o valor final de SOMA será 78.

2 - Sequências:
a) 1, 3, 5, 7, ___
Essa sequência é composta por números ímpares consecutivos. O próximo número será 9.

b) 2, 4, 8, 16, 32, 64, ____
Essa sequência dobra o valor anterior. O próximo número será 128.

c) 0, 1, 4, 9, 16, 25, 36, ____
Essa sequência segue os numeros quadrados : 0², 1²...até 6².
O próximo número será 49 = 7².

d) 4, 16, 36, 64, ____
Essa sequência segue os quadrados dos números pares: 
2²,4². O próximo número será 100 = 10².

e) 1, 1, 2, 3, 5, 8, ____
Essa é a sequência de Fibonacci. O próximo número será 13 (8 + 5).

f) 2, 10, 12, 16, 17, 18, 19, ____
A sequência adiciona diferentes incrementos. Após 19, o próximo número será 20.


4 - Modelo de banco de dados para cadastro de clientes:
Aqui está uma possível estrutura de banco de dados:

Tabela clientes:

id_cliente (PK)
razao_social
estado_id (FK para a tabela estados)
Tabela telefones:

id_telefone (PK)
numero
tipo_telefone_id (FK para a tabela tipos_telefone)
cliente_id (FK para a tabela clientes)
Tabela tipos_telefone:

id_tipo_telefone (PK)
descricao
Tabela estados:

id_estado (PK)
nome
sigla
Relacionamentos:

Um cliente pode ter vários telefones (1
entre clientes e telefones).
Um telefone tem um tipo específico (1
entre tipos_telefone e telefones).
Um cliente pertence a um estado (1
entre estados e clientes).
Consulta SQL:

sql
Copiar código
SELECT c.id_cliente, c.razao_social, t.numero
FROM clientes c
JOIN telefones t ON c.id_cliente = t.cliente_id
JOIN estados e ON c.estado_id = e.id_estado
WHERE e.sigla = 'SP';

5 - Qual veículo estará mais próximo de Ribeirão Preto?
A princípio, parece que ambos estarão à mesma distância de Ribeirão Preto quando se cruzarem, uma vez que ocupam a mesma posição na estrada no momento do cruzamento. No entanto, o caminhão tem a desvantagem dos pedágios.

O tempo adicional que o carro leva para passar pelos pedágios (5 minutos em cada um dos 3 pedágios) não altera significativamente a lógica de distância no momento do cruzamento. Apesar dessa diferença de tempo, os dois veículos estarão na mesma posição quando se cruzarem, então ambos estarão à mesma distância de Ribeirão Preto no ponto de cruzamento.

Explicação: O carro e o caminhão viajam em direções opostas, e o cruzamento ocorre em um ponto intermediário. As diferenças de velocidade e tempo nos pedágios afetam o tempo de viagem, mas não a distância no momento em que os veículos se encontram.
