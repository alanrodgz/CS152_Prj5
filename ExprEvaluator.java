import java.util.*;

public class ExprEvaluator extends ExprBaseVisitor<String>{

	public String visitProg(ExprParser.ProgContext ctx){
		System.out.println("Visiting Prog....");
		return visit(ctx.expr());
	}


	public String visitExpr(ExprParser.ExprContext ctx) {
		System.out.println("Visiting Expr....");
		return "";
	}


	public String visitAtomTerm(ExprParser.AtomTermContext ctx) {
		System.out.println("Visiting Atom Term....");
		return "";
	}
	public String visitVarTerm(ExprParser.VarTermContext ctx) {
		System.out.println("Visiting Var Term....");
		return "";
	}


	public String visitTermElement(ExprParser.TermElementContext ctx) {
		System.out.println("Visiting Term Element....");
		return "";
	}
	public String visitListElement(ExprParser.ListElementContext ctx) {
		System.out.println("Visiting List Element....");
		return "";
	}
	public String visitCompoundElement(ExprParser.CompoundElementContext ctx) {
		System.out.println("Visiting Compound Element....");
		return "";
	}


	public String visitSingleElements(ExprParser.SingleElementsContext ctx) {
		System.out.println("Visiting Single Elements....");
		return "";
	}
	public String visitMultiElements(ExprParser.MultiElementsContext ctx) {
		System.out.println("Visiting Multi Elements....");
		return "";
	}


	public String visitEmptyList(ExprParser.EmptyListContext ctx) {
		System.out.println("Visiting Empty List....");
		return "";
	}
	public String visitSingleElementsList(ExprParser.SingleElementsListContext ctx) {
		System.out.println("Visiting Single Elements List....");
		return "";
	}
	public String visitMultiElementsList(ExprParser.MultiElementsListContext ctx) {
		System.out.println("Visiting Multi Elements List....");
		return "";
	}


	public String visitAtomCompound(ExprParser.AtomCompoundContext ctx) {
		System.out.println("Visiting Atom Compound....");
		return "";
	}
	public String visitDotCompound(ExprParser.DotCompoundContext ctx) {
		System.out.println("Visiting Dot Compound....");
		return "";
	}


	public String visitSingleCompoundConjunction(ExprParser.SingleCompoundConjunctionContext ctx) {
		System.out.println("Visiting Single Compound Conjuction....");
		return "";
	}
	public String visitMultiCompoundConjunction(ExprParser.MultiCompoundConjunctionContext ctx) {
		System.out.println("Visiting Multi Compound Conjunction....");
		return "";
	}


	public String visitCompoundPrologRule(ExprParser.CompoundPrologRuleContext ctx) {
		System.out.println("Visiting Compound Prolog Rule....");
		String op = ctx.getChild(0).getText();
		System.out.println("op: " + op);
		return op;
	}
	public String visitConjunctionPrologRule(ExprParser.ConjunctionPrologRuleContext ctx) {
		System.out.println("Visiting Conjunction Prolog Rule....");
		return "";
	}


	public String visitPrologProgram(ExprParser.PrologProgramContext ctx) {
		System.out.println("Visiting Prolog Program....");
		return "";
	}


	public String visitPrologQuery(ExprParser.PrologQueryContext ctx){
		System.out.println("Visiting Prolog Query....");
		String op = ctx.getChild(0).getText();
		System.out.println("op: " + op);
		return op;
	}
}


