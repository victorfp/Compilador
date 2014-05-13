package main;
import java.io.*;
import java.io.ObjectInputStream.GetField;

import compilador.analysis.AnalysisAdapter;
import compilador.lexer.*;
import compilador.lexer.Lexer.State;
import compilador.node.*;
import compilador.parser.*;

public class Main {
	
	public static void main(String[] args) throws IOException, LexerException{
		Reader r;
		try {
			r = new FileReader("entrada.txt");
		
		/*Parser p = new Parser(new Lexer(new PushbackReader(r)));
		Start s = p.parse();
		*/
			MyLexer l = new MyLexer(new PushbackReader(r));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}