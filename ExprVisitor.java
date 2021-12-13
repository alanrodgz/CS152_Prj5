// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTerm(ExprParser.AtomTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTerm(ExprParser.VarTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termElement}
	 * labeled alternative in {@link ExprParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermElement(ExprParser.TermElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listElement}
	 * labeled alternative in {@link ExprParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElement(ExprParser.ListElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundElement}
	 * labeled alternative in {@link ExprParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundElement(ExprParser.CompoundElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleElements}
	 * labeled alternative in {@link ExprParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElements(ExprParser.SingleElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiElements}
	 * labeled alternative in {@link ExprParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiElements(ExprParser.MultiElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyList}
	 * labeled alternative in {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(ExprParser.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleElementsList}
	 * labeled alternative in {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementsList(ExprParser.SingleElementsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiElementsList}
	 * labeled alternative in {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiElementsList(ExprParser.MultiElementsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomCompound}
	 * labeled alternative in {@link ExprParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCompound(ExprParser.AtomCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotCompound}
	 * labeled alternative in {@link ExprParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotCompound(ExprParser.DotCompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCompoundConjunction}
	 * labeled alternative in {@link ExprParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCompoundConjunction(ExprParser.SingleCompoundConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiCompoundConjunction}
	 * labeled alternative in {@link ExprParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCompoundConjunction(ExprParser.MultiCompoundConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundPrologRule}
	 * labeled alternative in {@link ExprParser#prolog_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundPrologRule(ExprParser.CompoundPrologRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conjunctionPrologRule}
	 * labeled alternative in {@link ExprParser#prolog_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionPrologRule(ExprParser.ConjunctionPrologRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prologProgram}
	 * labeled alternative in {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologProgram(ExprParser.PrologProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prologQuery}
	 * labeled alternative in {@link ExprParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrologQuery(ExprParser.PrologQueryContext ctx);
}