// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ccParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ccVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ccParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#circuit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircuit(ccParser.CircuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(ccParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(ccParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(ccParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(ccParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(ccParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#siminputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiminputs(ccParser.SiminputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#signal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(ccParser.SignalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ccParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ccParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ccParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(ccParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(ccParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ccParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(ccParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link ccParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(ccParser.ParenthesesContext ctx);
}