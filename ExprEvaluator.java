import java.util.*;

public class ExprEvaluator extends ExprBaseVisitor<String>{

	public String visitProg(ExprParser.ProgContext ctx){
		return visit(ctx.expr());
	}

	public String visitPrologProgram(ExprParser.PrologProgramContext ctx) {
		return "";
	}

	public String visitCompoundPrologRule(ExprParser.CompoundPrologRuleContext ctx) { 
	
		System.out.println("Visiting the Compund Prolog Rule....");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}
	

	public String visitPrologQuery(ExprParser.PrologQueryContext ctx){

		System.out.println("Visiting the Prolog Query....");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}

}


