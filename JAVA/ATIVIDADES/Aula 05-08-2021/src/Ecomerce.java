import java.util.Scanner;

public class Ecomerce {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
	}
		String auxCod;
		char opcao = 'V';
		double icms = 0.00, descontoAVista = 0.00, pagamentoCartao = 0.00, pagamentoParcelado = 0.00;
		int quantidade=0, op = 0, x=0, contador = 0; double quantidadeCarrinho[]= new double[10];
		double total = 0.0;
		double totalCarrinho = 0.0;
		String produtoCarrinho[] = new String[10];
		String codigo[]= new String[10];	
		String produto[]= new String[10];            
		double valor[]= new double[10];
		int estoque[] = new int[10];
		//VETORES
		codigo[0] = "G5-1";  produto[0] = "RODO DE PIA";     valor[0] = 20.00;  estoque[0] = 10;
		codigo[1] = "G5-2";  produto[1] = "VASSOURA";        valor[1] = 10.00;  estoque[1] = 10;
		codigo[2] = "G5-3";  produto[2] = "ROBÔ ASPIRADOR";  valor[2] = 250.00; estoque[2] = 10;
		codigo[3] = "G5-4";  produto[3] = "ASPIRADOR DE PÓ"; valor[3] = 150.00; estoque[3] = 10;
		codigo[4] = "G5-5";  produto[4] = "LIXEIRA  ";       valor[4] = 15.00;  estoque[4] = 10;
		codigo[5] = "G5-6";  produto[5] = "RODO MAGICO";     valor[5] = 55.00;  estoque[5] = 10;
		codigo[6] = "G5-7";  produto[6] = "PÁ DE LIXO";      valor[6] = 5.00;   estoque[6] = 10;
		codigo[7] = "G5-8";  produto[7] = "TAPETE DE PIA";   valor[7] = 22.00;  estoque[7] = 10;
		codigo[8] = "G5-9";  produto[8] = "SACOLA DE LIXO";  valor[8] = 12.00;  estoque[8] = 10;
		codigo[9] = "G5-10"; produto[9] = "ESFREGÃO ";       valor[9] = 18.00;  estoque[9] = 10;
		//ENTRADAS
		System.out.printf("Deseja fazer compras? (S/N): ");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if (opcao == 'S'){ //CABEÇALHO
					System.out.println("LIMPAJÁ");
					System.out.println("Cuidando do seu lar");
					System.out.println("---------------------------------------------------------------------------------------------------");
					System.out.println("COD\\t\\tPRODUTO\\t\\t\\t\\tVALOR R$\\t\\tESTOQUE");
					System.out.println("---------------------------------------------------------------------------------------------------");
					//para tem a função de varrer os vetores e exibir o catalogo!!
					for(x=0;x<10; x++) {
					System.out.printf(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x], "\n");
					}
					System.out.println("Deseja comprar? (V) ou Finalizar compra(F): ");
					Scanner leia;
					opcao = leia.next().toUpperCase().charAt(0);
					
					while(opcao == 'V') {//Abre While1
						System.out.println("SELECIONE O CODIGO DO PRODUTO: ");
						auxCod = leia.nextLine();
						System.out.println("INFORME QUANTAS UNIDADES: ");
						quantidade = leia.nextInt();
						}//Fecha While 2

}
}
}
