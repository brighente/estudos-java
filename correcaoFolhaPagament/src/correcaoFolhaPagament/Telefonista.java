package correcaoFolhaPagament;


public class Telefonista extends Funcionario {
	
	public Telefonista(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.10);
	}
	
	@Override
	public String imprimirFolhaPagamento() {
		return "Telefonista (Bonificação de 10%)\n"+super.imprimirFolhaPagamento();
	}

}
