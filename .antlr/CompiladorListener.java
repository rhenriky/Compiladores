// Generated from c:/Users/rodri/OneDrive/Documentos/Compiladores/Gramaticap/Compilador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompiladorParser}.
 */
public interface CompiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CompiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CompiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(CompiladorParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(CompiladorParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(CompiladorParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(CompiladorParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CompiladorParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CompiladorParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CompiladorParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CompiladorParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CompiladorParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CompiladorParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CompiladorParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CompiladorParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(CompiladorParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(CompiladorParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CompiladorParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CompiladorParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(CompiladorParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(CompiladorParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(CompiladorParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(CompiladorParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_multiplicativa(CompiladorParser.Expressao_multiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#expressao_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_multiplicativa(CompiladorParser.Expressao_multiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_unaria(CompiladorParser.Expressao_unariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#expressao_unaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_unaria(CompiladorParser.Expressao_unariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(CompiladorParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(CompiladorParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(CompiladorParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(CompiladorParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(CompiladorParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(CompiladorParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CompiladorParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CompiladorParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladorParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CompiladorParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladorParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CompiladorParser.ParametrosContext ctx);
}