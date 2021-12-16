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

		while (true) {
			System.out.print("prolog> ");

			try {
				Scanner inputReader = new Scanner(new InputStreamReader(System.in));
				String inputString = inputReader.nextLine();
				System.out.println("input: " + inputString);
				CharStream stream2 = new CharStream(inputString);
				ExprLexer lexer2 = new ExprLexer(stream2);

				lexer2.addErrorListener(new BaseErrorListener() {
					@Override
					public void syntaxError(Recognizer<?, ?> r, Object o, int l, int c,
					String msg, RecognitionException e) {
						throw new RuntimeException(e);
					}
				});

				CommonTokenStream commonTokenStream2 = new CommonTokenStream(lexer2);
				ExprParser parser2 = new ExprParser(commonTokenStream2);
				parser2.setErrorHandler(new BailErrorStrategy());
		
				ParseTree tree2 = parser2.prog();
		
				ExprEvaluator evaluator2 = new ExprEvaluator();
			} catch (java.util.NoSuchElementException e){
				break;
			}

			System.out.println("Continue to process query...");
		}
			
    	}

}
