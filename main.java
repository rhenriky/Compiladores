package com.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Verifica se um arquivo foi passado como argumento
            if (args.length == 0) {
                System.err.println("Usage: java Main <source fonte.txt>");
                return;
            }

            // Lê o arquivo de entrada (código fonte a ser processado)
            String sourceFile = args[0];
            CharStream input = CharStreams.fromFileName(fonte.txt);

            // Cria o lexer a partir do arquivo de entrada
            CompiladoresLexer lexer = new CompiladoresLexer(input);

            // Gera tokens
            Token token;

            // Itera sobre os tokens e exibe os encontrados
            System.out.println("Tokens encontrados:");
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                String tokenType = CompiladoresLexer.VOCABULARY.getSymbolicName(token.getType());
                String tokenText = token.getText();
                
                // Exibe o tipo e o valor do token
                System.out.println("Tipo: " + tokenType + " | Valor: " + tokenText);
            }

        } catch (IOException e) {
            System.err.println("Error reading source file: " + e.getMessage());
        }
    }
}
