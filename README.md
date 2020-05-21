# Trabalho de compiladores utilizando ANTLR

* Linguagem Pascal utilizada como base.

## Executando o projeto

* Na pasta raíz do projeto execute o comando `mvn clean install`. Esse comando vai instalar todas as dependências do projeto e rodar os testes. Obs: É necessário ter o maven instalado.
* Utilizando o Intellij IDEA: Adicione uma configuration do tipo maven. No working directory tenha certeza que está apontando para a pasta do projeto do potato-lang, no command line escreva `clean install`, clique em apply e ok. Agora é só executar a task com o botão de play.
* Caso apenas queira rodar os testes sem reinstalar as dependências basta rodar o comando `mvn test` ou executar o script `test.sh` que se encontra na pasta raíz do projeto.

## Notas
* JSON: Pascal utiliza {} para comentários e '' poara strings. Logo o suporte a json é feito com § no lugar de {} e '' no lugar de "".


## Backlog
* [x] Adicionar operador ternário. Commit: 32af602ae4b3b3e04f41925624c18aac5f4d1a1c. Arquivo de teste: ternaryOperator.pot
* [x] Adicionar atribuição de variável com operador de soma. Commit: 45d92a58a5f3acf2002cfa01605d42b5921b4ad4. Arquivo de teste: sumAssign.pot.    
* [x] Adicionar atribuição de variável com operador de subtração. Commit: 45d92a58a5f3acf2002cfa01605d42b5921b4ad4. Arquivo de teste: minusAssign.pot.
* [x] Adicionar atribuição de variável com operador de multiplicação. Commit: 45d92a58a5f3acf2002cfa01605d42b5921b4ad4. Arquivo de teste: multiplyAssign.pot.
* [x] Adicionar atribuição de variável com operador de divisão. Commit: 45d92a58a5f3acf2002cfa01605d42b5921b4ad4. Arquivo de teste: divideAssign.pot.
* [x] Adicionar suporte a estrutura de dados JSON para variáveis do tipo const. Commit: cdc62edb45a04bb377fe28e28524c325e1aa05c4. Arquivo de teste: json.pot.
* [x] Adicionar suporte a estrutura de dados JSON para variáveis do tipo var. Commit: 11e64aac88947e8256ae6e8deff1f6c579b1abb9. Arquivo de teste: json.pot.
* [ ] Adicionar tipo enum.
