programa{
	
	funcao inicio(){
		//declaração de variaveis 
		cadeia auxCod
		caracter opcao = 'V'
		real icms = 0.00, descontoAVista = 0.00, pagamentoCartao = 0.00, pagamentoParcelado = 0.00
		inteiro quantidade=0, op = 0, x=0, contador = 0, quantidadeCarrinho[10]
		real total = 0.0
		real totalCarrinho = 0.0
		cadeia produtoCarrinho[10]
		cadeia codigo[10]	cadeia produto[10]             real valor[10] inteiro estoque[10]

		//declaração de vetores
		codigo[0] = "G5-1"  produto[0] = "RODO DE PIA"     valor[0] = 20.00  estoque[0] = 10
		codigo[1] = "G5-2"  produto[1] = "VASSOURA"        valor[1] = 10.00  estoque[1] = 10
		codigo[2] = "G5-3"  produto[2] = "ROBÔ ASPIRADOR"  valor[2] = 250.00 estoque[2] = 10
		codigo[3] = "G5-4"  produto[3] = "ASPIRADOR DE PÓ" valor[3] = 150.00 estoque[3] = 10
		codigo[4] = "G5-5"  produto[4] = "LIXEIRA  "       valor[4] = 15.00  estoque[4] = 10
		codigo[5] = "G5-6"  produto[5] = "RODO MAGICO"     valor[5] = 55.00  estoque[5] = 10
		codigo[6] = "G5-7"  produto[6] = "PÁ DE LIXO"      valor[6] = 5.00   estoque[6] = 10
		codigo[7] = "G5-8"  produto[7] = "TAPETE DE PIA"   valor[7] = 22.00  estoque[7] = 10
		codigo[8] = "G5-9"  produto[8] = "SACOLA DE LIXO"  valor[8] = 12.00  estoque[8] = 10
		codigo[9] = "G5-10" produto[9] = "ESFREGÃO "       valor[9] = 18.00  estoque[9] = 10

		//entradas
		escreva("Deseja fazer compras? (S/N): ")
		leia(opcao)
		se(opcao == 's' ou opcao == 'S'){
		limpa()
		
		//cabeçalho 
		escreva("LIMPAJÁ\n")
		escreva("Cuidando do seu lar\n")
		escreva("----------------------------------------------------------------------------------------------------------\n")
		escreva("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE\n")
		escreva("----------------------------------------------------------------------------------------------------------\n")
		//para tem a função de varrer os vetores e exibir o catalogo 
		para (x=0;x<10; x++){
			escreva(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x],"\n")
		}
		//condição para rodar o programa enquanto o clinete quiser comprar
		escreva("Deseja comprar? (V) ou Finalizar compra(F): ")
		leia(opcao)
		enquanto(opcao == 'V' ou opcao == 'v'){	
		escreva("SELECIONE O CODIGO DO PRODUTO: ")
		leia(auxCod)
		escreva("INFORME QUANTAS UNIDADES: ")
		leia(quantidade)
		limpa()

		//final da 1 parte - Felipe
		
		//processamentos
		para(x=0; x < 10; x++){
			se(auxCod == codigo[x]){
				se(quantidade <= estoque[x] e quantidade >0){ //validação de estoque
					
					total = valor[x] *quantidade //calcula o valor do pedido sem ICMS e sem os adicionais das opções de pagamento
					totalCarrinho += total
					estoque[x] = estoque[x] - quantidade //atualização de estoque 
					icms = (totalCarrinho) * 0.09 //calculo do ICMS
					quantidadeCarrinho[contador] = quantidade//adicionando a quantidade ao vetor de quantidade 
					produtoCarrinho[contador] = produto[x] //adiciona o produto ao vetor de produto 
					contador++//mantém os indices de quantidadeCarrinho e produtoCarrinho atualizados
					
					//exibição do produto selecionado
					escreva(codigo[x],"\t", produto[x],"\t Unidades ",quantidade, "\t Valor total ", (total),"\n")
					
					//verificação de continuidade ou encerramento de compra, caso a resposta seja V o loop se repete a partir da linha 45
					escreva("Deseja continuar comprando?(V) ou Prosseguir para opções de pagamento?(F)\n: ")
					leia(opcao)
					limpa()
					se(opcao == 'V' ou opcao == 'v'){
						escreva("----------------------------------------------------------------------------------------------------------\n")
						escreva("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE\n")
						escreva("----------------------------------------------------------------------------------------------------------\n")
						para (x=0; x<10; x++){
							escreva(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x],"\n")
						}
						} 
						//encerramento da compra e opçoes de pagamento
						
						se(opcao == 'F' ou opcao == 'f'){
						escreva("Escolha a forma de pagamento:\n 1: Á vista (10% de desconto)\n 2: Cartão com acrescimo de 10%\n 3: 2 parcelas (acrescimo de 15%) \n")
						leia(op)
						limpa()
						escreva("----------------------------------------------------------------------------------------------------------\n")
						escreva("NOTA FISCAL\t LIMPAJÁ\n")
						escreva("\nICMS DE 9% CALCULADO SOBRE O VALOR TOTAL DA COMPRA! \n")
						//subtrai um do contador para exibir os produtos e unidades na posição do contador na nota fiscal
						para(inteiro i = contador - 1; i >= 0; i--){
							escreva(produtoCarrinho[i], " Unidades: ", quantidadeCarrinho[i],"\n")
						}
						//final da segunda parte

						//inicio 3 parte Sabrina
						
						//opções de pagamento 
						se(op == 1){
							descontoAVista = totalCarrinho * 0.10
							escreva("Valor total da compra: ", totalCarrinho + icms - descontoAVista, "\n")
						} se(op == 2){
							pagamentoCartao = totalCarrinho * 0.10
							escreva("Valor total da compra: ", totalCarrinho + icms + pagamentoCartao, "\n")
						} se (op == 3){
							pagamentoParcelado = totalCarrinho * 0.15
							escreva("Valor total da compra: ", totalCarrinho + icms + pagamentoParcelado, "\n")
							escreva("Valor das parcelas: ", (totalCarrinho + icms + pagamentoParcelado) / 2.00, "\n")
						}
					}
				//validação de estoque para informar ao cliente se o pedido pode ser realizado
				} senao {
						escreva("----------------------------------------------------------------------------------------------------------\n")
						escreva("COD\t\tPRODUTO\t\t\t\tVALOR R$\t\tESTOQUE\n")
						escreva("----------------------------------------------------------------------------------------------------------\n")
						para (x=0; x<10; x++){
							escreva(codigo[x],"\t\t",produto[x],"\t\t\t",valor[x],"\t\t\t",estoque[x],"\n")
						}
						escreva("Quantidade Indisponivel\n")
						escreva("Por favor, insira o codigo novamente com uma quantidade válida.\n")
				}
			} senao {
				escreva("Codigo do produto invalido, por favor, insira um codigo válido.\n")
			}pare
		}
		}//final enquanto Felipe 
	escreva("COMPRA FINALIZADA, OBRIGADA POR COMPRAR CONOSCO\n")
		}
		//caso o cliente informe que não deseja comprar 
		senao se(opcao == 'n' ou opcao == 'N'){
		escreva("Volte Sempre!!!")
		}
		//caso o cliente digite um caracter invalido 
		senao{
		escreva("Opcao inválida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */