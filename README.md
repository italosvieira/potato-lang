# Trabalho de compiladores utilizando ANTLR

Integrantes do grupo:
*Italo Vieira
*Tarik Lopes
*Thabata Almeida


* Linguagem Pascal utilizada como base.

## Executando o projeto

* Na pasta raíz do projeto execute o comando `mvn clean install`. Esse comando vai instalar todas as dependências do projeto e rodar os testes. Obs: É necessário ter o maven instalado.
* Utilizando o Intellij IDEA: Adicione uma configuration do tipo maven. No working directory tenha certeza que está apontando para a pasta do projeto do potato-lang, no command line escreva `clean install`, clique em apply e ok. Agora é só executar a task com o botão de play.
* Caso apenas queira rodar os testes sem reinstalar as dependências basta rodar o comando `mvn test` ou executar o script `test.sh` que se encontra na pasta raíz do projeto.

## Notas
* JSON: Pascal utiliza {} para comentários e \' \' para strings. Logo o suporte a json é feito com () no lugar de {} e \' \' no lugar de "".

## Backlog
* [x] Adicionar operador ternário. Arquivo de teste -> ternaryOperator.pot
* [x] Adicionar atribuição de variável com operador de soma. Arquivo de teste -> sumAssign.pot
* [x] Adicionar atribuição de variável com operador de subtração. Arquivo de teste -> minusAssign.pot
* [x] Adicionar atribuição de variável com operador de multiplicação. Arquivo de teste -> multiplyAssign.pot
* [x] Adicionar atribuição de variável com operador de divisão. Arquivo de teste -> divideAssign.pot
* [x] Adicionar suporte a estrutura de dados JSON para variáveis do tipo const. Arquivo de teste -> json.pot
* [x] Adicionar suporte a estrutura de dados JSON para variáveis do tipo var. Arquivo de teste -> json.pot
* [x] Adicionar suporte a estrutura de dados ENUM para variáveis do tipo const. Arquivo de teste -> enum.pot
* [x] Adicionar suporte a estrutura de dados ENUM para variáveis do tipo var. Arquivo de teste -> enum.pot
* [x] Adicionar suporte a declaração de funções anônimas e atribuição a const e var. Arquivo de teste -> anonymousFunction.pot
