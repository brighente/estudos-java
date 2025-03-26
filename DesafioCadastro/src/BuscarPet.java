import javax.swing.JOptionPane;

public class BuscarPet {

	public static void buscar() {
		
		int tipoAnimal = Integer.parseInt(JOptionPane.showInputDialog("Qual animal você deseja buscar:\n1 - Cachorro\n2 - Gato\n3 - Voltar"));
		int dadoBusca1 = Integer.parseInt(JOptionPane.showInputDialog("Por qual dado você deseja filtrar:\n1 - Nome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereco\n7 - Cancelar"));
		int outraBusca = Integer.parseInt(JOptionPane.showInputDialog("Você deseja aplicar mais um filtro?\n1 - Sim\n2 - Não"));
		int dadoBusca2 = Integer.parseInt(JOptionPane.showInputDialog("Por qual outro dado você deseja filtrar:\n1 - Nome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereco\n7 - Cancelar"));
		
		while(tipoAnimal <= 0 || tipoAnimal > 3) {
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
			tipoAnimal = Integer.parseInt(JOptionPane.showInputDialog("Qual animal você deseja buscar:\n1 - Cachorro\n2 - Gato\n3 - Voltar"));
		}
		if(tipoAnimal == 3) {
			return;
		}
		
		while (dadoBusca1 <= 0 || dadoBusca1 > 7) {
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
			dadoBusca1 = Integer.parseInt(JOptionPane.showInputDialog("Por qual dado você deseja filtrar:\n1 - Nome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereco\n7 - Cancelar"));
		}
		if(dadoBusca1 == 7) {
			return;
		}
		
		if(outraBusca == 1) {
			dadoBusca2 = Integer.parseInt(JOptionPane.showInputDialog("Por qual outro dado você deseja filtrar:\n1 - Nome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereco\n7 - Cancelar"));
		}
		
		
		
		
			
				
				
			
		
		
			

	}

}
