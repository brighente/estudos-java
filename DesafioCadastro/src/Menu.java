import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
		
		int opcaoEscolhida = -1;
			
			do {
				
				try {
					opcaoEscolhida = Integer.parseInt(JOptionPane.showInputDialog
							("1- Cadastrar PET\n"
							+ "2- Listar PET\n"
							+ "3- Deletar PET\n"
							+ "4- Listar PETS\n"
							+ "5- Listar PETS por critério\n"
							+ "6- Sair"));

				
				if(opcaoEscolhida == 0 || opcaoEscolhida < 0) {
					JOptionPane.showMessageDialog(null, "Opção Inválida, digite um número entre 1 e 6.");
				} else {
					switch(opcaoEscolhida) {
					
					case 1:
						CadastroPet.cadastrarPet();
						break;
						
					case 2:
						break;
						
					case 3:
						break;
						
					case 4:
						break;
						
					case 5:
						break;
						
					case 6: JOptionPane.showMessageDialog(null, "Saindo...");
						break;
						
						default: System.out.println("Opção Inválida! Escolha um número de 1 a 6.");
					}
				}
	
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Opção Inválida, digite um número e não uma letra!");
				
			}
		} 
		while(opcaoEscolhida != 6);
		
	}
}
	
