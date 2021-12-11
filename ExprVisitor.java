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
	 * Visit a parse tree produced by {@link ExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ExprParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ExprParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(ExprParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ExprParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(ExprParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(ExprParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#prolog_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProlog_rule(ExprParser.Prolog_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ExprParser.QueryContext ctx);
}