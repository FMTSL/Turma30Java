package ex;

import java.util.Scanner;

public class ex {
	
	public static void main (String[]args) {
	
		Scanner scan = new Scanner (System.in);
	
		
		
		int num, soma=0;
	
	
	do {
	    System.out.printf("Digite o número: ");
	    num =scan.nextInt();
	    soma=soma+num;
	   } 
	
	
	while(num !=0);  
	System.out.printf("A soma é =%d",soma);

}
}


