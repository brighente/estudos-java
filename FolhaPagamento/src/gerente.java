
public class gerente extends funcionario{

	public gerente(Integer codigo, String nome) {
		super(codigo, nome);
	}
	
	public double getSalario() {
		return super.getSalario() + (super.getSalario() * 0.4);
	}
	
	public String imprimirFolhaPagamento() {
		return "Gerente (Bonificação de 40%)\n"+ super.imprimirFolhaPagamento();
	}
}
