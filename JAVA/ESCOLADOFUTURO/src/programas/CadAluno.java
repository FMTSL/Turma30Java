package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String alunes[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length]; //MAT-0X
		boolean ativo[] = new boolean[alunes.length]; //true or false
		char op, status; 
		String auxCod;
		int auxNota;
		
		//cria��o de cod matricula
		for(int i = 0; i < alunes.length; i++) {
			if(i > 8) {
				matriculas[i] = "MAT - "+(i+1);
			}
			else {
				matriculas[i] = "MAT - 0"+(i+1);
			}
			
		}
		
		//colocando ativo em todos os alunos 
		for(int i = 0; i < alunes.length; i++) {
			ativo[i] = true;
		}
		
	
		//imprimindo o nome dos alunos e cod matricula
		System.out.println("MATR�CULAS\tALUNOS\n");
		for(int i = 0; i < alunes.length; i++) {
			System.out.printf("%s \t %s \n",matriculas[i],alunes[i],notas);
		}
		
		do {
			
			System.out.print("\nINFORME O C�DIGO DE MATR�CULA DO ALUNO: ");
			auxCod = leia.next().toUpperCase();
			leia.nextLine(); //PARA ESVAZIAR O TECLADO
			System.out.print("INFORME A NOTA: ");
			auxNota = leia.nextInt(); //MUDA DE ".nextDouble()" PARA ".nextInt()"
			System.out.print("O ALUNE EST� ATIVO (DIGITE A) OU INATIVO (DIGITE I): ");
			status = leia.next().toUpperCase().charAt(0);
			
			for(int i = 0; i < alunes.length; i++) {
				if(matriculas.equals(auxCod)) {
					notas[i] = auxNota; 
					
					if(status == 'A') {
						ativo[i] = true;
									}
					if(status == 'I') {
						ativo[i] = false;
										}
												}		
													}
			
			
			System.out.print("DESEJA CONTINUAR? [S ou N]");
			op = leia.next().toUpperCase().charAt(0);
			
		}
		
		while(op == 'S');
		

		for(int i = 0; i < alunes.length; i++) {
			if(notas[i] != 1) { //MUDAR PARA "null"
				if(notas[i] <= 5) {
					
					if(ativo[i] == true) {
						System.out.printf("MATR�CULA: %s. NOME: %s. NOTA: %d. ALUNE ATIVO.",matriculas[i],alunes[i],notas[i]);
						System.out.printf("\nESTUDE MAIS!");
					}
					else {
						System.out.printf("MATR�CULA: %s. NOME: %s. NOTA: %d. ALUNE INATIVO.",matriculas[i],alunes[i],notas[i]);
						System.out.printf("\nESTUDE MAIS!");
					}
				}
				
				
				
				else {
					if(ativo[i] == true) {
						System.out.printf("MATR�CULA: %s. NOME: %s. NOTA: %d. ALUNE ATIVO.",matriculas[i],alunes[i],notas[i]);
						System.out.printf("\n�TIMO! CONTINUE ASSIM.");
					}
					else {
						System.out.printf("MATR�CULA: %s. NOME: %s. NOTA: %d. ALUNE INATIVO.",matriculas[i],alunes[i],notas[i]);
						System.out.printf("\n�TIMO! CONTINUE ASSIM.");
					}
				}
			
				
				
				System.out.printf("MATR�CULA: %s. NOME: %s. NOTA: %d. ALUNE INATIVO.",matriculas[i],alunes[i],notas[i]);
				System.out.printf("\n�TIMO! CONTINUE ASSIM.");
				
				
			}
			
		}
		//MOSTRA TODO MUNDO
		//LA�O E PEDE:  
		//VALOR TRUE PRIMEIRO MOMENTO 
		//DEPOIS PEDIR PELA MATRICULA
		//VAI INFORMAR SE O ALUNO AINDA CONTINUA ATIVO OU N�O 
		//USUARIO TEM QUE DIGITAR TRUE OU FALSE
		//TEM QUE FAZER O PROCESSO AT� QUE O PROGRAMA CONTINUE SIM OU N�O
		//APOS MOSTRAR TODOS OS ALUNOS COM NOTA PELA REGRA
		//ATE 5- ESTUDE MAIS
		//ACIME DE 5 - OTIMO CONTINUE ASSIM
		//ALUNO INATIVO OU ALUNO ATIVO BASEADO NO TRUE OU FALSE DE ATIVO
		//SOMENTE OS ALUNOS QUE TEM NOTA
	}
}
	

