package main;
import java.io.*;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

import compilador.analysis.*;
import compilador.lexer.*;
import compilador.node.*;
import compilador.parser.*;

public class Main {
	
	public static void main(String[] args){
		Reader r;
		try {
			
			if (args.length > 0){
				for (int i = 0; i < args.length; i++) {
					//System.out.println("Iniciando Teste para '"+args[i]+"'\n");
					r = new FileReader(args[i]);
				
					Parser p = new Parser(new MyLexer(new PushbackReader(r,1024)));
					Start s = p.parse();
					s.apply(new SemanticAnalyzer());
					//System.out.println("\nTeste Finalizado com Sucesso\n");
					//System.out.println(SemanticAnalyzer.simbolos);
					r.close();
				}
			}
			else{
				String dir = "./Teste";
				File f = new File(dir);
				String[] names = f.list();
				for (int i = 0; i < names.length; i++) {
					System.out.println("Iniciando Teste para '"+names[i]+"'\n");
					r = new FileReader(dir+"/"+names[i]);
				
					Parser p = new Parser(new MyLexer(new PushbackReader(r,1024)));
					Start s = p.parse();
					s.apply(new SemanticAnalyzer());
					System.out.println("\nTeste Finalizado com Sucesso\n");
					r.close();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
	}
}