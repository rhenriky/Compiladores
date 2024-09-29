// Generated from .\Compiladores.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompiladoresParser}.
 */
public interface CompiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CompiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CompiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(CompiladoresParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(CompiladoresParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(CompiladoresParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(CompiladoresParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CompiladoresParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CompiladoresParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CompiladoresParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CompiladoresParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CompiladoresParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CompiladoresParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CompiladoresParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CompiladoresParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(CompiladoresParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(CompiladoresParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CompiladoresParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CompiladoresParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(CompiladoresParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(CompiladoresParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_aritmetica(CompiladoresParser.Expressao_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#expressao_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_aritmetica(CompiladoresParser.Expressao_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_logica(CompiladoresParser.Expressao_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#expressao_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_logica(CompiladoresParser.Expressao_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(CompiladoresParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(CompiladoresParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(CompiladoresParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(CompiladoresParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CompiladoresParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CompiladoresParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CompiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CompiladoresParser.ParametrosContext ctx);
}