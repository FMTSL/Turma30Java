package application;

import java.util.Scanner;

public class TesteErro {
	
	public static void main (String[]args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		int valor;
		int valores [] = new int [4];
		
		/* try {
		 * }
		 * catch (erro) {
		 * trata de alguma forma o erro
		 * }*/
		
		System.out.println("Digite a posi��o dentro do vetor 0-3");
		valor = leia.nextInt();
		System.out.println("Digite um valor inteiro: ");
		valores [valor] = leia.nextInt();

		
		System.out.printf("O valor digitado na posi��o %d foi: %d!! \n ", valor, valores);
		System.out.print("valor da divis�o teste: "+valores[valor]/valor);
		System.out.println("FIM DE PROGRAMA!!");
	}

}
