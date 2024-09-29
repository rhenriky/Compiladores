grammar Compiladores;

// Regras do programa
programa      : 'begin' declaracoes comandos 'end';
declaracoes   : (declaracao)+;
comandos      : (comando)+;

// Tipos de declaração de variáveis (três tipos: int, float, string)
declaracao    : 'int' ID ';' 
              | 'float' ID ';'
              | 'string' ID ';';

// Comandos
comando       : atribuicao 
              | entrada 
              | saida 
              | condicional 
              | repeticao;

// Atribuição
atribuicao    : ID '=' expressao_aritmetica ';';

// Comando de entrada (teclado) e saída (vídeo)
entrada       : 'input' '(' ID ')' ';';
saida         : 'output' '(' expressao_aritmetica ')' ';';

// Estrutura condicional (Se... Então... Senão)
condicional   : 'if' expressao_logica 'then' comandos ('else' comandos)? 'endif';

// Estruturas de repetição (duas: while e for)
repeticao     : 'while' expressao_logica 'do' comandos 'endwhile'
              | 'for' ID '=' expressao_aritmetica 'to' expressao_aritmetica 'do' comandos 'endfor';

// Expressões aritméticas (com adição, subtração, multiplicação e divisão)
expressao_aritmetica 
              : expressao_aritmetica '+' expressao_aritmetica
              | expressao_aritmetica '-' expressao_aritmetica
              | expressao_aritmetica '*' expressao_aritmetica
              | expressao_aritmetica '/' expressao_aritmetica
              | '(' expressao_aritmetica ')'
              | NUM
              | ID;

// Expressões lógicas (com seis operadores)
expressao_logica 
              : expressao_aritmetica operador_relacional expressao_aritmetica
              | '(' expressao_logica ')'
              | expressao_logica operador_logico expressao_logica;

// Operadores relacionais e lógicos
operador_relacional 
              : '==' 
              | '!=' 
              | '<' 
              | '>' 
              | '<=' 
              | '>=';

operador_logico 
              : 'and' 
              | 'or'
              | 'not';

// Funções definidas pelo usuário
func : ID '(' parametros? ')' '{' comandos '}' ;

parametros : ID (',' ID)*;

// Tokens
ID            : [a-zA-Z_][a-zA-Z_0-9]*;
NUM           : [0-9]+ ('.' [0-9]+)?;
WS            : [ \t\n\r]+ -> skip;
