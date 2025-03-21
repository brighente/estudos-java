import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		if(num1 == 1) {
			JOptionPane.showMessageDialog(null, "Janeiro");
		} else if (num1 == 2) {
			JOptionPane.showMessageDialog(null, "Fevereiro");
		} else if (num1 == 3) {
			JOptionPane.showMessageDialog(null, "Março");
		} else if (num1 == 4) {
			JOptionPane.showMessageDialog(null, "Abril");
		} else if (num1 == 5) {
			JOptionPane.showMessageDialog(null, "Maio");
		} else if (num1 == 6) {
			JOptionPane.showMessageDialog(null, "Junho");
		} else if (num1 == 7) {
			JOptionPane.showMessageDialog(null, "Julho");
		} else if (num1 == 8) {
			JOptionPane.showMessageDialog(null, "Agosto");
		} else if (num1 == 9) {
			JOptionPane.showMessageDialog(null, "Setembro");
		} else if (num1 == 10) {
			JOptionPane.showMessageDialog(null, "Outubro");
		} else if (num1 == 11) {
			JOptionPane.showMessageDialog(null, "Novembro");
		} else if (num1 == 12) {
			JOptionPane.showMessageDialog(null, "Dezembro");
		}
		

	}

}
