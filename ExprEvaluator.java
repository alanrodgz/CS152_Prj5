import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ExprEvaluator extends ExprBaseVisitor<String>{

	List<Map<String, List<String>>> myWorldMap = new ArrayList<>();

	public Map<Object, Object> getMap() {

		return null;
		//
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

		// According to grammar, conjunctionPrologRule is:
		// compound ':-' conjunction
		// What these tell us is that the children of this ExprParser context are:
		// 0: compound
		// 1: :-
		// 2: conjunction
		System.out.println("op: " + op);
		System.out.println("child 1: " + ctx.getChild(1).getText());
		System.out.println("child 2: " + ctx.getChild(2).getText());

		modularize(ctx.getChild(0));
		modularize(ctx.getChild(2));

		return op;
	}

	public boolean modularize(ParseTree pt){

		String input = pt.getText();
		// Ex 1: pt = loves(romeo,juliet),loves(adam,eve)
		// Ex 2: pt = loves(romeo,juliet)
		String[] modified = input.split("\\(|\\),|\\)");
		// Ex 1: 0 = loves, 1 = romeo,juliet, 2 = loves, 3 = adam,eve
		// Ex 2: 0 = loves, 1 = romeo,juliet

		System.out.println(modified.length);

		// This loop accounts for the possibility that a conjunction may have multiple elements
		for (int index = 0; index < modified.length; index += 2){
			Map<String, List<String>> myMap = new HashMap<>();
			String[] elements = modified[index + 1].split(",");

			List<String> listElems = new ArrayList<>();
			Collections.addAll(listElems, elements);

			myMap.put(modified[index], listElems);
			myWorldMap.add(myMap);

			System.out.println("myMap: " + myMap);
			System.out.println("myWorldMap: " + myWorldMap);
		}
		return true;
	}

	public String visitAtomCompound(ExprParser.AtomCompoundContext ctx){

		System.out.println("Visiting Atom Compound...");


		// 0 1 2 3 4 
		// 0 loves
		// 1 (
		// 2 )
		// 3 romeo
		// 4 juliet

		String op = ctx.getChild(0).getText();
		Map<String, List<String>> myMap = new HashMap<>();


		int childSize = ctx.getChildCount();
		Set<String> children = new HashSet<>();
		for(int i = 1; i < childSize; i++) children.add(ctx.getChild(i).getText());

		System.out.println("op: " + op);

		System.out.println("children_size: " + childSize);
		System.out.println("children: " + children);
		System.out.println("lastChild: " + ctx.getChild(2).getText());

		String[] elements = ctx.getChild(2).getText().split(",");

		System.out.println("elements: " + Arrays.toString(elements));
		System.out.println("first: " + elements[0]);

		//Set<String> finalSet = new HashSet<>();
		//Collections.addAll(finalSet, elements);

		//System.out.println("finalSet: " + finalSet);
		List<String> listElems = new ArrayList<>();
		Collections.addAll(listElems, elements);

		myMap.put(op, listElems);
		myWorldMap.add(myMap);
		

		System.out.println("myMap: " + myMap);
		System.out.println("myWorldMap: " + myWorldMap);
		

		System.out.println("\n");

		//myMap.clear(); 

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


