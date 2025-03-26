package correcaoFolhaPagament;


public class Vendedor extends Funcionario {
	
	public Vendedor(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.25);
	}
	
	@Override
	public String imprimirFolhaPagamento() {
		return "Vendedor (Bonificação de 25%)\n"+super.imprimirFolhaPagamento();
	}

}
