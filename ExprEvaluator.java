import java.util.*;

public class ExprEvaluator extends ExprBaseVisitor<String>{

	Map<String, Set<String>> myMap = new HashMap<>();

	public Map<String, Set<String>> getMap() {return myMap;}

	public void addToMap(String statement){

	}

	public String visitProg(ExprParser.ProgContext ctx){

		List<ExprParser.ExprContext> myList = ctx.expr();
		String ans = "";
		String temp = "";

		for(ExprParser.ExprContext elem : myList){
			temp = visit(elem);
			ans += temp + "\n";
		}

		return ans;
	}

	

	/*
	public String visitPrologProgram(ExprParser.PrologProgramContext ctx) {
		
		System.out.println("Visiting the Prolog Program...");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op + "\n");

		//String op2 = visitCompoundPrologRule(ctx.getChild(0));
		//System.out.println("op2: " + op2);

		return op;
	}
	*/

	/*
	public String visitCompoundPrologRule(ExprParser.CompoundPrologRuleContext ctx){
		System.out.println("Visiting the Compound Prolog Rule...");
		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}
	*/

	public String visitConjunctionPrologRule(ExprParser.ConjunctionPrologRuleContext ctx) {
		System.out.println("Visiting Conjunction Prolog Rule...");
		
		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}

	public String visitAtomCompound(ExprParser.AtomCompoundContext ctx){

		System.out.println("Visiting Atom Compound...");

		String op = ctx.getChild(0).getText();
		System.out.println("atom: " + op + "\n");

		return op;
	}

	public String visitPrologQuery(ExprParser.PrologQueryContext ctx){

		System.out.println("Visiting the Prolog Query....");

		String op = ctx.getChild(0).getText();

		System.out.println("op: " + op);

		return op;
	}

	/*
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
	

	*/

}


