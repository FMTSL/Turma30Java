import java.util.Scanner;

public class OiMundo {
	
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		double d;
		double p1;
		double p2;
		
		
		
		
		System.out.print("Digite o valor de X1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de X1: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de X1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de X1: ");
		y2 = leia.nextDouble();
		
		d= Math.sqrt((Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)));
		
		System.out.println("\n A TAL DISTÂNCIA É: " +d);
		
		
		
		
		
	
    }

}