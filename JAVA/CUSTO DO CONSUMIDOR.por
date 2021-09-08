programa
{
  
  funcao inicio()
  {
 

		
	inteiro horas, minutos, segundos, totalsegundos

        escreva("Qual o total de segundos: ")
        leia (totalsegundos)


        horas = totalsegundos / 60
        minutos = (totalsegundos% /1)
        segundos = (totalsegundos / 1 )

        escreva ("Hora(s) :" ,+ horas, "\nMinuto(es) :" ,+ minutos, "\nSegundo(s) :" + segundos)
        
	
    
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */