package main;
import java.io.*;
import java.io.ObjectInputStream.GetField;

import compilador.analysis.AnalysisAdapter;
import compilador.lexer.*;
import compilador.lexer.Lexer.State;
import compilador.node.*;
import compilador.parser.*;

public class Main {
	
	public static void main(String[] args){
		Reader r;
		try {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Iniciando Teste para '"+args[i]+"'\n");
				r = new FileReader(args[i]);
			
				/*Parser p = new Parser(new MyLexer(new PushbackReader(r)));
				Start s = p.parse();
				*/
				
				MyLexer l = new MyLexer(new PushbackReader(r));
				while(true){
					Token t = l.next();
					String name = t.getClass().getSimpleName();
					if (!name.equals("EOF")){
						name = name.substring(1,name.length());
					}
					if (t instanceof TBlank){
						System.out.print(t.getText());
					}else
						System.out.print(name);
					if(t instanceof EOF)
						break;
				}
				System.out.println("\nTeste Finalizado com Sucesso\n");
				r.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}