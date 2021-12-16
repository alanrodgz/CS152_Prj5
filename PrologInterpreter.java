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

		Map<String, Map<String, Set<String>>> worldMap = new HashMap<>();
		Map<String, List<String>> factMap = new HashMap<>();
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
		
		//
		// Prolog emulate
		//

		String inputString = "";

		while (!inputString.equals("q")) {
			System.out.print("prolog> ");

			try {
				Scanner inputReader = new Scanner(new InputStreamReader(System.in));
				inputString = inputReader.nextLine();
				System.out.println("input: " + inputString);
				inputString += "\n";

				// Create a FileWriter object
				// to write in the file
				FileWriter fWriter = new FileWriter("buff.prolog");
	
				// Writing into file
				// Note: The content taken above inside the
				// string
				fWriter.write(inputString);
	
				// Closing the file writing connection
				fWriter.close();
	
				
				//
				// Query Statement from buff file
				//

				FileReader fr2 = new FileReader("buff.prolog");


				BufferedReader in2 =
					new BufferedReader(fr2);
				CharStream inputStream2 = CharStreams.fromReader(in2);
				ExprLexer lexer2 = new ExprLexer(inputStream2);

				lexer2.addErrorListener(new BaseErrorListener() {
						@Override
						public void syntaxError(Recognizer<?, ?> r, Object o, int l, int c,
						String msg, RecognitionException e) {
							throw new RuntimeException(e);
						}
				});

				CommonTokenStream commonTokenStream2 = new CommonTokenStream(lexer2);
				ExprParser parser2 = new ExprParser(commonTokenStream2);
				parser.setErrorHandler(new BailErrorStrategy());

				ParseTree tree2 = parser2.prog();

				ExprEvaluator evaluator2 = new ExprEvaluator();
				//Double result = evaluator.visit(tree);
				//System.out.println(result);


		

				String result2 = evaluator2.visit(tree2);

		

				System.out.println("All systems in check result: " + result2);

				in2.close();

				
			} catch (java.util.NoSuchElementException e){
				break;
			}

			System.out.println("Continue to process query...");
		}
			
    	}

}
