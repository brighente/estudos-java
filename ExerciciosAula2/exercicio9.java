import javax.swing.JOptionPane;

public class exercicio9 {

	public static void main(String[] args) {
		
		boolean proximo = false;
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			proximo = numero >=0;
			
			if(proximo) {
				System.out.println(numero);
			}
		} while(proximo);
		
	}

}
