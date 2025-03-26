
public class funcionario extends pessoa {
	public funcionario() {
		
	}
	
	public funcionario(Integer codigo, String nome){
		super(codigo, nome);
	}
	
	public double getSalario() {
		return 2000;
	}
	
	public String imprimirFolhaPagamento() {
		return "Nome do Funcionário: " + getNome() + "\n" + 
			   "Código do Funcionário: " + getCodigo() + "\n" +
			   "Salário Atualizado: " + getSalario() + "\n" +
			   "----------------------------------\n";
	}
}
