package main;

import java.util.Hashtable;

import compilador.analysis.DepthFirstAdapter;
import compilador.node.*;

public class SemanticAnalyzer extends DepthFirstAdapter{

	static Hashtable<String, String> simbolos = new Hashtable<>();
	static Hashtable<String, Integer> vetor = new Hashtable<>();
	
	public int getPos(String n, String d){
		int pos = n.lastIndexOf(d);
		return pos;
	}
	
	@Override
	public void outADeclarDeclaracao(ADeclarDeclaracao node) {
		// TODO Auto-generated method stub
		//super.outADeclarDeclaracao(node);
		TTipo tipo = node.getTipo();
		String ids = node.getVar().toString();
		try {
			if (ids.contains(",")){
				String[] data = ids.split(",");
				for (int i = 0; i < data.length; i++) {
					if (data[i].contains("[") && data[i].contains("]")){
						String name = data[i].split("\\[")[0].trim();
						int tam = Integer.parseInt(data[i].split("\\[")[1].split("\\]")[0].trim());
						if (simbolos.containsKey(name)){
							throw new SemanticException("[ "+tipo.getLine()+", "+(tipo.getLine()+tipo.getText().length()+getPos(ids, data[i].trim()))+"] Variável '"+name+"' já está declarada.");
						}else{
							simbolos.put(name, tipo.getText());
							vetor.put(name, tam);
						}
					}else{
						
						if (simbolos.containsKey(data[i].trim())){
							throw new SemanticException("["+tipo.getLine()+","+(tipo.getLine()+tipo.getText().length()+getPos(ids, data[i].trim()))+"] Variável '"+data[i].trim()+"' já está declarada.");
						}else{
							simbolos.put(data[i].trim(), tipo.getText());
						}
					}
				}
			}else{
				
				if (ids.contains("[") && ids.contains("]")){
					String name = ids.split("\\[")[0].trim();
					int tam = Integer.parseInt(ids.split("\\[")[1].split("\\]")[0].trim());
					if (simbolos.containsKey(name)){
						throw new SemanticException("[ "+tipo.getLine()+","+(tipo.getLine()+tipo.getText().length()+getPos(ids, ids.trim()))+"] Variável '"+ids.trim()+"' já está declarada.");
					}else{
						simbolos.put(name, tipo.getText());
						vetor.put(name, tam);
					}
				}else{
					
					if (simbolos.containsKey(ids.trim())){
						throw new SemanticException("[ "+tipo.getLine()+","+(tipo.getLine()+tipo.getText().length()+getPos(ids, ids.trim()))+"] Variável '"+ids.trim()+"' já está declarada.");
					}else{
						simbolos.put(ids.trim(), tipo.getText());
					}
				}
			}
		} catch (SemanticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseAIdExpressao(AIdExpressao node) {
		// TODO Auto-generated method stub
		//super.outAIdExpressao(node);
		String id = node.getIdentificador().toString().trim();
		String name = id.split("\\[")[0].trim();
		try {
			if (!isNumber(name) && !simbolos.containsKey(name)){
				throw new SemanticException("A variável '"+name+"' é usada mas não foi declarada.");
			}else{
				int i = Integer.parseInt(id.split("\\[")[1].split("\\]")[0].trim());
				int j = vetor.get(name);
				if (i >= j || i < 0)
					throw new SemanticException("Índice fora do intervalo do vetor.");
			}
		} catch (SemanticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public boolean validaTipo(String tipo){
		return (tipo.equals("inteiro") || tipo.equals("real") || tipo.equals("caractere"));
	}
	
	public boolean avaliaTipo(String tipo_key, String tipo){
		if (validaTipo(tipo) && validaTipo(tipo_key)){
			if ((tipo_key.equals("real") && !tipo.equals("caractere")) || (tipo.equals("real") && !tipo_key.equals("caractere"))){
				return true;
			}else{
				if (tipo_key.equals("inteiro") && tipo.equals(tipo_key))
					return true;
				else
					if (tipo_key.equals("caractere") && tipo.equals("caractere"))
						return true;
					else
						return false;
			}
		}else{
			return false;
		}
	}
	
	public boolean isNumber(String n){
		int init = 0;
		if (n.startsWith("-"))
			init = 1;
		for (int i = init; i < n.length(); i++) {
			if (!Character.isDigit((int)n.charAt(i))) return false;
		}
		return true;
	}
	
	public String getTipo(String var) throws SemanticException{
		if (var.startsWith("'") && var.endsWith("'"))
			return "caractere";
		else
			if (var.contains("."))
				return "real";
			else
				if (isNumber(var))
					return "inteiro";
				else
					if (simbolos.containsKey(var))
						return simbolos.get(var);
					else 
						throw new SemanticException("A variável '"+var+"' é usada mas não foi declarada.");
	}
	
	public String avaliaExp(String exp) throws SemanticException{
		String[] termos = exp.split(" ");
		boolean flag = true;
		String tipo = getTipo(termos[0]);
		if (vetor.containsKey(termos[0]) && !termos[1].equals("[")) return "erro";
		int vet = 0;
		StringBuilder builder = new StringBuilder();
		if (vetor.containsKey(termos[0])){
			vet = vetor.get(termos[0]);
			builder = new StringBuilder();
			int i = 1;
			do{ 
				if (!termos[i].equals("[") && !termos[i].equals("]")) builder.append(termos[i]);
				i++;
			}while (!termos[i].equals("]"));
			int tam = Integer.parseInt(builder.toString());
			if ((vet != 0) && (tam >= vet || tam < 0)) throw new SemanticException("Índice fora do intervalo do vetor.");
		}
			
		
		for (int i = 1; i < termos.length; i++) {
			vet = 0;
			if (termos[i].equals("[")){ 
				builder = new StringBuilder();
				do{ 
					if (!termos[i].equals("[") && !termos[i].equals("]")) builder.append(termos[i]);
					i++;
				}while (!termos[i].equals("]"));
				i++;
			}else{
				if (vetor.containsKey(termos[i]))
					vet = vetor.get(termos[i]);
			}
			int tam = 0;
			if (builder.length() > 0)
				tam = Integer.parseInt(builder.toString());
			if (i >= termos.length)  if (!flag) return "erro"; else break;
			else
				if (vetor.containsKey(termos[i]) && !vetor.containsKey(termos[0])) return "erro";
			
			if ((vet != 0) && (tam >= vet || tam < 0)) throw new SemanticException("Índice fora do intervalo do vetor.");  
			flag = avaliaTipo(tipo, getTipo(termos[i]));
			if (!flag) return "erro";
		}
		return tipo;
	}
	
	
	@Override
	public void caseAAtribuicaoComando(AAtribuicaoComando node) {
		// TODO Auto-generated method stub
		//super.caseAAtribuicaoComando(node);
		String id = node.getIdentificador().toString().trim();
		String name = id.split("\\[")[0].trim();
		try {
			if (!simbolos.containsKey(name)) 
				throw new SemanticException("A variável '"+id+"' é usada mas não foi declarada.");
			else{
				if (id.contains("[") && id.contains("]")){
					String tipo_id = simbolos.get(name);
					String tipo_exp = avaliaExp(node.getExpressao().toString());
					int i = Integer.parseInt(id.split("\\[")[1].split("\\]")[0].trim());
					int j = vetor.get(name);
					if (i >= j || i < 0) 
						throw new SemanticException("Índice fora do intervalo do vetor.");
					if (!avaliaTipo(tipo_id, tipo_exp))
						if (tipo_exp.equals("erro"))
							throw new SemanticException("Tipos incompativeis, expressão com os tipos dos valores diferentes.");
						else
							throw new SemanticException("Tipos incompativeis, tipo esperado '"+tipo_id+"' mas encontrado '"+tipo_exp+"'.");
				}
				else{
					String tipo_id = simbolos.get(id);
					String tipo_exp = avaliaExp(node.getExpressao().toString());
					if (!avaliaTipo(tipo_id, tipo_exp))
						if (tipo_exp.equals("erro"))
							throw new SemanticException("Tipos incompativeis, expressão com os tipos dos valores diferentes.");
						else
							throw new SemanticException("Tipos incompativeis, tipo esperado '"+tipo_id+"' mas encontrado '"+tipo_exp+"'.");
				}
			}
		} catch (SemanticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public void outAAtribuicaoComando(AAtribuicaoComando node) {
		// TODO Auto-generated method stub
		//super.outAAtribuicaoComando(node);
		String id = node.getIdentificador().toString().trim();
		String name = id.split("\\[")[0].trim();
		try {
			if (!simbolos.containsKey(name)){
				throw new SemanticException("A variável '"+name+"' é usada mas não foi declarada.");
			}
		} catch (SemanticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public void inAIdVarIdentificador(AIdVarIdentificador node) {
		// TODO Auto-generated method stub
		//super.caseAIdVarIdentificador(node);
		int i = Integer.parseInt(node.getNumber().toString().trim());
		try{
			if (i < 0)
				throw new SemanticException("Vetor com tamanho negativo.");
		}catch(SemanticException e){
			e.printStackTrace();
		}		
	}
	
	@Override
	public void caseASeComando(ASeComando node) {
		// TODO Auto-generated method stub
		//super.caseASeComando(node);
		try{
			if (!validaTipo(avaliaExp(node.getExpressaoLogica().toString().trim())))
				throw new SemanticException("Tipos incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseAEnquantoComando(AEnquantoComando node) {
		// TODO Auto-generated method stub
		//super.caseAEnquantoComando(node);
		try{
			if (!validaTipo(avaliaExp(node.getExpressaoLogica().toString().trim())))
				throw new SemanticException("Tipos incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseAAvalieComando(AAvalieComando node) {
		// TODO Auto-generated method stub
		//super.caseAAvalieComando(node);
		try{
			if (!validaTipo(avaliaExp(node.getExpressao().toString().trim())))
				throw new SemanticException("Tipos incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseARepitaComando(ARepitaComando node) {
		// TODO Auto-generated method stub
		//super.caseARepitaComando(node);
		try{
			if (!validaTipo(avaliaExp(node.getExpressaoLogica().toString())))
				throw new SemanticException("Tipos incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseAParaComando(AParaComando node) {
		// TODO Auto-generated method stub
		//super.caseAParaComando(node);
		String name = node.getIdentificador().toString().split("\\[")[0].trim();
		try{
			if (!simbolos.containsKey(name))
				throw new SemanticException("A variável '"+name+"' é usada mas não foi declarada.");
			if (!avaliaTipo(avaliaExp(node.getIdentificador().toString().trim()),"inteiro"))
				throw new SemanticException("Tipos Incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void caseAParaPassoComando(AParaPassoComando node) {
		// TODO Auto-generated method stub
		//super.caseAParaPassoComando(node);
		String name = node.getIdentificador().toString().split("\\[")[0].trim();
		try{
			if (!simbolos.containsKey(name))
				throw new SemanticException("A variável '"+name+"' é usada mas não foi declarada.");
			if (!avaliaTipo(avaliaExp(node.getIdentificador().toString()),"inteiro"))
				throw new SemanticException("Tipos Incompativeis.");
		}catch(SemanticException e){
			e.printStackTrace();
		}
	}
}
