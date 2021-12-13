import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class PrologInterpreter {

	public static void main(String[] args) throws IOException {

        	BufferedReader in =
         	 new BufferedReader(new InputStreamReader(System.in));
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

		String result = evaluator.visit(tree);

		System.out.println("All systems in check result: " + result);

    	}

}
