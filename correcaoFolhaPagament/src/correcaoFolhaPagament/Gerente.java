package correcaoFolhaPagament;


public class Gerente extends Funcionario {
	
	public Gerente(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.45);
	}
	
	@Override
	public String imprimirFolhaPagamento() {
		return "Gerente (Bonificação de 45%)\n"+super.imprimirFolhaPagamento();
	}
	

}
