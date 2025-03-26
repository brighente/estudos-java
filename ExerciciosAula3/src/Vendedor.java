
public class Vendedor extends Funcionario {
	
	public Vendedor(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.25);
	}
	
	public String imprimirFolhaPagamento() {
		return "Vendedor (Bonificação de 20%)\n" + super.imprimirFolhaPagamento();
	}
}
