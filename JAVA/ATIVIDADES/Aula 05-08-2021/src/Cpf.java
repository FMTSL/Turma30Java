import java.util.*;

public class Cpf {


 
	public static void main(String[] args) {
		
		
		String codTime[] = new String[4];
		String nomesTimes[];
		int pontosTimes[];
		char op;
		String auxiliarCod;
		
		System.out.println();
		System.out.println("COD\tTime\tPONTOS");
		
		for(int x=0;x<codTime.length;x++) {
			System.out.printf("%s\t%s\t%d\n", codTime[x],nomesTimes[x],pontosTimes[x]);
		}
		//la�o do time
		System.out.println();
		for (int x=0; x=0;x<3;x++){//vai rodar 3 vezes
			System.out.println("Rodada " + (x+1));
			
			//RODA TODOS OS TIMES.. VETOR COME�A DO ZERO
			for (int y=0; y<codTime.length; y++) {
				System.out.print(nomesTimes[y]+"G-ganhou, P-perdeu ou E-empate: ");
				op = leia.next().toUpperCase().charAt(0);
				if (op =='G') {
					pontosTimes[y] = pontosTimes[y]+3;
				}
				else if (op =='E') {
					pontosTimes[y] += 1; //pontos times +1
				}
				else {
					System.out.println("Vc n�o escolheu um codigo ");
				}
				
				
			}
		}

	}

}
