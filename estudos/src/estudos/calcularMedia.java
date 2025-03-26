package estudos;

import javax.swing.JOptionPane;

public class calcularMedia {
	
	public static void main(String[] args) {
	int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota: "));
	int peso1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da nota: "));
	int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota: "));
	int peso2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da nota: "));
	int n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota: "));
	int peso3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da nota: "));
	
	float mediaPond = (n1*peso1 + n2*peso2 + n3*peso3)/(peso1 + peso2 + peso3);
	System.out.println("A sua média final é: " + mediaPond);

	}
}
