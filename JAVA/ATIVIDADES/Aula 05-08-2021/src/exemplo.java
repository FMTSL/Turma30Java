import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String agenda [][] = new String [24][31]; //24 lindas e 31 colunas (ela é bi dimensional
		int auxDia, auxHora;
		char op;
		
		
		do {
		System.out.println("Digite o dia do evento:");
		auxDia = leia.nextInt()-1; //PARA SUBTRAIR A CONTA DO VETOR
		System.out.println("Digite a hora do evento");
		auxHora = leia.nextInt();
		leia.nextLine();//limpa buffer de teclado
		System.out.println("Digite o evento:");
		agenda[auxHora][auxDia] = leia.nextLine();		
		System.out.print("Continua S/N: ");
		op = leia.next().toUpperCase().charAt(0);//charArt le a primera posição. 
		}
		
		while (op =='S'); //SE DIGITAR SIM ELE CONTINUA, SE DIGITAR N ELE SAI NO LOOPING
		System.out.println("Mostrar a agenda");
		for(int dia=0; dia<31; dia++) {
			for (int hora=0;hora<24;hora++) {
				if(agenda[hora][dia] != null) { //Não mostrar a agenda toda, eliminando o espaço vazio
				System.out.printf("Dia %d - hora %d : %s\n", dia+1, hora, agenda[hora][dia]);
				}
				}
		}
		}
		

	}


