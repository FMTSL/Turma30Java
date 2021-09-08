import java.util.Scanner;

 class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.printf("Você é Infantil");
		}
		
		else if(idade >14 && idade <= 17) {
			System.out.printf("Você é juvenil");
		}
		
		else if(idade > 17 && idade <=25) {
			System.out.println("Você é adulto");
		}
		
		
		
		
		
	}
}