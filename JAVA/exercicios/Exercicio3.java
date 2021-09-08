
	import javax.swing.JOptionPane; public class Segundo { 
		
		
		public static void main(String[] args) { 
		
		int a, b, c, r, s, d; 
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de a ")); 
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de b ")); 
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de c ")); 
		r = (int) Math.pow((a+b), 2); s = (int) Math.pow((b+c), 2); d = r+s/2;

	JOptionPane.showMessageDialog(null, "Valor da expressão: "+d);

	System.exit(0); }
	}




