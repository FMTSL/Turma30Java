import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero, raiz, numeroQuadrado;
		
		System.out.println("Digite o n�mero: ");
		numero = scan.nextDouble();
		
		if( (numero%2) == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero %.2f � par, sua raiz � %.2f", numero, raiz);
		}
		else {
			numeroQuadrado = numero * numero;
			System.out.printf("O n�mero %.2f � �mpar, seu quadrado � %.2f", numero, numeroQuadrado);
		}

	}

}