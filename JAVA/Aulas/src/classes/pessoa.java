package classes;

public class pessoa {

	private String nome; //CLASSE - ATRIBUTOS
	private int anoNascimento; //PRIVATE SERVE PARA PRIVATIVAR O ATIBUTO E PUBLIC TORNAR O ATIBUTO ABERTO(ENCAPUSULAMENTO)
	private String cpf;
	private char pronome; //M, F, E
	private boolean ativo;//pra saber se está ativa ou não, true FALSE
	
	
	//Construtores - dita a regra da classe.. Construtores tem mesmo nome da classe
	public pessoa(String nome) {
		this.nome = nome; //atributo vai receber
	}
	
	
	
	
	
	
	
	//METODO -sempre que tem verbo 
	 public void mostrarIdade() {
		 System.out.println(2021-anoNascimento); 
	 }
	public int calcIdade (int anoAtual) {
		int valor;
		
		valor = anoAtual - anoNascimento;
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
