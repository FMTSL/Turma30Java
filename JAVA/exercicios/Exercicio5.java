import  java.util.Scanner ;


public  class  Exercicio5 {
	public  static  void  main ( String [] args ) {
		Scanner leia =  new  Scanner ( System.in);

		double nota1, nota2, nota3, media;
		double peso1 =  0.2;
		double peso2=  0.3 ;
		double peso3 =  0.5 ;

		System.out .println (" Digite a primeira nota: " );
		nota1 = leia . nextDouble ();
		System . out . println ( " Digite a segunda nota: " );
		nota2 = leia . nextDouble ();
		System . out. println ( " Digite a terceira nota: " );
		nota3 = leia . nextDouble ();

		media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);

		System . out . printf ( " A m�dia �:% .2f " , media);


	}
}