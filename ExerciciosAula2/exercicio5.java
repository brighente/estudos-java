import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero: "));
		double result = 0;
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão"));

		switch (opcao) {
			case 1:
				result = num1+ num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;

			default: JOptionPane.showMessageDialog(null, "Operação inválida");
				break;
		}
		
		if(opcao > 0 && opcao <=4) {
			JOptionPane.showMessageDialog(null, "O resultado é: "+result);
		}
		
		
	}

}
