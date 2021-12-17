import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;


public class PrologInterpreter {

	public static void main(String[] args) throws IOException {

		//
		// Read From File 
		//

		// Ensure that the use entered a prolog file
		if(args.length < 1){
			System.out.println("You have not entered a prolog file...");
			//System.out.println("Do you wish to continue? ");
			return;
		} else if(args.length > 1){
			System.out.println("You have entered too many files!");
			return;
		}

		
		List<Map<String, List<String>>> factMap = new ArrayList<>();
		FileReader fr = new FileReader(args[0]);


		BufferedReader in =
			new BufferedReader(fr);
		CharStream inputStream = CharStreams.fromReader(in);
		ExprLexer lexer = new ExprLexer(inputStream);

		lexer.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> r, Object o, int l, int c,
				String msg, RecognitionException e) {
					throw new RuntimeException(e);
				}
		});

		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(commonTokenStream);
		parser.setErrorHandler(new BailErrorStrategy());

		ParseTree tree = parser.prog();

		ExprEvaluator evaluator = new ExprEvaluator();
		//Double result = evaluator.visit(tree);
		//System.out.println(result);


		factMap = evaluator.getMap();

		String result = evaluator.visit(tree);

		System.out.println("factMap: " + factMap);

		System.out.println("All systems in check result: " + result);

		in.close();

		System.out.println("factMap: " + factMap);
		
		//
		// Prolog emulate
		//

		String inputString = "";

		while (!inputString.equals("q")) {
			System.out.print("prolog> ");

			try {
				Scanner inputReader = new Scanner(new InputStreamReader(System.in));
				inputString = inputReader.nextLine();
				String atom = "";

				
				int facitedCounter = 0;
				for(char c : inputString.toCharArray()){
					if(c == '(')
						facitedCounter++;
				}

				
				if(facitedCounter > 1){
					queryMultiFacited(inputString);
					continue;
				}
						
				for(int i = 0; i < inputString.length(); i++) {
					if(inputString.charAt(i) != '(')
						atom += inputString.charAt(i);
					else 
						break;
				}

				String elems = inputString.substring(atom.length() + 1, inputString.length() - 2);
				elems = elems.replaceAll("\\s", "");
				String[] arrElems = elems.split(",");

				boolean hasVariable = false;

				for(String elf : arrElems){
					if(Character.isUpperCase( elf.charAt(0)))
						hasVariable = true;
				}

				
				
				if(hasVariable) 
					checkVariableFacts(inputString, atom, arrElems, factMap);
				else 
					checkFacts(inputString, atom, arrElems, factMap);
				
			} catch (java.util.NoSuchElementException e){
				break;
			}

			
		}
			
    }

	public static void checkFacts(String inputString, String atom, String[] arrElems,
		List<Map<String, List<String>>> factMap ){
		
		
		List<String> listElems = new ArrayList<String>();

		Collections.addAll(listElems, arrElems);

		//System.out.println("elems: " + elems);
		//System.out.println("arrElems: " + Arrays.toString(arrElems));
		//System.out.println("listElems: " + listElems);

		boolean isFound = false;

		for(Map<String, List<String>> el : factMap){
			if(el.containsKey(atom) ) {
				//System.out.println( "**> " + el.get(atom) );
				//System.out.println( "++> " + listElems);
				if(el.get(atom).equals(listElems))
					isFound = true;

			}
		}

		if(isFound)
			System.out.println("\nYes");
		else
			System.out.println("\nNO");
	}


	public static void checkVariableFacts(String inputString, String atom, String[] arrElems,
		List<Map<String, List<String>>> factMap ){

			System.out.println("Chck Variable Fact.....");

			if(arrElems.length == 1) {
				checkSingleVariableFact(inputString, atom, arrElems, factMap);
				return;
			}

			boolean atomFound = false;

			for(Map<String, List<String>> fact : factMap){
				if (fact.containsKey(atom)) atomFound = true;
			}

			if(!atomFound){
				System.out.println("\nNo such atom found\n");
				return;
			}

			List<String> solutionFact = new ArrayList<>();

			for(Map<String, List<String>> fact : factMap){
				if(fact.containsKey(atom)){
					System.out.println("facts: " + fact.get(atom));
					System.out.println("arrElems: " + Arrays.toString(arrElems) );
					System.out.println("");
					if(fact.get(atom).size() != arrElems.length) continue;

					System.out.println("GONE TO FIND");

					for(int i = 0; i < fact.get(atom).size(); i++){
						if(fact.get(atom).get(i).equals(arrElems[i]) ){
							System.out.println("FOUND bitch");

							solutionFact = fact.get(atom);
						}
					}

					System.out.println("");
				}

				
			}


			System.out.println("solutionFact: " + solutionFact);
			for(int i = 0; i < arrElems.length; i++){
				if(Character.isUpperCase(arrElems[i].charAt(0))){
					System.out.println(arrElems[i] + " = "  + solutionFact.get(i));
				}
			}

	}

	public static void checkSingleVariableFact(String inputString, String atom, String[] arrElems,
		List<Map<String, List<String>>> factMap ){

			System.out.println("Check Single Variable Fact....");

			for(Map<String, List<String>> elf : factMap){
				if(elf.containsKey(atom)){
					System.out.println();
					System.out.println(arrElems[0] + " = " + elf.get(atom).get(0));
					System.out.println();
				}
			}

			
	}

	public static void queryMultiFacited(String inputString){
		System.out.println("querying the multi facited bitch");

		inputString = inputString.replaceAll("\\s", "");

		List<Boolean> boolList  = new ArrayList<>();

		String[] factArray = inputString.split("\\),");

		for(int i = 0; i < factArray.length; i++) {
			if(factArray[i].charAt(factArray.length-1) != ')' && i != factArray.length - 1)
				factArray[i] += ')';
		}

		for(int i = 0; i < factArray.length; i++) {
			if(i != factArray.length - 1)
				factArray[i] += '?';
		}

		System.out.println("fact array..." );
		for(String fact : factArray){
			System.out.println("-" + fact);
		}

		for(String fact : factArray){
			boolList.add(queryMultiFacitedTransitory(fact));
		}
	}

	public static boolean queryMultiFacitedTransitory(String inputString){
		System.out.println("start: " + inputString);
		String atom = "";
		
		for(int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) != '(')
				atom += inputString.charAt(i);
			else 
				break;
		}

		String elems = inputString.substring(atom.length() + 1, inputString.length() - 2);
		elems = elems.replaceAll("\\s", "");
		String[] arrElems = elems.split(",");

		System.out.println("Atom: " + atom);
		for(String elf : arrElems) System.out.println("--" + elf);
		

		System.out.println("\n\n\n\n");
		return false;
	}

	public static void impliesQuery(String inputString){

	}

}
