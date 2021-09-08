

import java.util.Scanner;

public class LOJA {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corrêa de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"Cássia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "Fábio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Flávio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "João Pedro Cruz Gomes",
				"José Paulo de Matos Ferreira Neto", "Letícia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Natália Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vinícios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int nota[] = new int[39];
		String matricula[] = new String[39]; //limite de vezes que pode rodar
		boolean ativo[] = new boolean[39]; 
		
		//criar menu com matricula, status e nota
		System.out.println("MAT\tSTATUS\tNOTA\t");
		for (int x=0;x<38;x++) { //pra rodar até 39 vezes
			nota[x] = 0;
			ativo[x] = true; //boolean
			matricula[x] = "MAT-0"+(x+1); //para começar com 0 e somar com + 1
			System.out.println(matricula[x]+ "\t" +"ATIVO\t"+nota[x]); //para alinhas os nomes na mesma linha
			
		}
		

		




	}

}
