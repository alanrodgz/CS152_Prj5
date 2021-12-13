import java.util.*;

public class ExprEvaluator extends ExprBaseVisitor<String>{

	public String visitProg(ExprParser.ProgContext ctx){
		return visit(ctx.expr());
	}

	public String visitPrologProgram(ExprParser.PrologProgramContext ctx) {
		
		System.out.println("Visiting the Prolog Program...");

		return "";
	}

	public String visitCompoundPrologRule(ExprParser.CompoundPrologRuleContext ctx) { 
	
		System.out.println("Visiting the Compund Prolog Rule....");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}

	public String visitConjunctionPrologRule(ExprParser.ConjunctionPrologRuleContext ctx) {
		
		System.out.println("Visiting Conjunction Prolog Rule....");

		return "";
	}

	public String visitSingleCompoundConjunction(ExprParser.SingleCompoundConjunctionContext ctx) {
		System.out.println("Visiting Singlee Compound Conjuction...");

		return "";
	}

	public String visitMultiCompoundConjunction(ExprParser.MultiCompoundConjunctionContext ctx) {
		
		System.out.println("Vising Multi Compound Conjunction....");

		return "";
	}
	

	public String visitPrologQuery(ExprParser.PrologQueryContext ctx){

		System.out.println("Visiting the Prolog Query....");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}

}


