
public class Funcionario extends Pessoa {

	public Funcionario() {

	}
	
	public Funcionario(Integer codigo, String nome) {
		super(codigo, nome);
	}

	public double getSalario() {
		return 2000;
	}
	
	public String imprimirFolhaPagamento() {
		return "Nome do Funcionário: " +getNome() + "\n" +
			   "Código: " + getCodigo() + "\n" +
			   "Salário: " + getSalario() + "\n" +
			   "------------------------------------";
	}
}


