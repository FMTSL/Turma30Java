

import java.util.Scanner;

public class LOJA {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corr�a de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"C�ssia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "F�bio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Fl�vio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "Jo�o Pedro Cruz Gomes",
				"Jos� Paulo de Matos Ferreira Neto", "Let�cia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Nat�lia Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vin�cios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int nota[] = new int[39];
		String matricula[] = new String[39]; //limite de vezes que pode rodar
		boolean ativo[] = new boolean[39]; 
		
		//criar menu com matricula, status e nota
		System.out.println("MAT\tSTATUS\tNOTA\t");
		for (int x=0;x<38;x++) { //pra rodar at� 39 vezes
			nota[x] = 0;
			ativo[x] = true; //boolean
			matricula[x] = "MAT-0"+(x+1); //para come�ar com 0 e somar com + 1
			System.out.println(matricula[x]+ "\t" +"ATIVO\t"+nota[x]); //para alinhas os nomes na mesma linha
			
		}
		

		




	}

}
