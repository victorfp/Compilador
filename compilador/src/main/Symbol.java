package main;

public class Symbol {

	private String name;
	private int tamanho;
	
	public String getName() {
		return name;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Symbol(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		tamanho = 0;
	}
	
	public Symbol(String name, int qtd) {
		// TODO Auto-generated constructor stub
		this.name = name;
		tamanho = qtd;
	}
	
}
